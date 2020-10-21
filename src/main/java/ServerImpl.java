import io.grpc.stub.StreamObserver;

public class ServerImpl extends DataNumberGrpc.DataNumberImplBase{
    @Override
    public void getPhoneNumber(Data.Text request, StreamObserver<Data.Text> responseObserver) {
        Data.Text text;
        if (request.getData().equals("79268581169")){
            text = Data.Text.newBuilder().setData("true").build();
        }else {
            text = Data.Text.newBuilder().setData("false").build();
        }
        responseObserver.onNext(text);
        responseObserver.onCompleted();
    }
}
