package com.itchain.msadddeventsourcing.orderservice.domain.event;

import com.itchain.msadddeventsourcing.orderservice.common.Event;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class OrderDeletedEvent implements Event {
    private String id;

    @Override
    public String getID() {
        return id;
    }
}
