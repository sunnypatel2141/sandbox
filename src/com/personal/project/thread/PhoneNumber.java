package com.personal.project.thread;

public class PhoneNumber {

    private final int areaCode;
    private final int divison;
    private final int num;


    public PhoneNumber(int areaCode, int divison, int num) {
        this.areaCode = areaCode;
        this.divison = divison;
        this.num = num;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public int getDivison() {
        return divison;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PhoneNumber{");
        sb.append("areaCode=").append(areaCode);
        sb.append(", divison=").append(divison);
        sb.append(", num=").append(num);
        sb.append('}');
        return sb.toString();
    }
}
