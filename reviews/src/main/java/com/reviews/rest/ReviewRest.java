package com.reviews.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reviews.dao.ReviewDAO;
import com.reviews.models.Review;

@RestController
@RequestMapping("reviews")
public class ReviewRest {

	@Autowired
	private ReviewDAO reviewDAO;
	
	@PostMapping("/guardar") 
	public void guardar(@RequestBody Review review) {
		reviewDAO.save(review);
	}
	
	@GetMapping("/consultar")
	public List<Review> consultar() {
		return reviewDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		reviewDAO.deleteById(id);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Review review)  {
		reviewDAO.save(review);
	}
	
	
	
}
