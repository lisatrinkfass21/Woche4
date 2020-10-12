/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beispiel1;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author Lisa
 */
public class MyRunnable implements Runnable {

    private ArrayList<Integer> list;
    private int teiler;

    public MyRunnable(ArrayList<Integer> list, int teiler) {
        this.list = list;
        this.teiler = teiler;
    }

    @Override
    public void run() {
        list.stream()
                .filter(s -> s % teiler == 0)
                .collect(Collectors.toList());

        for (Integer integer : list) {
            System.out.println(integer);
        }

    }

}
