package com.example.messagingapp.controller;

import com.example.messagingapp.models.SmsRequest;
import com.example.messagingapp.service.TwilioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/sms")
public class TwilioController {
    private final TwilioService twilioService;

    @Autowired
    public TwilioController(TwilioService twilioService) {
        this.twilioService = twilioService;
    }

    @PostMapping("")
    public void sendSms(@Valid @RequestBody SmsRequest smsRequest) {
        // send sms to smsRequest.PhoneNumber with smsRequest.Message
        twilioService.sendSms(smsRequest);
    }
}
