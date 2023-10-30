package application.loginpage;

public class Book {
    int ID;
    String title,author;

    public Book(int ID,String title,String author){
        this.ID=ID;
        this.author=author;
        this.title=title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getID() {
        return ID;
    }
}
