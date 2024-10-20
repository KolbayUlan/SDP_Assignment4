package ChatRoomApplication;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new RegularUser(chatRoom, "Alice");
        User user2 = new RegularUser(chatRoom, "Berik");
        User user3 = new PremiumUser(chatRoom, "Chaplin");
        User user4 = new PremiumUser(chatRoom, "Diana");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);

        user1.sendMessage("Hello everyone!");
        user3.sendMessage("Hi Alice!");
        user4.sendMessage("Good morning!");
    }
}
