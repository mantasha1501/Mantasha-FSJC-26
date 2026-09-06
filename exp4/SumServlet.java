package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/sumServlet")
public class SumServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Retrieve parameters from the GET request
        String str1 = request.getParameter("num1");
        String str2 = request.getParameter("num2");
        
        // Parse strings to integers and calculate the sum
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int sum = num1 + num2;
        
        // Set response content type and write output
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>The sum of " + num1 + " and " + num2 + " is: " + sum + "</h2>");
    }
}
