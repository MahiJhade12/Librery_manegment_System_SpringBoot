package LMS.com.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.awt.print.Book;
import java.util.List;


@Entity
@Table
@NoArgsConstructor
@Builder
@Data
@AllArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;

    private String country;

    @Column(unique = true)
    private String email;


    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> booksWritten;

}