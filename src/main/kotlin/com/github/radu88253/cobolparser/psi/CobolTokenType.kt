package com.github.radu88253.cobolparser.psi

import com.github.radu88253.cobolparser.CobolLanguage
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls

class CobolTokenType(@NonNls debugName: String) : IElementType(debugName, CobolLanguage){

    override fun toString(): String{
        return "CobolTokenType." + super.toString()
    }

}

/*
public class SimpleTokenType extends IElementType {

  public SimpleTokenType(@NotNull @NonNls String debugName) {
    super(debugName, SimpleLanguage.INSTANCE);
  }

  @Override
  public String toString() {
    return "SimpleTokenType." + super.toString();
  }

}
 */