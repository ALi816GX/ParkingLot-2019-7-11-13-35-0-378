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
    private Car car2;
    private Ticket ticket;
    private Ticket ticket2;

    public PakingBoy(PakingLot pakingLot) {
        this.pakingLot = pakingLot;
    }

    public Ticket parkCar(Car car){

        if(this.car == null) {
            this.car = car;
            this.ticket = new Ticket();
            return this.ticket;
        }
        else {
            this.car2 = car;
            this.ticket2 = new Ticket();
            return this.ticket2;
        }

    }

    public Car fetchCar(Ticket ticket) {

        if(ticket == this.ticket){
            return this.car;
        }else {
            this.car = null;
            return this.car2;
        }

    }



}
