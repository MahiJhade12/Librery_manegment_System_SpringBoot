package LMS.com.RequestDTO;

import LMS.com.Enums.Genre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
public class BookRequestDto {

    private String name;
    private Genre genre;
    private int authorId;
}
