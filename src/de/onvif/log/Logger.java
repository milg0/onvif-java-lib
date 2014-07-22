package de.onvif.log;

public class Logger {
	public void debug(String text) {
		System.out.println(text);
	}

	public void info(String text) {
		System.out.println(text);
	}

	public void warn(String text) {
		System.err.println(text);
	}

	public void error(String text) {
		System.err.println(text);
	}
}
