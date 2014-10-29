import greenfoot.World

/**
 * A groovier world
 */
class GroovyWorld extends World {

    /**
     * Constructor for objects of class GroovyWorld.
     *
     */
    GroovyWorld() {
        super(600, 400, 1);
        addObject(new GroovyDuke(), 300, 200)
    }
}
