package 网络聊天小程序;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import static 网络聊天小程序.Server.SERVER_PORT;

public class Client {
    public static void main(String[] args) {
        commWithServer();
    }

    private static void commWithServer() {
        try (
                Socket socket = new Socket("localhost", SERVER_PORT)
        ) {
            Chat chat = new Chat("服务器端", null, socket);
            chat.chatting();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("程序退出！");
    }
}
