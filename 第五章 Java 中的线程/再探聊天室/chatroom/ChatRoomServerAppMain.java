package 再探聊天室.chatroom;

import 再探聊天室.chatroom.server.ChatRoomServer;

import java.io.IOException;

import static 再探聊天室.chatroom.common.Constants.SERVER_PORT;

public class ChatRoomServerAppMain {
    public static void main(String[] args) throws IOException {
        ChatRoomServer server = new ChatRoomServer(SERVER_PORT);
        server.start();
    }
}
