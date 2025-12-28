package com.github.radu88253.cobolparser

import com.intellij.lang.Language

object CobolLanguage : Language("COBOL") {
    private fun readResolve(): Any = CobolLanguage
    override fun isCaseSensitive(): Boolean = false

}