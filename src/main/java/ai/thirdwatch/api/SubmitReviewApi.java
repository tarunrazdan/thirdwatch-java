/*
 * Thirdwatch API
 * The first version of the Thirdwatch API is an exciting step forward towards making it easier for developers to pass data to Thirdwatch.  Once you've [registered your website/app](https://thirdwatch.ai) it's easy to start sending data to Thirdwatch.  All endpoints are only accessible via https and are located at `api.thirdwatch.ai`. For instance: you can send event at the moment by ```HTTP POST``` Request to the following URL with your API key in ```Header``` and ```JSON``` data in request body. ```   https://api.thirdwatch.ai/event/v1 ``` Every API request must contain ```API Key``` in header value ```X-THIRDWATCH-API-KEY```  Every event must contain your ```_userId``` (if this is not available, you can alternatively provide a ```_sessionId``` value also in ```_userId```).  JavaScript Fingerprinting module for capturing unique devices and tracking user interaction.  This script will identify unique devices with respect to the browser. For e.g., if chrome is opened in normal mode a unique device id is generated and this will be same if chrome is opened in incognito mode or reinstalled.  Paste the below script onto your webpage, just after the opening `<body>` tag. This script should be added to the page which is accessed externally by the user of your website. For e.g., If you want to track three different webpages then paste the below script onto each webpage, just after the opening `<body>` tag. This script should not be added onto internal tools or admin panels. ```   &lt;script id=\"thirdwatch\"     data-session-cookie-name=\"&lt;cookie_name&gt;\"     data-session-id-value=\"&lt;session_id&gt;\"     data-user-id=\"&lt;user_id&gt;\"     data-app-secret=\"&lt;app_secret&gt;\"     data-is-track-pageview=\"true\"&gt; (function() {         var loadDeviceJs = function() {         var element = document.createElement(\"script\");         element.async = 1;         element.src = \"https://cdn.thirdwatch.ai/tw.min.js\";         document.body.appendChild(element);         };         if (window.addEventListener) {              window.addEventListener(\"load\", loadDeviceJs, false);         } else if (window.attachEvent) {         window.attachEvent(\"onload\", loadDeviceJs);         }     })();   &lt;/script&gt; ``` * `data-session-cookie-name` -- The cookie name where you are saving the unique session id. We will pick the session id by reading its value from the cookie name. (Optional) * `data-session-id-value` -- In case you are not passing `data-session-cookie-name` than you can put session id directly in this parameter. In absence of both `data-session-cookie-name` and `data-session-id-value`, our system will generate a session Id. (Optional) * `data-user-id` -- Unique user id at your end. This can be email id or primary key in the database. In case of guest user, you can insert session Id here. * `data-app-secret` -- Unique App secret generated for you by Thirdwatch. * `data-is-track-pageview` -- If this is set to true, then the url on which this script is running will be sent to Thirdwatch, else the url will not be captured.   The Score API is use to get an up to date cutomer trust score after you have sent transaction event and order successful. This API will provide the riskiness score of the order with reasons. Some examples of when you may want to check the score are before:    - Before Shippement of a package   - Finalizing a money transfer   - Giving access to a prearranged vacation rental   - Sending voucher on mail  ```   https://api.thirdwatch.ai/neo/v1/score?api_key=<your api key>&order_id=<Order id> ```  According to Score you can decide to take action Approve or Reject. Orders with score more than 70 will consider as Riskey orders. We'll provide some reasons also in rules section.   ``` {   \"order_id\": \"OCT45671\",   \"user_id\": \"ajay_245\",   \"order_timestamp\": \"2017-05-09T09:40:45.717Z\",   \"score\": 82,   \"flag\": \"red\",     -\"reasons\": [     {         \"name\": \"_numOfFailedTransactions\",         \"display_name\": \"Number of failed transactions\",         \"flag\": \"green\",         \"value\": \"0\",         \"is_display\": true       },       {         \"name\": \"_accountAge\",         \"display_name\": \"Account age\",         \"flag\": \"red\",         \"value\": \"0\",         \"is_display\": true       },       {         \"name\": \"_numOfOrderSameIp\",         \"display_name\": \"Number of orders from same IP\",         \"flag\": \"red\",         \"value\": \"11\",         \"is_display\": true       }     ] } ``` 
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ai.thirdwatch.api;

import ai.thirdwatch.ApiCallback;
import ai.thirdwatch.ApiClient;
import ai.thirdwatch.ApiException;
import ai.thirdwatch.ApiResponse;
import ai.thirdwatch.Configuration;
import ai.thirdwatch.Pair;
import ai.thirdwatch.ProgressRequestBody;
import ai.thirdwatch.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import ai.thirdwatch.model.ErrorResponse;
import ai.thirdwatch.model.EventResponse;
import ai.thirdwatch.model.SubmitReview;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubmitReviewApi {
    private ApiClient apiClient;

    public SubmitReviewApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SubmitReviewApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for submitReview
     * @param JSON Pass review to thirdwatch. Only &#x60;_userID&#x60; is required field. But this should contain review info. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call submitReviewCall(SubmitReview JSON, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = JSON;
        
        // create path and map variables
        String localVarPath = "/v1/submit_review";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call submitReviewValidateBeforeCall(SubmitReview JSON, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'JSON' is set
        if (JSON == null) {
            throw new ApiException("Missing the required parameter 'JSON' when calling submitReview(Async)");
        }
        
        
        com.squareup.okhttp.Call call = submitReviewCall(JSON, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Use submit_review when a user-submitted review of a product or seller.
     * 
     * @param JSON Pass review to thirdwatch. Only &#x60;_userID&#x60; is required field. But this should contain review info. (required)
     * @return EventResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EventResponse submitReview(SubmitReview JSON) throws ApiException {
        ApiResponse<EventResponse> resp = submitReviewWithHttpInfo(JSON);
        return resp.getData();
    }

    /**
     * Use submit_review when a user-submitted review of a product or seller.
     * 
     * @param JSON Pass review to thirdwatch. Only &#x60;_userID&#x60; is required field. But this should contain review info. (required)
     * @return ApiResponse&lt;EventResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EventResponse> submitReviewWithHttpInfo(SubmitReview JSON) throws ApiException {
        com.squareup.okhttp.Call call = submitReviewValidateBeforeCall(JSON, null, null);
        Type localVarReturnType = new TypeToken<EventResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Use submit_review when a user-submitted review of a product or seller. (asynchronously)
     * 
     * @param JSON Pass review to thirdwatch. Only &#x60;_userID&#x60; is required field. But this should contain review info. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call submitReviewAsync(SubmitReview JSON, final ApiCallback<EventResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = submitReviewValidateBeforeCall(JSON, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EventResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
