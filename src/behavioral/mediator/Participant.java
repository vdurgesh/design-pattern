package behavioral.mediator;


public abstract class Participant {
    private ChatMediator chatMediator;
    private String name;

    public Participant(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ChatMediator getChatMediator() {
        return chatMediator;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}
