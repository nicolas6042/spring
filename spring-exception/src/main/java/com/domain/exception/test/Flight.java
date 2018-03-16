package com.domain.exception.test;

/**
 * @author mbaranowicz
 */
public class Flight {

    private final String departureAirport;


    public Flight(String departureAirport) {
        this.departureAirport = departureAirport;

    }



    public String getDepartureAirport() {

        return departureAirport;
    }
}
