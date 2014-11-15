package behavioral.command;


public class Client {
/*
    Four terms always associated with the command pattern are command, receiver, invoker and client.
    A command object has a receiver object and invokes a method of the receiver in a way that
    is specific to that receiver's class. The receiver then does the work.
    A command object is separately passed to an invoker object, which invokes the command,
    and optionally does bookkeeping about the command execution.

    Any command object can be passed to the same invoker object. Both an invoker object
    and several command objects are held by a client object.
    The client contains the decision making about which commands to execute at which points.
    To execute a command, it passes the command object to the invoker object.
*/

    public static void main(String[] args) {
        ControlInvoker control = new ControlInvoker();

        Light light = new Light();

        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);

        //switch on
        control.setCommand(lightsOn);
        control.pressButton();

        //switch off
        control.setCommand(lightsOff);
        control.pressButton();

    }

}