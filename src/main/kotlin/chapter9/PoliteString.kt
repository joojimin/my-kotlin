package chapter9

import kotlin.reflect.KProperty

class PoliteString(var content: String) {
    operator fun getValue(thisRef: Any?, property: KProperty<*>) = content.replace("stupid", "s*****")
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        content = value
    }
}