# AuthenticateApi

All URIs are relative to *https://api.verbatim.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**whoami**](AuthenticateApi.md#whoami) | **GET** /v1/auth/whoami | Info about the token used for authenticated this query |



## whoami

> TokenInfo whoami()

Info about the token used for authenticated this query

Get info about the active session (token)

### Example

```java
// Import classes:
import com.verbatim.client.spring_rest.invoker.ApiClient;
import com.verbatim.client.spring_rest.invoker.ApiException;
import com.verbatim.client.spring_rest.invoker.Configuration;
import com.verbatim.client.spring_rest.invoker.auth.*;
import com.verbatim.client.spring_rest.invoker.models.*;
import com.verbatim.client.spring_rest.api.AuthenticateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.verbatim.cloud");
        
        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        AuthenticateApi apiInstance = new AuthenticateApi(defaultClient);
        try {
            TokenInfo result = apiInstance.whoami();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticateApi#whoami");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**TokenInfo**](TokenInfo.md)

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
| **200** | Token info given in the body |  -  |

