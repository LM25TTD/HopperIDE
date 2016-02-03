/*
 * generated by Xtext 2.9.0
 */
package org.hopper.language.formatting2

import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.hopper.language.portugol.AbstractCommand
import org.hopper.language.portugol.BlockCommand
import org.hopper.language.portugol.BlockFunction
import org.hopper.language.portugol.BlockProcedure
import org.hopper.language.portugol.DeclarationsBlock
import org.hopper.language.portugol.HeaderBlock
import org.hopper.language.portugol.Model
import org.hopper.language.portugol.SubprogramParamDeclaration
import org.hopper.language.portugol.Subprograms
import org.hopper.language.portugol.VarDeclaration
import org.hopper.language.portugol.VarType
import org.hopper.language.portugol.Variable
import org.hopper.language.services.PortugolGrammarAccess
import org.hopper.language.portugol.ReadCommand
import org.hopper.language.portugol.WriteCommand
import org.hopper.language.portugol.IfStatement

@SuppressWarnings("all")
class PortugolFormatter extends AbstractFormatter2 {

	@Inject extension PortugolGrammarAccess

	def dispatch void format(Model model, extension IFormattableDocument document) {
		model.getHeader.format;
		model.getGlobalDeclarations.format;
		model.getSubprograms.format;
		model.getCommands.format;
	}

	def dispatch void format(HeaderBlock headerBlock, extension IFormattableDocument document) {
		headerBlock.regionFor.keyword('algoritmo').append[oneSpace]
		headerBlock.regionFor.ruleCallTo(END_COMMANDRule).prepend[noSpace]
		headerBlock.append[newLine]
	}

	def dispatch void format(DeclarationsBlock declarationsBlock, extension IFormattableDocument document) {
		declarationsBlock.regionFor.keyword('var').append[newLine].prepend[newLine]
		val vars = declarationsBlock.getVars()
		for (Variable variable : vars) {
			variable.format;
			variable.prepend[newLine]
		}
		declarationsBlock.interior[indent]
	}

	def dispatch void format(Subprograms subprograms, extension IFormattableDocument document) {
		for (subprogram : subprograms.blockSubPrograms) {
			subprogram.format
		}
	}

	def dispatch void format(BlockFunction blockFunction, extension IFormattableDocument document) {
		blockFunction.surround[newLines = 2]
		blockFunction.regionFor.keyword('funcao').prepend[noSpace].append[oneSpace]
		blockFunction.regionFor.keyword('(').surround[noSpace]
		blockFunction.regionFor.keyword(')').prepend[noSpace]
		blockFunction.regionFor.keyword(':').surround[oneSpace]
		blockFunction.declarations.format
		val beginCommands = blockFunction.regionFor.keyword('inicio')
		val endCommands = blockFunction.regionFor.keyword('fimfuncao')
		beginCommands.surround[noSpace].prepend[newLine].append[newLine]
		interior(beginCommands, endCommands)[indent]
		blockFunction.commands.format
		endCommands.prepend[newLine]
	}

	def dispatch void format(BlockProcedure blockProcedure, extension IFormattableDocument document) {
		blockProcedure.surround[newLines = 2]
		blockProcedure.regionFor.keyword('procedimento').prepend[noSpace].append[oneSpace]
		blockProcedure.regionFor.keyword('(').surround[noSpace]
		blockProcedure.regionFor.keyword(')').prepend[noSpace]
		blockProcedure.declarations.format
		val beginCommands = blockProcedure.regionFor.keyword('inicio')
		val endCommands = blockProcedure.regionFor.keyword('fimprocedimento')
		beginCommands.surround[noSpace].prepend[newLine].append[newLine]
		interior(beginCommands, endCommands)[indent]
		blockProcedure.commands.format
		endCommands.prepend[newLine]
	}

	def dispatch void format(Variable variable, extension IFormattableDocument document) {
		variable.surround[noSpace]
		variable.varDeclaration.format
		variable.regionFor.keyword(':').surround[oneSpace]
		variable.type.format
	}

	def dispatch void format(VarType varType, extension IFormattableDocument document) {
		varType.surround[noSpace]
	}

	def dispatch void format(BlockCommand blockCommand, extension IFormattableDocument document) {
		blockCommand.prepend[newLines = 2].append[noSpace]
		val beginCommands = blockCommand.regionFor.keyword('inicio')
		val endCommands = blockCommand.regionFor.keyword('fimalgoritmo')
		beginCommands.surround[noSpace].append[newLine]
		interior(beginCommands, endCommands)[indent]
		blockCommand.commands.format
		endCommands.prepend[newLine]
	}

	def dispatch void format(EList<AbstractCommand> commands, extension IFormattableDocument document) {
		for (command : commands) {
			command.prepend[newLine]
			command.format
		}
	}

	def dispatch void format(ReadCommand readCommand, extension IFormattableDocument document) {
		readCommand.surround[noSpace]
		readCommand.regionFor.keyword('(').surround[noSpace]
		readCommand.regionFor.keyword(')').surround[noSpace]
		readCommand.regionFor.ruleCallTo(END_COMMANDRule).prepend[noSpace].append[newLine]
	}

	def dispatch void format(WriteCommand writeCommand, extension IFormattableDocument document) {
		writeCommand.surround[noSpace]
		writeCommand.regionFor.keyword('(').surround[noSpace]
		writeCommand.regionFor.keyword(')').surround[noSpace]
		writeCommand.regionFor.ruleCallTo(END_COMMANDRule).prepend[noSpace].append[newLine]
	}

	def dispatch void format(IfStatement ifStatement, extension IFormattableDocument document) {
		var regionIfKeyword = ifStatement.regionFor.keyword('se')
		regionIfKeyword.prepend[noSpace].append[oneSpace]

		var regionThenKeyword = ifStatement.regionFor.keyword('entao')
		regionThenKeyword.prepend[oneSpace].append[newLine]

		var regionEndifKeyword = ifStatement.regionFor.keyword('fimse')
		regionEndifKeyword.surround[newLine]

		var regionElseKeyword = ifStatement.regionFor.keyword('senao')
		if (regionElseKeyword != null) {
			regionElseKeyword.surround[newLine]
			interior(regionThenKeyword, regionElseKeyword)[indent]
			interior(regionElseKeyword, regionEndifKeyword)[indent]
			ifStatement.elseCommands.format
		} else {
			interior(regionThenKeyword, regionEndifKeyword)[indent]
		}

		ifStatement.commands.format
	}

	def dispatch void format(VarDeclaration varDeclaration, extension IFormattableDocument document) {
		for (commas : varDeclaration.regionFor.keywords(',')) {
			commas.prepend[noSpace].append[oneSpace; autowrap]
		}
	}

	def dispatch void format(SubprogramParamDeclaration subprogramParamDeclaration,
		extension IFormattableDocument document) {
		for (variables : subprogramParamDeclaration.regionFor.keywords(';')) {
			variables.append[oneSpace; autowrap]
		}
	}
}
