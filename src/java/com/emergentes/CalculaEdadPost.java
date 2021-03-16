/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jorge
 */
@WebServlet(name = "CalculaEdadPost", urlPatterns = {"/CalculaEdadPost"})
public class CalculaEdadPost extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculaEdadPost</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Calcula edad </h1>");
            out.println("<h1>Ingrese  </h1>");
            out.println("<form action='' method='post'>");
                  
            
            out.println("<label>Nombre     </label>");
            out.println("<input size='15px' type='text' name='nombre'> ");
            out.println("<br>"); 
            out.println("<label>Año de Nacimiento     </label>");
            out.println("<input size='10px' type='number' name='fecha'> ");
            out.println("<br>");   
            out.println("<input type='submit' value='Calcular'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int edad;
        
        String nombre=request.getParameter("nombre");
        int fecha= Integer.parseInt(request.getParameter("fecha"));
        edad = 2021-fecha;
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Datos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Sus datos son</h1>");
            out.println("<br>");
            out.println("Su nombre es:<Strong>"+nombre+ "</Strong> <br> su edad es :   <Strong>"+edad+"</Strong>");   
            
            out.println("</body>");
            out.println("</html>");
        }
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
