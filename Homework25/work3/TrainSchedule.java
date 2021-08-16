package com.alfabank.work3;

public class TrainSchedule {
    private Train [] trainsArr;
    private static int iCount = 0;

    public TrainSchedule (int trainsCount) {
        trainsArr = new Train[trainsCount];
    }

    public Train[] getTrainsArr() {
        return trainsArr;
    }

    public void setTrainsArr(Train[] trainsArr) {
        this.trainsArr = trainsArr;
    }

    //public void addTrain (Train curTrain, String sDisp, String sArriv, String sTimeD, String sTimeA, String sDaysD) {
    public void addTrain (Train curTrain, String sDisp, String sArriv, String sTimeD, String sTimeA, DaysOfWeek [] sDaysD) {
        curTrain.setStationDispatch(sDisp);
        curTrain.setStationArrival(sArriv);
        curTrain.setTimeDispatch(sTimeD);
        curTrain.setTimeArrival(sTimeA);
        //curTrain.setDays(DaysOfWeek.valueOf(sDaysD.toUpperCase()));
        curTrain.setDays(sDaysD);

        if (iCount < trainsArr.length)
        trainsArr[iCount] = curTrain;
        iCount++;
    }

    public void printTrains () {
        for (Train trArr : trainsArr) {
            System.out.println(trArr);
        }
    }

    public void searchTrains (String searchArrivalStation, String searchDayDispatch) {
        boolean bSearch = false;
        for (Train trArr : trainsArr) {
            if (trArr.getStationArrival().equals(searchArrivalStation)) {
                for (DaysOfWeek dw: trArr.getDays()) {
                    if (dw.name().equalsIgnoreCase(searchDayDispatch)) {
                        bSearch = true;
                        System.out.println(trArr);
                    }
                }
            }
            if (!bSearch) {
                System.out.println("Trains not found");
            }

        }
    }

    // 1 day enum
//    public void searchTrains (String searchArrivalStation, String searchDayDispatch) {
//        boolean bSearch = false;
//        for (Train trArr : trainsArr) {
//            if (trArr.getStationArrival().equals(searchArrivalStation)) {
//                if (trArr.getDays().name().equalsIgnoreCase(searchDayDispatch)) {
//                    bSearch = true;
//                    System.out.println(trArr);
//                }
//            }
//            if (!bSearch) {
//                System.out.println("Trains not found");
//            }
//
//        }
//    }



}
