/*
 * Thirdwatch API
 * The first version of the Thirdwatch API is an exciting step forward towards making it easier for developers to pass data to Thirdwatch.  Once you've [registered your website/app](https://thirdwatch.ai) it's easy to start sending data to Thirdwatch.  All endpoints are only accessible via https and are located at `api.thirdwatch.ai`. For instance: you can send event at the moment by ```HTTP POST``` Request to the following URL with your API key in ```Header``` and ```JSON``` data in request body. ```   https://api.thirdwatch.ai/event/v1 ``` Every API request must contain ```API Key``` in header value ```X-THIRDWATCH-API-KEY```  Every event must contain your ```_userId``` (if this is not available, you can alternatively provide a ```_sessionId``` value also in ```_userId```).  JavaScript Fingerprinting module for capturing unique devices and tracking user interaction.  This script will identify unique devices with respect to the browser. For e.g., if chrome is opened in normal mode a unique device id is generated and this will be same if chrome is opened in incognito mode or reinstalled.  Paste the below script onto your webpage, just after the opening `<body>` tag. This script should be added to the page which is accessed externally by the user of your website. For e.g., If you want to track three different webpages then paste the below script onto each webpage, just after the opening `<body>` tag. This script should not be added onto internal tools or admin panels. ```   &lt;script id=\"thirdwatch\"     data-session-cookie-name=\"&lt;cookie_name&gt;\"     data-session-id-value=\"&lt;session_id&gt;\"     data-user-id=\"&lt;user_id&gt;\"     data-app-secret=\"&lt;app_secret&gt;\"     data-is-track-pageview=\"true\"&gt; (function() {         var loadDeviceJs = function() {         var element = document.createElement(\"script\");         element.async = 1;         element.src = \"https://cdn.thirdwatch.ai/tw.min.js\";         document.body.appendChild(element);         };         if (window.addEventListener) {              window.addEventListener(\"load\", loadDeviceJs, false);         } else if (window.attachEvent) {         window.attachEvent(\"onload\", loadDeviceJs);         }     })();   &lt;/script&gt; ``` * `data-session-cookie-name` -- The cookie name where you are saving the unique session id. We will pick the session id by reading its value from the cookie name. (Optional) * `data-session-id-value` -- In case you are not passing `data-session-cookie-name` than you can put session id directly in this parameter. In absence of both `data-session-cookie-name` and `data-session-id-value`, our system will generate a session Id. (Optional) * `data-user-id` -- Unique user id at your end. This can be email id or primary key in the database. In case of guest user, you can insert session Id here. * `data-app-secret` -- Unique App secret generated for you by Thirdwatch. * `data-is-track-pageview` -- If this is set to true, then the url on which this script is running will be sent to Thirdwatch, else the url will not be captured.   The Score API is use to get an up to date cutomer trust score after you have sent transaction event and order successful. This API will provide the riskiness score of the order with reasons. Some examples of when you may want to check the score are before:    - Before Shippement of a package   - Finalizing a money transfer   - Giving access to a prearranged vacation rental   - Sending voucher on mail  ```   https://api.thirdwatch.ai/neo/v1/score?api_key=<your api key>&order_id=<Order id> ```  According to Score you can decide to take action Approve or Reject. Orders with score more than 70 will consider as Riskey orders. We'll provide some reasons also in rules section.   ``` {   \"order_id\": \"OCT45671\",   \"user_id\": \"ajay_245\",   \"order_timestamp\": \"2017-05-09T09:40:45.717Z\",   \"score\": 82,   \"flag\": \"red\",     -\"reasons\": [     {         \"name\": \"_numOfFailedTransactions\",         \"display_name\": \"Number of failed transactions\",         \"flag\": \"green\",         \"value\": \"0\",         \"is_display\": true       },       {         \"name\": \"_accountAge\",         \"display_name\": \"Account age\",         \"flag\": \"red\",         \"value\": \"0\",         \"is_display\": true       },       {         \"name\": \"_numOfOrderSameIp\",         \"display_name\": \"Number of orders from same IP\",         \"flag\": \"red\",         \"value\": \"11\",         \"is_display\": true       }     ] } ``` 
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ai.thirdwatch.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The Seller field type represents information about the seller. The value must be a nested object with the appropriate item subfields for the given seller. Generally usedwith the order, item or transaction events. 
 */
