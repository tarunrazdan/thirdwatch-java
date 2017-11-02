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
import ai.thirdwatch.model.CustomInfo;
import ai.thirdwatch.model.Promotion;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AddPromotion
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-02T14:14:25.959+05:30")
public class AddPromotion {
  @SerializedName("_userId")
  private String userId = null;

  @SerializedName("_sessionId")
  private String sessionId = null;

  @SerializedName("_deviceIp")
  private String deviceIp = null;

  @SerializedName("_originTimestamp")
  private String originTimestamp = null;

  @SerializedName("_promotions")
  private List<Promotion> promotions = null;

  @SerializedName("_customInfo")
  private CustomInfo customInfo = null;

  public AddPromotion userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The user&#39;s account ID according to your systems. Note that user IDs are case sensitive.
   * @return userId
  **/
  @ApiModelProperty(value = "The user's account ID according to your systems. Note that user IDs are case sensitive.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public AddPromotion sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * The user&#39;s current session ID, used to tie a user&#39;s action before and after login or account creation. Required if no user_id values is provided.
   * @return sessionId
  **/
  @ApiModelProperty(value = "The user's current session ID, used to tie a user's action before and after login or account creation. Required if no user_id values is provided.")
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public AddPromotion deviceIp(String deviceIp) {
    this.deviceIp = deviceIp;
    return this;
  }

   /**
   * IP address of the request made by the user. Recommended for historical backfills and customers with mobile apps.
   * @return deviceIp
  **/
  @ApiModelProperty(value = "IP address of the request made by the user. Recommended for historical backfills and customers with mobile apps.")
  public String getDeviceIp() {
    return deviceIp;
  }

  public void setDeviceIp(String deviceIp) {
    this.deviceIp = deviceIp;
  }

  public AddPromotion originTimestamp(String originTimestamp) {
    this.originTimestamp = originTimestamp;
    return this;
  }

   /**
   * Represents the time the event occured in your system. Send as a UNIX timestamp in milliseconds in string.
   * @return originTimestamp
  **/
  @ApiModelProperty(value = "Represents the time the event occured in your system. Send as a UNIX timestamp in milliseconds in string.")
  public String getOriginTimestamp() {
    return originTimestamp;
  }

  public void setOriginTimestamp(String originTimestamp) {
    this.originTimestamp = originTimestamp;
  }

  public AddPromotion promotions(List<Promotion> promotions) {
    this.promotions = promotions;
    return this;
  }

  public AddPromotion addPromotionsItem(Promotion promotionsItem) {
    if (this.promotions == null) {
      this.promotions = new ArrayList<Promotion>();
    }
    this.promotions.add(promotionsItem);
    return this;
  }

   /**
   * Contains all promotions that have been newly applied to the referenced user.
   * @return promotions
  **/
  @ApiModelProperty(value = "Contains all promotions that have been newly applied to the referenced user.")
  public List<Promotion> getPromotions() {
    return promotions;
  }

  public void setPromotions(List<Promotion> promotions) {
    this.promotions = promotions;
  }

  public AddPromotion customInfo(CustomInfo customInfo) {
    this.customInfo = customInfo;
    return this;
  }

   /**
   * Get customInfo
   * @return customInfo
  **/
  @ApiModelProperty(value = "")
  public CustomInfo getCustomInfo() {
    return customInfo;
  }

  public void setCustomInfo(CustomInfo customInfo) {
    this.customInfo = customInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddPromotion addPromotion = (AddPromotion) o;
    return Objects.equals(this.userId, addPromotion.userId) &&
        Objects.equals(this.sessionId, addPromotion.sessionId) &&
        Objects.equals(this.deviceIp, addPromotion.deviceIp) &&
        Objects.equals(this.originTimestamp, addPromotion.originTimestamp) &&
        Objects.equals(this.promotions, addPromotion.promotions) &&
        Objects.equals(this.customInfo, addPromotion.customInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, sessionId, deviceIp, originTimestamp, promotions, customInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddPromotion {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    deviceIp: ").append(toIndentedString(deviceIp)).append("\n");
    sb.append("    originTimestamp: ").append(toIndentedString(originTimestamp)).append("\n");
    sb.append("    promotions: ").append(toIndentedString(promotions)).append("\n");
    sb.append("    customInfo: ").append(toIndentedString(customInfo)).append("\n");
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

