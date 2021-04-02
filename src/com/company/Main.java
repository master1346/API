package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main  {

    public static void main(String[] args) {
        List<Integer> intListMain = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        StreamMain streamMain = new StreamMain(intListMain);
        System.out.println("StreamMain: ");
        streamMain.filterStream().forEach(System.out::println);

        System.out.println("Main: ");
        Collections.sort(intListMain);
        for( int number : intListMain ) {
            if((number > 0) && (number % 2 == 0) ){
                System.out.println(number);
            }

        }
    }
}
