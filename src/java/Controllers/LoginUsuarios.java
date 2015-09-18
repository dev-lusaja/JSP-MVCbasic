package Controllers;

import Models.Users;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginUsuarios", urlPatterns = {"/loginusuarios.do"})
public class LoginUsuarios extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            String login, user, pass;
            user = request.getParameter("usuario");
            pass = request.getParameter("clave");
            login = new Users().LoginUsuarios(user,pass);
            if (login.equals("1")) {
                request.setAttribute("datos_usuario", new Users().DatosUsuario(user));
                request.getRequestDispatcher("Logeado.jsp").forward(request, response);
            } else {
                request.setAttribute("mensaje_error", "Datos incorrectos");
                request.getRequestDispatcher("Index.jsp").forward(request, response);
            }
        } catch (Exception e){
                request.setAttribute("mensaje_error", e);
                request.getRequestDispatcher("Errors.jsp").forward(request, response);
        }
    }

}