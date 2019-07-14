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
public class PakingBoyStory1Test {

    @Test
    public void should_return_car_when_fetch_car_given_have_ticket_by_parking_the_car() {


        //given
        PakingLot pakingLot = new PakingLot();
        PakingBoy pakingBoy = new PakingBoy(pakingLot);


        Ticket ticketTemp = null;

        //when
        for(int i = 0;i < 10;i++){
            Car car = new Car();
            ticketTemp = pakingBoy.parkCar(car);
        }

        Ticket ticket_11 = pakingBoy.parkCar(new Car());

        pakingBoy.fetchCar(ticketTemp);
        Ticket ticket_12 = pakingBoy.parkCar(new Car());



        //Then
        Assertions.assertSame(null,ticket_11);
        Assertions.assertSame(ticket_12!=null,true);

    }



}
