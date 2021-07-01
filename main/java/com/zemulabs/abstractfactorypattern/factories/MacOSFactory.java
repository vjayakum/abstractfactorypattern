package com.zemulabs.abstractfactorypattern.factories;

import com.zemulabs.abstractfactorypattern.button.Button;
import com.zemulabs.abstractfactorypattern.button.MacButton;
import com.zemulabs.abstractfactorypattern.checkbox.Checkbox;
import com.zemulabs.abstractfactorypattern.checkbox.MacCheckBox;

public class MacOSFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public Checkbox createCheckBox() {
		return new MacCheckBox();
	}

}
