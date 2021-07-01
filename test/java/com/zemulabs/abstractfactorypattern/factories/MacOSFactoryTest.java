package com.zemulabs.abstractfactorypattern.factories;

import org.junit.Test;

import com.zemulabs.abstractfactorypattern.button.MacButton;
import com.zemulabs.abstractfactorypattern.checkbox.MacCheckBox;

import static org.junit.Assert.assertTrue;


public class MacOSFactoryTest {
	
	private MacOSFactory macFactory = new MacOSFactory();
	
	@Test
	public void shouldReturnMacButton() {
		assertTrue( macFactory.createButton().getClass() == MacButton.class);
	}
	
	@Test
	public void shouldReturnMacCheckBox() {
		assertTrue( macFactory.createCheckBox().getClass() == MacCheckBox.class);
	}

}
