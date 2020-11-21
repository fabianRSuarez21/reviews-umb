package com.reviews.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reviews.models.Review;

public interface ReviewDAO extends JpaRepository <Review, Integer> {

}
