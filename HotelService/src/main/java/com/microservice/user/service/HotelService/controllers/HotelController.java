package com.microservice.user.service.HotelService.controllers;

import com.microservice.user.service.HotelService.entities.Hotel;
import com.microservice.user.service.HotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    //create
    @PostMapping
    public ResponseEntity<Hotel>createHotel(@RequestBody Hotel hotel)
    {
        Hotel savedHotel = this.hotelService.createHotel(hotel);
        return new ResponseEntity<>(savedHotel, HttpStatus.CREATED);
        //return ResponseEntity.status(HttpStatus.CREATED).body(savedHotel);
    }


    //get all
    @GetMapping
    public ResponseEntity<List<Hotel>>getAllHotels()
    {
        List<Hotel>hotels = this.hotelService.getAllhotels();
        return new ResponseEntity<>(hotels, HttpStatus.OK);
    }


    //get single
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel>getHotelById(@PathVariable String hotelId)
    {
        Hotel hotel = this.hotelService.getHotel(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(hotel);
    }

}
