package behavioral.memento;


import java.util.ArrayList;
import java.util.List;

public class Client {
    /*
        The memento pattern is implemented with three objects: the originator, a caretaker and a memento.
         The originator is some object that has an internal state. The caretaker is going to do something
      to the originator, but wants to be able to undo the change. The caretaker first asks the originator
       for a memento object. Then it does whatever operation (or sequence of operations)
        it was going to do. To roll back to the state before the operations, it returns the memento object to the originator.
         The memento object itself is an opaque object (one which the caretaker cannot, or should not, change).
          When using this pattern, care should be taken if the originator may change other objects or resources
          - the memento pattern operates on a single object.
     */
    public static void main(String args[]) {
        Caretaker caretaker = new Caretaker();

        Originator originator = new Originator();
        originator.setState("State1");
        originator.setState("State2");
        caretaker.addMemento(originator.save());
        originator.setState("State3");
        caretaker.addMemento(originator.save());
        originator.setState("State4");

        originator.restore(caretaker.getMemento(1));
    }
}
