package com.example.dilip.webservice;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

@SuppressWarnings("restriction")
public class PutHandler implements HttpHandler {
	static Map<Integer, String> parameters = new HashMap<Integer, String>();

	@Override
	public void handle(HttpExchange exchange) throws IOException {
		String method = exchange.getRequestMethod();
		String response = "";
		int statusCode = 200;
		// HttpExchange is An instance of this class is passed to
		// HttpHandler#handle(). It has methods to access Http request
		// information,
		// and to prepare and send the response.
		
		if (method.equals("POST")) {//create new resource
			String body = ParserUtil.parseBody(exchange.getRequestBody());
			Map<String, String> dataMap = ParserUtil.getJsonString(body.toString());
			String name1 = dataMap.get("name");
			if (name1 != null) {
				Integer randomNum = new Random().nextInt(100);
				parameters.put(randomNum, name1);
				response = "The random number assigned is: " + randomNum;
			} else {
				response = "Missing request body";
			}
		} else if (method.equals("GET")) {
			URI url = exchange.getRequestURI();
			String query = url.getRawQuery();
			int id = Integer.parseInt(query.split("=")[1]);
			String name = parameters.get(id);
			if (name != null) {
				response = name;
			} else {
				response = "Name not found";
				statusCode = 404;
			}
		}else if(method.equals("DELETE")){
			URI url = exchange.getRequestURI();
			String query = url.getRawQuery();
			int id = Integer.parseInt(query.split("=")[1]);
			String name = parameters.get(id);
			if (name != null) {
				parameters.remove(id);
				response = name + " is deleted";
			} else {
				response = "Name not found";
				statusCode = 404;
			}
		}else if(method.equals("PUT")){//Update the resource
			String body = ParserUtil.parseBody(exchange.getRequestBody());
			Map<String, String> dataMap = ParserUtil.getJsonString(body.toString());
			//updating name from id
			String postName = dataMap.get("name");
			int nameID = Integer.parseInt(dataMap.get("id"));
			if(postName!=null && postName!=null){
				parameters.put(nameID, postName);
				response = postName + " is added at with ID number " + nameID;
			}else{
				response = "Body is absent";
				statusCode = 404;
			}
		}
		System.out.println(parameters);
		exchange.sendResponseHeaders(statusCode, response.length());
		OutputStream os = exchange.getResponseBody();
		os.write(response.getBytes());
		os.close();
	}

}
