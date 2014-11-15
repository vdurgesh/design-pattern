package behavioral.mediator;

import java.util.List;

public interface ChatMediator {
    public void sendMessage(Participant sender, String msg);

    public void addParticipant(Participant participant);
}
