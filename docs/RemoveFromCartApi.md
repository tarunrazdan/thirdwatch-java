# RemoveFromCartApi

All URIs are relative to *https://localhost/event*

Method | HTTP request | Description
------------- | ------------- | -------------
[**removeFromCart**](RemoveFromCartApi.md#removeFromCart) | **POST** /v1/remove_from_cart | Use remove_from_cart when a user removes an item from their shopping cart or list.


<a name="removeFromCart"></a>
# **removeFromCart**
> EventResponse removeFromCart(JSON)

Use remove_from_cart when a user removes an item from their shopping cart or list.

### Example
```java
// Import classes:
//import ai.thirdwatch.ApiClient;
//import ai.thirdwatch.ApiException;
//import ai.thirdwatch.Configuration;
//import ai.thirdwatch.auth.*;
//import ai.thirdwatch.api.RemoveFromCartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RemoveFromCartApi apiInstance = new RemoveFromCartApi();
RemoveFromCart JSON = new RemoveFromCart(); // RemoveFromCart | Pass removed item info to thirdwatch. Only `_userID` is required field. But this should contain item info.
try {
    EventResponse result = apiInstance.removeFromCart(JSON);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoveFromCartApi#removeFromCart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **JSON** | [**RemoveFromCart**](RemoveFromCart.md)| Pass removed item info to thirdwatch. Only &#x60;_userID&#x60; is required field. But this should contain item info. |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

