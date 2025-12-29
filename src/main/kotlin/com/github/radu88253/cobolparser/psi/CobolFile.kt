package com.github.radu88253.cobolparser.psi

import com.github.radu88253.cobolparser.CobolFileType
import com.github.radu88253.cobolparser.CobolLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider
import com.intellij.openapi.fileTypes.FileType

class CobolFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, CobolLanguage){

    override fun getFileType() : FileType {
        return CobolFileType()
    }

    override fun toString() : String {
        return "COBOL File"
    }

}