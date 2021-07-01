package com.zemulabs.abstractfactorypattern.button;

public class WindowsButton implements Button {

	@Override
	public void paint() {
		System.out.println("Adding Windows Button");
	}

}
