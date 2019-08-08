package com.naren.test;

import java.util.Map;

public class EnvironmentVariableDemo {

	public static void main(String args[]) {

		// getting username using System.getProperty in Java
		String user = System.getProperty("user.name");
		System.out.println("Username using system property: " + user);

		// getting username as environment variable in java, only works in windows
		String userWindows = System.getenv("HOME");
		System.out.println("Username using environment variable in windows : " + userWindows);

		// name and value of all environment variable in Java program
		Map<String, String> env = System.getenv();
		for (String envName : env.keySet()) {
			System.out.format("%s=%s%n", envName, env.get(envName));
		}

	}

}
