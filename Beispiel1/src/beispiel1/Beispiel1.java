/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beispiel1;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Lisa
 */
public class Beispiel1 {

    public static void main(String[] args) throws FileNotFoundException {
        NumberReader nr = new NumberReader();
        Scanner scan = new Scanner(System.in, "Windows-1252");
        nr.readFile();
        int teiler = 0;
        int teilbereiche = 0;

        while (teilbereiche == 0) {
            System.out.println("Geben Sie bitte die Anzahl der Teilbereiche ein:");
            try {
                teilbereiche = Integer.parseInt(scan.nextLine());
            } catch (Exception e) {
                System.out.println("Sie haben keine gültige Zahl eingegebn");
            }
        };

        while (teiler == 0) {
            System.out.println("Geben Sie bitte nun einen Teiler ein:");
            try {
                teiler = Integer.parseInt(scan.nextLine());
            } catch (Exception e) {
                System.out.println("Sie haben keine gültige Zahl eingegebn");
            }
        };
    }

}
