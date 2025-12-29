package com.github.radu88253.cobolparser

import com.github.radu88253.cobolparser.lexer.CobolLexer
import com.intellij.lexer.FlexAdapter

class CobolLexerAdapter : FlexAdapter(CobolLexer(null)) {
}