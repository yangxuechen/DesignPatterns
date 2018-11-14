package test;

public class WeeklyLog implements Cloneable {
    private String name;  //姓名
    private String date;  //日期
    private String content; //内容

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }
    //克隆方法，此处使用java语言提供的浅克隆机制
    public Object clone(){
        Object object=null;

        try {
            object=super.clone();
            return object;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
