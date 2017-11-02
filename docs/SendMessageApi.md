# SendMessageApi

All URIs are relative to *https://localhost/event*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendMessage**](SendMessageApi.md#sendMessage) | **POST** /v1/send_message | Use send_message to record when a user sends a message to other i.e. seller, support.


<a name="sendMessage"></a>
# **sendMessage**
> EventResponse sendMessage(JSON)

Use send_message to record when a user sends a message to other i.e. seller, support.

### Example
```java
// Import classes:
//import ai.thirdwatch.ApiClient;
//import ai.thirdwatch.ApiException;
//import ai.thirdwatch.Configuration;
//import ai.thirdwatch.auth.*;
//import ai.thirdwatch.api.SendMessageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SendMessageApi apiInstance = new SendMessageApi();
SendMessage JSON = new SendMessage(); // SendMessage | Pass message to thirdwatch. Only `_userID` is required field. But this should contain message info.
try {
    EventResponse result = apiInstance.sendMessage(JSON);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SendMessageApi#sendMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **JSON** | [**SendMessage**](SendMessage.md)| Pass message to thirdwatch. Only &#x60;_userID&#x60; is required field. But this should contain message info. |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

