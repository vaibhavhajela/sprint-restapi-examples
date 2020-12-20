package vaibhavhajela;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by vaibhavhajela on 19/12/20.
 */
@Repository
public class BookReposittory {

    private HashMap<Long,Book> books = new HashMap<>();

    public BookReposittory(){
        Book book = new Book("Intelligent Investor","Stephen",new BigDecimal(100));
        books.put(book.getId(),book);
    }

    public List<Book> getBooks(){
        return  new ArrayList(books.values());
    }

    public Book addNewBook(Book book){
        return books.put(book.getId(),book);
    }


}
