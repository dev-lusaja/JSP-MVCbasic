
package Controllers;

import Models.Users;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author osanchez
 */
@WebServlet(name = "UpdateUsuario", urlPatterns = {"/updateusuario.do"})
public class UpdateUsuario extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            String usuario, clave, nombre, apellido, email;
            usuario = request.getParameter("usuario");
            clave = request.getParameter("clave");
            nombre = request.getParameter("nombres");
            apellido = request.getParameter("apellidos");
            email = request.getParameter("email");

            new Users().UpdateUsuario(usuario, clave, nombre, apellido, email);
            request.setAttribute("mensaje", "Datos actualizados, inicie sesion nuevamente");
            request.getRequestDispatcher("Index.jsp").forward(request, response);
        } catch(Exception e){
                request.setAttribute("mensaje_error", e);
                request.getRequestDispatcher("Errors.jsp").forward(request, response);
        }
    }

}
