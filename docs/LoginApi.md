# LoginApi

All URIs are relative to *https://localhost/event*

Method | HTTP request | Description
------------- | ------------- | -------------
[**login**](LoginApi.md#login) | **POST** /v1/login | Use login to record when a user attempts to log in.


<a name="login"></a>
# **login**
> EventResponse login(JSON)

Use login to record when a user attempts to log in.

### Example
```java
// Import classes:
//import ai.thirdwatch.ApiClient;
//import ai.thirdwatch.ApiException;
//import ai.thirdwatch.Configuration;
//import ai.thirdwatch.auth.*;
//import ai.thirdwatch.api.LoginApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoginApi apiInstance = new LoginApi();
Login JSON = new Login(); // Login | Pass login status to thirdwatch. Only `_userID` is required field. But this should contain login info.
try {
    EventResponse result = apiInstance.login(JSON);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **JSON** | [**Login**](Login.md)| Pass login status to thirdwatch. Only &#x60;_userID&#x60; is required field. But this should contain login info. |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

