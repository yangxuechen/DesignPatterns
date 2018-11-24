package test;

//抽象播放器类：抽象类
abstract class OperationSystemVersion {
    protected VideoFile videoFile;
    public void setVideoFile(VideoFile videoFile){
        this.videoFile=videoFile;
    }
    public abstract void play(String flieName);
}
