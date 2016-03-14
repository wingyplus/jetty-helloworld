package com.wingyplus.sample.web;

import org.eclipse.jetty.server.Server;

/**
 * Created by wingyplus on 3/14/2016 AD.
 */
public class Main {

    public static void main(String ...args) throws Exception {
        Server s = new Server(8080);
        s.setHandler(new HelloWorld());

        s.start();
        s.join();
    }
}
