package Day3.Book;

public class Book {
   private String title;
   private String author;
   private Double price;
    Book(String title,String author,Double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public Double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

}
