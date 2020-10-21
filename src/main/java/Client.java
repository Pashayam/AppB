import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
//import com.grpc.*;

public class Client {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        DataNumberGrpc.DataNumberBlockingStub stub = DataNumberGrpc.newBlockingStub(channel);
        Data.Text text = stub.getPhoneNumber(Data.Text.newBuilder().setData("79268581169").build());


        System.out.println(text.getData());

        channel.shutdown();
    }
}