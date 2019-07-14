package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/15
 * @Time:01:39
 * @description:
 */
public class ParkingBoyStory6Test {

    @Test
    public void should_park_into__parkingLot_when_call_park_car_by_different_boy_given_car() {

        ServiceManager serviceManager = new ServiceManager();

        Car car = new Car();
        Ticket ticket = serviceManager.parkingBoy.parkCar(car);
        Car fetchedCar = serviceManager.parkingBoy.fetchCar(ticket);
        Assertions.assertSame(fetchedCar, car);

        //-------//


        SmartParkingBoy smartParkingBoy = serviceManager.smartParkingBoy;

        for(int i = 0;i < 3;i++){
            Car car1 = new Car();
            smartParkingBoy.parkCar(car1);
        }

        smartParkingBoy.addParkingLot();

        Ticket fetchTicket = smartParkingBoy.parkCar(new Car());

        Assertions.assertSame(1,smartParkingBoy.getParkingLotIndexByTicket(fetchTicket));


    }


    @Test
    public void should_return_message_when_call_park_car_by_different_boy_given_car(){

        ServiceManager serviceManager = new ServiceManager();

        //given
        ParkingBoy parkingBoy= serviceManager.getParkingBoy();

        for(int i = 0;i < 10;i++){
            Car car = new Car();
            parkingBoy.parkCar(car);
        }

        Ticket fetchTicket = parkingBoy.parkCar(new Car());

        Assertions.assertNotNull(fetchTicket);
        Assertions.assertSame("",parkingBoy.getMessage());


        for(int i = 0;i < 10;i++){
            Car car = new Car();
            parkingBoy.parkCar(car);
        }

        Ticket fetchTicket2 = parkingBoy.parkCar(new Car());

        Assertions.assertNull(fetchTicket2);
        Assertions.assertSame("Not enough position.",parkingBoy.getMessage());
    }
}
