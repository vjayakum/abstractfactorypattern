package com.zemulabs.abstractfactorypattern.factories;

import com.zemulabs.abstractfactorypattern.button.Button;
import com.zemulabs.abstractfactorypattern.button.WindowsButton;
import com.zemulabs.abstractfactorypattern.checkbox.Checkbox;
import com.zemulabs.abstractfactorypattern.checkbox.WindowsCheckBox;

public class WindowsOSFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckBox() {
		return new WindowsCheckBox();
	}

}
