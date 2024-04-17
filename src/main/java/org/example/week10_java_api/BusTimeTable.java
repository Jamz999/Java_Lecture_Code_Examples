package org.example.week10_java_api;

import kong.unirest.Unirest;

public class BusTimeTable {
    public static void main(String[] args) {
        String busTimesUrl = "https://svc.metrotransit.org/NexTrip/17940?format=json";

        BusDepartures response = Unirest.get(busTimesUrl).asObject(BusDepartures.class).getBody();

        Bus[] buses = response.departures;

        for (Bus bus : buses) {
            System.out.printf("BUS %s -\n" + "Departs in %s\n" + "Description: %s\n\n",
                    bus.route_id,
                    bus.departure_text,
                    bus.description);
        }

    }
}

class BusDepartures {
    public Bus[] departures;
}

class Bus {
    public String departure_text;
    public String route_id;
    public String description;

}