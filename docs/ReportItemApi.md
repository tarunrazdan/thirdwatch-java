# ReportItemApi

All URIs are relative to *https://localhost/event*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportItem**](ReportItemApi.md#reportItem) | **POST** /v1/report_item | Use report_item to let us know when another user reports that this item may violate your company’s policies.


<a name="reportItem"></a>
# **reportItem**
> EventResponse reportItem(JSON)

Use report_item to let us know when another user reports that this item may violate your company’s policies.

If you have a feature like \&quot;Report Item\&quot; or \&quot;Flag this Item\&quot;, send that event to us using this. 

### Example
```java
// Import classes:
//import ai.thirdwatch.ApiClient;
//import ai.thirdwatch.ApiException;
//import ai.thirdwatch.Configuration;
//import ai.thirdwatch.auth.*;
//import ai.thirdwatch.api.ReportItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReportItemApi apiInstance = new ReportItemApi();
ReportItem JSON = new ReportItem(); // ReportItem | Pass report item info to thirdwatch. Only `_userID` is required field. But this should contain item id.
try {
    EventResponse result = apiInstance.reportItem(JSON);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportItemApi#reportItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **JSON** | [**ReportItem**](ReportItem.md)| Pass report item info to thirdwatch. Only &#x60;_userID&#x60; is required field. But this should contain item id. |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

