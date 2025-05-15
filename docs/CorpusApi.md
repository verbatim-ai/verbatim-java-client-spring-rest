# CorpusApi

All URIs are relative to *https://api.verbatim.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add1**](CorpusApi.md#add1) | **POST** /v1/corpus | Create a new corpus |
| [**delete1**](CorpusApi.md#delete1) | **DELETE** /v1/corpus/{corpusId} | Delete a Corpus |
| [**get1**](CorpusApi.md#get1) | **GET** /v1/corpus/{corpusId} | Get a Corpus |
| [**list2**](CorpusApi.md#list2) | **GET** /v1/corpus | List corpus |
| [**update1**](CorpusApi.md#update1) | **PUT** /v1/corpus/{corpusId} | Update metadata of a Corpus |



## add1

> Corpus add1(corpusMetadata)

Create a new corpus

Create a new corpus where your documents will be stored

### Example

```java
// Import classes:
import com.verbatim.client.spring_rest.invoker.ApiClient;
import com.verbatim.client.spring_rest.invoker.ApiException;
import com.verbatim.client.spring_rest.invoker.Configuration;
import com.verbatim.client.spring_rest.invoker.auth.*;
import com.verbatim.client.spring_rest.invoker.models.*;
import com.verbatim.client.spring_rest.api.CorpusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.verbatim.cloud");
        
        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        CorpusApi apiInstance = new CorpusApi(defaultClient);
        CorpusMetadata corpusMetadata = new CorpusMetadata(); // CorpusMetadata | 
        try {
            Corpus result = apiInstance.add1(corpusMetadata);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorpusApi#add1");
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
| **corpusMetadata** | [**CorpusMetadata**](CorpusMetadata.md)|  | |

### Return type

[**Corpus**](Corpus.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json
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
| **200** | Corpus is ready to use. ID of your corpus is given in the body |  -  |


## delete1

> delete1(corpusId)

Delete a Corpus

Permanent removal of a Corpus. No restore after a delete.

### Example

```java
// Import classes:
import com.verbatim.client.spring_rest.invoker.ApiClient;
import com.verbatim.client.spring_rest.invoker.ApiException;
import com.verbatim.client.spring_rest.invoker.Configuration;
import com.verbatim.client.spring_rest.invoker.auth.*;
import com.verbatim.client.spring_rest.invoker.models.*;
import com.verbatim.client.spring_rest.api.CorpusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.verbatim.cloud");
        
        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        CorpusApi apiInstance = new CorpusApi(defaultClient);
        String corpusId = "corpusId_example"; // String | Id of the corpus
        try {
            apiInstance.delete1(corpusId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorpusApi#delete1");
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
| **corpusId** | **String**| Id of the corpus | |

### Return type

null (empty response body)

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
| **200** | Corpus is deleted |  -  |


## get1

> Corpus get1(corpusId)

Get a Corpus

Get detail info about a Corpus

### Example

```java
// Import classes:
import com.verbatim.client.spring_rest.invoker.ApiClient;
import com.verbatim.client.spring_rest.invoker.ApiException;
import com.verbatim.client.spring_rest.invoker.Configuration;
import com.verbatim.client.spring_rest.invoker.auth.*;
import com.verbatim.client.spring_rest.invoker.models.*;
import com.verbatim.client.spring_rest.api.CorpusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.verbatim.cloud");
        
        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        CorpusApi apiInstance = new CorpusApi(defaultClient);
        String corpusId = "corpusId_example"; // String | Id of the corpus
        try {
            Corpus result = apiInstance.get1(corpusId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorpusApi#get1");
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
| **corpusId** | **String**| Id of the corpus | |

### Return type

[**Corpus**](Corpus.md)

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
| **200** | Corpus given in the body |  -  |


## list2

> PageCorpus list2(pageToken, pageSize)

List corpus

List your corpus

### Example

```java
// Import classes:
import com.verbatim.client.spring_rest.invoker.ApiClient;
import com.verbatim.client.spring_rest.invoker.ApiException;
import com.verbatim.client.spring_rest.invoker.Configuration;
import com.verbatim.client.spring_rest.invoker.auth.*;
import com.verbatim.client.spring_rest.invoker.models.*;
import com.verbatim.client.spring_rest.api.CorpusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.verbatim.cloud");
        
        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        CorpusApi apiInstance = new CorpusApi(defaultClient);
        String pageToken = "pageToken_example"; // String | Page token
        Integer pageSize = 25; // Integer | Page size
        try {
            PageCorpus result = apiInstance.list2(pageToken, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorpusApi#list2");
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
| **pageToken** | **String**| Page token | [optional] |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |

### Return type

[**PageCorpus**](PageCorpus.md)

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
| **200** | page of corpus given in the body |  -  |


## update1

> Corpus update1(corpusId, corpusMetadata)

Update metadata of a Corpus

Update display info of your corpus

### Example

```java
// Import classes:
import com.verbatim.client.spring_rest.invoker.ApiClient;
import com.verbatim.client.spring_rest.invoker.ApiException;
import com.verbatim.client.spring_rest.invoker.Configuration;
import com.verbatim.client.spring_rest.invoker.auth.*;
import com.verbatim.client.spring_rest.invoker.models.*;
import com.verbatim.client.spring_rest.api.CorpusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.verbatim.cloud");
        
        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        CorpusApi apiInstance = new CorpusApi(defaultClient);
        String corpusId = "corpusId_example"; // String | Id of the corpusId
        CorpusMetadata corpusMetadata = new CorpusMetadata(); // CorpusMetadata | 
        try {
            Corpus result = apiInstance.update1(corpusId, corpusMetadata);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorpusApi#update1");
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
| **corpusId** | **String**| Id of the corpusId | |
| **corpusMetadata** | [**CorpusMetadata**](CorpusMetadata.md)|  | |

### Return type

[**Corpus**](Corpus.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json
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
| **200** | Updated corpus given in the body |  -  |

