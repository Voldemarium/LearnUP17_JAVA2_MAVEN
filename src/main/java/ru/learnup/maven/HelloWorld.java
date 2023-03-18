package ru.learnup.maven;

import com.google.gson.Gson;

public class HelloWorld {
	public static void main(String[] args) {
//		System.out.println("Hello world!");
		User user =new User("Vova", 27);
		System.out.println(user);
		Gson gson = new Gson();
		String json = gson.toJson(user);
		System.out.println(json);
		User newUser = gson.fromJson(json, User.class);
		System.out.println("newUser: " + newUser);

		String s = "{\"name\":\"Olga\",\"age\":13}";
		User olga = gson.fromJson(s, User.class);
		System.out.println("olga: " + olga);
	}
}