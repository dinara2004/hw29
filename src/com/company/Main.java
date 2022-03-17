package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
/**       Integer массивден жуп сандарды терип алынызда алардын квадраттарынын эн чонун табыныз.
 */

        List <Integer> san = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        san.stream().filter(x -> x % 2 == 0).map(x -> x * x).max(Integer::compare).ifPresent(System.out::println);

    }
}
