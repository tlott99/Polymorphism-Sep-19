package com.company;

public class Age {
    private int year = 0;
    private int month = 0;
    public Age(int year, int month){
        this.year = year;
        this.month = month;
    }
    public Age(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }

}
