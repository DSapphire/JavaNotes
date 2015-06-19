import java.util.*;
public class Movie {
    //实例属性
    private String     title, type;
    private Vector     actors;
    //get及set方法
    public String getTitle() { return title; }
    public String getType() { return type; }
    public Vector getActors() { return actors; }
    public void setTitle(String aTitle) { title = aTitle; }
    public void setType(String aType) { type = aType; }
    //无参构造方法
    public Movie() {
        this("???", "???");
    }
    //两个参数的构造方法
    public Movie(String aTitle, String aType) {
        title = aTitle;
        type = aType;
        actors = new Vector();
    }
    //toString方法
    public String toString() {
        return("Movie: " + "\"" + title + "\"");
    }
    //向Movie实例中增加一个演员。
    public void addActor(String anActor) {
        actors.add(anActor);
    }
}
