package test;
//AVI格式视频文件类：具体实现类
public class AVIFile implements VideoFile {
    @Override
    public void decode(String osType, String fileName) {
        System.out.println("格式为AVI的视频文件"+fileName+"在"+osType+"平台中解码播放。");
    }
}
