# ChargebackApi

All URIs are relative to *https://localhost/event*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chargeback**](ChargebackApi.md#chargeback) | **POST** /v1/chargeback | Use chargeback to capture a chargeback reported on a transaction. This event can be called multiple times to record changes to the chargeback state.


<a name="chargeback"></a>
# **chargeback**
> EventResponse chargeback(JSON)

Use chargeback to capture a chargeback reported on a transaction. This event can be called multiple times to record changes to the chargeback state.

Note - When you send a chargeback event you also need to send a label event if you want to prevent the user from making another purchase. 

### Example
```java
// Import classes:
//import ai.thirdwatch.ApiClient;
//import ai.thirdwatch.ApiException;
//import ai.thirdwatch.Configuration;
//import ai.thirdwatch.auth.*;
//import ai.thirdwatch.api.ChargebackApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChargebackApi apiInstance = new ChargebackApi();
Chargeback JSON = new Chargeback(); // Chargeback | Pass chargeback to thirdwatch. Only `_userID` is required field. But this should contain chargeback info.
try {
    EventResponse result = apiInstance.chargeback(JSON);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargebackApi#chargeback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **JSON** | [**Chargeback**](Chargeback.md)| Pass chargeback to thirdwatch. Only &#x60;_userID&#x60; is required field. But this should contain chargeback info. |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

