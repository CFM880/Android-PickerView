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
                month = "Jan";
                break;
            case 1:
                month = "Feb";
                break;
            case 2:
                month = "Mar";
                break;
            case 3:
                month = "Apr";
                break;
            case 4:
                month = "May";
                break;
            case 5:
                month = "Jun";
                break;
            case 6:
                month = "Jul";
                break;
            case 7:
                month = "Aug";
                break;
            case 8:
                month = "Sept";
                break;
            case 9:
                month = "Oct";
                break;
            case 10:
                month = "Nov";
                break;
            case 11:
                month = "Dec";
                break;
        }
        return month;
    }

    @Override
    public int indexOf(String month) {
        int index = -1;
        switch (month) {
            case "Jan":
                index = 0;
                break;
            case "Feb":
                index = 1;
                break;
            case "Mar":
                index = 2;
                break;
            case "Apr":
                index = 3;
                break;
            case "May":
                index = 4;
                break;
            case "Jun":
                index = 5;
                break;
            case "Jul":
                index = 6;
                break;
            case "Aug":
                index = 7;
                break;
            case "Sept":
                index = 8;
                break;
            case "Oct":
                index = 9;
                break;
            case "Nov":
                index = 10;
                break;
            case "Dec":
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
