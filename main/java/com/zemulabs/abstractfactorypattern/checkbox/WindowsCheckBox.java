package com.zemulabs.abstractfactorypattern.checkbox;

public class WindowsCheckBox implements Checkbox {

	@Override
	public void paint() {
		System.out.println("Adding Windows checkbox");
	}

}
