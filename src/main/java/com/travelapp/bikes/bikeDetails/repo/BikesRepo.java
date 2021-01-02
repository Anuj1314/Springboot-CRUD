package com.travelapp.bikes.bikeDetails.repo;

import com.travelapp.bikes.bikeDetails.modal.BikeVO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface BikesRepo extends MongoRepository<BikeVO, Integer> {

}
