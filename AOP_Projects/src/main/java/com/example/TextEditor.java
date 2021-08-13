package com.example;

import com.google.inject.Inject;

public class TextEditor {
	private SpellChecker sc;

	@Inject
	public TextEditor(SpellChecker sc) {
		this.sc = sc;
	}
	
	public void makeSpellChecking() {
		sc.checkSpelling();
	}
	
}
