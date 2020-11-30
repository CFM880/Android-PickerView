package com.bigkoo.pickerview.adapter;

import com.contrarywind.adapter.WheelAdapter;

public class EnMonthWheelAdapter implements WheelAdapter<String> {
    private int minValue;
    private int maxValue;

    /**
     * Constructor
     * @param minValue the wheel min value
     * @param maxValue the wheel max value
     */
    public EnMonthWheelAdapter(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    @Override
    public String getItem(int index) {
        String month = "need add enmonth to layout";
        switch (index) {
            case 0:
                month = "January";
                break;
            case 1:
                month = "February";
                break;
            case 2:
                month = "March";
                break;
            case 3:
                month = "April";
                break;
            case 4:
                month = "May";
                break;
            case 5:
                month = "June";
                break;
            case 6:
                month = "July";
                break;
            case 7:
                month = "August";
                break;
            case 8:
                month = "September";
                break;
            case 9:
                month = "October";
                break;
            case 10:
                month = "November";
                break;
            case 11:
                month = "December";
                break;
        }
        return month;
    }

    @Override
    public int indexOf(String month) {
        int index = -1;
        switch (month) {
            case "January":
                index = 0;
                break;
            case "February":
                index = 1;
                break;
            case "March":
                index = 2;
                break;
            case "Apr":
                index = 3;
                break;
            case "May":
                index = 4;
                break;
            case "June":
                index = 5;
                break;
            case "July":
                index = 6;
                break;
            case "August":
                index = 7;
                break;
            case "September":
                index = 8;
                break;
            case "October":
                index = 9;
                break;
            case "November":
                index = 10;
                break;
            case "December":
                index = 11;
                break;
        }
        return index;
    }

    @Override
    public int getItemsCount() {
        return maxValue - minValue + 1;
    }
}
