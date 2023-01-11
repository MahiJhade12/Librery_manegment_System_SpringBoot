package LMS.com.Service;

import LMS.com.Convertor.AuthorConvertor;
import LMS.com.Models.Author;
import LMS.com.Repository.AuthorRepository;
import LMS.com.RequestDTO.AuthorRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AuthorService {


    @Autowired
    AuthorRepository authorRepository;
    public String createAuthor(AuthorRequestDto authorRequestDto){
        try {
            Author author = AuthorConvertor.convertDtoToEntity(authorRequestDto);
            authorRepository.save(author);
        }
        catch (Exception e){
            log.info("createAuthor has caused an error");
            return "Create author didn't work";
        }
        return "Author created successfully";
    }
}
