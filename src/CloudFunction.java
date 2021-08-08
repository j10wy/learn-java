package com.example;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import java.io.BufferedWriter;

public class Example implements HttpFunction {
	@Override
	public void service(HttpRequest request, HttpResponse response) throws Exception {
		int age = 38;
		String name = "Jeff";
		BufferedWriter writer = response.getWriter();
		writer.write("G'day, Mate! Jeez, " + name + ", are you really " + age + " ?");
	}
}
