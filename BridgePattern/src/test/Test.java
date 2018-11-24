package test;

public class Test {
    public static void main(String[] args) {
        VideoFile videoFile;
        OperationSystemVersion operationSystemVersion;

        videoFile=new RMVBFile();
        operationSystemVersion =new LinuxVersion();
        operationSystemVersion.setVideoFile(videoFile);
        operationSystemVersion.play("《让子弹飞》");
    }
}
