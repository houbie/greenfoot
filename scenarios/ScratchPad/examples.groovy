import greenfoot.*
import greenfoot.core.*

//start the scenario
greenfoot.export.GreenfootScenarioMain.main()
//get the world
world = greenfoot.core.WorldHandler.instance.world
simulation= Simulation.instance

//press CTRL+Enter (Cmd+Enter on Mac) and then click the 'Run' button

//now we can start to play...

//create a new Actor class (it doesn't have to do anything)
class MyActor extends Actor {

}

//add a new instance to the world
actor = new MyActor()
world.addObject(actor, 100, 100)

// let it move around, give it an image ...
actor.move(100)
actor.turn(90)
actor.move(-50)
actor.setImage("groovy-duke.jpg")

// When you define variable without a type (like we did with world and actor), then you can reuse that variable
// after executing a piece of code, but you won't have good code completion
// When you define a typed variable (see below) you will get code completion, but the variable won't exist anymore after
// executing the code

Actor duke = actor
1.upto(10){ //an alternative for-loop in groovy
    duke.turn(10)
    duke.move(20)
    sleep(500)
}

//in stead of clicking 'Run' in greenfoot, we can programmatically 'click' the Act button
actor.turn(10)
actor.move(20)
sleep(500)
simulation.runOnce()