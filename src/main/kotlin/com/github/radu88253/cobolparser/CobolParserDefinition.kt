package com.github.radu88253.cobolparser

import com.github.radu88253.cobolparser.parser.CobolParserClass
import com.github.radu88253.cobolparser.psi.CobolFile
import com.github.radu88253.cobolparser.psi.CobolTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import com.github.radu88253.cobolparser.CobolLexerAdapter


class CobolParserDefinition : ParserDefinition{

    companion object {
        @JvmField
        val FILE: IFileElementType = IFileElementType(CobolLanguage)
    }

    override fun createLexer(p0: Project?): Lexer {
        return CobolLexerAdapter()
    }

    override fun getCommentTokens(): TokenSet {
        return TokenSet.EMPTY
    }

    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    override fun getWhitespaceTokens(): TokenSet {
        return TokenSet.EMPTY
    }

    override fun createParser(project: Project?): PsiParser {
        return CobolParserClass()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return CobolFile(viewProvider)
    }

    override fun createElement(node: ASTNode): PsiElement {
        return CobolTypes.Factory.createElement(node)
    }



}