package com.github.deathman92.spring.boot.twilio;

import com.twilio.sdk.TwilioRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Victor Zhivotikov
 * @since 03.09.2016
 */
@Configuration
@ConditionalOnClass(TwilioRestClient.class)
@ConditionalOnProperty(prefix = "twilio", value = {"accountSID", "authToken"})
@EnableConfigurationProperties(TwilioProperties.class)
public class TwilioAutoconfiguration {

    private final TwilioProperties properties;

    @Autowired
    public TwilioAutoconfiguration(TwilioProperties properties) {
        this.properties = properties;
    }

    @Bean
    @ConditionalOnMissingBean(TwilioRestClient.class)
    public TwilioRestClient twilioRestClient() {
        if (properties.getEndpoint() != null) {
            return new TwilioRestClient(properties.getAccountSID(), properties.getAuthToken(), properties.getEndpoint());
        } else {
            return new TwilioRestClient(properties.getAccountSID(), properties.getAuthToken());
        }
    }
}
