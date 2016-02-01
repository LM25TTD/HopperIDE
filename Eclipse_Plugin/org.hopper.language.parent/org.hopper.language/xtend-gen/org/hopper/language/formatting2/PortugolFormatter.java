/**
 * generated by Xtext 2.9.0
 */
package org.hopper.language.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegionsFinder;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hopper.language.portugol.AbstractCommand;
import org.hopper.language.portugol.BlockCommand;
import org.hopper.language.portugol.BlockFunction;
import org.hopper.language.portugol.BlockProcedure;
import org.hopper.language.portugol.BlockSubPrograms;
import org.hopper.language.portugol.DeclarationsBlock;
import org.hopper.language.portugol.HeaderBlock;
import org.hopper.language.portugol.Model;
import org.hopper.language.portugol.SubprogramParamDeclaration;
import org.hopper.language.portugol.Subprograms;
import org.hopper.language.portugol.VarDeclaration;
import org.hopper.language.portugol.VarType;
import org.hopper.language.portugol.Variable;
import org.hopper.language.services.PortugolGrammarAccess;

@SuppressWarnings("all")
public class PortugolFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private PortugolGrammarAccess _portugolGrammarAccess;
  
  protected void _format(final Model model, @Extension final IFormattableDocument document) {
    HeaderBlock _header = model.getHeader();
    document.<HeaderBlock>format(_header);
    DeclarationsBlock _globalDeclarations = model.getGlobalDeclarations();
    document.<DeclarationsBlock>format(_globalDeclarations);
    Subprograms _subprograms = model.getSubprograms();
    document.<Subprograms>format(_subprograms);
    BlockCommand _commands = model.getCommands();
    document.<BlockCommand>format(_commands);
  }
  
  protected void _format(final HeaderBlock headerBlock, @Extension final IFormattableDocument document) {
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(headerBlock);
    ISemanticRegion _keyword = _regionFor.keyword("algoritmo");
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(_keyword, _function);
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(headerBlock);
    ParserRule _eND_COMMANDRule = this._portugolGrammarAccess.getEND_COMMANDRule();
    ISemanticRegion _ruleCallTo = _regionFor_1.ruleCallTo(_eND_COMMANDRule);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(_ruleCallTo, _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.<HeaderBlock>append(headerBlock, _function_2);
  }
  
  protected void _format(final DeclarationsBlock declarationsBlock, @Extension final IFormattableDocument document) {
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(declarationsBlock);
    ISemanticRegion _keyword = _regionFor.keyword("var");
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    ISemanticRegion _append = document.append(_keyword, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(_append, _function_1);
    final EList<Variable> vars = declarationsBlock.getVars();
    for (final Variable variable : vars) {
      {
        document.<Variable>format(variable);
        final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<Variable>prepend(variable, _function_2);
      }
    }
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<DeclarationsBlock>interior(declarationsBlock, _function_2);
  }
  
  protected void _format(final Subprograms subprograms, @Extension final IFormattableDocument document) {
    EList<BlockSubPrograms> _blockSubPrograms = subprograms.getBlockSubPrograms();
    for (final BlockSubPrograms subprogram : _blockSubPrograms) {
      document.<BlockSubPrograms>format(subprogram);
    }
  }
  
  protected void _format(final BlockFunction blockFunction, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.<BlockFunction>surround(blockFunction, _function);
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(blockFunction);
    ISemanticRegion _keyword = _regionFor.keyword("funcao");
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    ISemanticRegion _prepend = document.prepend(_keyword, _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(_prepend, _function_2);
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(blockFunction);
    ISemanticRegion _keyword_1 = _regionFor_1.keyword("(");
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.surround(_keyword_1, _function_3);
    ISemanticRegionsFinder _regionFor_2 = this.textRegionExtensions.regionFor(blockFunction);
    ISemanticRegion _keyword_2 = _regionFor_2.keyword(")");
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(_keyword_2, _function_4);
    ISemanticRegionsFinder _regionFor_3 = this.textRegionExtensions.regionFor(blockFunction);
    ISemanticRegion _keyword_3 = _regionFor_3.keyword(":");
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(_keyword_3, _function_5);
    DeclarationsBlock _declarations = blockFunction.getDeclarations();
    document.<DeclarationsBlock>format(_declarations);
    ISemanticRegionsFinder _regionFor_4 = this.textRegionExtensions.regionFor(blockFunction);
    final ISemanticRegion beginCommands = _regionFor_4.keyword("inicio");
    ISemanticRegionsFinder _regionFor_5 = this.textRegionExtensions.regionFor(blockFunction);
    final ISemanticRegion endCommands = _regionFor_5.keyword("fimfuncao");
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    ISemanticRegion _surround = document.surround(beginCommands, _function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    ISemanticRegion _prepend_1 = document.prepend(_surround, _function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(_prepend_1, _function_8);
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(beginCommands, endCommands, _function_9);
    EList<AbstractCommand> _commands = blockFunction.getCommands();
    document.<EList<AbstractCommand>>format(_commands);
    final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(endCommands, _function_10);
  }
  
  protected void _format(final BlockProcedure blockProcedure, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.<BlockProcedure>surround(blockProcedure, _function);
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(blockProcedure);
    ISemanticRegion _keyword = _regionFor.keyword("procedimento");
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    ISemanticRegion _prepend = document.prepend(_keyword, _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(_prepend, _function_2);
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(blockProcedure);
    ISemanticRegion _keyword_1 = _regionFor_1.keyword("(");
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.surround(_keyword_1, _function_3);
    ISemanticRegionsFinder _regionFor_2 = this.textRegionExtensions.regionFor(blockProcedure);
    ISemanticRegion _keyword_2 = _regionFor_2.keyword(")");
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(_keyword_2, _function_4);
    DeclarationsBlock _declarations = blockProcedure.getDeclarations();
    document.<DeclarationsBlock>format(_declarations);
    ISemanticRegionsFinder _regionFor_3 = this.textRegionExtensions.regionFor(blockProcedure);
    final ISemanticRegion beginCommands = _regionFor_3.keyword("inicio");
    ISemanticRegionsFinder _regionFor_4 = this.textRegionExtensions.regionFor(blockProcedure);
    final ISemanticRegion endCommands = _regionFor_4.keyword("fimprocedimento");
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    ISemanticRegion _surround = document.surround(beginCommands, _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    ISemanticRegion _prepend_1 = document.prepend(_surround, _function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(_prepend_1, _function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(beginCommands, endCommands, _function_8);
    EList<AbstractCommand> _commands = blockProcedure.getCommands();
    document.<EList<AbstractCommand>>format(_commands);
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(endCommands, _function_9);
  }
  
  protected void _format(final Variable variable, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.<Variable>surround(variable, _function);
    VarDeclaration _varDeclaration = variable.getVarDeclaration();
    document.<VarDeclaration>format(_varDeclaration);
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(variable);
    ISemanticRegion _keyword = _regionFor.keyword(":");
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(_keyword, _function_1);
    VarType _type = variable.getType();
    document.<VarType>format(_type);
  }
  
  protected void _format(final VarType varType, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.<VarType>surround(varType, _function);
  }
  
  protected void _format(final BlockCommand blockCommand, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    BlockCommand _prepend = document.<BlockCommand>prepend(blockCommand, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.<BlockCommand>append(_prepend, _function_1);
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(blockCommand);
    final ISemanticRegion beginCommands = _regionFor.keyword("inicio");
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(blockCommand);
    final ISemanticRegion endCommands = _regionFor_1.keyword("fimalgoritmo");
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    ISemanticRegion _surround = document.surround(beginCommands, _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(_surround, _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(beginCommands, endCommands, _function_4);
    EList<AbstractCommand> _commands = blockCommand.getCommands();
    document.<EList<AbstractCommand>>format(_commands);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(endCommands, _function_5);
  }
  
  protected void _format(final EList<AbstractCommand> commands, @Extension final IFormattableDocument document) {
    for (final AbstractCommand command : commands) {
      final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
        it.newLine();
      };
      document.<AbstractCommand>prepend(command, _function);
    }
  }
  
  protected void _format(final VarDeclaration varDeclaration, @Extension final IFormattableDocument document) {
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(varDeclaration);
    List<ISemanticRegion> _keywords = _regionFor.keywords(",");
    for (final ISemanticRegion commas : _keywords) {
      final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
        it.noSpace();
      };
      ISemanticRegion _prepend = document.prepend(commas, _function);
      final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
        it.oneSpace();
        it.autowrap();
      };
      document.append(_prepend, _function_1);
    }
  }
  
  protected void _format(final SubprogramParamDeclaration subprogramParamDeclaration, @Extension final IFormattableDocument document) {
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(subprogramParamDeclaration);
    List<ISemanticRegion> _keywords = _regionFor.keywords(";");
    for (final ISemanticRegion variables : _keywords) {
      final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
        it.oneSpace();
        it.autowrap();
      };
      document.append(variables, _function);
    }
  }
  
  public void format(final Object commands, final IFormattableDocument document) {
    if (commands instanceof XtextResource) {
      _format((XtextResource)commands, document);
      return;
    } else if (commands instanceof EList) {
      _format((EList<AbstractCommand>)commands, document);
      return;
    } else if (commands instanceof BlockFunction) {
      _format((BlockFunction)commands, document);
      return;
    } else if (commands instanceof BlockProcedure) {
      _format((BlockProcedure)commands, document);
      return;
    } else if (commands instanceof BlockCommand) {
      _format((BlockCommand)commands, document);
      return;
    } else if (commands instanceof DeclarationsBlock) {
      _format((DeclarationsBlock)commands, document);
      return;
    } else if (commands instanceof HeaderBlock) {
      _format((HeaderBlock)commands, document);
      return;
    } else if (commands instanceof Model) {
      _format((Model)commands, document);
      return;
    } else if (commands instanceof SubprogramParamDeclaration) {
      _format((SubprogramParamDeclaration)commands, document);
      return;
    } else if (commands instanceof Subprograms) {
      _format((Subprograms)commands, document);
      return;
    } else if (commands instanceof VarDeclaration) {
      _format((VarDeclaration)commands, document);
      return;
    } else if (commands instanceof VarType) {
      _format((VarType)commands, document);
      return;
    } else if (commands instanceof Variable) {
      _format((Variable)commands, document);
      return;
    } else if (commands instanceof EObject) {
      _format((EObject)commands, document);
      return;
    } else if (commands == null) {
      _format((Void)null, document);
      return;
    } else if (commands != null) {
      _format(commands, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(commands, document).toString());
    }
  }
}
