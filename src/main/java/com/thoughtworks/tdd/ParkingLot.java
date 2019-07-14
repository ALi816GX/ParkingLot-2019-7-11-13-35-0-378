package com.thoughtworks.tdd;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/14
 * @Time:17:36
 * @description:
 */
public class ParkingLot {

    private int capacity = 10;

    Map<Ticket,Car> map = new HashMap<>(capacity);


    public Ticket parkCar(Car car){

        Ticket ticket = null;

        if(map.size() <= 9){
            ticket = new Ticket();
            map.put(ticket,car);
        }

        return ticket;

    }

    public Car fetchCar(Ticket ticket) {

        Car car = map.get(ticket);

        map.remove(ticket);

        return car;

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
