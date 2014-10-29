import greenfoot.Actor
import greenfoot.Greenfoot

/**
 * A car that can be driven with the right/left cursor keys.
 *
 * @author mik
 * @version 1.0
 */
class Car extends Actor {
    /**
     * Constructor for Car - nothing to do.
     */
    Car() {
    }

    /**
     * Drive and allow steering.
     */
    void act() {
        if (Greenfoot.isKeyDown("left")) {
            turn(-5)
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(5)
        }
        move(4)
    }
}