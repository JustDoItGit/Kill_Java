package 再探聊天室.chatroom;

import 再探聊天室.chatroom.client.ChatRoomClient;

import java.io.IOException;

public class ChatRoomClientAppMain {
    public static void main(String[] args) throws IOException {
        String server = args[0];
        ChatRoomClient client = new ChatRoomClient(server);
        client.start();
    }
}
