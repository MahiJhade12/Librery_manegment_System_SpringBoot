package LMS.com.Service;

import LMS.com.Convertor.BookConverter;
import LMS.com.Models.Author;
import LMS.com.Models.Book;
import LMS.com.Repository.AuthorRepository;
import LMS.com.Repository.BookRepository;
import LMS.com.RequestDTO.BookRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    BookRepository bookRepository;
    public String createBook(BookRequestDto bookRequestDto){
        Book book= BookConverter.convertBootDtoToEntity(bookRequestDto);
        int authorId= bookRequestDto.getAuthorId();
        Author author= authorRepository.findById(authorId).get();
        book.setAuthor(author);
        //book list need to update

        List<Book> currentListOfAuthorBook=author.getWittenBooks();
        currentListOfAuthorBook.add(book);
        author.setWittenBooks(currentListOfAuthorBook);

        ///save author save book

        authorRepository.save(author);

        bookRepository.save(book);
        return "successfully added bboks";
    }
}
