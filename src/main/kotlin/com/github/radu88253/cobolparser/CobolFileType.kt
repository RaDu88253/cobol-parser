package com.github.radu88253.cobolparser

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class CobolFileType : LanguageFileType(CobolLanguage) {

    override fun getName(): String = "COBOL"
    override fun getDescription(): String = "COBOL source file"

    override fun getDefaultExtension(): String = "cob"

    override fun getIcon(): Icon = CobolIcons.FILE

}