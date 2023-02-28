package org.leo.operations;

import com.azure.ai.textanalytics.TextAnalyticsAsyncClient;
import com.azure.ai.textanalytics.TextAnalyticsClient;
import com.azure.ai.textanalytics.TextAnalyticsClientBuilder;
import com.azure.core.credential.AzureKeyCredential;
import org.leo.common.Constants;

public interface AzureOperation {


    TextAnalyticsAsyncClient aSynclient = new TextAnalyticsClientBuilder()
            .credential(new AzureKeyCredential(Constants.APIKEY))
            .endpoint(Constants.ENDPOINT)
            .buildAsyncClient();

    TextAnalyticsClient client = new TextAnalyticsClientBuilder()
            .credential(new AzureKeyCredential(Constants.APIKEY))
            .endpoint(Constants.ENDPOINT).buildClient();
}
