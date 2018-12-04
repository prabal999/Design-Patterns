package com.prabalhub.design.patterns.behavioral.command;

/** The Command for turning off the light - ConcreteCommand #2 */
public class FlipDownCommand implements Command {
   private Light theLight;

   public FlipDownCommand(final Light light) {
      this.theLight = light;
   }

   // Command
   public void execute() {
      theLight.turnOff();
   }
}