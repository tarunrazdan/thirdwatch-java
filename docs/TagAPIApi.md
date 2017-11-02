# TagAPIApi

All URIs are relative to *https://localhost/event*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tagUser**](TagAPIApi.md#tagUser) | **POST** /v1/tag | The Tag API enables you to tell Thirdwatch which of your users are bad and which are good.


<a name="tagUser"></a>
# **tagUser**
> EventResponse tagUser(JSON)

The Tag API enables you to tell Thirdwatch which of your users are bad and which are good.

By telling us who is bad and who is good, we can identify patterns that are unique to your business. Once you give this feedback, the platform instantly analyzes it and learns to identify good and bad behavior of other users more accurately. If you want to change an existing label for a user - for example, from bad to good - all you need to do is send a new label and we&#39;ll overwrite the existing value. 

### Example
```java
// Import classes:
//import ai.thirdwatch.ApiClient;
//import ai.thirdwatch.ApiException;
//import ai.thirdwatch.Configuration;
//import ai.thirdwatch.auth.*;
//import ai.thirdwatch.api.TagAPIApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TagAPIApi apiInstance = new TagAPIApi();
Tag JSON = new Tag(); // Tag | Pass user and it's info to thirdwatch. Only `_userID` is required field. But this should contain tag info.
try {
    EventResponse result = apiInstance.tagUser(JSON);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagAPIApi#tagUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **JSON** | [**Tag**](Tag.md)| Pass user and it&#39;s info to thirdwatch. Only &#x60;_userID&#x60; is required field. But this should contain tag info. |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

