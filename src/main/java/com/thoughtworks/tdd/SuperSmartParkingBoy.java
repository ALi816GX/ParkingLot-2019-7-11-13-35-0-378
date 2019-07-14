package com.thoughtworks.tdd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/15
 * @Time:01:01
 * @description:
 */
public class SuperSmartParkingBoy {


    private List<ParkingLot> parkingLotList;

    public SuperSmartParkingBoy(ParkingLot parkingLot) {
        parkingLotList = new ArrayList<>();
        parkingLotList.add(parkingLot);
    }

    public void addParkingLot() {
        parkingLotList.add(new ParkingLot());
    }


    public Ticket parkCar(Car car){
        int index = 0;
        int max_available_position_rate = 0;
        int i = 0;
        for (ParkingLot parkingLot:parkingLotList) {
            double available_position_rate = parkingLot.getCapacity() - parkingLot.map.size() * 1.00 / parkingLot.getCapacity();
            if(available_position_rate >= max_available_position_rate){
                max_available_position_rate = parkingLot.map.size();
                index = i;
            }
            i++;
        }
        return parkingLotList.get(index).parkCar(car);
    }

    public int getParkingLotIndexByTicket(Ticket ticket) {
        int index = -1;
        for (int i = 0;i < parkingLotList.size();i++) {
            if(parkingLotList.get(i).map.containsKey(ticket)){
                index = i;
                break;
            }
        }
        return index;
    }
}
