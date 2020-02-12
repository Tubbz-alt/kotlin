/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.conversion.copy

import org.jetbrains.kotlin.idea.AbstractCopyPasteTest
import org.jetbrains.kotlin.idea.configuration.ExperimentalFeatures

abstract class AbstractJ2kCopyPasteTest : AbstractCopyPasteTest() {
    protected open fun isNewJ2K(): Boolean = false

    override fun setUp() {
        super.setUp()
        ExperimentalFeatures.newJ2k.isEnabled = isNewJ2K()
    }
}