# CrawlerApi

All URIs are relative to *https://api.verbatim.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](CrawlerApi.md#add) | **POST** /v1/crawler/{corpusId} | Create a new crawler |
| [**delete**](CrawlerApi.md#delete) | **DELETE** /v1/crawler/{corpusId}/id/{crawlerId} | Delete a crawler |
| [**get**](CrawlerApi.md#get) | **GET** /v1/crawler/{corpusId}/id/{crawlerId} | Get a crawler |
| [**list1**](CrawlerApi.md#list1) | **GET** /v1/crawler/{corpusId} | List the crawler |
| [**update**](CrawlerApi.md#update) | **PUT** /v1/crawler/{corpusId}/id/{crawlerId} | Update metadata of a Crawler |



## add

> Crawler add(corpusId, crawlerMetadata)

Create a new crawler

Create a new crawler. Only available if account has been init and attached to an organization

### Example

```java
// Import classes:
import cloud.verbatim.client.spring_rest.invoker.ApiClient;
import cloud.verbatim.client.spring_rest.invoker.ApiException;
import cloud.verbatim.client.spring_rest.invoker.Configuration;
import cloud.verbatim.client.spring_rest.invoker.auth.*;
import cloud.verbatim.client.spring_rest.invoker.models.*;
import cloud.verbatim.client.spring_rest.api.CrawlerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.verbatim.cloud");
        
        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        CrawlerApi apiInstance = new CrawlerApi(defaultClient);
        String corpusId = "corpusId_example"; // String | Id of the corpus
        CrawlerMetadata crawlerMetadata = new CrawlerMetadata(); // CrawlerMetadata | 
        try {
            Crawler result = apiInstance.add(corpusId, crawlerMetadata);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CrawlerApi#add");
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
| **crawlerMetadata** | [**CrawlerMetadata**](CrawlerMetadata.md)|  | |

### Return type

[**Crawler**](Crawler.md)

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
| **200** | Corpus is ready to use |  -  |


## delete

> delete(corpusId, crawlerId)

Delete a crawler

Permanent removal of a crawler. No restore after a delete

### Example

```java
// Import classes:
import cloud.verbatim.client.spring_rest.invoker.ApiClient;
import cloud.verbatim.client.spring_rest.invoker.ApiException;
import cloud.verbatim.client.spring_rest.invoker.Configuration;
import cloud.verbatim.client.spring_rest.invoker.auth.*;
import cloud.verbatim.client.spring_rest.invoker.models.*;
import cloud.verbatim.client.spring_rest.api.CrawlerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.verbatim.cloud");
        
        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        CrawlerApi apiInstance = new CrawlerApi(defaultClient);
        String corpusId = "corpusId_example"; // String | Id of the corpus
        String crawlerId = "crawlerId_example"; // String | Id of the crawler
        try {
            apiInstance.delete(corpusId, crawlerId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CrawlerApi#delete");
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
| **crawlerId** | **String**| Id of the crawler | |

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
| **200** | Crawler is deleted |  -  |


## get

> Crawler get(corpusId, crawlerId)

Get a crawler

Get detail info about a Crawler

### Example

```java
// Import classes:
import cloud.verbatim.client.spring_rest.invoker.ApiClient;
import cloud.verbatim.client.spring_rest.invoker.ApiException;
import cloud.verbatim.client.spring_rest.invoker.Configuration;
import cloud.verbatim.client.spring_rest.invoker.auth.*;
import cloud.verbatim.client.spring_rest.invoker.models.*;
import cloud.verbatim.client.spring_rest.api.CrawlerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.verbatim.cloud");
        
        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        CrawlerApi apiInstance = new CrawlerApi(defaultClient);
        String corpusId = "corpusId_example"; // String | Id of the corpus
        String crawlerId = "crawlerId_example"; // String | Id of the crawler
        try {
            Crawler result = apiInstance.get(corpusId, crawlerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CrawlerApi#get");
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
| **crawlerId** | **String**| Id of the crawler | |

### Return type

[**Crawler**](Crawler.md)

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
| **200** | Crawler detail is given in the body |  -  |


## list1

> PageCrawler list1(corpusId, pageToken, pageSize)

List the crawler

List your crawlers

### Example

```java
// Import classes:
import cloud.verbatim.client.spring_rest.invoker.ApiClient;
import cloud.verbatim.client.spring_rest.invoker.ApiException;
import cloud.verbatim.client.spring_rest.invoker.Configuration;
import cloud.verbatim.client.spring_rest.invoker.auth.*;
import cloud.verbatim.client.spring_rest.invoker.models.*;
import cloud.verbatim.client.spring_rest.api.CrawlerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.verbatim.cloud");
        
        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        CrawlerApi apiInstance = new CrawlerApi(defaultClient);
        String corpusId = "corpusId_example"; // String | Id of the corpus
        String pageToken = "pageToken_example"; // String | Page token. Null to fetch the first page
        Integer pageSize = 25; // Integer | Page size (max 100)
        try {
            PageCrawler result = apiInstance.list1(corpusId, pageToken, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CrawlerApi#list1");
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
| **pageToken** | **String**| Page token. Null to fetch the first page | [optional] |
| **pageSize** | **Integer**| Page size (max 100) | [optional] [default to 25] |

### Return type

[**PageCrawler**](PageCrawler.md)

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
| **200** | page of crawler given in the body |  -  |


## update

> Crawler update(corpusId, crawlerId, crawlerMetadata)

Update metadata of a Crawler

Update display info of your crawler

### Example

```java
// Import classes:
import cloud.verbatim.client.spring_rest.invoker.ApiClient;
import cloud.verbatim.client.spring_rest.invoker.ApiException;
import cloud.verbatim.client.spring_rest.invoker.Configuration;
import cloud.verbatim.client.spring_rest.invoker.auth.*;
import cloud.verbatim.client.spring_rest.invoker.models.*;
import cloud.verbatim.client.spring_rest.api.CrawlerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.verbatim.cloud");
        
        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        CrawlerApi apiInstance = new CrawlerApi(defaultClient);
        String corpusId = "corpusId_example"; // String | Id of the corpus
        String crawlerId = "crawlerId_example"; // String | Id of the crawler
        CrawlerMetadata crawlerMetadata = new CrawlerMetadata(); // CrawlerMetadata | 
        try {
            Crawler result = apiInstance.update(corpusId, crawlerId, crawlerMetadata);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CrawlerApi#update");
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
| **crawlerId** | **String**| Id of the crawler | |
| **crawlerMetadata** | [**CrawlerMetadata**](CrawlerMetadata.md)|  | |

### Return type

[**Crawler**](Crawler.md)

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
| **200** | Updated crawler given in the body |  -  |

