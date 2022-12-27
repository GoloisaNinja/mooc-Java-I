
public class Main {

    public static void main(String[] args) {

        Message myMessage = new Message("Jackers", "Hello beautiful wifey - how is your day going my love?");
        MessagingService JackText = new MessagingService();
        System.out.println(JackText.getMessages());
        JackText.add(myMessage);
        System.out.println(JackText.getMessages());
    }
}
