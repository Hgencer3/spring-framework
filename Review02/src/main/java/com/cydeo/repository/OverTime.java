package com.cydeo.repository;

import org.springframework.stereotype.Component;

@Component
public class OverTime implements HoursRepository {

    @Override
    public int getHours() {
        return 15;
    }
}
