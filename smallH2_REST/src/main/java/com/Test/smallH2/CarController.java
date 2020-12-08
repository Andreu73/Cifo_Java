package com.Test.smallH2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@RequestMapping(value = "/author")
//, produces = { MediaType.APPLICATION_JSON_VALUE })
public class CarController {

      
  @Autowired
  CarService service;

    
//   public void setCarService(CarService service) {
//    this.service = service;
//   }
   
   @GetMapping("/api/authors")
   public Iterable<Author> getEmployees() {
    Iterable<Author> employees = service.retrieveAuthors();
    return employees;
   }
    
   @GetMapping("/api/authors/{authorId}")
   public Author getEmployee(@PathVariable(name="authorId")Long authorId) {
    return service.getAuthor(authorId);
   }
    
   @PostMapping("/api/authors")
   public void saveEmployee(Author author){
       service.saveAuthor(author);
    System.out.println("Employee Saved Successfully");
   }
    
   @DeleteMapping("/api/authors/{authorId}")
   public void deleteEmployee(@PathVariable(name="authorId")Long authorId){
       service.deleteAuthor(authorId);
    System.out.println("Employee Deleted Successfully");
   }
    
   @PutMapping("/api/authors/{authorId}")
   public void updateEmployee(@RequestBody Author author,
     @PathVariable(name="authorId")Long authorId){
       Author author1 = service.getAuthor(authorId);
    if(author1 != null){
     service.updateAuthor(author);
    }
     
   }
  
}

