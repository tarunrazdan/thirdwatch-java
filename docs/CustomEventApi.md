# CustomEventApi

All URIs are relative to *https://localhost/event*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customEvent**](CustomEventApi.md#customEvent) | **POST** /v1/custom_event | Use order_status to track the order processing workflow of a previously submitted order.


<a name="customEvent"></a>
# **customEvent**
> EventResponse customEvent(JSON)

Use order_status to track the order processing workflow of a previously submitted order.

Custom events and fields capture user behavior and differences not covered by our reserved events and fields. For example, a location tracking business can create a custom event called trackLocation with custom fields that are relevant. 

### Example
```java
// Import classes:
//import ai.thirdwatch.ApiClient;
//import ai.thirdwatch.ApiException;
//import ai.thirdwatch.Configuration;
//import ai.thirdwatch.auth.*;
//import ai.thirdwatch.api.CustomEventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomEventApi apiInstance = new CustomEventApi();
Custom JSON = new Custom(); // Custom | Pass order status to thirdwatch. Only `_userID` is required field. But this should contain custom info.
try {
    EventResponse result = apiInstance.customEvent(JSON);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomEventApi#customEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **JSON** | [**Custom**](Custom.md)| Pass order status to thirdwatch. Only &#x60;_userID&#x60; is required field. But this should contain custom info. |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

