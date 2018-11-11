package com.example.android.boardingpass;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

/**
 * Created by Michael Klunko on 10/28/2018.
 */

public class BoardingPassInfo {
    public String passengerName;
    public String flightCode;
    public String originCode;
    public String destinationCode;

    public Timestamp boardingTime;
    public Timestamp departureTime;
    public Timestamp arrivalTime;

    public String departureTerminal;
    public String departureGate;
    public String seatNumber;

    public int barCodeImgRes;

    public long getMinsToBoarding(){
        long millisUntilBoarding = boardingTime.getTime() - System.currentTimeMillis();
        return TimeUnit.MILLISECONDS.toMinutes(millisUntilBoarding);
    }
}
