package org.javascool.macros;

public class Stdout {

	public static void print(Object o) {
		Console.getOutput().append(o.toString());
	}

	public static void println(Object o) {
		Console.getOutput().append(o.toString() + "\n");

	}

	public static void clear() {
		Console.getOutput().setText("");
	}

	public static void printError(String str) {
		System.err.println(str);
	}

}
