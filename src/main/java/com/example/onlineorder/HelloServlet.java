package com.example.onlineorder;

import org.json.JSONObject;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("application/json");

        JSONObject customer = new JSONObject();
        customer.put("email", "alex@gmail.com");
        customer.put("first_name", "alex");
        customer.put("last_name", "Hu");
        customer.put("age", 50);
        response.getWriter().print(customer);
    }
}