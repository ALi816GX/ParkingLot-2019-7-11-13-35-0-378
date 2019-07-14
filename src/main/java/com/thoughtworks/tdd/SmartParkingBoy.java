package com.thoughtworks.tdd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/15
 * @Time:00:06
 * @description:
 */
public class SmartParkingBoy{

    private List<ParkingLot> parkingLotList;

    public SmartParkingBoy(ParkingLot parkingLot) {
        parkingLotList = new ArrayList<>();
        parkingLotList.add(parkingLot);
    }

    public void addParkingLot() {
        parkingLotList.add(new ParkingLot());
    }

    public List<ParkingLot> getParkingLotList() {
        return parkingLotList;
    }

    public void setParkingLotList(List<ParkingLot> parkingLotList) {
        this.parkingLotList = parkingLotList;
    }

    public Ticket parkCar(Car car) {
        int index = 0;
        int max_empty_postion = 0;
        int i = 0;
        for (ParkingLot parkingLot:parkingLotList) {
            if(parkingLot.map.size()<=max_empty_postion){
                max_empty_postion = parkingLot.map.size();
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
