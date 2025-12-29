// This is a generated file. Not intended for manual editing.
package com.github.radu88253.cobolparser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolLine extends PsiElement {

  @NotNull
  CobolLineNumber getLineNumber();

  @NotNull
  List<CobolToken> getTokenList();

}
