package vaibhavhajela;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vaibhavhajela on 19/12/20.
 */
@Service
public class BookService {

    @Autowired
    BookReposittory bookReposittory;

    public List<Book> getBooks(){
        return bookReposittory.getBooks();
    }

    public Book createBook(Book newBook){
        return bookReposittory.addNewBook(newBook);
    }

}
