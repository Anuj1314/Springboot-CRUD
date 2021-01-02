package com.travelapp.bikes.bikeDetails.controller;

import com.travelapp.bikes.bikeDetails.pojo.Bike;
import com.travelapp.bikes.bikeDetails.service.BikeDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/v1/bikes")
public class BikeDetailController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BikeDetailController.class);

    @Autowired
    private BikeDetailService bikeDetailService;

    @GetMapping(value = "/")
    public List<Bike> getAllBikesDetail() {
        if(LOGGER.isDebugEnabled()){
            LOGGER.debug("going to get all bike details");
        }
        List<Bike> allBikes = bikeDetailService.getAllBikes();
        return allBikes;
    }

    @PostMapping(value = "")
    public Bike createBike(@RequestBody Bike bike){
        if (LOGGER.isDebugEnabled()){
            LOGGER.debug("going to create a bike for cNo [{}]",bike.getcNo());
        }
        return bikeDetailService.create(bike);
    }



}
