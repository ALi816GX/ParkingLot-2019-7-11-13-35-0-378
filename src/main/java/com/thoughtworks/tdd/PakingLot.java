package com.thoughtworks.tdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/14
 * @Time:17:36
 * @description:
 */
public class PakingLot {


    private Car car;
    private Car car2;
    private Ticket ticket;
    private Ticket ticket2;


    public Ticket parkCar(Car car){

        if(this.car == null) {
            this.car = car;
            this.ticket = new Ticket();
            return this.ticket;
        }

        else{
            this.car2 = car;
            this.ticket2 = new Ticket();
            return this.ticket2;
        }


    }

    public Car fetchCar(Ticket ticket) {

        if(this.ticket == ticket ){
            this.ticket = null;
            return this.car;
        }
        else if(ticket == this.ticket2){
            this.ticket2 = null;
            return this.car2;
        }
        else {
            return null;
        }
    }




}
