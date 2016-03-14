package com.wingyplus.sample.web;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.WebSocketAdapter;

/**
 * Created by wingyplus on 3/14/2016 AD.
 */
public class EchoServer extends WebSocketAdapter {

    @Override
    public void onWebSocketConnect(Session sess) {
        super.onWebSocketConnect(sess);
        System.out.println("Socket connect " + sess);
    }

    @Override
    public void onWebSocketText(String message) {
        super.onWebSocketText(message);
        System.out.println("Socket message " + message);
    }
}
