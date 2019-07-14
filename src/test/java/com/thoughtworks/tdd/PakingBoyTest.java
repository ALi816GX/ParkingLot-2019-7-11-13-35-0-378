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
        Car car = new Car();
        Ticket ticket = pakingBoy.parkCar(car);

        //when
        Car fetchedCar = pakingBoy.fetchCar(ticket);


        //Then
        Assertions.assertSame(car,fetchedCar);



    }



}
