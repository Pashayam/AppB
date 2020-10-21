import io.grpc.ServerBuilder;

import java.io.IOException;

public class Server {
    public static void main(String[] args) {
        io.grpc.Server server = ServerBuilder
                .forPort(8080)
                .addService(new ServerImpl()).build();

        try {
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            server.awaitTermination();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
