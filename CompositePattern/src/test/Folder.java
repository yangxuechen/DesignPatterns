package test;

import java.util.ArrayList;

//文件夹类：容器构件
public class Folder extends AbstractFile {

    private ArrayList fileList=new ArrayList();
    private String fileName;

    public Folder(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void add(AbstractFile element) {
        fileList.add(element);
    }

    @Override
    public void remove(AbstractFile element) {
        fileList.remove(element);
    }

    @Override
    public void display() {
        System.out.println("文件夹-"+fileName+"-包含如下资料：");
        for(Object o:fileList){
            ((AbstractFile)o).display();
        }
    }
}
