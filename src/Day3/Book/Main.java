package Day3.Book;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Book book1 = new Book("Harry Potter","Rhythm gurung",500.0);

        System.out.println(book1.getAuthor());
     book1.setPrice(1000.0);
     System.out.println(book1.getPrice());


        ArrayList<Book> bookStorage = new ArrayList<>();
        bookStorage.add(book1);

    }

}
