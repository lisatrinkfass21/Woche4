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
import java.util.stream.Collectors;

/**
 *
 * @author Lisa
 */
public class NumberReader {

    ArrayList<Integer> list = new ArrayList<Integer>();
    int teiler = 0;

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

    public ArrayList<Integer> getList() {
        return list;
    }

    private void isNumeric(String num) {
        int zahl;
        try {
            zahl = Integer.parseInt(num);
            list.add(zahl);
        } catch (Exception e) {

        }

    }

}
