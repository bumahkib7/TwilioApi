package com.example.messagingapp.service;

import com.example.messagingapp.models.SmsRequest;

public interface SmsSender {
  void sendSms(SmsRequest smsRequest);

}
