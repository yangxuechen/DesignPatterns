package test;

public class Test {
    public static void main(String[] args) {
        Window windowS,windowSB,windowT;
        windowS=new SimpleWindow();//定义简单窗体
        windowSB=new ScrollbarDecoractor(windowS);//装饰窗体
        windowT=new TransparentDecorator(windowSB);//继续装饰窗体

        windowT.display();
    }
}
