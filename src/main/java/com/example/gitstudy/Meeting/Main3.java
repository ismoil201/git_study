package com.example.gitstudy.Meeting;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {


        Meeting meeting = new Meeting();

        Set<String> par = new HashSet<>();

        par.add("New Particle Danny");

        meeting.validateAndUpdate(new UpdateMeeting(
                "Meeting room1",
                "Reading",
                par,
                "REading books",
                ZonedDateTime.now(),
                ZonedDateTime.now()));
    }
}
