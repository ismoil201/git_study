package com.example.gitstudy.Meeting;

import java.time.ZonedDateTime;
import java.util.Set;

public class Todo {

    private  String title;
    private ZonedDateTime startTime;
    private  ZonedDateTime endTime;
    private  boolean deletedYn;
    private  String description;

    public void update(String title, ZonedDateTime startTime, ZonedDateTime endTime,
                       String description){

        if(this.deletedYn){
            throw  new RuntimeException("이미 삭제된 데이터이기 때문에 값을 업데이터 할 수 없음!!!");
        }

        this.title = title;
        this.startTime  = startTime;
        this.endTime  = endTime;
        this.description = description;

    }
}
