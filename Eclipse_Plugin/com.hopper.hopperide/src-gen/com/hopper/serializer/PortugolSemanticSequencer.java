package com.hopper.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.hopper.portugol.HEADER;
import com.hopper.portugol.Model;
import com.hopper.portugol.PortugolPackage;
import com.hopper.services.PortugolGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PortugolSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PortugolGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PortugolPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PortugolPackage.HEADER:
				if(context == grammarAccess.getHEADERRule() ||
				   context == grammarAccess.getProgramaRule()) {
					sequence_HEADER(context, (HEADER) semanticObject); 
					return; 
				}
				else break;
			case PortugolPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     nameOfProgram=STRING
	 */
	protected void sequence_HEADER(EObject context, HEADER semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PortugolPackage.Literals.HEADER__NAME_OF_PROGRAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PortugolPackage.Literals.HEADER__NAME_OF_PROGRAM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHEADERAccess().getNameOfProgramSTRINGTerminalRuleCall_2_0(), semanticObject.getNameOfProgram());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     main=Programa
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PortugolPackage.Literals.MODEL__MAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PortugolPackage.Literals.MODEL__MAIN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelAccess().getMainProgramaParserRuleCall_0(), semanticObject.getMain());
		feeder.finish();
	}
}
