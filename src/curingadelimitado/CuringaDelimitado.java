/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curingadelimitado;

import java.util.*;

/**
 *
 * @author faust
 */
public class CuringaDelimitado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> myInts = Arrays.asList(1, 2, 3);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();
        
        copy(myInts, myObjs);
        printList(myObjs);
        
        copy(myDoubles, myObjs);
        printList(myObjs);
        

    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);

        }

    }

    public static void printList(List<?> List) {

        for (Object object : List) {
            System.out.print(object + " ");

        }
        System.out.println();
    }

}
