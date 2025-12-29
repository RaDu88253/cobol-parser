// This is a generated file. Not intended for manual editing.
package com.github.radu88253.cobolparser.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.radu88253.cobolparser.psi.impl.*;

public interface CobolTypes {

  IElementType LINE = new CobolElementType("LINE");
  IElementType LINE_NUMBER = new CobolElementType("LINE_NUMBER");
  IElementType PIC_CLAUSE = new CobolElementType("PIC_CLAUSE");
  IElementType TOKEN = new CobolElementType("TOKEN");

  IElementType CRLF = new CobolTokenType("CRLF");
  IElementType DOT = new CobolTokenType("DOT");
  IElementType EOF = new CobolTokenType("EOF");
  IElementType IDENTIFIER = new CobolTokenType("IDENTIFIER");
  IElementType KEYWORD = new CobolTokenType("KEYWORD");
  IElementType LPARAN = new CobolTokenType("LPARAN");
  IElementType NUMBER = new CobolTokenType("NUMBER");
  IElementType OPERATOR = new CobolTokenType("OPERATOR");
  IElementType RPARAN = new CobolTokenType("RPARAN");
  IElementType STRING = new CobolTokenType("STRING");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == LINE) {
        return new CobolLineImpl(node);
      }
      else if (type == LINE_NUMBER) {
        return new CobolLineNumberImpl(node);
      }
      else if (type == PIC_CLAUSE) {
        return new CobolPicClauseImpl(node);
      }
      else if (type == TOKEN) {
        return new CobolTokenImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
