package test;

/**
 * 窗体装饰类：抽象装饰者类
 */
public class WindowDeractor extends Window {
    private Window window;
    public WindowDeractor(Window window){
        this.window=window;
    }
    @Override
    public void display() {
        window.display();
    }
}
