package cloud.verbatim.client.spring_rest.api;

import cloud.verbatim.client.spring_rest.invoker.ApiClient;
import cloud.verbatim.client.spring_rest.invoker.BaseApi;

import cloud.verbatim.client.spring_rest.models.Error;
import cloud.verbatim.client.spring_rest.models.PromptResponse;

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
public class PromptApi extends BaseApi {

    public PromptApi() {
        super(new ApiClient());
    }

    public PromptApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Run a prompt
     * Your prompt is process in the engine. Semantic response if give in the body with attachments found from your corpus
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Response is given in the body
     * @param corpusId ID of your corpus (required)
     * @param model AI Model to use (required)
     * @param query Query to run on the engine (Max 1014 characters allowed) (required)
     * @return PromptResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PromptResponse prompt(String corpusId, String model, String query) throws RestClientException {
        return promptWithHttpInfo(corpusId, model, query).getBody();
    }

    /**
     * Run a prompt
     * Your prompt is process in the engine. Semantic response if give in the body with attachments found from your corpus
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Response is given in the body
     * @param corpusId ID of your corpus (required)
     * @param model AI Model to use (required)
     * @param query Query to run on the engine (Max 1014 characters allowed) (required)
     * @return ResponseEntity&lt;PromptResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PromptResponse> promptWithHttpInfo(String corpusId, String model, String query) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'corpusId' is set
        if (corpusId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corpusId' when calling prompt");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling prompt");
        }
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'query' when calling prompt");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("corpusId", corpusId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "model", model));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "JWT" };

        ParameterizedTypeReference<PromptResponse> localReturnType = new ParameterizedTypeReference<PromptResponse>() {};
        return apiClient.invokeAPI("/v1/prompt/{corpusId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "JWT" };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
