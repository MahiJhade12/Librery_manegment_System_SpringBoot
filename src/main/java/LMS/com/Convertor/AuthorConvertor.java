package LMS.com.Convertor;

import LMS.com.Models.Author;
import LMS.com.RequestDTO.AuthorRequestDto;

public class AuthorConvertor {

   public static Author convertDtoToEntity(AuthorRequestDto authorRequestDto){
       Author author= Author.builder().
                       name(authorRequestDto.getName()).
                       age(authorRequestDto.getAge()).
                       email(authorRequestDto.getEmail()).
                       country(authorRequestDto.getCountry()).
                       build();
         return author;
   }
}
