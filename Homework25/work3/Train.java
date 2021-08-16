package com.alfabank.work3;

public class Train {
    int number;
    String stationDispatch;
    String stationArrival;
    String timeDispatch;
    String timeArrival;
    //DaysOfWeek days;
    DaysOfWeek [] days;

    public Train (int iNum) {
        this.number = iNum;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getStationDispatch() {
        return stationDispatch;
    }
    public void setStationDispatch(String stationDispatch) {
        this.stationDispatch = stationDispatch;
    }
    public String getStationArrival() {
        return stationArrival;
    }
    public void setStationArrival(String stationArrival) {
        this.stationArrival = stationArrival;
    }
    public String getTimeDispatch() {
        return timeDispatch;
    }
    public void setTimeDispatch(String timeDispatch) {
        this.timeDispatch = timeDispatch;
    }
    public String getTimeArrival() {
        return timeArrival;
    }
    public void setTimeArrival(String timeArrival) {
        this.timeArrival = timeArrival;
    }

    public DaysOfWeek[] getDays() {
        return days;
    }

    public void setDays(DaysOfWeek[] days) {
        this.days = days;
    }

    //    public DaysOfWeek getDays() {
//        return days;
//    }
//    public void setDays(DaysOfWeek days) {
//        this.days = days;
//    }

    @Override
    public String toString() {
        String sRes = "Train number = " + number +
                ", stationDispatch = " + stationDispatch +
                ", stationArrival = " + stationArrival +
                ", timeDispatch = " + timeDispatch +
                ", timeArrival = " + timeArrival +
                ", days = ";
        int idays = 1;
        for (DaysOfWeek d: getDays()) {
            if (idays == getDays().length) {
                sRes += d.name();
            } else {
                sRes += d.name() + ",";
            }
            idays++;
        }
        return sRes;
//        return "Train: " +
//                "number = " + number +
//                ", stationDispatch = " + stationDispatch +
//                ", stationArrival = " + stationArrival +
//                ", timeDispatch = " + timeDispatch +
//                ", timeArrival = " + timeArrival +
//                ", days = " + DaysOfWeek.values();
    }
}
