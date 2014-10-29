import greenfoot.Actor
import greenfoot.Greenfoot;

/**
 * A car that can be driven with the right/left cursor keys.
 *
 * @author mik
 * @version 1.0
 */
class Car extends Actor {
    /**
     * Drive and allow steering.
     */
    void act() {
        if (Greenfoot.isKeyDown("left")) {
            turn(3)
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(15)
        }
        move(4);
    }
}