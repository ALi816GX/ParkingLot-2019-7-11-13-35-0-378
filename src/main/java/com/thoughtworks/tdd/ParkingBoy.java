package com.thoughtworks.tdd;


/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/14
 * @Time:17:36
 * @description:
 */
public class PakingBoy {

    private PakingLot pakingLot;


    public PakingBoy(PakingLot pakingLot) {

        this.pakingLot = pakingLot;

    }

    public Ticket parkCar(Car car){

        return pakingLot.parkCar(car);

    }

    public Car fetchCar(Ticket ticket) {

        return pakingLot.fetchCar(ticket);

    }



}
