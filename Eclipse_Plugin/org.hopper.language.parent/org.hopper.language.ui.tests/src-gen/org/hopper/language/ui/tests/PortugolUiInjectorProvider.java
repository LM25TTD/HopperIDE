/*
 * generated by Xtext 2.9.0
 */
package org.hopper.language.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.hopper.language.ui.internal.LanguageActivator;

public class PortugolUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return LanguageActivator.getInstance().getInjector("org.hopper.language.Portugol");
	}

}
