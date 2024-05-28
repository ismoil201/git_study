package com.example.gitstudy.Meeting;

import java.time.ZonedDateTime;

public abstract  class AbstractAudiTableEvent {

    private String title;
    private ZonedDateTime startAt;
    private ZonedDateTime endAt;


    public AbstractAudiTableEvent(String title, ZonedDateTime startAt, ZonedDateTime endAt) {
        this.title = title;
        this.startAt = startAt;
        this.endAt = endAt;
    }

    public String getTitle() {
        return title;
    }

    public ZonedDateTime getStartAt() {
        return startAt;
    }

    public ZonedDateTime getEndAt() {
        return endAt;
    }
}
