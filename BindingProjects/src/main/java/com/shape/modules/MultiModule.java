package com.shape.modules;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import com.shape.services.Shapes;

public class MultiModule extends AbstractModule{
	
	Multibinder<Shapes> mbinder=Multibinder.newSetBinder(binder(), Shapes.class);

}
