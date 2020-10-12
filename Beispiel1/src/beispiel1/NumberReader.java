/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beispiel1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lisa
 */
public class NumberReader {

    ArrayList<Integer> list = new ArrayList<Integer>();

    public void readFile() throws FileNotFoundException {

        try {
            BufferedReader br = new BufferedReader(new FileReader("numbers.csv"));
            String numbers;
            while ((numbers = br.readLine()) != null) {
                String[] numb = numbers.split(":");
                for (String string : numb) {
                    isNumeric(string);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(NumberReader.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void isNumeric(String num) {
        int zahl;
        try {
            zahl = Integer.parseInt(num);
            list.add(zahl);
        } catch (Exception e) {

        }

    }

    /*public void testTeiler(int teiler) {
        list.stream()
                .filter(s -> s % teiler == 0)
                .collect(Collectors.toList());

        for (Integer integer : list) {
            System.out.println(integer);
        }

    }*/
}
