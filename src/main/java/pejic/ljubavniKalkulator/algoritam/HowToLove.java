/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pejic.ljubavniKalkulator.algoritam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Pejić
 */
public class HowToLove {

    public static int checkLove(String prvoIme, String drugoIme) {

        String ime = prvoIme + drugoIme;
        char[] znakovi = ime.toLowerCase().toCharArray();
        List<Integer> brojevi = new ArrayList<>();
        int count = 1;
        int i=0, j=1;
        
        Arrays.sort(znakovi);
                
        while(true){
            
            while(j<=ime.length()-1){
                
                if ( znakovi[i] == znakovi[j] ) {
                    count++;
                    j++;
                    continue;
                }
                
                brojevi.add(count);
                count=1;
                i=j;
                j++;
                
            }
            brojevi.add(count);
            break;
        }
        
        

        return zbrajac(brojevi);

    }

    private static int zbrajac(List<Integer> num) {

        int broj = 0, x = 0;
        List<Integer> brojcic = new ArrayList<>();
        Iterator<Integer> itr = num.iterator();

        if (num.size() == 2) {
            return Integer.parseInt(num.get(0) + "" + num.get(1));
        }

        while (itr.hasNext()) {

            if(num.size()==1){
                broj+=itr.next();
                brojcic.add(broj);
                break;
            }
            
            broj += itr.next();
            x++;

            if (x == 2) {

                if (checkNumValue(broj)) {
                    brojcic.add(broj);
                } else {
                    brojcic.add(1);
                }

                broj = 0;
                x = 0;
            }

            itr.remove();

        }

        return zbrajac(brojcic);
 
    }

    private static boolean checkNumValue(int broj) {

        return (broj < 10);
    }

}
