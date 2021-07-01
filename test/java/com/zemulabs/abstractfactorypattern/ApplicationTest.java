package com.zemulabs.abstractfactorypattern;

import org.junit.Test;

import com.zemulabs.abstractfactorypattern.button.MacButton;
import com.zemulabs.abstractfactorypattern.button.WindowsButton;
import com.zemulabs.abstractfactorypattern.checkbox.MacCheckBox;
import com.zemulabs.abstractfactorypattern.checkbox.WindowsCheckBox;
import com.zemulabs.abstractfactorypattern.factories.GUIFactory;
import com.zemulabs.abstractfactorypattern.factories.MacOSFactory;
import com.zemulabs.abstractfactorypattern.factories.WindowsOSFactory;

import static org.junit.Assert.assertTrue;

public class ApplicationTest {
	
	private Application app;
	private GUIFactory factory;
	
	@Test
	public void shouldReturnMacUI() {
		factory = new MacOSFactory();
		app = new Application(factory);
		assertTrue( app.getButtonClass() == MacButton.class );
		assertTrue( app.getCheckBoxClass() == MacCheckBox.class );
	}
	
	@Test
	public void shouldReturnWindowsUI() {
		factory = new WindowsOSFactory();
		app = new Application(factory);
		assertTrue( app.getButtonClass() == WindowsButton.class );
		assertTrue( app.getCheckBoxClass() == WindowsCheckBox.class );
	}

}