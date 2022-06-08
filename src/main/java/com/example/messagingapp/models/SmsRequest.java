package com.example.messagingapp.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SmsRequest {
    @NotBlank(message = "Phone number is required")
    private final String PhoneNumber; // phone number to send sms to
    @NotBlank(message = "Message is required")
    private final String Message; // message to send

    public SmsRequest(@JsonProperty("phoneNumber") String phoneNumber,
                      @JsonProperty("message") String message) {

        this.PhoneNumber = phoneNumber;
        this.Message = message;
    }

}
