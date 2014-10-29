import greenfoot.World

/**
 * A background with a path drawn on it. Two different backgrounds are available.
 *
 * @author mik
 * @version 1.0
 */
class Ground extends World {

    /**
     * Create the field.
     */
    Ground() {
        super(800, 540, 1)
        addObject(new Car(), 180, 450)
    }

    void showMap1() {
        setBackground("ground.png")
    }

    void showMap2() {
        setBackground("ground2.png")
    }

}
