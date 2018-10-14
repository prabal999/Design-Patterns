package com.prabalhub.design.patterns.creational.abstract_factory;

import com.prabalhub.design.patterns.creational.abstract_factory.product.button.Button;
import com.prabalhub.design.patterns.creational.abstract_factory.product.menu.Menu;

public interface GUIFactory {

	Button getButton();

	Menu getMenu();
}
