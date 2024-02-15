package main.java.package3;

public class Textbook {
    private String title;
    private String author;
    private String publisher;

    public Textbook(String title, String author, String publisher){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle(){return this.title;}
    public String getAuthor(){return this.author;}
    public String getPublisher(){return this.publisher;}

    public void setTitle(String title) {this.title = title;}
    public void setAuthor(String author) {this.author = author;}
    public void setPublisher(String publisher) {this.publisher = publisher;}
    
}
