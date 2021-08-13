package com.shape.services;

import com.google.inject.ImplementedBy;

@ImplementedBy(Circle.class)
public interface Shapes {
	void area();
	void parameter();
}
