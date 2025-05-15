package com.verbatim.client.spring_rest.api;

import com.verbatim.client.spring_rest.invoker.ApiClient;
import com.verbatim.client.spring_rest.invoker.BaseApi;

import com.verbatim.client.spring_rest.models.Error;
import com.verbatim.client.spring_rest.models.TokenInfo;

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
public class AuthenticateApi extends BaseApi {

    public AuthenticateApi() {
        super(new ApiClient());
    }

    public AuthenticateApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Info about the token used for authenticated this query
     * Get info about the active session (token)
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Token info given in the body
     * @return TokenInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * Technical documentation
     * @see <a href="https://www.verbatim.cloud/api-docs">Info about the token used for authenticated this query Documentation</a>
     */
    public TokenInfo whoami() throws RestClientException {
        return whoamiWithHttpInfo().getBody();
    }

    /**
     * Info about the token used for authenticated this query
     * Get info about the active session (token)
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Token info given in the body
     * @return ResponseEntity&lt;TokenInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * Technical documentation
     * @see <a href="https://www.verbatim.cloud/api-docs">Info about the token used for authenticated this query Documentation</a>
     */
    public ResponseEntity<TokenInfo> whoamiWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<TokenInfo> localReturnType = new ParameterizedTypeReference<TokenInfo>() {};
        return apiClient.invokeAPI("/v1/auth/whoami", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
