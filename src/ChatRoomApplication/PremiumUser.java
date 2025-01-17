package ChatRoomApplication;

public class PremiumUser extends User {

    public PremiumUser(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + " (Premium) sends: " + message);
        chatMediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " (Premium) receives: " + message);
    }
}

