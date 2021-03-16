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
@WebServlet(name = "Main", urlPatterns = {"/Main"})
public class Main extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Main</title>");            
            out.println("</head>");
            out.println("<body>");            
            out.println("<h1>PRACTICA N#1</h1>");
            out.println("<ul>");
            out.println("<li><a href=\"CalculaEdadPost\">1. Calcula edad Formulario</a></li>");
            out.println("<li><a href=\"CalculaFactorial\">2. Calcula factorial</a></li>");
            out.println("<li><a href=\"CalculaEdadGet\">3. Calcula edad</a></li>");
            out.println("<li><a href=\"ConvierteMonedas\">4. Calcula Monedas</a></li>");
            out.println("<li><a href=\"Calculadora\">5. Calculadora</a></li>");
            out.println("<li><a href=\"Dados\">6. Juego Dados</a></li>");
            out.println("<li><a href=\"MatrizCaracol\">7. MatrizCaracol</a></li>");
            out.println("</ul>");
                      
            out.println("</body>");
            out.println("</html>");
        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
