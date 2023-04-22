package com.microservice.ratinng.service.RatingService.services;

import com.microservice.ratinng.service.RatingService.entities.Rating;

import java.util.List;

public interface RatingService {

    //create rating
    Rating createRating(Rating rating);

    //get all ratings
    List<Rating>getAllRatings();

    //get all by the userid
    List<Rating>getRatingByUserId(String userId);

    //get all by hotel
    List<Rating>getRatingByHotelId(String hotelId);

}
