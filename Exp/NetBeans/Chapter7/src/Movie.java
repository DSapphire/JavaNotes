import java.util.*;
public class Movie {
    //ʵ������
    private String     title, type;
    private Vector     actors;
    //get��set����
    public String getTitle() { return title; }
    public String getType() { return type; }
    public Vector getActors() { return actors; }
    public void setTitle(String aTitle) { title = aTitle; }
    public void setType(String aType) { type = aType; }
    //�޲ι��췽��
    public Movie() {
        this("???", "???");
    }
    //���������Ĺ��췽��
    public Movie(String aTitle, String aType) {
        title = aTitle;
        type = aType;
        actors = new Vector();
    }
    //toString����
    public String toString() {
        return("Movie: " + "\"" + title + "\"");
    }
    //��Movieʵ��������һ����Ա��
    public void addActor(String anActor) {
        actors.add(anActor);
    }
}
