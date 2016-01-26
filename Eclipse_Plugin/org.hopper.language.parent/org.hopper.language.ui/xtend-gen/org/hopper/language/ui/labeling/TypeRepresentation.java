package org.hopper.language.ui.labeling;

import org.hopper.language.portugol.VarType;

@SuppressWarnings("all")
public class TypeRepresentation {
  public String representation(final VarType type) {
    return type.getTypeName();
  }
}
