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

    private Car car;

    private Ticket ticket;

    public PakingBoy(PakingLot pakingLot) {
        this.pakingLot = pakingLot;
    }

    public Ticket parkCar(Car car){
        this.car = car;
        return new Ticket();
    }

    public Car fetchCar(Ticket ticket) {
        return this.car;

    }



}
