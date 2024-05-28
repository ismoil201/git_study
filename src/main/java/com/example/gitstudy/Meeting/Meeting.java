package com.example.gitstudy.Meeting;

import java.time.ZonedDateTime;
import java.util.Set;

public class Meeting extends  AbstractEvent{



   private  String meetingRoom;
   private String agenda ;
   private Set<String> participants;

   public void update(String title, ZonedDateTime startTime, ZonedDateTime endTime,
                      String meetingRoom, String agenda, Set<String> participants){

      if(deleteYn){
         throw  new RuntimeException("이미 삭제된 데이터이기 때문에 값을 업데이터 할 수 없음!!!");
      }

      this.meetingRoom = meetingRoom;
      this.agenda =  agenda;
      this.participants = participants;


   }

   @Override
   protected void update(AbstractAudiTableEvent event) {

      UpdateMeeting meeting = (UpdateMeeting) event;

      this.agenda = meeting.getAgenda();
      this.meetingRoom = meeting.getMeetingRoom();
      this.participants = meeting.getParticipants();


   }
}
