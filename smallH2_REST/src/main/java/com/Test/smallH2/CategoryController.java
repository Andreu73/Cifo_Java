package com.Test.smallH2;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/cate")
public class CategoryController {
	
	@Autowired
	CategoryRepository cateservice;
	
	@GetMapping(value="/cate")
    public Iterable<Category> getCategory() {
        return cateservice.findAll();
    }
	
	@GetMapping(value="/cate/{id}")
	public Optional<Category> getCategoryById(@PathVariable(value = "id") Long category) {
	 
	return cateservice.findById(category);

	}
	

//@PostMapping(“/addBook”)
//public Book addBook(@RequestBody Book book)
//{
//return bookRepository.save(book);
//}
//
//@PutMapping(“/updateBook/{id}”)
//public Book updateBook(@PathVariable(value=”id”) Long id, @RequestBody Book bookDetails)
//{
//Optional<Book> book = bookRepository.findById(id);
//Book book_new=book.get();
//book_new.setAuthor_name(bookDetails.getAuthor_name());
//book_new.setBook_name(bookDetails.getBook_name());
//book_new.setIsbn(bookDetails.getIsbn());
//return bookRepository.save(book_new);
//
//}

	@DeleteMapping("/deleteCate/{id}")
	public void deleteCate(@PathVariable(value="id") Long id){
//	Optional<Category> cate=cateservice.findById(id);
	Category cate2 = new Category(); 
	cate2.setCategoryid(id);
	cateservice.delete(cate2);
	}
	
	
	
}

 


//@Controller
//@RequestMapping("/cate")
//public class CategoryController {
//	
//	@Autowired
//	CategoryServicesImpl cateservice;
//	
//	@Autowired
//	CarServicesImpl carservice;
//
//	@RequestMapping("/cate")
//	public String showCates (Model model) {
//
//	model.addAttribute("cates", cateservice.findAll());
//	model.addAttribute("cars", carservice.findAll());
//	return "cates/cates.html";
//	}
////	@RequestMapping("/newCate")
////	public String newCate() {
////	return "cates/newCate.html";
////	}
//	
//	
//    @RequestMapping(value = "/addCate", method = RequestMethod.GET)
//    public String add(Model model) {
//    	model.addAttribute("cats", cateservice.findAll());
//        model.addAttribute("cates", new Category());
//        return "cates/newCate";
//    }
//
//    @RequestMapping(value = "/addCate", method = RequestMethod.POST)
//    public String processAdd(@ModelAttribute("cates")Category cate, Model model, BindingResult bindingResult) {
//    	
//        if (bindingResult.hasErrors()) {
//            return "cates/newCate";
//        }
//        cateservice.insertCate(cate);
//        return "cates/cates";
//}
//	
//	@RequestMapping("/deleteCate")
//	public String deleteCate(@RequestParam("id") Long id, Model model) {
//	
//	Category cate = new Category();
//	cate.setCategoryid(id);
//	cateservice.deleteCate(cate);
//	model.addAttribute("cate", cateservice.findAll());
//	return "cates/cates.html";
//	}
//
//	
//	
//}