package behavioral.mediator;


public class ParticipantImpl extends Participant {

    public ParticipantImpl(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.getName()+": Send Message:"+msg);
        this.getChatMediator().sendMessage(this, msg);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.getName() +": Received Message:"+msg);
    }
}
