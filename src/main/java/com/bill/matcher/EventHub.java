package com.bill.matcher;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;

@Component
public class EventHub {

    @Bean @AffirmEvent
    public EventBus createEventBus() {
        return new AsyncEventBus(Executors.newSingleThreadExecutor());
    }

    //EventPublisher bean

}
