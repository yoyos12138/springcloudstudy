package com.zzz.Schedule;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import jakarta.annotation.Resource;

@Component
public class TestSchedule {
    @Resource
    RestTemplate restTemplate;
}
