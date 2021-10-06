package com.alfabank.controller;

import com.alfabank.model.entity.Book;

import java.util.ArrayList;

public class Validator {
    public static int checkYear(String year) {
        int yy = Integer.parseInt(year);
        System.out.println(yy);
        if (yy < 1800 || yy > 2021) {
            throw new IllegalArgumentException("ERROR_YEAR");
        }
        return yy;
    }

    public static int checkPage(String spage) {
        int ipage = Integer.parseInt(spage);
        if(ipage < 10 || ipage > 1001) {
            throw new IllegalArgumentException("ERROR_PAGES");
        }
        return ipage;
    }

    public static double checkPrice(String sprice) {
        double dprice = Double.parseDouble(sprice);
        if(dprice <= 0 || dprice > 1001) {
            throw new IllegalArgumentException("ERROR_PRICE");
        }
        return dprice;
    }

    public static int checkPercent(String sperc) {
        int iperc = Integer.parseInt(sperc);
        if(iperc < 0 || iperc > 100) {
            throw new IllegalArgumentException("ERROR_PERCENT");
        }
        return iperc;
    }

    public static int checkIdBook(String sId, int iCnt) {
        int iId = Integer.parseInt(sId) + 1;
        if(iId <= 0 || iId > iCnt) {
            throw new IllegalArgumentException("ERROR_IDBOOK");
        }
        return iId;
    }

    public static Boolean checkSizeArrAuthor(ArrayList<Book> arr) {
        if (arr.size() == 0) {
            throw new NullPointerException("Array_length_zero");
        }
        return true;
    }

}
