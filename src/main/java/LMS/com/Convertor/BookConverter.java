package LMS.com.Convertor;

import LMS.com.Models.Book;
import LMS.com.RequestDTO.BookRequestDto;

public class BookConverter {

    public static Book convertBootDtoToEntity(BookRequestDto bookRequestDto){
        Book book= Book.builder().
                name(bookRequestDto.getName()).
                genre(bookRequestDto.getGenre())
                .build();
        return book;
    }
}
