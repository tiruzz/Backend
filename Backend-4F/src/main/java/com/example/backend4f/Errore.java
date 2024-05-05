package com.example.backend4f;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "errore", value = "/errore")
public class Errore extends Errore {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //5
        int attributoSalvato = (int) session.getAttribute("messaggio");
        System.out.println(messaggio);
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html><body>");
        out.println("<h1>"+ messaggio + "</h1>");
        out.println("</body></html>");
    }


    public void destroy() {
    }
}