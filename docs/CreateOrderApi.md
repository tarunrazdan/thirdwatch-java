# CreateOrderApi

All URIs are relative to *https://localhost/event*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrder**](CreateOrderApi.md#createOrder) | **POST** /v1/createOrder | Submit a new or existing order to Thirdwatch for review. This API should contain order item info, the payment info, and user identity info.


<a name="createOrder"></a>
# **createOrder**
> EventResponse createOrder(body)

Submit a new or existing order to Thirdwatch for review. This API should contain order item info, the payment info, and user identity info.

### Example
```java
// Import classes:
//import ai.thirdwatch.ApiClient;
//import ai.thirdwatch.ApiException;
//import ai.thirdwatch.Configuration;
//import ai.thirdwatch.auth.*;
//import ai.thirdwatch.api.CreateOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CreateOrderApi apiInstance = new CreateOrderApi();
CreateOrder body = new CreateOrder(); // CreateOrder | An order to submit for review. Only `_userID` is required field. But this should contain order info.
try {
    EventResponse result = apiInstance.createOrder(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateOrderApi#createOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateOrder**](CreateOrder.md)| An order to submit for review. Only &#x60;_userID&#x60; is required field. But this should contain order info. |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

