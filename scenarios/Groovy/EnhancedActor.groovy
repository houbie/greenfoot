import greenfoot.Actor
import greenfoot.Greenfoot

/**
 * An actor that supports event handlers based on naming conventions
 * like onClicked, onUpKeyDown, onLeftKeyDown etc.
 */
abstract class EnhancedActor extends Actor {
    def onClicked
    def keyDownHandlers

    EnhancedActor() {
        onClicked = getClass().getMethod("onClicked")
        keyDownHandlers = getClass().methods.findAll { it.name ==~ /on(\w+)KeyDown/ }.collectEntries {
            String key = (it.name =~ /on(\w+)KeyDown/)[0][1]
            [(key.toLowerCase()): it]
        }
    }

    /**
     * Act: call doAct() and handle event handlers.
     */
    void act() {
        doAct()

        if (Greenfoot.mouseClicked(this) && onClicked) {
            onClicked.invoke(this)
        }
        for (key in keyDownHandlers.keySet()) {
            if (Greenfoot.isKeyDown(key)) {
                keyDownHandlers[key].invoke(this)
            }
        }
    }
    /**
     * The actual act implementation
     */
    abstract void doAct()
}
