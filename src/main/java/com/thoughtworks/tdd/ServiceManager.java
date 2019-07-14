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


    public ParkingBoy getParkingBoy() {
        return parkingBoy;
    }

    public void setParkingBoy(ParkingBoy parkingBoy) {
        this.parkingBoy = parkingBoy;
    }


    public SmartParkingBoy getSmartParkingBoy() {
        return smartParkingBoy;
    }

    public void setSmartParkingBoy(SmartParkingBoy smartParkingBoy) {
        this.smartParkingBoy = smartParkingBoy;
    }

    public SuperSmartParkingBoy getSuperSmartParkingBoy() {
        return superSmartParkingBoy;
    }

    public void setSuperSmartParkingBoy(SuperSmartParkingBoy superSmartParkingBoy) {
        this.superSmartParkingBoy = superSmartParkingBoy;
    }
}
