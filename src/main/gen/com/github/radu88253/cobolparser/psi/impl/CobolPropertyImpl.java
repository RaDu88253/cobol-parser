// This is a generated file. Not intended for manual editing.
package com.github.radu88253.cobolparser.psi.impl;


import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.radu88253.cobolparser.psi.*;

public class CobolPropertyImpl extends ASTWrapperPsiElement implements CobolProperty {

  public CobolPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

}
