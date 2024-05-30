package com.example.gitstudy.Mission;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JUnit_SpockTest {

    private  static  List<Integer> filterList;
    private  static  JUnit_Spock filter ;

    @BeforeAll
      static void  setup(){

        filter = new JUnit_Spock();
        filterList = new ArrayList<>();

        addDataInList();

    }

    private static void addDataInList() {
        for (int i = 0; i < 100; i++) {
            filterList.add(i+1);
        }
    }

    @Test
    @DisplayName("from , to를 받았아서 필터링을 할 수 있.")
    void filterBy() {


        int from = 10;
        int to = 60;
        int exceptedSize = to - from -1;

        //when
        List<Integer> result = filter.filterBy(filterList, from, to);

        //then
        assertEquals(exceptedSize,result.size());
    }

    @Test
    @DisplayName("from 이 to 보디 큰 경우 필터링을 할 수 없다.")
    void filter_failed_when_from_is_grater_than_do(){

        //given


        int from =70;
        int to = 60;

        //when && then
        assertThrows(RuntimeException.class ,() ->{
            filter.filterBy(filterList,from,to);
        });
    }
}