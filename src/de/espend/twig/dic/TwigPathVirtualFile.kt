package de.espend.twig.dic

import de.espend.twig.utils.TwigUtil

/**
 * @author Daniel Espendiller <daniel@espendiller.net>
 */
class TwigPathVirtualFile(
        override val namespace: String,
        override val path: String,
        override val isGlobalNamespace: Boolean,
        override val isEnabled: Boolean,
        override val getNamespaceType: TwigUtil.NamespaceType
) : TwigPathInterface