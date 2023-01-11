package LMS.com.Service;

import LMS.com.Enums.CardStatus;
import LMS.com.Models.Card;
import LMS.com.Models.Student;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    public static Card createCard(Student student){
        Card newCard =new Card();
        newCard.setCardStatus(CardStatus.Activated);
        newCard.setStudentInfo(student);

        return newCard;

    }

}
