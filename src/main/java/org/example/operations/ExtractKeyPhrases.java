package org.example.operations;


import com.azure.ai.textanalytics.TextAnalyticsClient;
import com.azure.ai.textanalytics.TextAnalyticsClientBuilder;
import com.azure.core.credential.AzureKeyCredential;

/**
 * Sample demonstrates how to extract the key phrases of document.
 */
public class ExtractKeyPhrases {
    /**
     * Main method to invoke this demo about how to extract the key phrases of document.
     *
     * @param args     Unused arguments to the program.
     * @param document
     * @param key
     * @param endpoint
     */
    public static void analyze(String document, String key, String endpoint) {
        // Instantiate a client that will be used to call the service.
        TextAnalyticsClient client = new TextAnalyticsClientBuilder()
                .credential(new AzureKeyCredential(key))
                .endpoint(endpoint)
                .buildClient();

        // The document that needs be analyzed.

        System.out.println("Extracted phrases:");
        client.extractKeyPhrases(document).forEach(keyPhrase -> System.out.printf("%s.%n", keyPhrase));
    }
}