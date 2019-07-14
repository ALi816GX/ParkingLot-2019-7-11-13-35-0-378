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
    private String message = "";


    public ParkingBoy(ParkingLot parkingLot) {

        this.parkingLot = parkingLot;

    }

    public Ticket parkCar(Car car){

        return parkingLot.parkCar(car);

    }

    public Car fetchCar(Ticket ticket) {

        Car car = parkingLot.fetchCar(ticket);

        if(ticket == null || car == null ){
            this.message = "Unrecognized parking ticket.";
        }

        return car;

    }


    public String getMessage() {
        String message = this.message;
        this.message = "";
        return message;
    }

}
