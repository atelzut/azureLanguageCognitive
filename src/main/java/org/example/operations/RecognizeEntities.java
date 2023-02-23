package org.example.operations;

import com.azure.ai.textanalytics.TextAnalyticsClient;
import com.azure.ai.textanalytics.TextAnalyticsClientBuilder;
import com.azure.ai.textanalytics.models.TextDocumentInput;
import com.azure.core.credential.AzureKeyCredential;

import java.util.List;

public class RecognizeEntities {
    public static void analize(List<TextDocumentInput> batchDocuments, String apiKey, String endpoint) {
        TextAnalyticsClient client = new TextAnalyticsClientBuilder().credential(new AzureKeyCredential(apiKey)).endpoint(endpoint).buildClient();

        for (TextDocumentInput batchDocument : batchDocuments) {
            client.recognizeEntities(batchDocument.getText()).forEach(entity -> System.out.printf(
                    "Message Id: %s, Recognized categorized entity: %s, entity category: %s, entity subcategory: %s, confidence score: %f.%n",
                    batchDocument.getId(), entity.getText(), entity.getCategory(), entity.getSubcategory(), entity.getConfidenceScore()));
            System.out.println("##############################################");
        }
    }
}
