/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pejic.ljubavniKalkulator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Pejić
 */
public class Test {
    
    
    public static void main(String[] args) {
        
    
        List<Integer> imena = new ArrayList<>();
        List<Integer> ostala = new ArrayList<>();
        
           int broj=0;
           
        
           
        imena.add(1);
        imena.add(2);
        imena.add(3);
        imena.add(4);
        imena.add(7);
        imena.add(10);
        System.out.println("Velkicina imena size "+imena.size());
        Iterator<Integer> itr = imena.iterator();
        
        while(itr.hasNext()){
            
            broj += itr.next();
            itr.remove();
            
            
        }
        
        System.out.println("Suma brojeva "+broj);
        
        System.out.println("Nakon obrade velicina size imena "+imena.size());
        

//List<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(101);
//        numbers.add(200);
//        numbers.add(301);
//        numbers.add(400);
//        
//        System.out.println("ArrayList Before : " + numbers);
//
//Iterator<Integer> itr = numbers.iterator();
//
//// remove all even numbers
//while (itr.hasNext()) {
//    Integer number = itr.next();
//
//       if (number % 2 == 0) {
//       itr.remove();
//    }
//
//}
//
//System.out.println("ArrayList After : " + numbers);

        
    }
    
    
    
    
}
