package com.zemulabs.abstractfactorypattern;

import com.zemulabs.abstractfactorypattern.factories.MacOSFactory;
import com.zemulabs.abstractfactorypattern.factories.WindowsOSFactory;

public class Demo {
	
	private static Application configureApplication() {
		Application app;
		
		String osName = System.getProperty("os.name").toLowerCase();
		
		if (osName.contains("mac")) {
			app = new Application(new MacOSFactory());
		} else if (osName.contains("windows")) {
			app = new Application(new WindowsOSFactory());
		} else {
			app = null;
		}
		
		return app;
	}

	public static void main(String[] args) {
		Application app = configureApplication();
		app.paint();
	}

}
