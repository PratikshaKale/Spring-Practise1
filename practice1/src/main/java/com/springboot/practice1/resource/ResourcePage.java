package com.springboot.practice1.resource;

import com.springboot.Exception.InvalidStudentInfoException;
import com.springboot.practice1.controller.StudentManager;
import com.springboot.practice1.model.StudentInfo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class ResourcePage {

    @Autowired
    StudentManager stManager;

    @GetMapping("/hello/comp")
    public String getDataB(){
        return stManager.getInfo();
    }

/*
    @GetMapping("/hello1/{name}")
    public ResponseEntity<Object> getData(@PathVariable("name") String name , int age){
      //  return new ResponseEntity<>("Hello"+name+"Welcome to GFG....", HttpStatus.ACCEPTED);
      //  try {
            if (name.equals("") || age < 18) {
                // return new ResponseEntity<>("Invalid username and Age ", HttpStatus.BAD_REQUEST);
             //   throw new InvalidStudentInfoException("Invalid Student Information ");
                throw new InvalidStudentInfoException();
            }
    //    }catch (InvalidStudentInfoException ex){
      //      return new ResponseEntity<>("Invalid Student Age ", HttpStatus.BAD_REQUEST);
      //  }
        return new ResponseEntity<>("Hello"+name+"Welcome to GFG...\n.and your age is "+age, HttpStatus.ACCEPTED);
    }


    @GetMapping("/hello")
    public ResponseEntity<Object> getData2(@RequestParam String name , @RequestParam int age){
        return new ResponseEntity<>("Hello"+name+"Welcome to GFG....and your age is "+age, HttpStatus.ACCEPTED);
    }

    @GetMapping("/hello/2/{name}")
    public ResponseEntity<Object> getData3(@RequestParam String name , @RequestParam int age){
        if(name.equals("")|| age<18){
          // return new ResponseEntity<>("Invalid username and Age ", HttpStatus.BAD_REQUEST);
            throw new InvalidStudentInfoException();
        }
        return new ResponseEntity<>("Hello"+name+"Welcome to GFG...\n.and your age is "+age, HttpStatus.ACCEPTED);
    }

    @GetMapping("/hello2")
    public ResponseEntity<Object> getData5(@RequestBody StudentInfo studentinfo){

       // return  "Hello"+studentinfo.getName()+"Welcome to GFG..and your branch ."+studentinfo.getBarnch()+"\n.and your age is "+studentinfo.getAge();
        return new ResponseEntity<>(studentinfo,HttpStatus.OK);
    }

    @GetMapping("/endpoint")
    public String getHeaderValue(HttpServletRequest request)
    {
        String name=request.getHeader("name");
        String age = request.getHeader("age");
        // Process the header value
        return "Header value "+name+" "+age;
    }

    @GetMapping("/hello/new/{name}")
    public ResponseEntity<Object> getData6(@RequestParam String name , @RequestParam int age){
        if(name.equals("")|| age<18){
            throw new InvalidStudentInfoException();
        }
        return new ResponseEntity<>("Hello"+name+"Welcome to GFG...\n.and your age is "+age, HttpStatus.ACCEPTED);
    } */
@GetMapping("/hello/new/{name}")
public ResponseEntity<Object> getData6(@PathVariable String name , @RequestParam int age){
    if(name.equals("")|| age<18){
        throw new InvalidStudentInfoException();
    }
    return new ResponseEntity<>("Hello"+name+"Welcome to GFG...\n.and your age is "+age, HttpStatus.OK);
}
}
