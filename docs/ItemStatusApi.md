# ItemStatusApi

All URIs are relative to *https://localhost/event*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemStatus**](ItemStatusApi.md#itemStatus) | **POST** /v1/item_status | Use item_status to update the status of item that you’ve already pass to Thirdwatch.


<a name="itemStatus"></a>
# **itemStatus**
> EventResponse itemStatus(JSON)

Use item_status to update the status of item that you’ve already pass to Thirdwatch.

If the status is the only thing that’s changing about the item, use this as a convenient way to send status of the item after order processing. 

### Example
```java
// Import classes:
//import ai.thirdwatch.ApiClient;
//import ai.thirdwatch.ApiException;
//import ai.thirdwatch.Configuration;
//import ai.thirdwatch.auth.*;
//import ai.thirdwatch.api.ItemStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemStatusApi apiInstance = new ItemStatusApi();
ItemStatus JSON = new ItemStatus(); // ItemStatus | Pass change item status to thirdwatch. Only `_userID` is required field. But this should contain item status.
try {
    EventResponse result = apiInstance.itemStatus(JSON);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemStatusApi#itemStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **JSON** | [**ItemStatus**](ItemStatus.md)| Pass change item status to thirdwatch. Only &#x60;_userID&#x60; is required field. But this should contain item status. |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

