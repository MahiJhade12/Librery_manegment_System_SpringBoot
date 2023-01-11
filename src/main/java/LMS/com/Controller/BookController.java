package LMS.com.Controller;

import LMS.com.RequestDTO.BookRequestDto;
import LMS.com.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/create_book")
    public String createBook( @RequestBody()  BookRequestDto bookRequestDto){
      return bookService.createBook(bookRequestDto);
    }

}
