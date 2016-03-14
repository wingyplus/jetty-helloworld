package com.wingyplus.sample.web;

import org.eclipse.jetty.websocket.servlet.WebSocketServlet;
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory;

/**
 * Created by wingyplus on 3/14/2016 AD.
 */
public class EchoServlet extends WebSocketServlet {
    @Override
    public void configure(WebSocketServletFactory factory) {
        factory.register(EchoServer.class);
    }
}
