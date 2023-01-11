package LMS.com.RequestDTO;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentRequestDto {

    private int age;

    @Column(nullable = false)
    private  String name;

    @Column(columnDefinition = "varchar(255) default 'India'")
    private String country;

    @Column(name = "school_email",unique = true)
    private String email;

}
