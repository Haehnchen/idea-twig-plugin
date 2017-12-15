package de.espend.twig.extension

import de.espend.twig.dic.TwigPathInterface

/**
 * @author Daniel Espendiller <daniel@espendiller.net>
 */
interface TwigNamespaceExtension {
    fun getNamespaces(parameter: TwigNamespaceExtensionParameter): Collection<TwigPathInterface>
}
