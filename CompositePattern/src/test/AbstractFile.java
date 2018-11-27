package test;

//抽象文件夹 ：抽象构件
abstract class AbstractFile {
    public abstract void add(AbstractFile element);
    public abstract void remove(AbstractFile element);
    public abstract void display();
}