@ApiModel(description = "The Seller field type represents information about the seller. The value must be a nested object with the appropriate item subfields for the given seller. Generally usedwith the order, item or transaction events. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-21T16:23:00.366+05:30")
public class Seller {
  @SerializedName("_sellerId")
  private String sellerId = null;

  @SerializedName("_name")
  private String name = null;

  @SerializedName("_email")
  private String email = null;

  @SerializedName("_phone")
  private String phone = null;

  @SerializedName("_createdDate")
  private String createdDate = null;

  @SerializedName("_lastUpdatedDate")
  private String lastUpdatedDate = null;

  @SerializedName("_onboardingIpAddress")
  private String onboardingIpAddress = null;

  public Seller sellerId(String sellerId) {
    this.sellerId = sellerId;
    return this;
  }

   /**
   * The seller’s internal account ID. This field is required on all events required seller info.
   * @return sellerId
  **/
  @ApiModelProperty(value = "The seller’s internal account ID. This field is required on all events required seller info.")
  public String getSellerId() {
    return sellerId;
  }

  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }

  public Seller name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Provide the full name associated with the seller here. Concatenate first name and last name together if you collect them separately in your system.
   * @return name
  **/
  @ApiModelProperty(value = "Provide the full name associated with the seller here. Concatenate first name and last name together if you collect them separately in your system.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Seller email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the seller. Note - If the seller&#39;s email is also their account ID in your system, set both the _sellerId and _email fields to their email address.
   * @return email
  **/
  @ApiModelProperty(value = "Email of the seller. Note - If the seller's email is also their account ID in your system, set both the _sellerId and _email fields to their email address.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Seller phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * The primary phone number of the seller associated with this account. Provide the phone number as a string.
   * @return phone
  **/
  @ApiModelProperty(value = "The primary phone number of the seller associated with this account. Provide the phone number as a string.")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Seller createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Date when seller registered in system.
   * @return createdDate
  **/
  @ApiModelProperty(value = "Date when seller registered in system.")
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public Seller lastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

   /**
   * Date when seller profile uopdated last time.
   * @return lastUpdatedDate
  **/
  @ApiModelProperty(value = "Date when seller profile uopdated last time.")
  public String getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  public void setLastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }

  public Seller onboardingIpAddress(String onboardingIpAddress) {
    this.onboardingIpAddress = onboardingIpAddress;
    return this;
  }

   /**
   * Ip address used by seller while registration.
   * @return onboardingIpAddress
  **/
  @ApiModelProperty(value = "Ip address used by seller while registration.")
  public String getOnboardingIpAddress() {
    return onboardingIpAddress;
  }

  public void setOnboardingIpAddress(String onboardingIpAddress) {
    this.onboardingIpAddress = onboardingIpAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Seller seller = (Seller) o;
    return Objects.equals(this.sellerId, seller.sellerId) &&
        Objects.equals(this.name, seller.name) &&
        Objects.equals(this.email, seller.email) &&
        Objects.equals(this.phone, seller.phone) &&
        Objects.equals(this.createdDate, seller.createdDate) &&
        Objects.equals(this.lastUpdatedDate, seller.lastUpdatedDate) &&
        Objects.equals(this.onboardingIpAddress, seller.onboardingIpAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerId, name, email, phone, createdDate, lastUpdatedDate, onboardingIpAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Seller {\n");
    
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    onboardingIpAddress: ").append(toIndentedString(onboardingIpAddress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

