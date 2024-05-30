package com.example.gitstudy.Mission;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class JUnit_Spock {

    public   List<Integer> filterBy(List<Integer> target, int from , int to){

        if(from >= to){
            throw new RuntimeException(
                    String.format("from  %s ga qaraganda to %s  kichkina !!! ", from, to)
            );
        }
        return  target.stream()
                .filter(data -> from < data && data <  to )
                .collect(Collectors.toList());
    }
// bu o'zim yozgan logika
//    public   List<Integer> filters (List<Integer> target, int a, int b){
//
//        Collections.sort(target);
//        List<Integer> filitered_list = new ArrayList<>();
//
//        for (int i = 0; i < target.size(); i++) {
//            if(target.get(i) > a && target.get(i) < b){
//                filitered_list.add(target.get(i));
//            }
//        }
//        return filitered_list;
//    }
}
