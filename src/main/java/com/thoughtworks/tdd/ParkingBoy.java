package com.thoughtworks.tdd;


/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/14
 * @Time:17:36
 * @description:
 */
public class ParkingBoy {

    private ParkingLot parkingLot;


    public ParkingBoy(ParkingLot parkingLot) {

        this.parkingLot = parkingLot;

    }

    public Ticket parkCar(Car car){

        return parkingLot.parkCar(car);

    }

    public Car fetchCar(Ticket ticket) {

        return parkingLot.fetchCar(ticket);

    }



}
