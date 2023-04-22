package com.microservice.user.service.HotelService.services.impl;

import com.microservice.user.service.HotelService.entities.Hotel;
import com.microservice.user.service.HotelService.exceptions.ResourceNotFoundExceptions;
import com.microservice.user.service.HotelService.repositories.HotelRepository;
import com.microservice.user.service.HotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;


    @Override
    public Hotel createHotel(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllhotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotel(String id) {
        return hotelRepository.findById(id).orElseThrow(()->new ResourceNotFoundExceptions("Hotel with given ID not found : " + id));
    }
}
