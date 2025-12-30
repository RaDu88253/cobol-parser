// This is a generated file. Not intended for manual editing.
package com.github.radu88253.cobolparser.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.radu88253.cobolparser.psi.CobolTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CobolParserClass implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return program(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // IDENTIFIER LPAREN NUMBER RPAREN | NUMBER LPAREN NUMBER RPAREN
  public static boolean PIC_CLAUSE(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PIC_CLAUSE")) return false;
    if (!nextTokenIs(builder_, "<pic clause>", IDENTIFIER, NUMBER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PIC_CLAUSE, "<pic clause>");
    result_ = parseTokens(builder_, 0, IDENTIFIER, LPAREN, NUMBER, RPAREN);
    if (!result_) result_ = parseTokens(builder_, 0, NUMBER, LPAREN, NUMBER, RPAREN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // LINE_NUMBER (token DOT?)+ (CRLF | EOF?)
  public static boolean line(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "line")) return false;
    if (!nextTokenIs(builder_, LINE_NUMBER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LINE_NUMBER);
    result_ = result_ && line_1(builder_, level_ + 1);
    result_ = result_ && line_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, LINE, result_);
    return result_;
  }

  // (token DOT?)+
  private static boolean line_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "line_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = line_1_0(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!line_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "line_1", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // token DOT?
  private static boolean line_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "line_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = token(builder_, level_ + 1);
    result_ = result_ && line_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // DOT?
  private static boolean line_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "line_1_0_1")) return false;
    consumeToken(builder_, DOT);
    return true;
  }

  // CRLF | EOF?
  private static boolean line_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "line_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CRLF);
    if (!result_) result_ = line_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // EOF?
  private static boolean line_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "line_2_1")) return false;
    consumeToken(builder_, EOF);
    return true;
  }

  /* ********************************************************** */
  // line+
  static boolean program(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "program")) return false;
    if (!nextTokenIs(builder_, LINE_NUMBER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = line(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!line(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "program", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // STRING | KEYWORD | PIC_CLAUSE | OPERATOR | NUMBER | IDENTIFIER
  public static boolean token(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "token")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TOKEN, "<token>");
    result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = consumeToken(builder_, KEYWORD);
    if (!result_) result_ = PIC_CLAUSE(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, OPERATOR);
    if (!result_) result_ = consumeToken(builder_, NUMBER);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

}
