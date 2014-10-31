import greenfoot.World

/**
 * A groovier world
 */
class GroovyWorld extends World {
    GroovyDuke duke

    /**
     * Constructor for objects of class GroovyWorld.
     *
     */
    GroovyWorld() {
        super(600, 400, 1);
        duke = new GroovyDuke()
        addObject(duke, 300, 200)
    }
}
