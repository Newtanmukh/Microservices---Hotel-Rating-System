package com.microservice.ratinng.service.RatingService.services.impl;

import com.microservice.ratinng.service.RatingService.entities.Rating;
import com.microservice.ratinng.service.RatingService.repositories.RatingRepo;
import com.microservice.ratinng.service.RatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepo ratingRepo;

    @Override
    public Rating createRating(Rating rating) {
        String ratingId = UUID.randomUUID().toString();
        rating.setRatingId(ratingId);
        Rating createdRating = this.ratingRepo.save(rating);
        return createdRating;
    }

    @Override
    public List<Rating> getAllRatings() {
        return this.ratingRepo.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return this.ratingRepo.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return this.ratingRepo.findByHotelId(hotelId);
    }
}
