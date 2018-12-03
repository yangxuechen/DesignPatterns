package test;

public class ScrollbarDecoractor extends WindowDeractor {
    public ScrollbarDecoractor(Window window) {
        super(window);
    }
    public void display(){
        this.setScrollerbar();
        super.display();
    }
    public void setScrollerbar(){
        System.out.println("给窗体增加滚动条");
    }
}
