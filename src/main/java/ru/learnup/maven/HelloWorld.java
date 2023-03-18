package ru.learnup.maven;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class HelloWorld {
	public static void main(String[] args) throws URISyntaxException, IOException {
		System.out.println("Hello world!");
		URL resource= HelloWorld.class.getResource("1.txt");
		System.out.println(resource);
		assert resource != null;
		Files.readAllLines(Path.of(resource.toURI()))
				.forEach(System.out::println);
	}
}