package org.leo.common;

// Java Program to Illustrate Configuration Class


// Importing required classes
import com.azure.ai.textanalytics.TextAnalyticsClient;
import com.azure.ai.textanalytics.TextAnalyticsClientBuilder;
import com.azure.core.credential.AzureKeyCredential;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurations {

    // Using Bean annotation to create
    // College class Bean
    @Bean
    // Here the method name is the
    // bean id/bean name
    public TextAnalyticsClient collegeBean() {

        // Return the College object
        return new  TextAnalyticsClientBuilder()
                .credential(new AzureKeyCredential(Constants.APIKEY))
                .endpoint(Constants.ENDPOINT)
                .buildClient();
    }

}
