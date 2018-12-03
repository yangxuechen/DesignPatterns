package test;

/**
 * 透明窗体装饰类：具体装饰类
 */
public class TransparentDecorator extends WindowDeractor {
    public TransparentDecorator(Window window) {
        super(window);
    }

    @Override
    public void display() {
        this.setTransparent();
        super.display();
    }
    public void setTransparent(){
        System.out.println("将窗体设置为透明窗体");
    }
}
