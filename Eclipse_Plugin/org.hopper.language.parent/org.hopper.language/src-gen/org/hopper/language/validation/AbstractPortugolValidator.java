/*
 * generated by Xtext 2.9.0
 */
package org.hopper.language.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractPortugolValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.hopper.language.portugol.PortugolPackage.eINSTANCE);
		return result;
	}
	
}
