/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beispiel2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 *
 * @author Lisa
 */
public class MyRunnable implements Callable<Integer> {

    private List<Integer> list = new ArrayList<Integer>();

    MyRunnable(List<Integer> list) {
        this.list = list;

    }

    @Override
    public Integer call() {
        return list.stream()
                .reduce(0, (a, b) -> a + b);

    }

}
