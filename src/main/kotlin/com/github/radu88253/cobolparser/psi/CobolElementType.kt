package com.github.radu88253.cobolparser.psi

import com.github.radu88253.cobolparser.CobolLanguage
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls

class CobolElementType(@NonNls debugName: String) : IElementType(debugName, CobolLanguage)