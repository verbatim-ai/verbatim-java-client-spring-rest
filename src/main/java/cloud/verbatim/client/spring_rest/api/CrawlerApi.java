package cloud.verbatim.client.spring_rest.api;

import cloud.verbatim.client.spring_rest.invoker.ApiClient;
import cloud.verbatim.client.spring_rest.invoker.BaseApi;

import cloud.verbatim.client.spring_rest.models.Crawler;
import cloud.verbatim.client.spring_rest.models.CrawlerMetadata;
import cloud.verbatim.client.spring_rest.models.Error;
import cloud.verbatim.client.spring_rest.models.PageCrawler;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class CrawlerApi extends BaseApi {

    public CrawlerApi() {
        super(new ApiClient());
    }

    public CrawlerApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Create a new crawler
     * Create a new crawler. Only available if account has been init and attached to an organization
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Corpus is ready to use
     * @param corpusId Id of the corpus (required)
     * @param crawlerMetadata  (required)
     * @return Crawler
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Crawler add(String corpusId, CrawlerMetadata crawlerMetadata) throws RestClientException {
        return addWithHttpInfo(corpusId, crawlerMetadata).getBody();
    }

    /**
     * Create a new crawler
     * Create a new crawler. Only available if account has been init and attached to an organization
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Corpus is ready to use
     * @param corpusId Id of the corpus (required)
     * @param crawlerMetadata  (required)
     * @return ResponseEntity&lt;Crawler&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Crawler> addWithHttpInfo(String corpusId, CrawlerMetadata crawlerMetadata) throws RestClientException {
        Object localVarPostBody = crawlerMetadata;
        
        // verify the required parameter 'corpusId' is set
        if (corpusId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corpusId' when calling add");
        }
        
        // verify the required parameter 'crawlerMetadata' is set
        if (crawlerMetadata == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'crawlerMetadata' when calling add");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("corpusId", corpusId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "JWT" };

        ParameterizedTypeReference<Crawler> localReturnType = new ParameterizedTypeReference<Crawler>() {};
        return apiClient.invokeAPI("/v1/crawler/{corpusId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a crawler
     * Permanent removal of a crawler. No restore after a delete
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Crawler is deleted
     * @param corpusId Id of the corpus (required)
     * @param crawlerId Id of the crawler (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void delete(String corpusId, String crawlerId) throws RestClientException {
        deleteWithHttpInfo(corpusId, crawlerId);
    }

    /**
     * Delete a crawler
     * Permanent removal of a crawler. No restore after a delete
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Crawler is deleted
     * @param corpusId Id of the corpus (required)
     * @param crawlerId Id of the crawler (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteWithHttpInfo(String corpusId, String crawlerId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'corpusId' is set
        if (corpusId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corpusId' when calling delete");
        }
        
        // verify the required parameter 'crawlerId' is set
        if (crawlerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'crawlerId' when calling delete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("corpusId", corpusId);
        uriVariables.put("crawlerId", crawlerId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "JWT" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/v1/crawler/{corpusId}/id/{crawlerId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a crawler
     * Get detail info about a Crawler
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Crawler detail is given in the body
     * @param corpusId Id of the corpus (required)
     * @param crawlerId Id of the crawler (required)
     * @return Crawler
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Crawler get(String corpusId, String crawlerId) throws RestClientException {
        return getWithHttpInfo(corpusId, crawlerId).getBody();
    }

    /**
     * Get a crawler
     * Get detail info about a Crawler
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Crawler detail is given in the body
     * @param corpusId Id of the corpus (required)
     * @param crawlerId Id of the crawler (required)
     * @return ResponseEntity&lt;Crawler&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Crawler> getWithHttpInfo(String corpusId, String crawlerId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'corpusId' is set
        if (corpusId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corpusId' when calling get");
        }
        
        // verify the required parameter 'crawlerId' is set
        if (crawlerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'crawlerId' when calling get");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("corpusId", corpusId);
        uriVariables.put("crawlerId", crawlerId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "JWT" };

        ParameterizedTypeReference<Crawler> localReturnType = new ParameterizedTypeReference<Crawler>() {};
        return apiClient.invokeAPI("/v1/crawler/{corpusId}/id/{crawlerId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List the crawler
     * List your crawlers
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - page of crawler given in the body
     * @param corpusId Id of the corpus (required)
     * @param pageToken Page token. Null to fetch the first page (optional)
     * @param pageSize Page size (max 100) (optional, default to 25)
     * @return PageCrawler
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageCrawler list1(String corpusId, String pageToken, Integer pageSize) throws RestClientException {
        return list1WithHttpInfo(corpusId, pageToken, pageSize).getBody();
    }

    /**
     * List the crawler
     * List your crawlers
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - page of crawler given in the body
     * @param corpusId Id of the corpus (required)
     * @param pageToken Page token. Null to fetch the first page (optional)
     * @param pageSize Page size (max 100) (optional, default to 25)
     * @return ResponseEntity&lt;PageCrawler&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PageCrawler> list1WithHttpInfo(String corpusId, String pageToken, Integer pageSize) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'corpusId' is set
        if (corpusId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corpusId' when calling list1");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("corpusId", corpusId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageToken", pageToken));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "JWT" };

        ParameterizedTypeReference<PageCrawler> localReturnType = new ParameterizedTypeReference<PageCrawler>() {};
        return apiClient.invokeAPI("/v1/crawler/{corpusId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update metadata of a Crawler
     * Update display info of your crawler
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Updated crawler given in the body
     * @param corpusId Id of the corpus (required)
     * @param crawlerId Id of the crawler (required)
     * @param crawlerMetadata  (required)
     * @return Crawler
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Crawler update(String corpusId, String crawlerId, CrawlerMetadata crawlerMetadata) throws RestClientException {
        return updateWithHttpInfo(corpusId, crawlerId, crawlerMetadata).getBody();
    }

    /**
     * Update metadata of a Crawler
     * Update display info of your crawler
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Updated crawler given in the body
     * @param corpusId Id of the corpus (required)
     * @param crawlerId Id of the crawler (required)
     * @param crawlerMetadata  (required)
     * @return ResponseEntity&lt;Crawler&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Crawler> updateWithHttpInfo(String corpusId, String crawlerId, CrawlerMetadata crawlerMetadata) throws RestClientException {
        Object localVarPostBody = crawlerMetadata;
        
        // verify the required parameter 'corpusId' is set
        if (corpusId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corpusId' when calling update");
        }
        
        // verify the required parameter 'crawlerId' is set
        if (crawlerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'crawlerId' when calling update");
        }
        
        // verify the required parameter 'crawlerMetadata' is set
        if (crawlerMetadata == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'crawlerMetadata' when calling update");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("corpusId", corpusId);
        uriVariables.put("crawlerId", crawlerId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "JWT" };

        ParameterizedTypeReference<Crawler> localReturnType = new ParameterizedTypeReference<Crawler>() {};
        return apiClient.invokeAPI("/v1/crawler/{corpusId}/id/{crawlerId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    @Override
    public <T> ResponseEntity<T> invokeAPI(String url, HttpMethod method, Object request, ParameterizedTypeReference<T> returnType) throws RestClientException {
        String localVarPath = url.replace(apiClient.getBasePath(), "");
        Object localVarPostBody = request;

        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "JWT" };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
