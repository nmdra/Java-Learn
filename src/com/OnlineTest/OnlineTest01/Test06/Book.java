package OnlineTest.OnlineTest01.Test06;

public class Book {
    private String title;
    private String author;
    private int pageCount;

    public Book(){
        this.title = "";
        this.author = "";
        this.pageCount = 0;
    }

    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public boolean isShortBook(){
        if(pageCount < 200){
            return true;
        } else {
            return false;
        }
    }

    public void print(){

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);

        if(isShortBook() == true){
            System.out.println("Is a Short book.");
        } else {
            System.out.println("Is not a Short Book.");
        }
    }

}
