package vaibhavhajela;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by vaibhavhajela on 19/12/20.
 */
@RestController
public class BookController {

    @Autowired
    BookService bookService;


    @GetMapping("/books")
    List<Book> getAllBooks(){
        System.out.println("Called Get Books");
        return bookService.getBooks();
    }

    @PostMapping("/books")
    @ResponseStatus(HttpStatus.CREATED)
    Book createBook(@RequestBody Book newBook){
        System.out.println("called post book" + newBook);
        return bookService.createBook(newBook);
    }

}
