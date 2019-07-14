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


    Map<Ticket,Car> map = new HashMap<>(10);


    public Ticket parkCar(Car car){

        Ticket ticket = null;

        if(map.size() <= 9){
            ticket = new Ticket();
            map.put(ticket,car);
        }

        return ticket;

    }

    public Car fetchCar(Ticket ticket) {

        return map.remove(ticket);

    }



}
