package com.wingyplus.sample.web;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.servlet.ServletContextHandler;

import javax.servlet.Servlet;

/**
 * Created by wingyplus on 3/14/2016 AD.
 */
public class Main {

    public static void main(String ...args) throws Exception {
        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        handler.addServlet(HelloWorld.class, "/hello");
        handler.addServlet(EchoServlet.class, "/echo");

        Server s = new Server(8080);
        s.setHandler(handler);

        s.start();
        s.join();
    }
}
