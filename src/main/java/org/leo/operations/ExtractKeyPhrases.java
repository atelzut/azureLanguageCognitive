package org.leo.operations;


import com.azure.ai.textanalytics.TextAnalyticsClient;
import com.azure.ai.textanalytics.TextAnalyticsClientBuilder;
import com.azure.core.credential.AzureKeyCredential;
import org.json.JSONArray;

/**
 * Sample demonstrates how to extract the key phrases of document.
 */
public class ExtractKeyPhrases implements AzureOperation{

    public static JSONArray analyze(String document) {
        // Instantiate a client that will be used to call the service.


        // The document that needs be analyzed.

        JSONArray results=new JSONArray();
        System.out.println("Extracted phrases:");
        client.extractKeyPhrases(document).forEach(keyPhrase -> {
            System.out.printf("%s.%n", keyPhrase);
        results.put(keyPhrase);
        });
        return results;
    }
}