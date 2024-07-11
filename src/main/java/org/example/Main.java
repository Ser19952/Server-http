

import src.main.java.org.example.Server;

public class Main {
    public static void main(String[] args) {

        Server server = new Server(64);
        server.start(9999);
    }
}
