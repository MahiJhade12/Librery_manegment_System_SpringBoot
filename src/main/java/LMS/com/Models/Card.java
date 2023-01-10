package LMS.com.Models;
import LMS.com.Enums.CardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student_card")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int fine;
    private String expiry;

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    @OneToOne
    @JoinColumn  //by default, it has primary key
    private Student studentInfo;



}
