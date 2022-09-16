package entities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private Date moment;
    private String title;
    private String content;
    private int likes;

    private List<Comment> comments = new ArrayList<>();

    public Post() {
    }

    public Post(Date moment, String title, String content, int likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComent(Comment comment){
        comments.add(comment);
    }

    public void removeComent(Comment comment){
        comments.remove(comment);
    }

    public String toString(){
        return String.format("Title: %s\n Content: %s\n Likes %d\n Date: %Date ", title, content, likes, moment);
    }
}
