# LinkSessionToUserApi

All URIs are relative to *https://localhost/event*

Method | HTTP request | Description
------------- | ------------- | -------------
[**linkSessionToUser**](LinkSessionToUserApi.md#linkSessionToUser) | **POST** /v1/link_session_to_user | Use link_session_to_user to associate specific session to a user. Generally used only in anonymous checkout workflows.


<a name="linkSessionToUser"></a>
# **linkSessionToUser**
> EventResponse linkSessionToUser(JSON)

Use link_session_to_user to associate specific session to a user. Generally used only in anonymous checkout workflows.

### Example
```java
// Import classes:
//import ai.thirdwatch.ApiClient;
//import ai.thirdwatch.ApiException;
//import ai.thirdwatch.Configuration;
//import ai.thirdwatch.auth.*;
//import ai.thirdwatch.api.LinkSessionToUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LinkSessionToUserApi apiInstance = new LinkSessionToUserApi();
LinkSessionToUser JSON = new LinkSessionToUser(); // LinkSessionToUser | Pass session and user to thirdwatch for link. Only `_userID` is required field. But this should contain session and user info.
try {
    EventResponse result = apiInstance.linkSessionToUser(JSON);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinkSessionToUserApi#linkSessionToUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **JSON** | [**LinkSessionToUser**](LinkSessionToUser.md)| Pass session and user to thirdwatch for link. Only &#x60;_userID&#x60; is required field. But this should contain session and user info. |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

