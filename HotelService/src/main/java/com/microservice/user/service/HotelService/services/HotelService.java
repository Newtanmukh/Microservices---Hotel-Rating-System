package com.microservice.user.service.HotelService.services;

import com.microservice.user.service.HotelService.entities.Hotel;

import java.util.List;

public interface HotelService {

    //create
    Hotel createHotel(Hotel hotel);

    //get all
    List<Hotel>getAllhotels();

    //get single
    Hotel getHotel(String id);
}
