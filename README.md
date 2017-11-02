# thirdwatch_api

ThirdwatchApi - Java client for thirdwatch_api

The first version of the Thirdwatch API is an exciting step forward towards making it easier for developers to pass data to Thirdwatch.  

# Introduction 

Once you've [registered your website/app](https://www.thirdwatch.ai/) it's easy to start sending data to Thirdwatch.  All endpoints are only accessible via https and are located at `api.thirdwatch.ai`. 
For instance: you can send event at the moment by ```HTTPS POST``` request to the following URL with your API key in ```Header``` and ```JSON``` data in request body. 

```   http://api.thirdwatch.co/event/v1 ``` 

Every API request must contain ```API Key``` in header value ```X-THIRDWATCH-API-KEY```. Every event must contain your ```_userId``` (if this is not available, you can alternatively provide a ```_sessionId``` value also in ```_userId```). 

- API version: 0.0.1

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>ai.thirdwatch</groupId>
    <artifactId>thirdwatch_api</artifactId>
    <version>0.0.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "ai.thirdwatch:thirdwatch_api:0.0.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/thirdwatch_api-0.0.1.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import ai.thirdwatch.*;
import ai.thirdwatch.auth.*;
import ai.thirdwatch.model.*;
import ai.thirdwatch.api.AddPromotionApi;

import java.io.File;
import java.util.*;

public class AddPromotionApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://api.thirdwatch.co/event*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AddPromotionApi* | [**addPromotion**](docs/AddPromotionApi.md#addPromotion) | **POST** /v1/add_promotion | Use add_promotion to record when a user adds one or more promotions to their account.
*AddToCartApi* | [**addToCart**](docs/AddToCartApi.md#addToCart) | **POST** /v1/add_to_cart | Use add_to_cart when a user adds an item to their shopping cart or list.
*ChargebackApi* | [**chargeback**](docs/ChargebackApi.md#chargeback) | **POST** /v1/chargeback | Use chargeback to capture a chargeback reported on a transaction. This event can be called multiple times to record changes to the chargeback state.
*CreateAccountApi* | [**createAccount**](docs/CreateAccountApi.md#createAccount) | **POST** /v1/create_account | Use create_account to pass user details at user registration.
*CreateOrderApi* | [**createOrder**](docs/CreateOrderApi.md#createOrder) | **POST** /v1/createOrder | Submit a new or existing order to Thirdwatch for review. This API should contain order item info, the payment info, and user identity info.
*CustomEventApi* | [**customEvent**](docs/CustomEventApi.md#customEvent) | **POST** /v1/custom_event | Use order_status to track the order processing workflow of a previously submitted order.
*ItemStatusApi* | [**itemStatus**](docs/ItemStatusApi.md#itemStatus) | **POST** /v1/item_status | Use item_status to update the status of item that you’ve already pass to Thirdwatch.
*LinkSessionToUserApi* | [**linkSessionToUser**](docs/LinkSessionToUserApi.md#linkSessionToUser) | **POST** /v1/link_session_to_user | Use link_session_to_user to associate specific session to a user. Generally used only in anonymous checkout workflows.
*LoginApi* | [**login**](docs/LoginApi.md#login) | **POST** /v1/login | Use login to record when a user attempts to log in.
*LogoutApi* | [**logout**](docs/LogoutApi.md#logout) | **POST** /v1/logout | Use logout to record when a user logs out.
*OrderStatusApi* | [**orderStatus**](docs/OrderStatusApi.md#orderStatus) | **POST** /v1/order_status | Use order_status to track the order processing workflow of a previously submitted order.
*RemoveFromCartApi* | [**removeFromCart**](docs/RemoveFromCartApi.md#removeFromCart) | **POST** /v1/remove_from_cart | Use remove_from_cart when a user removes an item from their shopping cart or list.
*ReportItemApi* | [**reportItem**](docs/ReportItemApi.md#reportItem) | **POST** /v1/report_item | Use report_item to let us know when another user reports that this item may violate your company’s policies.
*SendMessageApi* | [**sendMessage**](docs/SendMessageApi.md#sendMessage) | **POST** /v1/send_message | Use send_message to record when a user sends a message to other i.e. seller, support.
*SubmitReviewApi* | [**submitReview**](docs/SubmitReviewApi.md#submitReview) | **POST** /v1/submit_review | Use submit_review when a user-submitted review of a product or seller.
*TagAPIApi* | [**tagUser**](docs/TagAPIApi.md#tagUser) | **POST** /v1/tag | The Tag API enables you to tell Thirdwatch which of your users are bad and which are good.
*TransactionApi* | [**transaction**](docs/TransactionApi.md#transaction) | **POST** /v1/transaction | Use transaction to record attempts results to Pay, Transfer money, Refund or other transactions.
*UntagAPIApi* | [**unTagUser**](docs/UntagAPIApi.md#unTagUser) | **POST** /v1/untag | If you are unsure whether a user is bad or good, you can always remove tag and leave the user in a neutral state.
*UpdateAccountApi* | [**updateAccount**](docs/UpdateAccountApi.md#updateAccount) | **POST** /v1/update_account | Use update_account to record changes to the user&#39;s account information.
*UpdateOrderApi* | [**updateOrder**](docs/UpdateOrderApi.md#updateOrder) | **POST** /v1/update_order | Update details of an existing order.


## Documentation for Models

 - [AddPromotion](docs/AddPromotion.md)
 - [AddToCart](docs/AddToCart.md)
 - [BillingAddress](docs/BillingAddress.md)
 - [Chargeback](docs/Chargeback.md)
 - [CreateAccount](docs/CreateAccount.md)
 - [CreateOrder](docs/CreateOrder.md)
 - [Custom](docs/Custom.md)
 - [CustomInfo](docs/CustomInfo.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [EventResponse](docs/EventResponse.md)
 - [Item](docs/Item.md)
 - [ItemStatus](docs/ItemStatus.md)
 - [LinkSessionToUser](docs/LinkSessionToUser.md)
 - [Login](docs/Login.md)
 - [Logout](docs/Logout.md)
 - [OrderStatus](docs/OrderStatus.md)
 - [PaymentMethod](docs/PaymentMethod.md)
 - [Promotion](docs/Promotion.md)
 - [RemoveFromCart](docs/RemoveFromCart.md)
 - [ReportItem](docs/ReportItem.md)
 - [Seller](docs/Seller.md)
 - [SendMessage](docs/SendMessage.md)
 - [ShippingAddress](docs/ShippingAddress.md)
 - [SubmitReview](docs/SubmitReview.md)
 - [Tag](docs/Tag.md)
 - [Transaction](docs/Transaction.md)
 - [UnTag](docs/UnTag.md)
 - [UpdateAccount](docs/UpdateAccount.md)
 - [UpdateOrder](docs/UpdateOrder.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: X-THIRDWATCH-API-KEY
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



