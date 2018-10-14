package com.prabalhub.design.patterns.creational.abstract_factory.win;

import com.prabalhub.design.patterns.creational.abstract_factory.GUIFactory;
import com.prabalhub.design.patterns.creational.abstract_factory.product.button.Button;
import com.prabalhub.design.patterns.creational.abstract_factory.product.button.WinButton;
import com.prabalhub.design.patterns.creational.abstract_factory.product.menu.Menu;
import com.prabalhub.design.patterns.creational.abstract_factory.product.menu.WinMenu;

public class WinFactory implements GUIFactory{

	public Button getButton() {
		return new WinButton();
	}

	public Menu getMenu() {
		return new WinMenu();
	}
	
}
