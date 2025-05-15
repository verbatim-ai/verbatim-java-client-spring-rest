package com.verbatim.client.spring_rest.api;

import com.verbatim.client.spring_rest.invoker.ApiClient;
import com.verbatim.client.spring_rest.invoker.BaseApi;

import com.verbatim.client.spring_rest.models.Document;
import com.verbatim.client.spring_rest.models.DocumentResumable;
import com.verbatim.client.spring_rest.models.DocumentSign;
import com.verbatim.client.spring_rest.models.Error;
import com.verbatim.client.spring_rest.models.PageDocument;
import com.verbatim.client.spring_rest.models.WebPage;

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
public class DocumentApi extends BaseApi {

    public DocumentApi() {
        super(new ApiClient());
    }

    public DocumentApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * List documents
     * List documents available in your corpus
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - result page given in the body
     * @param corpusId Id of the corpus where document is pushed. See Corpus section to learn more (required)
     * @param pageToken Page token. Null to get first page (optional)
     * @param pageSize Page size (optional, default to 25)
     * @return PageDocument
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageDocument callList(String corpusId, String pageToken, Integer pageSize) throws RestClientException {
        return callListWithHttpInfo(corpusId, pageToken, pageSize).getBody();
    }

    /**
     * List documents
     * List documents available in your corpus
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - result page given in the body
     * @param corpusId Id of the corpus where document is pushed. See Corpus section to learn more (required)
     * @param pageToken Page token. Null to get first page (optional)
     * @param pageSize Page size (optional, default to 25)
     * @return ResponseEntity&lt;PageDocument&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PageDocument> callListWithHttpInfo(String corpusId, String pageToken, Integer pageSize) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'corpusId' is set
        if (corpusId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corpusId' when calling callList");
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

        ParameterizedTypeReference<PageDocument> localReturnType = new ParameterizedTypeReference<PageDocument>() {};
        return apiClient.invokeAPI("/v1/doc/{corpusId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a document
     * Delete a document from your corpus
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Document has been deleted form your corpus
     * @param corpusId Id of the corpus where document is hosted. See Corpus section to learn more (required)
     * @param documentId Id of the document (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void delete2(String corpusId, String documentId) throws RestClientException {
        delete2WithHttpInfo(corpusId, documentId);
    }

    /**
     * Delete a document
     * Delete a document from your corpus
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Document has been deleted form your corpus
     * @param corpusId Id of the corpus where document is hosted. See Corpus section to learn more (required)
     * @param documentId Id of the document (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> delete2WithHttpInfo(String corpusId, String documentId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'corpusId' is set
        if (corpusId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corpusId' when calling delete2");
        }
        
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'documentId' when calling delete2");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("corpusId", corpusId);
        uriVariables.put("documentId", documentId);

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
        return apiClient.invokeAPI("/v1/doc/{corpusId}/id/{documentId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the download link
     * Get a secured and signed urls to download file from a document ID
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Access url given in the body
     * @param corpusId Id of the corpus where document is hosted. See Corpus section to learn more (required)
     * @param documentId Id of the document (required)
     * @return DocumentSign
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentSign download(String corpusId, String documentId) throws RestClientException {
        return downloadWithHttpInfo(corpusId, documentId).getBody();
    }

    /**
     * Get the download link
     * Get a secured and signed urls to download file from a document ID
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Access url given in the body
     * @param corpusId Id of the corpus where document is hosted. See Corpus section to learn more (required)
     * @param documentId Id of the document (required)
     * @return ResponseEntity&lt;DocumentSign&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentSign> downloadWithHttpInfo(String corpusId, String documentId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'corpusId' is set
        if (corpusId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corpusId' when calling download");
        }
        
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'documentId' when calling download");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("corpusId", corpusId);
        uriVariables.put("documentId", documentId);

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

        ParameterizedTypeReference<DocumentSign> localReturnType = new ParameterizedTypeReference<DocumentSign>() {};
        return apiClient.invokeAPI("/v1/doc/{corpusId}/doc/{documentId}/download", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a document
     * Get detail info about a Document
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Document given in the body
     * @param corpusId Id of the corpus where document is hosted. See Corpus section to learn more (required)
     * @param documentId Id of the document (required)
     * @return Document
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Document getDoc(String corpusId, String documentId) throws RestClientException {
        return getDocWithHttpInfo(corpusId, documentId).getBody();
    }

    /**
     * Get a document
     * Get detail info about a Document
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Document given in the body
     * @param corpusId Id of the corpus where document is hosted. See Corpus section to learn more (required)
     * @param documentId Id of the document (required)
     * @return ResponseEntity&lt;Document&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Document> getDocWithHttpInfo(String corpusId, String documentId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'corpusId' is set
        if (corpusId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corpusId' when calling getDoc");
        }
        
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'documentId' when calling getDoc");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("corpusId", corpusId);
        uriVariables.put("documentId", documentId);

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

        ParameterizedTypeReference<Document> localReturnType = new ParameterizedTypeReference<Document>() {};
        return apiClient.invokeAPI("/v1/doc/{corpusId}/doc/{documentId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a WebPage
     * Get detail info about a Web page
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Document given in the body
     * @param corpusId Id of the corpus where document is hosted. See Corpus section to learn more (required)
     * @param documentId Id of the document (required)
     * @return WebPage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WebPage getWebPage(String corpusId, String documentId) throws RestClientException {
        return getWebPageWithHttpInfo(corpusId, documentId).getBody();
    }

    /**
     * Get a WebPage
     * Get detail info about a Web page
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Document given in the body
     * @param corpusId Id of the corpus where document is hosted. See Corpus section to learn more (required)
     * @param documentId Id of the document (required)
     * @return ResponseEntity&lt;WebPage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<WebPage> getWebPageWithHttpInfo(String corpusId, String documentId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'corpusId' is set
        if (corpusId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corpusId' when calling getWebPage");
        }
        
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'documentId' when calling getWebPage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("corpusId", corpusId);
        uriVariables.put("documentId", documentId);

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

        ParameterizedTypeReference<WebPage> localReturnType = new ParameterizedTypeReference<WebPage>() {};
        return apiClient.invokeAPI("/v1/doc/{corpusId}/web/{documentId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Preview a document image
     * Get the preview url of one of the page of the document.
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Access url given in the body
     * @param corpusId Id of the corpus where document is hosted. See Corpus section to learn more (required)
     * @param documentId Id of the document (required)
     * @param pageIndex Index of the page in the document, use 0 for the first page (required)
     * @param previewSize Size of the preview (required)
     * @return DocumentSign
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentSign previewDoc(String corpusId, String documentId, Integer pageIndex, String previewSize) throws RestClientException {
        return previewDocWithHttpInfo(corpusId, documentId, pageIndex, previewSize).getBody();
    }

    /**
     * Preview a document image
     * Get the preview url of one of the page of the document.
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Access url given in the body
     * @param corpusId Id of the corpus where document is hosted. See Corpus section to learn more (required)
     * @param documentId Id of the document (required)
     * @param pageIndex Index of the page in the document, use 0 for the first page (required)
     * @param previewSize Size of the preview (required)
     * @return ResponseEntity&lt;DocumentSign&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentSign> previewDocWithHttpInfo(String corpusId, String documentId, Integer pageIndex, String previewSize) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'corpusId' is set
        if (corpusId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corpusId' when calling previewDoc");
        }
        
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'documentId' when calling previewDoc");
        }
        
        // verify the required parameter 'pageIndex' is set
        if (pageIndex == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageIndex' when calling previewDoc");
        }
        
        // verify the required parameter 'previewSize' is set
        if (previewSize == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'previewSize' when calling previewDoc");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("corpusId", corpusId);
        uriVariables.put("documentId", documentId);
        uriVariables.put("pageIndex", pageIndex);
        uriVariables.put("previewSize", previewSize);

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

        ParameterizedTypeReference<DocumentSign> localReturnType = new ParameterizedTypeReference<DocumentSign>() {};
        return apiClient.invokeAPI("/v1/doc/{corpusId}/doc/{documentId}/page/{pageIndex}/preview/{previewSize}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Preview a web page
     * Get the preview url of a web page.
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Access url given in the body
     * @param corpusId Id of the corpus where document is hosted. See Corpus section to learn more (required)
     * @param documentId Id of the document (required)
     * @param previewSize Size of the preview (required)
     * @return DocumentSign
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentSign previewWeb(String corpusId, String documentId, String previewSize) throws RestClientException {
        return previewWebWithHttpInfo(corpusId, documentId, previewSize).getBody();
    }

    /**
     * Preview a web page
     * Get the preview url of a web page.
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Access url given in the body
     * @param corpusId Id of the corpus where document is hosted. See Corpus section to learn more (required)
     * @param documentId Id of the document (required)
     * @param previewSize Size of the preview (required)
     * @return ResponseEntity&lt;DocumentSign&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentSign> previewWebWithHttpInfo(String corpusId, String documentId, String previewSize) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'corpusId' is set
        if (corpusId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corpusId' when calling previewWeb");
        }
        
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'documentId' when calling previewWeb");
        }
        
        // verify the required parameter 'previewSize' is set
        if (previewSize == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'previewSize' when calling previewWeb");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("corpusId", corpusId);
        uriVariables.put("documentId", documentId);
        uriVariables.put("previewSize", previewSize);

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

        ParameterizedTypeReference<DocumentSign> localReturnType = new ParameterizedTypeReference<DocumentSign>() {};
        return apiClient.invokeAPI("/v1/doc/{corpusId}/web/{documentId}/preview/{previewSize}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Upload a document
     * Upload a new document in a corpus
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Document is ready to be uploaded. Resumable upload session is given in the body. Use uploadUrl to start the upload. Please check doc attached to field uploadUrl
     * @param corpusId Id of the corpus where document is pushed. See [Corpus section](https://www.verbatim.cloud/api-docs/index.html#tag/Corpus) to learn more. (required)
     * @param filename the name of your file (max 128 characters) (required)
     * @return DocumentResumable
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentResumable upload(String corpusId, String filename) throws RestClientException {
        return uploadWithHttpInfo(corpusId, filename).getBody();
    }

    /**
     * Upload a document
     * Upload a new document in a corpus
     * <p><b>500</b> - Internal error. Check body to get more info
     * <p><b>429</b> - Too many request. Check your quota on your dashboard
     * <p><b>503</b> - Service temporary not available. Reason is given the body
     * <p><b>403</b> - Not authorized. Access not granted for this request
     * <p><b>404</b> - Document not found
     * <p><b>400</b> - Bad request. Invalid body or missing parameter
     * <p><b>200</b> - Document is ready to be uploaded. Resumable upload session is given in the body. Use uploadUrl to start the upload. Please check doc attached to field uploadUrl
     * @param corpusId Id of the corpus where document is pushed. See [Corpus section](https://www.verbatim.cloud/api-docs/index.html#tag/Corpus) to learn more. (required)
     * @param filename the name of your file (max 128 characters) (required)
     * @return ResponseEntity&lt;DocumentResumable&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentResumable> uploadWithHttpInfo(String corpusId, String filename) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'corpusId' is set
        if (corpusId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corpusId' when calling upload");
        }
        
        // verify the required parameter 'filename' is set
        if (filename == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filename' when calling upload");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("corpusId", corpusId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filename", filename));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "JWT" };

        ParameterizedTypeReference<DocumentResumable> localReturnType = new ParameterizedTypeReference<DocumentResumable>() {};
        return apiClient.invokeAPI("/v1/doc/{corpusId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
