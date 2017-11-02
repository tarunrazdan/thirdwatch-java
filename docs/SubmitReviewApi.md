# SubmitReviewApi

All URIs are relative to *https://localhost/event*

Method | HTTP request | Description
------------- | ------------- | -------------
[**submitReview**](SubmitReviewApi.md#submitReview) | **POST** /v1/submit_review | Use submit_review when a user-submitted review of a product or seller.


<a name="submitReview"></a>
# **submitReview**
> EventResponse submitReview(JSON)

Use submit_review when a user-submitted review of a product or seller.

### Example
```java
// Import classes:
//import ai.thirdwatch.ApiClient;
//import ai.thirdwatch.ApiException;
//import ai.thirdwatch.Configuration;
//import ai.thirdwatch.auth.*;
//import ai.thirdwatch.api.SubmitReviewApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubmitReviewApi apiInstance = new SubmitReviewApi();
SubmitReview JSON = new SubmitReview(); // SubmitReview | Pass review to thirdwatch. Only `_userID` is required field. But this should contain review info.
try {
    EventResponse result = apiInstance.submitReview(JSON);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmitReviewApi#submitReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **JSON** | [**SubmitReview**](SubmitReview.md)| Pass review to thirdwatch. Only &#x60;_userID&#x60; is required field. But this should contain review info. |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

