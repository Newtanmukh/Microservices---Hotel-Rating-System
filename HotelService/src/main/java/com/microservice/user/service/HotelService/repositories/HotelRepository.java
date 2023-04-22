package com.microservice.user.service.HotelService.repositories;

import com.microservice.user.service.HotelService.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository  extends JpaRepository<Hotel,String> {
}
