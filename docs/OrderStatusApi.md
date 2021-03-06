# OrderStatusApi

All URIs are relative to *https://localhost/event*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderStatus**](OrderStatusApi.md#orderStatus) | **POST** /v1/order_status | Use order_status to track the order processing workflow of a previously submitted order.


<a name="orderStatus"></a>
# **orderStatus**
> EventResponse orderStatus(JSON)

Use order_status to track the order processing workflow of a previously submitted order.

For example, order_status can be used to indicate that an order has been held for review, canceled due to suspected fraud, or fulfilled. This event can be called multiple times to record changes an order&#39;s status. 

### Example
```java
// Import classes:
//import ai.thirdwatch.ApiClient;
//import ai.thirdwatch.ApiException;
//import ai.thirdwatch.Configuration;
//import ai.thirdwatch.auth.*;
//import ai.thirdwatch.api.OrderStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderStatusApi apiInstance = new OrderStatusApi();
OrderStatus JSON = new OrderStatus(); // OrderStatus | Pass order status to thirdwatch. Only `_userID` is required field. But this should contain order info.
try {
    EventResponse result = apiInstance.orderStatus(JSON);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderStatusApi#orderStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **JSON** | [**OrderStatus**](OrderStatus.md)| Pass order status to thirdwatch. Only &#x60;_userID&#x60; is required field. But this should contain order info. |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

