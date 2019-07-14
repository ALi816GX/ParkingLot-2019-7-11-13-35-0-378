package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/14
 * @Time:17:43
 * @description:
 */
public class PakingBoyTest {

    @Test
    public void should_return_car_when_fetch_car_given_have_ticket_by_parking_the_car() {


        //given
        PakingLot pakingLot = new PakingLot();
        PakingBoy pakingBoy = new PakingBoy(pakingLot);

        Car car1 = new Car();
        Car car2 = new Car();
        Ticket ticket1 = pakingBoy.parkCar(car1);
        Ticket ticket2 = pakingBoy.parkCar(car2);

        //when
        Car fetchedCar1 = pakingBoy.fetchCar(ticket1);
        Car fetchedCar2 = pakingBoy.fetchCar(ticket2);


        //Then
        Assertions.assertSame(car1,fetchedCar1);
        Assertions.assertSame(car2,fetchedCar2);


    }



}
