package de.espend.twig

import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.util.xmlb.XmlSerializerUtil

/**
 * @author Daniel Espendiller <daniel@espendiller.net>
 */
class TwigSettings: PersistentStateComponent<TwigSettings> {
    override fun loadState(settings: TwigSettings) {
        XmlSerializerUtil.copyBean<TwigSettings>(settings, this)
    }

    override fun getState(): TwigSettings? {
        return this;
    }
}