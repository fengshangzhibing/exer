package com.git.demo1;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private String info;

    public void init() {
        message = "Hello World!,Hello,Java!,Hello,Git1,hello,zwb!,hello,master!";
        message = "Hello World!,Hello,Java!,Hello,Git1,hello,zwb!";
        info="Hello,zwb";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h1>" + info + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}