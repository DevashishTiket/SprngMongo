package controller;
import model.Book;
import org.springframework.http.HttpStatus;
import repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

// Class
public class BookController {

    @Autowired
    private BookRepo repo;

    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book){
        repo.save(book);

        return "Added Successfully";
    }
    @ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Error")
    @GetMapping("/")
    public String trial(){
        return ("Trial hit on the API");
    }
    @GetMapping("/findAllBooks")
    public List<Book> getBooks() {

        return repo.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id){
        repo.deleteById(id);

        return "Deleted Successfully";
    }

}