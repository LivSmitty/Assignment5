/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livsmitty.com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author scott_000
 */
public class MyServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response)
        throws ServletException,IOException
    {

        response.setContentType("text/html");
        PrintWriter pwriter = response.getWriter();
  
        //ServletContext object creation
        ServletContext scontext=getServletContext();
  
        //fetching values of initialization parameters and printing it
  
        String userName=scontext.getInitParameter("uname");
        pwriter.println("User name is=" + userName);
        String userEmail=scontext.getInitParameter("email");
        pwriter.println("Email ID is="+userEmail);
        String userAge=scontext.getInitParameter("age");
        pwriter.println("User age is=" + userAge);
        String userDOB=scontext.getInitParameter("dob");
        pwriter.println("User DOB is=" + userDOB);
        pwriter.close();
   
    }
    
    

}
