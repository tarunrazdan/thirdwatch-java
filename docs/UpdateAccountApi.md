# UpdateAccountApi

All URIs are relative to *https://localhost/event*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateAccount**](UpdateAccountApi.md#updateAccount) | **POST** /v1/update_account | Use update_account to record changes to the user&#39;s account information.


<a name="updateAccount"></a>
# **updateAccount**
> EventResponse updateAccount(JSON)

Use update_account to record changes to the user&#39;s account information.

For user accounts created before integration with Thirdwatch, there&#39;s no need to call &#x60;create_account&#x60; before &#x60;update_account&#x60;. Simply call &#x60;update_account&#x60; and we&#39;ll infer that account was created before integration. 

### Example
```java
// Import classes:
//import ai.thirdwatch.ApiClient;
//import ai.thirdwatch.ApiException;
//import ai.thirdwatch.Configuration;
//import ai.thirdwatch.auth.*;
//import ai.thirdwatch.api.UpdateAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UpdateAccountApi apiInstance = new UpdateAccountApi();
UpdateAccount JSON = new UpdateAccount(); // UpdateAccount | Pass user details after update or change in user info. Only `_userID` is required field. But this should contain user info.
try {
    EventResponse result = apiInstance.updateAccount(JSON);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateAccountApi#updateAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **JSON** | [**UpdateAccount**](UpdateAccount.md)| Pass user details after update or change in user info. Only &#x60;_userID&#x60; is required field. But this should contain user info. |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

