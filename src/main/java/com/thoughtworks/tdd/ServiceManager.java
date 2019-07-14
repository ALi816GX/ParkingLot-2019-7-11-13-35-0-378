package com.thoughtworks.tdd;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/15
 * @Time:01:43
 * @description:
 */
public class ServiceManager {

    ParkingBoy parkingBoy = new ParkingBoy(new ParkingLot());
    SmartParkingBoy smartParkingBoy = new SmartParkingBoy(new ParkingLot());
    SuperSmartParkingBoy superSmartParkingBoy = new SuperSmartParkingBoy(new ParkingLot());


}
