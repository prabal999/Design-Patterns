package com.prabalhub.design.patterns.creational.abstract_factory.mac;

import com.prabalhub.design.patterns.creational.abstract_factory.GUIFactory;
import com.prabalhub.design.patterns.creational.abstract_factory.product.button.Button;
import com.prabalhub.design.patterns.creational.abstract_factory.product.button.MacButton;
import com.prabalhub.design.patterns.creational.abstract_factory.product.menu.MacMenu;
import com.prabalhub.design.patterns.creational.abstract_factory.product.menu.Menu;

public class MacFactory implements GUIFactory {

	public Button getButton() {
		return new MacButton();
	}

	public Menu getMenu() {
		return new MacMenu();
	}

}
