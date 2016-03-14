package com.wingyplus.sample.web;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wingyplus on 3/14/2016 AD.
 */
public class HelloWorld extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setStatus(HttpServletResponse.SC_OK);
        resp.addHeader("Content-Type", "text/html; charset=utf-8");
        resp.getWriter().write("<h1>Hello, World</h1>");
    }

}
