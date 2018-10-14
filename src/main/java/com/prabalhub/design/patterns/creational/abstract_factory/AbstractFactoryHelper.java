package com.prabalhub.design.patterns.creational.abstract_factory;

import com.prabalhub.design.patterns.creational.abstract_factory.linux.LinuxFactory;
import com.prabalhub.design.patterns.creational.abstract_factory.mac.MacFactory;
import com.prabalhub.design.patterns.creational.abstract_factory.win.WinFactory;

public class AbstractFactoryHelper {
	public static GUIFactory getFactory(Type type) {
		GUIFactory factory = null;
		switch (type) {
		case WIN:
			factory = new WinFactory();
			break;
		case MAC:
			factory = new MacFactory();
			break;
		case LINUX:
			factory = new LinuxFactory();
			break;
		}
		return factory;
	}
}
