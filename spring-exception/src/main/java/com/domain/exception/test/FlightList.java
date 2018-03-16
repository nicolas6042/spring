package com.domain.exception.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mbaranowicz
 */
public class FlightList {
    public boolean findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> flightList = new HashMap<>();
        flightList.put("Paris", true);
        flightList.put("London", true);
        flightList.put("New York", false);
        flightList.put("Seattle", false);
        if(!flightList.containsKey(flight.getDepartureAirport())){
            throw new RouteNotFoundException();
        }
        return flightList.get(flight.getDepartureAirport());
    }
}
