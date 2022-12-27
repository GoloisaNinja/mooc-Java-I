import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messages;
    // Constructor
    public MessagingService() {
        this.messages = new ArrayList<>();
    }
    // Methods
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            messages.add(message);
        }
    }
    public ArrayList<Message> getMessages() {
        return this.messages;
    }
}
