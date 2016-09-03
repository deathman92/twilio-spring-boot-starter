package com.github.deathman92.spring.boot.twilio;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Victor Zhivotikov
 * @since 03.09.2016
 */
@Data
@ConfigurationProperties("twilio")
public class TwilioProperties {

    private String accountSID;
    private String authToken;
    private String endpoint;

}