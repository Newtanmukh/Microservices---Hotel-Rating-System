package com.microservice.ratinng.service.RatingService.repositories;
import com.microservice.ratinng.service.RatingService.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepo extends JpaRepository<Rating,String> {

    //custom find methods
    //use camel casing.
    List<Rating>findByUserId(String userId);

    List<Rating>findByHotelId(String hotelId);
}
