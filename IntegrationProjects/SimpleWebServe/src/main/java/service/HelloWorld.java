package service;

import java.io.IOException;

import com.google.inject.ImplementedBy;

@ImplementedBy(HelloWorldImpl.class)
public interface HelloWorld {
	void execute() throws IOException;
}
