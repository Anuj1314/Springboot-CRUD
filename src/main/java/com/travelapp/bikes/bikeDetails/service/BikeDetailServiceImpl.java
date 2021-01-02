package com.travelapp.bikes.bikeDetails.service;

import com.travelapp.bikes.bikeDetails.modal.BikeVO;
import com.travelapp.bikes.bikeDetails.pojo.Bike;
import com.travelapp.bikes.bikeDetails.repo.BikesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BikeDetailServiceImpl implements BikeDetailService{

    @Autowired
    private BikesRepo bikesRepo;

    @Override
    public Bike create(Bike bike) {
        validate(bike);
        bike.setCretedAt(new Date());
        bike.setUpdatedAt(new Date());
        BikeVO bikeVO = buildBikeVOFromBike(bike);
        bikesRepo.save(bikeVO);
        bike.setSoldBySeller(bikeVO.getSoldBySeller());
        return bike;

    }

    @Override
    public List<Bike> getAllBikes() {
        List<BikeVO> allbikes = bikesRepo.findAll();
        System.out.println(allbikes);
        List<Bike> bikes = new ArrayList<Bike>();
        allbikes.forEach(bikeVO -> bikes.add(buildBikeFromBikeVO(bikeVO)));
        return bikes;
        }

    boolean validate(Bike bike){
        return true;
    }

    BikeVO buildBikeVOFromBike(Bike bike){
        BikeVO bikeVO = new BikeVO();
        bikeVO.setSoldBySeller("anuj");  //TODO: make it automated generated
        bikeVO.setBikeName(bike.getBikeName());
        bikeVO.setCompanyName(bike.getCompanyName());
        bikeVO.setColor(bike.getColor());
        bikeVO.setCno(bike.getcNo());
        bikeVO.setCreatedAt(bike.getCretedAt());
        bikeVO.setUpdatedAt(bike.getUpdatedAt());
        bikeVO.setSellerId(1); //TODO: make it something from bike or something automated
        return bikeVO;
    }

    Bike buildBikeFromBikeVO(BikeVO bikeVO){
        Bike bike = new Bike();
        bike.setBikeName(bikeVO.getBikeName());
        bike.setcNo(bikeVO.getCno());
        bike.setColor(bikeVO.getColor());
        bike.setCompanyName(bikeVO.getCompanyName());
        bike.setSoldBySeller(bikeVO.getSoldBySeller());
        bike.setCretedAt(bikeVO.getCreatedAt());
        bike.setUpdatedAt(bikeVO.getUpdatedAt());
        return bike;
    }
}
