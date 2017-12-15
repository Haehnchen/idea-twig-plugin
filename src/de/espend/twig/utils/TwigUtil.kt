package de.espend.twig.utils

/**
 * @author Daniel Espendiller <daniel@espendiller.net>
 */
class TwigUtil {
    /**
     * Twig namespace for "non namespace"; its also a reserved value in Twig library
     */
    companion object {
        const val MAIN = "__main__"
    }

    /**
     * Twig namespace types; mainly switch for its prefix
     */
    enum class NamespaceType {
        BUNDLE, ADD_PATH
    }
}