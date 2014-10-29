import greenfoot.World

/**
 * A Groovy Duke that can handle events elegantly
 */
class GroovyDuke extends EnhancedActor {
    int clicks = 0

    @Override
    protected void addedToWorld(World world) {
        super.addedToWorld(world)
        world.showText("I'm groovy!", x - 100, y - 120)
        world.showText("Click on me or press left/right", x - 80, y - 100)
    }

    void doAct() {
        if (clicks) {
            world.showText("You clicked me $clicks times", 200, y + 80)
        }
    }

    void onClicked() {
        clicks++
    }

    void onLeftKeyDown() {
        move(-10)
    }

    void onRightKeyDown() {
        move(10)
    }
}
