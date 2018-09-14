package com.example.dilip.webservice;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;

import com.sun.net.httpserver.HttpServer;

@SuppressWarnings("restriction")
public class Server {
	static Map<Integer, String> parameters = new HashMap<Integer, String>();
	public void start() {
		int port = 9000;
		try {
			// Creates a socket address where the IP address is the wildcard
			// address and the port number a specified value.
			InetSocketAddress ipAddress = new InetSocketAddress(port);
			System.out.println("Server started at ipAddress: " + ipAddress);
			HttpServer server = HttpServer.create(ipAddress, 0);

			String path = "/job";

			// createContext represents a mapping between the root URI path to a
			// HttpHandler.
			// HttpHandleris an interface, which needs to be implemented by the
			// application to handle the Http requests. It has only one method:handle
			server.createContext(path, new PutHandler());
			server.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
