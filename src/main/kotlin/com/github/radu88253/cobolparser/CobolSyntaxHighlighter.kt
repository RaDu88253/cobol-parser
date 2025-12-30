package com.github.radu88253.cobolparser

import com.github.radu88253.cobolparser.psi.CobolTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.editor.markup.TextAttributes
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.intellij.ui.JBColor
import java.awt.Color
import java.awt.Font

class CobolSyntaxHighlighter : SyntaxHighlighterBase() {

    companion object{
        val KEYWORD = createTextAttributesKey(
            "COBOL_KEYWORD",
            DefaultLanguageHighlighterColors.KEYWORD
        )
        val IDENTIFIER = createTextAttributesKey(
            "COBOL_IDENTIFIER",
            DefaultLanguageHighlighterColors.IDENTIFIER
        )
        val NUMBER = createTextAttributesKey(
            "COBOL_NUMBER",
            DefaultLanguageHighlighterColors.NUMBER
        )
        val LINE_NUMBER = createTextAttributesKey(
            "COBOL_LINE_NUMBER",
            DefaultLanguageHighlighterColors.LABEL
        )
        val STRING = createTextAttributesKey(
            "COBOL_STRING",
            DefaultLanguageHighlighterColors.STRING
        )
        val OPERATOR = createTextAttributesKey(
            "COBOL_OPERATOR",
            DefaultLanguageHighlighterColors.OPERATION_SIGN
        )
        val DOT = createTextAttributesKey(
            "COBOL_DOT",
            DefaultLanguageHighlighterColors.DOT
        )
        val PAREN = createTextAttributesKey(
            "COBOL_PARENTHESIS",
            DefaultLanguageHighlighterColors.OPERATION_SIGN
        )
        val BAD_CHARACTER = createTextAttributesKey(
            "SIMPLE_SEPARATOR",
            HighlighterColors.BAD_CHARACTER
        )

        private val KEYWORD_KEYS = arrayOf(KEYWORD)
        private val IDENTIFIER_KEYS = arrayOf(IDENTIFIER)
        private val NUMBER_KEYS = arrayOf(NUMBER)
        private val LINE_NUMBER_KEYS = arrayOf(LINE_NUMBER)
        private val STRING_KEYS = arrayOf(STRING)
        private val OPERATOR_KEYS = arrayOf(OPERATOR)
        private val DOT_KEYS = arrayOf(DOT)
        private val PAREN_KEYS = arrayOf(PAREN)
        private val BAD_CHAR_KEYS = arrayOf(BAD_CHARACTER)
        private val EMPTY_KEYS : Array<TextAttributesKey> = emptyArray()
    }

    override fun getHighlightingLexer(): Lexer {
        return CobolLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<out TextAttributesKey> {
        return when (tokenType) {
            CobolTypes.KEYWORD -> KEYWORD_KEYS
            CobolTypes.IDENTIFIER -> IDENTIFIER_KEYS
            CobolTypes.NUMBER -> NUMBER_KEYS
            CobolTypes.LINE_NUMBER -> LINE_NUMBER_KEYS
            CobolTypes.STRING -> STRING_KEYS
            CobolTypes.OPERATOR -> OPERATOR_KEYS
            CobolTypes.DOT -> DOT_KEYS
            CobolTypes.LPAREN, CobolTypes.RPAREN -> PAREN_KEYS
            TokenType.BAD_CHARACTER -> BAD_CHAR_KEYS
            else -> EMPTY_KEYS
        }
    }
}