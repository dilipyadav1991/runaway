package com.example.dilip.webservice;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ParserUtil {
	public static String parseBody(InputStream in) {
		try {
			InputStreamReader input = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(input);
			int b;
			StringBuilder builder = new StringBuilder();
			while ((b = br.read()) != -1) {
				builder.append((char) b);
			}
			br.close();
			input.close();
			return builder.toString();
		} catch (Exception e) {

		}
		return null;
	}

	public static Map<String, String> getJsonString(String body) {
		if (body == null) {
			return new HashMap<String, String>();
		}
		try {
			// https://stackoverflow.com/questions/2525042/how-to-convert-a-json-string-to-a-mapstring-string-with-jackson-json
			return new ObjectMapper().readValue(body, new TypeReference<Map<String, String>>() {
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new HashMap<String, String>();
	}
}
