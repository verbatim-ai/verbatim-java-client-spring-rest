package cloud.verbatim.client.spring_rest.api;

import cloud.verbatim.client.spring_rest.invoker.ApiClient;
import cloud.verbatim.client.spring_rest.invoker.BaseApi;

import cloud.verbatim.client.spring_rest.models.Corpus;
import cloud.verbatim.client.spring_rest.models.CorpusMetadata;
import cloud.verbatim.client.spring_rest.models.Error;
import cloud.verbatim.client.spring_rest.models.PageCorpus;

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
public class CorpusApi extends BaseApi {

    public CorpusApi() {
        super(new ApiClient());
    }

    public CorpusApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Create a new corpus
     * Create a new corpus where your documents will be stored
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Corpus is ready to use. ID of your corpus is given in the body
     * @param corpusMetadata  (required)
     * @return Corpus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Corpus add1(CorpusMetadata corpusMetadata) throws RestClientException {
        return add1WithHttpInfo(corpusMetadata).getBody();
    }

    /**
     * Create a new corpus
     * Create a new corpus where your documents will be stored
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Corpus is ready to use. ID of your corpus is given in the body
     * @param corpusMetadata  (required)
     * @return ResponseEntity&lt;Corpus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Corpus> add1WithHttpInfo(CorpusMetadata corpusMetadata) throws RestClientException {
        Object localVarPostBody = corpusMetadata;
        
        // verify the required parameter 'corpusMetadata' is set
        if (corpusMetadata == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corpusMetadata' when calling add1");
        }
        

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

        ParameterizedTypeReference<Corpus> localReturnType = new ParameterizedTypeReference<Corpus>() {};
        return apiClient.invokeAPI("/v1/corpus", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a Corpus
     * Permanent removal of a Corpus. No restore after a delete.
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Corpus is deleted
     * @param corpusId Id of the corpus (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void delete1(String corpusId) throws RestClientException {
        delete1WithHttpInfo(corpusId);
    }

    /**
     * Delete a Corpus
     * Permanent removal of a Corpus. No restore after a delete.
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Corpus is deleted
     * @param corpusId Id of the corpus (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> delete1WithHttpInfo(String corpusId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'corpusId' is set
        if (corpusId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corpusId' when calling delete1");
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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "JWT" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/v1/corpus/{corpusId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a Corpus
     * Get detail info about a Corpus
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Corpus given in the body
     * @param corpusId Id of the corpus (required)
     * @return Corpus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Corpus get1(String corpusId) throws RestClientException {
        return get1WithHttpInfo(corpusId).getBody();
    }

    /**
     * Get a Corpus
     * Get detail info about a Corpus
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Corpus given in the body
     * @param corpusId Id of the corpus (required)
     * @return ResponseEntity&lt;Corpus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Corpus> get1WithHttpInfo(String corpusId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'corpusId' is set
        if (corpusId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corpusId' when calling get1");
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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "JWT" };

        ParameterizedTypeReference<Corpus> localReturnType = new ParameterizedTypeReference<Corpus>() {};
        return apiClient.invokeAPI("/v1/corpus/{corpusId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List corpus
     * List your corpus
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - page of corpus given in the body
     * @param pageToken Page token (optional)
     * @param pageSize Page size (optional, default to 25)
     * @return PageCorpus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageCorpus list2(String pageToken, Integer pageSize) throws RestClientException {
        return list2WithHttpInfo(pageToken, pageSize).getBody();
    }

    /**
     * List corpus
     * List your corpus
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - page of corpus given in the body
     * @param pageToken Page token (optional)
     * @param pageSize Page size (optional, default to 25)
     * @return ResponseEntity&lt;PageCorpus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PageCorpus> list2WithHttpInfo(String pageToken, Integer pageSize) throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<PageCorpus> localReturnType = new ParameterizedTypeReference<PageCorpus>() {};
        return apiClient.invokeAPI("/v1/corpus", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update metadata of a Corpus
     * Update display info of your corpus
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Updated corpus given in the body
     * @param corpusId Id of the corpusId (required)
     * @param corpusMetadata  (required)
     * @return Corpus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Corpus update1(String corpusId, CorpusMetadata corpusMetadata) throws RestClientException {
        return update1WithHttpInfo(corpusId, corpusMetadata).getBody();
    }

    /**
     * Update metadata of a Corpus
     * Update display info of your corpus
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Updated corpus given in the body
     * @param corpusId Id of the corpusId (required)
     * @param corpusMetadata  (required)
     * @return ResponseEntity&lt;Corpus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Corpus> update1WithHttpInfo(String corpusId, CorpusMetadata corpusMetadata) throws RestClientException {
        Object localVarPostBody = corpusMetadata;
        
        // verify the required parameter 'corpusId' is set
        if (corpusId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corpusId' when calling update1");
        }
        
        // verify the required parameter 'corpusMetadata' is set
        if (corpusMetadata == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corpusMetadata' when calling update1");
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

        ParameterizedTypeReference<Corpus> localReturnType = new ParameterizedTypeReference<Corpus>() {};
        return apiClient.invokeAPI("/v1/corpus/{corpusId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
