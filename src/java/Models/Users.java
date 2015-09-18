package Models;

import java.util.ArrayList;

public class Users {

    private String usuario;
    private String clave;
    private String nombre;
    private String apellido;
    private String email;
    private String login;
    private ArrayList<Users> lista_usuarios;
    private ArrayList<Users> datos_usuario;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public ArrayList<Users> getLista_usuarios() {
        return lista_usuarios;
    }

    public void setLista_usuarios(ArrayList<Users> lista_usuarios) {
        this.lista_usuarios = lista_usuarios;
    }

    public ArrayList<Users> getDatos_usuario() {
        return datos_usuario;
    }

    public void setDatos_usuario(ArrayList<Users> datos_usuario) {
        this.datos_usuario = datos_usuario;
    }
    
    public Users(){
        //Contructor
        lista_usuarios = new Connect().ListarUsuarios();
    }

    Users(String usuario, String clave, String nombre, String apellido, String email) {
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    
    public String  LoginUsuarios(String user, String pass) {
        this.login = new Connect().LoginUsuarios(user, pass);
        return this.login;
    }
    public ArrayList<Users> DatosUsuario(String user) {
        this.datos_usuario = new Connect().DatosUsuario(user);
        return this.datos_usuario;
    }
    
    public void InsertarUsuario(String usuario, String clave, String nombre, String apellido, String email){
        
        Users u = new Users(usuario, clave, nombre, apellido, email);
        new Connect().InsertarUsuario(u);
    }
    public void UpdateUsuario(String usuario, String clave, String nombre, String apellido, String email){
        Users u = new Users(usuario, clave, nombre, apellido, email);
        new Connect().UpdateUsuario(u);
    }
    
}


