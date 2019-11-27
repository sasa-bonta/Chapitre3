package com.company.Date;

public class DysplayDate {

    public static void main(String[] args) {
        Date date1 = new Date(29, 2, 2001);
        Date date2 = new Date(32, 12, 2011);

        System.out.printf("%d/%d/%d%n", date1.getDay(), date1.getMonth(), date1.getYear());
        System.out.printf("%d/%d/%d%n", date2.getDay(), date2.getMonth(), date2.getYear());
    }
}

