package com.example.backend4f;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "home", value = "/home")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //2.1
        System.out.println("User Agent:" + request.getHeader("User-Agent"));
        //2.2
        String username = request.getParameter("username"));
        String password = request.getParameter("password"));
        //2.3
        if(username.equals("Gino") && password.equals("Pasquale")){
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            out.println("<html><body>");
            out.println("<h1>Benvenuto</h1>");
            out.println("</body></html>");
        }else{
            HttpSession session = request.getSession(true);
            session.setAttribute("messaggio", "Credenziali sbagliati");
            response.sendRedirect("/errore");
        }




    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //3
        System.out.println("Host:" + request.getHeader("Host"));
        System.out.println("Accept-Encoding:" + request.getHeader("Accept-Encoding"));
        System.out.println("Accept-Encoding:" + request.getHeader("If-None-Match"));
        PrintWriter out = response.getWriter();
        response.setContentType("text/txt");

        out.println("Bungiorno Galvani!");


    }


    public void destroy() {
    }
}