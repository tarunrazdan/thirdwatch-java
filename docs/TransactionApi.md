# TransactionApi

All URIs are relative to *https://localhost/event*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transaction**](TransactionApi.md#transaction) | **POST** /v1/transaction | Use transaction to record attempts results to Pay, Transfer money, Refund or other transactions.


<a name="transaction"></a>
# **transaction**
> EventResponse transaction(JSON)

Use transaction to record attempts results to Pay, Transfer money, Refund or other transactions.

### Example
```java
// Import classes:
//import ai.thirdwatch.ApiClient;
//import ai.thirdwatch.ApiException;
//import ai.thirdwatch.Configuration;
//import ai.thirdwatch.auth.*;
//import ai.thirdwatch.api.TransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TransactionApi apiInstance = new TransactionApi();
Transaction JSON = new Transaction(); // Transaction | Pass transaction results to thirdwatch. Only `_userID` is required field. But this should contain transaction info.
try {
    EventResponse result = apiInstance.transaction(JSON);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionApi#transaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **JSON** | [**Transaction**](Transaction.md)| Pass transaction results to thirdwatch. Only &#x60;_userID&#x60; is required field. But this should contain transaction info. |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

