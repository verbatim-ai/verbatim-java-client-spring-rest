# PromptApi

All URIs are relative to *https://api.verbatim.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**prompt**](PromptApi.md#prompt) | **GET** /v1/prompt/{corpusId} | Run a prompt |



## prompt

> PromptResponse prompt(corpusId, model, query)

Run a prompt

Your prompt is process in the engine. Semantic response if give in the body with attachments found from your corpus

### Example

```java
// Import classes:
import com.verbatim.client.spring_rest.invoker.ApiClient;
import com.verbatim.client.spring_rest.invoker.ApiException;
import com.verbatim.client.spring_rest.invoker.Configuration;
import com.verbatim.client.spring_rest.invoker.auth.*;
import com.verbatim.client.spring_rest.invoker.models.*;
import com.verbatim.client.spring_rest.api.PromptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.verbatim.cloud");
        
        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        PromptApi apiInstance = new PromptApi(defaultClient);
        String corpusId = "corpusId_example"; // String | ID of your corpus
        String model = "gemini_15_pro"; // String | AI Model to use
        String query = "What is the name of the Uk prime minister ?"; // String | Query to run on the engine (Max 1014 characters allowed)
        try {
            PromptResponse result = apiInstance.prompt(corpusId, model, query);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromptApi#prompt");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **corpusId** | **String**| ID of your corpus | |
| **model** | **String**| AI Model to use | [enum: gemini_15_pro, gemini_20_flash] |
| **query** | **String**| Query to run on the engine (Max 1014 characters allowed) | |

### Return type

[**PromptResponse**](PromptResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | Internal error. Check body to get more info |  -  |
| **429** | Too many request. Check your quota on your dashboard |  -  |
| **503** | Service temporary not available. Reason is given the body |  -  |
| **403** | Not authorized. Access not granted for this request |  -  |
| **404** | Document not found |  -  |
| **400** | Bad request. Invalid body or missing parameter |  -  |
| **200** | Response is given in the body |  -  |

