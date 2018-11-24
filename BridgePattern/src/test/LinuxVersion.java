package test;

public class LinuxVersion extends OperationSystemVersion {
    @Override
    public void play(String flieName) {
        videoFile.decode("Linux",flieName);
    }
}
