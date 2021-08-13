package com.shape.request;

import com.google.inject.Provider;
import com.shape.services.Shapes;
import com.shape.services.Simple;

public class SimpleProvider implements Provider<Shapes>{
	
	@Override
	public Shapes get() {
		Shapes sp=new Simple();
		
		return sp;
	}
	

}
