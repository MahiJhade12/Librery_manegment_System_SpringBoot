package LMS.com.Service;

import LMS.com.Models.Card;
import LMS.com.Models.Student;
import LMS.com.Repository.StudentRepository;
import LMS.com.RequestDTO.StudentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public String createStudent (StudentRequestDto studentRequestDto){

        Student student = new Student();
        student.setAge(studentRequestDto.getAge());
        student.setCountry(studentRequestDto.getCountry());
        student.setEmail(studentRequestDto.getEmail());
        student.setName(studentRequestDto.getName());

        Card newCard=CardService.createCard(student);

        student.setCard(newCard);
         studentRepository.save(student);

         return  "SuccessFully added student and card";
    }

}
