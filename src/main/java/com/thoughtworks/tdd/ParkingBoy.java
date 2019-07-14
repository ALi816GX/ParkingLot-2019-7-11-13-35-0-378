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
    private ParkingLot parkingLot2;
    private String message = "";


    public ParkingBoy(ParkingLot parkingLot) {

        this.parkingLot = parkingLot;

    }

    public Ticket parkCar(Car car){

        Ticket ticket = null;

        if(parkingLot.map.size() == 10){
            this.message = "Not enough position.";
            addparkingLot();
            ticket = parkingLot2.parkCar(car);
        }
        else {
            this.message = "";
            ticket = parkingLot.parkCar(car);
        }

        return ticket;

    }

    public Car fetchCar(Ticket ticket) {

        Car car = parkingLot.fetchCar(ticket);

        if(ticket == null){
            this.message = "Please provide your parking ticket.";
        }
        else if( car == null ){
            this.message = "Unrecognized parking ticket.";
        }

        return car;

    }


    public String getMessage() {
        String message = this.message;
        this.message = "";
        return message;
    }


    public void addparkingLot(){
        this.parkingLot2 = new ParkingLot();
    }


}
