# AddPromotionApi

All URIs are relative to *https://localhost/event*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPromotion**](AddPromotionApi.md#addPromotion) | **POST** /v1/add_promotion | Use add_promotion to record when a user adds one or more promotions to their account.


<a name="addPromotion"></a>
# **addPromotion**
> EventResponse addPromotion(JSON)

Use add_promotion to record when a user adds one or more promotions to their account.

### Example
```java
// Import classes:
//import ai.thirdwatch.ApiClient;
//import ai.thirdwatch.ApiException;
//import ai.thirdwatch.Configuration;
//import ai.thirdwatch.auth.*;
//import ai.thirdwatch.api.AddPromotionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AddPromotionApi apiInstance = new AddPromotionApi();
AddPromotion JSON = new AddPromotion(); // AddPromotion | Pass added promotion info to thirdwatch. Only `_userID` is required field. But this should contain promotion info.
try {
    EventResponse result = apiInstance.addPromotion(JSON);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddPromotionApi#addPromotion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **JSON** | [**AddPromotion**](AddPromotion.md)| Pass added promotion info to thirdwatch. Only &#x60;_userID&#x60; is required field. But this should contain promotion info. |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

