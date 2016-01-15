/*
 * generated by Xtext 2.9.0
 */
package org.hopper.language.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.hopper.language.portugol.Model

@RunWith(XtextRunner)
@InjectWith(PortugolInjectorProvider)
class PortugolParsingTest {

	@Inject
	ParseHelper<Model> parseHelper;

	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			algoritmo "Maior_de_dois"
			// Fun��o : Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
			// Autor :    Iasmim Cunha
			// Data : 5/8/2013
			// Se��o de Declara��es 
			var
			  primeiro : real
			  segundo : real
			inicio
			// Se��o de Comandos 
			escreval("Entre com o primeiro valor...")
			leia(primeiro)
			escreval("Entre com o segundo valor...")
			leia(segundo)
			
			   se(primeiro > segundo) entao
			       escreval("O maior valor entre os n�meros �:",primeiro)
			   senao
			       escreval("O maior valor entre os n�meros �:",segundo)
			   fimse
			fimalgoritmo
		''')
		Assert.assertNotNull(result)
	}

}
