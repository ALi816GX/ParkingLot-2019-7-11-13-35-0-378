package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/15
 * @Time:00:26
 * @description:
 */
public class ParkingBoyStory4Test {


    @Test
    public void should_park_into_the_more_empty_positions_parkingLot_when_call_park_car_by_smart_boy_given_car(){

        //given
        ParkingLot parkingLot = new ParkingLot();
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy(parkingLot);

        for(int i = 0;i < 3;i++){
            Car car = new Car();
            smartParkingBoy.parkCar(car);
        }

        smartParkingBoy.addParkingLot();

        Ticket fetchTicket = smartParkingBoy.parkCar(new Car());

        Assertions.assertSame(1,smartParkingBoy.getParkingLotIndexByTicket(fetchTicket));

    }


}
