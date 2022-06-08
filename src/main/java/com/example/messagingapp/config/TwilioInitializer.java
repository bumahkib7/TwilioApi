package com.example.messagingapp.config;

import com.twilio.Twilio;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioInitializer {

    private final TwilioConfig twilioConfig;
    private final static Logger logger = LoggerFactory.getLogger(TwilioInitializer.class);

    @Autowired
    public TwilioInitializer(@NotNull TwilioConfig twilioConfig) {
        this.twilioConfig = twilioConfig;
        Twilio.init(
                twilioConfig.getAccountSid(),
                twilioConfig.getAuthToken()
        );
        logger.info("Twilio initialized ... with accountSid: {}", twilioConfig.getAccountSid());
    }
}


