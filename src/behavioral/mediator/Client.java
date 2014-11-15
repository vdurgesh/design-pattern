package behavioral.mediator;


public class Client {
    public static void main(String [] args) {
            ChatMediator mediator = new ChatMediatorImpl();

            Participant participant1 = new ParticipantImpl(mediator, "Aaron");
            Participant participant2 = new ParticipantImpl(mediator, "David");
            Participant participant3 = new ParticipantImpl(mediator, "John");
            Participant participant4 = new ParticipantImpl(mediator, "Ryan");

            mediator.addParticipant(participant1);
            mediator.addParticipant(participant2);
            mediator.addParticipant(participant3);
            mediator.addParticipant(participant4);

            participant1.send("Hi All");

    }
}
