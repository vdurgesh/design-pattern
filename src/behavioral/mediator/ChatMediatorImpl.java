package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private List<Participant> participants;

    public ChatMediatorImpl() {
        this.participants = new ArrayList<Participant>();
    }

    public void sendMessage(Participant sender, String msg) {
        for(Participant participant : this.participants) {
            if(!sender.getName().equals(participant.getName())) {
                participant.receive(msg);
            }
        }
    }

    public void addParticipant(Participant participant) {
        this.participants.add(participant);
    }
}
