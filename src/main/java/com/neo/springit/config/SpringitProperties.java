package com.neo.springit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author neo
 * @date 2020-10-14 15:59
 */

@ConfigurationProperties("springit")
public class SpringitProperties {

    /**
     * This is our welcome message.
     */

    private String welcomeMsg = "Hello Wolrd";

    public String getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomepMsg) {
        this.welcomeMsg = welcomepMsg;
    }
}
