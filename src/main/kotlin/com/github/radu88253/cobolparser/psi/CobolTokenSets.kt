package com.github.radu88253.cobolparser.psi

import com.intellij.psi.tree.TokenSet

object CobolTokenSets {

    val IDENTIFIERS = TokenSet.create(CobolTypes.IDENTIFIER)
    val KEYWORDS = TokenSet.create(CobolTypes.KEYWORD)
    val WHITESPACES = TokenSet.create(CobolTypes.CRLF)

}