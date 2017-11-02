# CreateAccountApi

All URIs are relative to *https://localhost/event*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccount**](CreateAccountApi.md#createAccount) | **POST** /v1/create_account | Use create_account to pass user details at user registration.


<a name="createAccount"></a>
# **createAccount**
> EventResponse createAccount(JSON)

Use create_account to pass user details at user registration.

### Example
```java
// Import classes:
//import ai.thirdwatch.ApiClient;
//import ai.thirdwatch.ApiException;
//import ai.thirdwatch.Configuration;
//import ai.thirdwatch.auth.*;
//import ai.thirdwatch.api.CreateAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CreateAccountApi apiInstance = new CreateAccountApi();
CreateAccount JSON = new CreateAccount(); // CreateAccount | Pass user details after registration. Only `_userID` is required field. But this should contain user info.
try {
    EventResponse result = apiInstance.createAccount(JSON);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateAccountApi#createAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **JSON** | [**CreateAccount**](CreateAccount.md)| Pass user details after registration. Only &#x60;_userID&#x60; is required field. But this should contain user info. |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

