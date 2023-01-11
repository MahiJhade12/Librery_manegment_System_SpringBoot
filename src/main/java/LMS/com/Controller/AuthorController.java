package LMS.com.Controller;

import LMS.com.RequestDTO.AuthorRequestDto;
import LMS.com.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/add_author")
    public String createAuthor(@RequestBody AuthorRequestDto authorRequestDto){
      return authorService.createAuthor(authorRequestDto);
    }
}
