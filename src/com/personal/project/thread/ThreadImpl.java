package com.personal.project.thread;

public class ThreadImpl implements Runnable {

    private final String s;

    public ThreadImpl(String s)
    {
        this.s = s;
    }

    @Override
    public void run() {
        String[] array = s.split("\\t");

        String phone = array[8];

        String[] phoneArray = phone.split("-");

        PhoneNumber p = new PhoneNumber(Integer.parseInt(phoneArray[0]), Integer.parseInt(phoneArray[1]), Integer.parseInt(phoneArray[2]));

        System.out.println(Thread.currentThread().getId() + "\t" + p.toString());
    }
}
