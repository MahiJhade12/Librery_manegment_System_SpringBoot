package LMS.com.Controller;

import LMS.com.Models.Student;
import LMS.com.Service.StudentService;
import LMS.com.StudentRequestDTO.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/add_student")
    public ResponseEntity<String> addStudent(@RequestBody StudentRequest studentRequest){
        studentService.createStudent(studentRequest);
        return new ResponseEntity<>("Student added", HttpStatus.CREATED);
    }


}

