# DocumentApi

All URIs are relative to *https://api.verbatim.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**callList**](DocumentApi.md#callList) | **GET** /v1/doc/{corpusId} | List documents |
| [**delete2**](DocumentApi.md#delete2) | **DELETE** /v1/doc/{corpusId}/id/{documentId} | Delete a document |
| [**download**](DocumentApi.md#download) | **GET** /v1/doc/{corpusId}/doc/{documentId}/download | Get the download link |
| [**getDoc**](DocumentApi.md#getDoc) | **GET** /v1/doc/{corpusId}/doc/{documentId} | Get a document |
| [**getWebPage**](DocumentApi.md#getWebPage) | **GET** /v1/doc/{corpusId}/web/{documentId} | Get a WebPage |
| [**previewDoc**](DocumentApi.md#previewDoc) | **GET** /v1/doc/{corpusId}/doc/{documentId}/page/{pageIndex}/preview/{previewSize} | Preview a document image |
| [**previewWeb**](DocumentApi.md#previewWeb) | **GET** /v1/doc/{corpusId}/web/{documentId}/preview/{previewSize} | Preview a web page |
| [**upload**](DocumentApi.md#upload) | **POST** /v1/doc/{corpusId} | Upload a document |



## callList

> PageDocument callList(corpusId, pageToken, pageSize)

List documents

List documents available in your corpus

### Example

```java
// Import classes:
import com.verbatim.client.spring_rest.invoker.ApiClient;
import com.verbatim.client.spring_rest.invoker.ApiException;
import com.verbatim.client.spring_rest.invoker.Configuration;
import com.verbatim.client.spring_rest.invoker.auth.*;
import com.verbatim.client.spring_rest.invoker.models.*;
import com.verbatim.client.spring_rest.api.DocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.verbatim.cloud");
        
        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DocumentApi apiInstance = new DocumentApi(defaultClient);
        String corpusId = "corpusId_example"; // String | Id of the corpus where document is pushed. See Corpus section to learn more
        String pageToken = "pageToken_example"; // String | Page token. Null to get first page
        Integer pageSize = 25; // Integer | Page size
        try {
            PageDocument result = apiInstance.callList(corpusId, pageToken, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentApi#callList");
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
| **corpusId** | **String**| Id of the corpus where document is pushed. See Corpus section to learn more | |
| **pageToken** | **String**| Page token. Null to get first page | [optional] |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |

### Return type

[**PageDocument**](PageDocument.md)

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
| **200** | result page given in the body |  -  |


## delete2

> delete2(corpusId, documentId)

Delete a document

Delete a document from your corpus

### Example

```java
// Import classes:
import com.verbatim.client.spring_rest.invoker.ApiClient;
import com.verbatim.client.spring_rest.invoker.ApiException;
import com.verbatim.client.spring_rest.invoker.Configuration;
import com.verbatim.client.spring_rest.invoker.auth.*;
import com.verbatim.client.spring_rest.invoker.models.*;
import com.verbatim.client.spring_rest.api.DocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.verbatim.cloud");
        
        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DocumentApi apiInstance = new DocumentApi(defaultClient);
        String corpusId = "corpusId_example"; // String | Id of the corpus where document is hosted. See Corpus section to learn more
        String documentId = "documentId_example"; // String | Id of the document
        try {
            apiInstance.delete2(corpusId, documentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentApi#delete2");
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
| **corpusId** | **String**| Id of the corpus where document is hosted. See Corpus section to learn more | |
| **documentId** | **String**| Id of the document | |

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
| **200** | Document has been deleted form your corpus |  -  |


## download

> DocumentSign download(corpusId, documentId)

Get the download link

Get a secured and signed urls to download file from a document ID

### Example

```java
// Import classes:
import com.verbatim.client.spring_rest.invoker.ApiClient;
import com.verbatim.client.spring_rest.invoker.ApiException;
import com.verbatim.client.spring_rest.invoker.Configuration;
import com.verbatim.client.spring_rest.invoker.auth.*;
import com.verbatim.client.spring_rest.invoker.models.*;
import com.verbatim.client.spring_rest.api.DocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.verbatim.cloud");
        
        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DocumentApi apiInstance = new DocumentApi(defaultClient);
        String corpusId = "corpusId_example"; // String | Id of the corpus where document is hosted. See Corpus section to learn more
        String documentId = "documentId_example"; // String | Id of the document
        try {
            DocumentSign result = apiInstance.download(corpusId, documentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentApi#download");
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
| **corpusId** | **String**| Id of the corpus where document is hosted. See Corpus section to learn more | |
| **documentId** | **String**| Id of the document | |

### Return type

[**DocumentSign**](DocumentSign.md)

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
| **200** | Access url given in the body |  -  |


## getDoc

> Document getDoc(corpusId, documentId)

Get a document

Get detail info about a Document

### Example

```java
// Import classes:
import com.verbatim.client.spring_rest.invoker.ApiClient;
import com.verbatim.client.spring_rest.invoker.ApiException;
import com.verbatim.client.spring_rest.invoker.Configuration;
import com.verbatim.client.spring_rest.invoker.auth.*;
import com.verbatim.client.spring_rest.invoker.models.*;
import com.verbatim.client.spring_rest.api.DocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.verbatim.cloud");
        
        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DocumentApi apiInstance = new DocumentApi(defaultClient);
        String corpusId = "corpusId_example"; // String | Id of the corpus where document is hosted. See Corpus section to learn more
        String documentId = "documentId_example"; // String | Id of the document
        try {
            Document result = apiInstance.getDoc(corpusId, documentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentApi#getDoc");
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
| **corpusId** | **String**| Id of the corpus where document is hosted. See Corpus section to learn more | |
| **documentId** | **String**| Id of the document | |

### Return type

[**Document**](Document.md)

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
| **200** | Document given in the body |  -  |


## getWebPage

> WebPage getWebPage(corpusId, documentId)

Get a WebPage

Get detail info about a Web page

### Example

```java
// Import classes:
import com.verbatim.client.spring_rest.invoker.ApiClient;
import com.verbatim.client.spring_rest.invoker.ApiException;
import com.verbatim.client.spring_rest.invoker.Configuration;
import com.verbatim.client.spring_rest.invoker.auth.*;
import com.verbatim.client.spring_rest.invoker.models.*;
import com.verbatim.client.spring_rest.api.DocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.verbatim.cloud");
        
        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DocumentApi apiInstance = new DocumentApi(defaultClient);
        String corpusId = "corpusId_example"; // String | Id of the corpus where document is hosted. See Corpus section to learn more
        String documentId = "documentId_example"; // String | Id of the document
        try {
            WebPage result = apiInstance.getWebPage(corpusId, documentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentApi#getWebPage");
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
| **corpusId** | **String**| Id of the corpus where document is hosted. See Corpus section to learn more | |
| **documentId** | **String**| Id of the document | |

### Return type

[**WebPage**](WebPage.md)

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
| **200** | Document given in the body |  -  |


## previewDoc

> DocumentSign previewDoc(corpusId, documentId, pageIndex, previewSize)

Preview a document image

Get the preview url of one of the page of the document.

### Example

```java
// Import classes:
import com.verbatim.client.spring_rest.invoker.ApiClient;
import com.verbatim.client.spring_rest.invoker.ApiException;
import com.verbatim.client.spring_rest.invoker.Configuration;
import com.verbatim.client.spring_rest.invoker.auth.*;
import com.verbatim.client.spring_rest.invoker.models.*;
import com.verbatim.client.spring_rest.api.DocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.verbatim.cloud");
        
        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DocumentApi apiInstance = new DocumentApi(defaultClient);
        String corpusId = "corpusId_example"; // String | Id of the corpus where document is hosted. See Corpus section to learn more
        String documentId = "documentId_example"; // String | Id of the document
        Integer pageIndex = 56; // Integer | Index of the page in the document, use 0 for the first page
        String previewSize = "original"; // String | Size of the preview
        try {
            DocumentSign result = apiInstance.previewDoc(corpusId, documentId, pageIndex, previewSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentApi#previewDoc");
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
| **corpusId** | **String**| Id of the corpus where document is hosted. See Corpus section to learn more | |
| **documentId** | **String**| Id of the document | |
| **pageIndex** | **Integer**| Index of the page in the document, use 0 for the first page | |
| **previewSize** | **String**| Size of the preview | [enum: original, small, medium, large] |

### Return type

[**DocumentSign**](DocumentSign.md)

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
| **200** | Access url given in the body |  -  |


## previewWeb

> DocumentSign previewWeb(corpusId, documentId, previewSize)

Preview a web page

Get the preview url of a web page.

### Example

```java
// Import classes:
import com.verbatim.client.spring_rest.invoker.ApiClient;
import com.verbatim.client.spring_rest.invoker.ApiException;
import com.verbatim.client.spring_rest.invoker.Configuration;
import com.verbatim.client.spring_rest.invoker.auth.*;
import com.verbatim.client.spring_rest.invoker.models.*;
import com.verbatim.client.spring_rest.api.DocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.verbatim.cloud");
        
        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DocumentApi apiInstance = new DocumentApi(defaultClient);
        String corpusId = "corpusId_example"; // String | Id of the corpus where document is hosted. See Corpus section to learn more
        String documentId = "documentId_example"; // String | Id of the document
        String previewSize = "original"; // String | Size of the preview
        try {
            DocumentSign result = apiInstance.previewWeb(corpusId, documentId, previewSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentApi#previewWeb");
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
| **corpusId** | **String**| Id of the corpus where document is hosted. See Corpus section to learn more | |
| **documentId** | **String**| Id of the document | |
| **previewSize** | **String**| Size of the preview | [enum: original, small, medium, large] |

### Return type

[**DocumentSign**](DocumentSign.md)

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
| **200** | Access url given in the body |  -  |


## upload

> DocumentResumable upload(corpusId, filename)

Upload a document

Upload a new document in a corpus

### Example

```java
// Import classes:
import com.verbatim.client.spring_rest.invoker.ApiClient;
import com.verbatim.client.spring_rest.invoker.ApiException;
import com.verbatim.client.spring_rest.invoker.Configuration;
import com.verbatim.client.spring_rest.invoker.auth.*;
import com.verbatim.client.spring_rest.invoker.models.*;
import com.verbatim.client.spring_rest.api.DocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.verbatim.cloud");
        
        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        DocumentApi apiInstance = new DocumentApi(defaultClient);
        String corpusId = "corpusId_example"; // String | Id of the corpus where document is pushed. See [Corpus section](https://www.verbatim.cloud/api-docs/index.html#tag/Corpus) to learn more.
        String filename = "myfile.txt"; // String | the name of your file (max 128 characters)
        try {
            DocumentResumable result = apiInstance.upload(corpusId, filename);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentApi#upload");
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
| **corpusId** | **String**| Id of the corpus where document is pushed. See [Corpus section](https://www.verbatim.cloud/api-docs/index.html#tag/Corpus) to learn more. | |
| **filename** | **String**| the name of your file (max 128 characters) | |

### Return type

[**DocumentResumable**](DocumentResumable.md)

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
| **200** | Document is ready to be uploaded. Resumable upload session is given in the body. Use uploadUrl to start the upload. Please check doc attached to field uploadUrl |  -  |

