package com.github.radu88253.cobolparser

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import com.intellij.openapi.util.NlsContexts
import org.jetbrains.annotations.NonNls
import javax.swing.Icon

class CobolColorSettingsPage : ColorSettingsPage {

    companion object{
        private val DESCRIPTORS = arrayOf(
            AttributesDescriptor("Keyword", CobolSyntaxHighlighter.KEYWORD),
            AttributesDescriptor("Identifier", CobolSyntaxHighlighter.IDENTIFIER),
            AttributesDescriptor("Number", CobolSyntaxHighlighter.NUMBER),
            AttributesDescriptor("Line number", CobolSyntaxHighlighter.LINE_NUMBER),
            AttributesDescriptor("String", CobolSyntaxHighlighter.STRING),
            AttributesDescriptor("Operator", CobolSyntaxHighlighter.OPERATOR),
            AttributesDescriptor("Dot", CobolSyntaxHighlighter.DOT),
            AttributesDescriptor("Parentheses", CobolSyntaxHighlighter.PAREN),
            AttributesDescriptor("Bad value", CobolSyntaxHighlighter.BAD_CHARACTER),

            )
    }

    override fun getIcon(): Icon {
        return CobolIcons.FILE
    }

    override fun getHighlighter(): SyntaxHighlighter {
        return CobolSyntaxHighlighter()
    }

    override fun getDemoText(): @NonNls String {
        //bad indentation is intentional, lexer uses line start to detect line numbers
        return """
01 IDENTIFICATION DIVISION.
02 PROGRAM-ID. HELLO.
03 DATA DIVISION.
04 WORKING-STORAGE SECTION.
05 01 WS-A PIC 9(2) VALUE 0.
06 PROCEDURE DIVISION.
07 A-PARA.
08 PERFORM B-PARA VARYING WS-A FROM 2 BY 2 UNTIL WS-A=12
09 STOP RUN.
10 B-PARA.
11 DISPLAY 'B-PARA ' WS-A.
12 DISPLAY 'B-PARA'.""";
    }

    override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String?, TextAttributesKey?>? {
        return null
    }

    override fun getAttributeDescriptors(): Array<out AttributesDescriptor> {
        return DESCRIPTORS
    }

    override fun getColorDescriptors(): Array<out ColorDescriptor?> {
        return ColorDescriptor.EMPTY_ARRAY
    }

    override fun getDisplayName(): @NlsContexts.ConfigurableName String {
        return "COBOL"
    }

}