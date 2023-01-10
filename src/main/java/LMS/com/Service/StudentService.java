package LMS.com.Service;

import LMS.com.Repository.StudentRepository;
import LMS.com.StudentRequestDTO.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public String createStudent (StudentRequest studentRequest){


    }

}
