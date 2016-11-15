package com.testservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MyServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    	String username = (String) request.getParameter("username");
        username = username.toUpperCase();
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<!DOCTYPE HTML>");
        response.getWriter().println("<html><body><p>" + username + "</p></body></html>");
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doGet(request, response);
       
       
       
    }
}
