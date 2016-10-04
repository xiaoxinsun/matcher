package com.bill.matcher;

import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher {

    @Autowired @AffirmEvent
    private EventBus eventBus;

    public <T> void publish(T event) {
        eventBus.post(event);
    }

}
