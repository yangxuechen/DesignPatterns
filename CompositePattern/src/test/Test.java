package test;

public class Test {
    public static void main(String[] args) {
        AbstractFile file1,file2,file3,file4,file5,folder1,folder2,folder3;

        file1=new ImageFile("房子.gif");
        file2=new ImageFile("美女.jpg");
        file3=new TextFile("设计模式.txt");
        file4=new TextFile("java.doc");
        file5=new VideoFile("非诚勿扰.rmvb");

        folder1=new Folder("图片");
        folder1.add(file1);
        folder1.add(file2);

        folder2=new Folder("学习资料");
        folder2.add(file3);
        folder2.add(file4);

        folder3=new Folder("个人资料");
        folder3.add(file5);
        folder3.add(folder1);
        folder3.add(folder2);

        folder3.display();
    }
}
