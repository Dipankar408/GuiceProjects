package com.module;

import com.google.inject.Inject;
import com.google.inject.servlet.ServletModule;
import com.servelet.GuiceServelet;


public class GuiceModule extends ServletModule{
	@Inject
	public void configureServlets() {
		serve("/*.jsp").with(GuiceServelet.class);
		
	}

}
