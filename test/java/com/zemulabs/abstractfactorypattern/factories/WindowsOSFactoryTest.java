package com.zemulabs.abstractfactorypattern.factories;

import org.junit.Test;

import com.zemulabs.abstractfactorypattern.button.WindowsButton;
import com.zemulabs.abstractfactorypattern.checkbox.WindowsCheckBox;

import static org.junit.Assert.assertTrue;

public class WindowsOSFactoryTest {
	
	private WindowsOSFactory factory = new WindowsOSFactory();
	
	@Test
	public void shouldReturnWindowsButton() {
		assertTrue( factory.createButton().getClass() == WindowsButton.class);
	}
	
	@Test
	public void shouldReturnWindowsCheckBox() {
		assertTrue( factory.createCheckBox().getClass() == WindowsCheckBox.class );
	}

}
