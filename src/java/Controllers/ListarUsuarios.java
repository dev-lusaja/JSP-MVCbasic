package Controllers;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Models.Users;

@WebServlet(name = "ListarUsuarios", urlPatterns = {"/listarusuarios.do"})
public class ListarUsuarios extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            request.setAttribute("lista_usuarios", new Users().getLista_usuarios());
            request.getRequestDispatcher("lista_usuarios.jsp").forward(request, response);
        }catch(Exception e){
                request.setAttribute("mensaje_error", e);
                request.getRequestDispatcher("Errors.jsp").forward(request, response);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}