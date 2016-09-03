package com.github.deathman92.spring.boot.twilio;

import com.twilio.sdk.TwilioRestClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Victor Zhivotikov
 * @since 03.09.2016
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TwilioAutoconfigurationTest.TestApplication.class)
public class TwilioAutoconfigurationTest {

    @Autowired
    private TwilioRestClient twilioRestClient;

    @Test
    public void shouldInstantiateTwilioWithSettings() throws Exception {
        assertThat(twilioRestClient).isNotNull();
        assertThat(twilioRestClient.getAccount().getSid()).isEqualTo("testSID");
        assertThat(twilioRestClient.getAccount().getAuthToken()).isEqualTo("testToken");
        assertThat(twilioRestClient.getEndpoint()).isEqualTo("localhost");
    }

    @EnableAutoConfiguration
    public static class TestApplication {
    }

}