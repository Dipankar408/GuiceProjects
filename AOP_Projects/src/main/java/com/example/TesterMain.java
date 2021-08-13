package com.example;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class TesterMain {

	public static void main(String[] args) {
		Injector in=Guice.createInjector(new ChekerModule());
		TextEditor te=in.getInstance(TextEditor.class);
		te.makeSpellChecking();

	}

}
