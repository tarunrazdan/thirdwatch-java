# UpdateOrderApi

All URIs are relative to *https://localhost/event*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateOrder**](UpdateOrderApi.md#updateOrder) | **POST** /v1/update_order | Update details of an existing order.


<a name="updateOrder"></a>
# **updateOrder**
> EventResponse updateOrder(JSON)

Update details of an existing order.

* This event contains the same fields as &#x60;&#x60;&#x60;create_order&#x60;&#x60;&#x60;. * The existing order will be completely replaced by the values sent in &#x60;update_order&#x60;. Be sure to specify all values for the order, not just those that changed. * If no matching &#x60;_orderId&#x60; found, a new order will be created. 

### Example
```java
// Import classes:
//import ai.thirdwatch.ApiClient;
//import ai.thirdwatch.ApiException;
//import ai.thirdwatch.Configuration;
//import ai.thirdwatch.auth.*;
//import ai.thirdwatch.api.UpdateOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UpdateOrderApi apiInstance = new UpdateOrderApi();
UpdateOrder JSON = new UpdateOrder(); // UpdateOrder | Update details of an existing order. Only `_userID` is required field. But this should contain existing order info.
try {
    EventResponse result = apiInstance.updateOrder(JSON);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateOrderApi#updateOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **JSON** | [**UpdateOrder**](UpdateOrder.md)| Update details of an existing order. Only &#x60;_userID&#x60; is required field. But this should contain existing order info. |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

