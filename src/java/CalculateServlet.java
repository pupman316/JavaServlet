/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dssupport
 */
public class CalculateServlet extends HttpServlet 
{
    public void ProcessRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        //PrintWriter out = response.getWriter();
        
        String strNumberOne = request.getParameter("NumberOne");
        String strNumberTwo = request.getParameter("NumberTwo");
        
        String strAnswer = String.valueOf(Integer.parseInt(strNumberOne) + Integer.parseInt(strNumberTwo));
        
        request.setAttribute("NumberOne", strNumberOne.toString());
        request.setAttribute("NumberTwo", strNumberTwo.toString());
        request.setAttribute("strAnswer", strAnswer);
        
        RequestDispatcher rs = request.getRequestDispatcher("/Index.jsp");
        rs.forward(request, response);
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
//        PrintWriter out = response.getWriter();
//        //out.println("Hello"); // <-- just for debugging
//        String strNumberOne = request.getParameter("NumberOne");
//        String strNumberTwo = request.getParameter("NumberTwo");
//        
//        String answer = String.valueOf(Integer.parseInt(strNumberOne) + Integer.parseInt(strNumberTwo));
//        out.println(answer);
        
        ProcessRequest(request, response);
    }
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {    
        //doPost(request, response);
        //response.sendRedirect(request.getContextPath() + "/Index.jsp");
    
//        String strNumberOne = request.getParameter("NumberOne");
//        String strNumberTwo = request.getParameter("NumberTwo");
//        
//        String answer = String.valueOf(Integer.parseInt(strNumberOne) + Integer.parseInt(strNumberTwo));
//        
//        request.setAttribute("Answer", answer);
//        request.getRequestDispatcher("/Index.jsp").forward(request, response);
        
        ProcessRequest(request, response);
    }
    // <editor-fold defaultstate="collapsed" desc="Not Used.">    
        /**
         * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
         * methods.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
    //    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    //            throws ServletException, IOException {
    //        response.setContentType("text/html;charset=UTF-8");
    //        try (PrintWriter out = response.getWriter()) {
    //            /* TODO output your page here. You may use following sample code. */
    //            out.println("<!DOCTYPE html>");
    //            out.println("<html>");
    //            out.println("<head>");
    //            out.println("<title>Servlet CalculateServlet</title>");            
    //            out.println("</head>");
    //            out.println("<body>");
    //            out.println("<h1>Servlet CalculateServlet at " + request.getContextPath() + "</h1>");
    //            out.println("</body>");
    //            out.println("</html>");
    //        }
    //    }

    //</editor-fold>    
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }

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