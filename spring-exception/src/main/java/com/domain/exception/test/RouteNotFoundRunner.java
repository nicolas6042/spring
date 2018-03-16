package com.domain.exception.test;

/**
 * @author mbaranowicz
 */
public class RouteNotFoundRunner {
    public static void main(String []args){
        FlightList flightList = new FlightList();
        Flight warsaw = new Flight("Warsaw");

        try{
            if(flightList.findFlight(warsaw)){
                System.out.println("Flight is available");
            } else {
                System.out.println("Flight is not available");
            }

        }catch (RouteNotFoundException e){
            System.out.println("Exception " + e);
        }
    }
}
