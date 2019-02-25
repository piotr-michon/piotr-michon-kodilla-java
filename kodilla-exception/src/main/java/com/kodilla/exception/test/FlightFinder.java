package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("JFK", true);
        flightMap.put("LAX", true);
        flightMap.put("FRA", false);
        flightMap.put("WAW", true);
        flightMap.put("ARN", false);
        flightMap.put("WRO", true);

        if (flightMap.containsKey(flight.getArrivalAirport())){
            return flightMap.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException();
        }
    }

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        try {
            if (flightFinder.findFlight(new Flight("WAW", "RZE"))) {
                System.out.println("Arrival airport available");
            } else {
                System.out.println("Arrival airport not available");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Sorry! Route you are looking for could not be found!");
        }
    }
}
