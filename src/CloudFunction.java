package com.example;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import java.io.BufferedWriter;

public class Example implements HttpFunction {
	@Override
	public void service(HttpRequest request, HttpResponse response) throws Exception {
		BufferedWriter writer = response.getWriter();
		writer.write(
				"<html><head><title>test</title></head><body><img src='https://i1.sndcdn.com/avatars-000689822399-n8zm5q-t240x240.jpg'/></body></html>");
	}
}
