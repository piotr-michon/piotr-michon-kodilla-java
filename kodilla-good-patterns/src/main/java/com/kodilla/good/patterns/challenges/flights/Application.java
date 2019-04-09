package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {
        FlightScanner flightScanner = new FlightScanner();
        flightScanner.lookForDepartureAirport("WMI");
        flightScanner.lookForArrivalAirport("WRO");
        flightScanner.lookForConnectingAirport("WAW", "WRO");
    }
}
