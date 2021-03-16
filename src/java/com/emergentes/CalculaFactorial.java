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
@WebServlet(name = "CalculaFactorial", urlPatterns = {"/CalculaFactorial"})
public class CalculaFactorial extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculaFactorial</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Calcula Factorial</h1>");
            out.println("<form action='' method='post'>");

            out.println("<label>Ingrese Numero:</label>");
            out.println("<input size='15px' type='text' name='numero'> ");
            out.println("<br>");

            out.println("<input type='submit' value='Cancular'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int numero = Integer.parseInt(request.getParameter("numero"));
        int fac = 1;
        if (numero != 0) {
            for (int i = 1; i <= numero; i++) {
                fac = fac * i;
            }
        }

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculaFactorial</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Calcula factorial</h1>");
            out.println("<h4>El factorial de " + numero + " es " + fac + "</h4>");
            out.println("</body>");
            out.println("</html>");
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
