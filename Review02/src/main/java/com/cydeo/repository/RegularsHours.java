package com.cydeo.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("RH")
@Component
public class RegularsHours implements HoursRepository{
    @Override
    public int getHours() {
        return 40;
    }
}
