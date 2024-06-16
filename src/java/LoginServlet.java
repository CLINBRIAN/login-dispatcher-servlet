/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author kamau
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //deal with doPost method
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //accept username and password from index.html file
        String name = request.getParameter("user");
        String pass = request.getParameter("pass");

        if (name.equals("abc") &&
                pass.equals("123")) {
            RequestDispatcher dis = request.getRequestDispatcher("Welcome");
            dis.forward(request, response);

        }else{
            out.print("wrong username and password ");
            
            //above error messagen forward to index.html
            RequestDispatcher dis = request.getRequestDispatcher("index.html");
            dis.include(request, response);
            
        
        }
    }

}
