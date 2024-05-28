package com.example.gitstudy.Meeting;

import java.time.ZonedDateTime;

public abstract class AbstractEvent {




    private String title;
    private ZonedDateTime startAt;
    private ZonedDateTime endAt;
    protected boolean deleteYn;


    public void validateAndUpdate(AbstractAudiTableEvent event){

        if(getDeletedYn()){
            throw  new RuntimeException();
        }
        update(event);
        defaultUpdate(event);
    }

    protected abstract void update(AbstractAudiTableEvent event);


    private void defaultUpdate(AbstractAudiTableEvent event) {
        this.title =  event.getTitle();
        this.startAt = event.getStartAt();
        this.endAt = event.getEndAt();
    }

    private  boolean getDeletedYn(){
        return deleteYn;
    }


}
