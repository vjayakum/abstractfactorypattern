package com.zemulabs.abstractfactorypattern.factories;

import com.zemulabs.abstractfactorypattern.button.Button;
import com.zemulabs.abstractfactorypattern.checkbox.Checkbox;

public interface GUIFactory {

		Button createButton();
		
		Checkbox createCheckBox();
}
