package LMS.com.Controller;

import LMS.com.Service.StudentService;
import LMS.com.RequestDTO.StudentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping ("/add_student")
    public ResponseEntity<String> addStudent(@RequestBody StudentRequestDto studentRequestDto){
      String result=  studentService.createStudent(studentRequestDto);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }


}

