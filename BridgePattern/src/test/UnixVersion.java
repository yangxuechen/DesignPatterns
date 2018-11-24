package test;

public class UnixVersion extends OperationSystemVersion {
    @Override
    public void play(String flieName) {
        videoFile.decode("Unix",flieName);
    }
}
