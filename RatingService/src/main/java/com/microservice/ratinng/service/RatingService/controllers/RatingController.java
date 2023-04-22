package com.microservice.ratinng.service.RatingService.controllers;

import com.microservice.ratinng.service.RatingService.entities.Rating;
import com.microservice.ratinng.service.RatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    //create Rating
    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating)
    {
        Rating createdRating = this.ratingService.createRating(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdRating);
    }

    //get all Ratings
    @GetMapping
    public  ResponseEntity<List<Rating>>getAllRatings(){
        return ResponseEntity.status(HttpStatus.OK).body(ratingService.getAllRatings());
    }

    //get ratings by user id
    @GetMapping("/users/{userId}")
    public  ResponseEntity<List<Rating>>getRatingsByUserId(@PathVariable String userId){
        return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRatingByUserId(userId));
    }

    //get ratings by Hotel id
    @GetMapping("/hotels/{hotelId}")
    public  ResponseEntity<List<Rating>>getRatingsByHotelId(@PathVariable String hotelId){
        return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRatingByHotelId(hotelId));
    }


}
