package com.travelapp.bikes.bikeDetails.service;

import com.travelapp.bikes.bikeDetails.modal.BikeVO;
import com.travelapp.bikes.bikeDetails.pojo.Bike;

import java.util.List;

public interface BikeDetailService {

    Bike create(Bike bike);

    List<Bike> getAllBikes();
}
