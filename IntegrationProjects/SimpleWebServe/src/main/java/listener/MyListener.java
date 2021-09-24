package listener;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

import servlet.DemoServlet;
import servlet.MyServlet;

public class MyListener extends GuiceServletContextListener{

	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new ServletModule() {
			@Override
			public void configureServlets()
			{
				serve("*.jsp").with(MyServlet.class);
				serve("/serve").with(DemoServlet.class);
			}
		});
	}

}
