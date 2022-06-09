package repository;
import model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo
        extends MongoRepository<Book, Integer> {
}