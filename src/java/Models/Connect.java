package Models;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Models.Users;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect {
    private String driver = "com.mysql.jdbc.Driver";
    private String host = "jdbc:mysql://localhost/informacion";
    private String user = "root";
    private String pass = "root";
    
    private Statement consulta;
    private ResultSet resultado;
    private PreparedStatement enunciado;
    private Connection conexion;
    private ArrayList<Users> usuarios;
    private ArrayList<Users> datos_usuario;
    private String login;
    private int nuevo_id;
    private int id_actual;
    
    public Connect(){
        try {
            Class.forName(this.driver);
            this.conexion = DriverManager.getConnection(this.host, this.user, this.pass);
            this.consulta = this.conexion.createStatement();
            this.usuarios = new ArrayList<Users>();
            this.datos_usuario = new ArrayList<Users>();
        } catch( ClassNotFoundException | SQLException e){
            
        }
    }
    
    public ArrayList<Users> ListarUsuarios(){
        try{
            this.resultado = this.consulta.executeQuery("select * from usuarios join perfil using(id_usuario)");
            while (this.resultado.next()){
                String u = this.resultado.getString("usuarios") ;
                String p = this.resultado.getString("passw");
                String n = this.resultado.getString("nombres");
                String a = this.resultado.getString("apellidos");
                String e = this.resultado.getString("e_mail");
                this.usuarios.add(new Users(u,p,n,a,e));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return this.usuarios;
    }
    
    public String LoginUsuarios(String user, String pass){
        try{
            this.resultado = this.consulta.executeQuery("select count(*) as login from usuarios where usuarios='" +user+ "' and passw='" +pass+ "'");
            while (this.resultado.next()){
                this.login = this.resultado.getString("login");
            }
        }catch( Exception e ){
            
        }
        return this.login;
    }
    public ArrayList<Users> DatosUsuario(String user){
        try{
            this.resultado = this.consulta.executeQuery("select * from usuarios join perfil using(id_usuario) where usuarios='"+ user + "'");
            while (this.resultado.next()){
                String u = this.resultado.getString("usuarios") ;
                String p = this.resultado.getString("passw");
                String n = this.resultado.getString("nombres");
                String a = this.resultado.getString("apellidos");
                String e = this.resultado.getString("e_mail");
                this.datos_usuario.add(new Users(u,p,n,a,e));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return this.datos_usuario;
    }
    public void InsertarUsuario(Users user){
        try {
            this.enunciado = this.conexion.prepareStatement("insert into usuarios values (?,?,?)");
            int id = IdUsuario();
            this.enunciado.setInt(1, id);
            this.enunciado.setString(2, user.getUsuario());
            this.enunciado.setString(3, user.getClave());
            this.enunciado.execute();
            
            this.enunciado = this.conexion.prepareStatement("insert into perfil values (?,?,?,?)");
            this.enunciado.setInt(1, id);
            this.enunciado.setString(2, user.getNombre());
            this.enunciado.setString(3, user.getApellido());
            this.enunciado.setString(4, user.getEmail());
            this.enunciado.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int IdUsuario(){
        Random r = new Random();
        this.nuevo_id = r.nextInt(1000)+1;
        return this.nuevo_id;
    }
    
    public void UpdateUsuario(Users user){
        try {
            String usuario = user.getUsuario();
            String clave = user.getClave();
            String nombres = user.getNombre();
            String apellidos = user.getApellido();
            String email = user.getEmail();
            this.enunciado = this.conexion.prepareStatement("UPDATE usuarios u JOIN perfil p ON u.id_usuario = p.id_usuario SET u.usuarios = '"+usuario+"', u.passw = '"+clave+"', p.nombres = '"+nombres+"', p.apellidos = '"+apellidos+"', p.e_mail = '"+email+"' where u.usuarios = '"+user.getUsuario()+"'");
            this.enunciado.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
}

