package com.zemulabs.abstractfactorypattern;

import com.zemulabs.abstractfactorypattern.button.Button;
import com.zemulabs.abstractfactorypattern.checkbox.Checkbox;
import com.zemulabs.abstractfactorypattern.factories.GUIFactory;

public class Application {
	
	private Button button;
	private Checkbox checkbox;
	
	public Application(GUIFactory factory) {
		button = factory.createButton();
		checkbox = factory.createCheckBox();
	}
	
	public void paint() {
		button.paint();
		checkbox.paint();
	}

	public Class<? extends Button> getButtonClass() {
		return button.getClass();
	}
	
	public Class<? extends Checkbox> getCheckBoxClass() {
		return checkbox.getClass();
	}
	
}
