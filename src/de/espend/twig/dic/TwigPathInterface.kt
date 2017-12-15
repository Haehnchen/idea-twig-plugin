package de.espend.twig.dic

import de.espend.twig.utils.TwigUtil

/**
 * @author Daniel Espendiller <daniel></daniel>@espendiller.net>
 */
interface TwigPathInterface {
    val namespace: String
    val path: String
    val isGlobalNamespace: Boolean
    val isEnabled: Boolean
    val getNamespaceType: TwigUtil.NamespaceType
}