package com.prabalhub.design.patterns.creational.abstract_factory.linux;

import com.prabalhub.design.patterns.creational.abstract_factory.GUIFactory;
import com.prabalhub.design.patterns.creational.abstract_factory.product.button.Button;
import com.prabalhub.design.patterns.creational.abstract_factory.product.button.LinuxButton;
import com.prabalhub.design.patterns.creational.abstract_factory.product.menu.LinuxMenu;
import com.prabalhub.design.patterns.creational.abstract_factory.product.menu.Menu;

public class LinuxFactory implements GUIFactory{

	public Button getButton() {
		return new LinuxButton();
	}

	public Menu getMenu() {
		return new LinuxMenu();
	}

}
