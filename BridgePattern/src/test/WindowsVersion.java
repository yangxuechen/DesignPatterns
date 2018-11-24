package test;

public class WindowsVersion extends OperationSystemVersion {
    @Override
    public void play(String flieName) {
        videoFile.decode("Windows",flieName);
    }
}
