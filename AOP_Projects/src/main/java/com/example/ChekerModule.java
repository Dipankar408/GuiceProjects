package com.example;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class ChekerModule extends AbstractModule
{
	public void configure()
	{
		bind(SpellChecker.class).to(SpellCheckerIpml.class);
		bindInterceptor(Matchers.any(), Matchers.annotatedWith(Calltracker.class), new TrackerService());
	}
}
