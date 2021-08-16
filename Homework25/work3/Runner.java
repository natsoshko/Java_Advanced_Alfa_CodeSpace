package com.alfabank.work3;
import java.util.Scanner;

public class Runner {
    public void run() {
        TrainSchedule schedule = createScheduleTrains();
        schedule.printTrains();
        searchTrainsInSchedule(schedule);

    }

    public TrainSchedule createScheduleTrains () {
        System.out.print("Enter count of trains: ");
        Scanner sc1 = new Scanner(System.in);
        int iCount = sc1.nextInt();

        TrainSchedule trainsSched = new TrainSchedule(iCount);
        //System.out.println("trainsSched: " + trainsSched.getTrainsArr().length);

        for (int i = 0; i < trainsSched.getTrainsArr().length; i++) {
            Scanner sc2 = new Scanner(System.in);
            System.out.print("Enter number of train: ");
            int iNumberTrain  = sc2.nextInt();
            System.out.print("Enter stationDispatch of train " + iNumberTrain + ": ");
            sc2 = new Scanner(System.in);
            String sStationDisp = sc2.nextLine();
            System.out.print("Enter stationArrival of train " + iNumberTrain + ": ");
            sc2 = new Scanner(System.in);
            String sStationArriv = sc2.nextLine();
            System.out.print("Enter timeDispatch of train " + iNumberTrain + ": ");
            sc2 = new Scanner(System.in);
            String sTimeDisp = sc2.nextLine();
            System.out.print("Enter timeArrival of train " + iNumberTrain + ": ");
            sc2 = new Scanner(System.in);
            String sTimeArriv = sc2.nextLine();
            System.out.print("Enter dayDispatch of train " + iNumberTrain + " (separate values by comma): ");
            sc2 = new Scanner(System.in);
            String sDaysDisp = sc2.nextLine();
            String [] sDaysDispArr = sDaysDisp.replaceAll("\\s+", "").split(",");


            DaysOfWeek [] daysArr = new DaysOfWeek[sDaysDispArr.length];
            for (int j = 0; j < sDaysDispArr.length; j++) {
                daysArr[j] = DaysOfWeek.valueOf(sDaysDispArr[j].toUpperCase());
            }
            trainsSched.getTrainsArr()[i] = new Train(iNumberTrain);
            trainsSched.addTrain(trainsSched.getTrainsArr()[i], sStationDisp, sStationArriv, sTimeDisp, sTimeArriv, daysArr);
        }
        return trainsSched;
    }

    public void searchTrainsInSchedule(TrainSchedule searchTrains) {
        System.out.print("Enter stationArrival for search trains: ");
        Scanner sc3 = new Scanner(System.in);
        String srcArrStaion = sc3.nextLine();
        System.out.print("Enter dayDispatch for search trains: ");
        sc3 = new Scanner(System.in);
        String srcDays = sc3.nextLine();
        searchTrains.searchTrains (srcArrStaion, srcDays);
    }

}
