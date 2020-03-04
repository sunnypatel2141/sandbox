package com.personal.project.thread;

import java.io.*;

public class ThreadingEx {

    public static void main(String[] args) {
        String file = "C:\\Users\\sanip\\Documents\\data.txt";
        BufferedReader br = null;
        {
            try {
                br = new BufferedReader(new FileReader(file));

                String header = br.readLine();
                String line = br.readLine();
                while(line != null)
                {
                    Thread t = new Thread(new ThreadImpl(line));
                    t.start();
                    line = br.readLine();
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    assert br != null;
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
