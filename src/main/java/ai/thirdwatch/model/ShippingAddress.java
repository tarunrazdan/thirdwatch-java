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
 * The Address field type represents a physical address. The value must be a nested object with the appropriate address subfields. We extract many geolocation features from these values. An address is represented as a nested JSON object. 
 */
@ApiModel(description = "The Address field type represents a physical address. The value must be a nested object with the appropriate address subfields. We extract many geolocation features from these values. An address is represented as a nested JSON object. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-02T14:14:25.959+05:30")
public class ShippingAddress {
  @SerializedName("_name")
  private String name = null;

  @SerializedName("_phone")
  private String phone = null;

  @SerializedName("_address1")
  private String address1 = null;

  @SerializedName("_address2")
  private String address2 = null;

  @SerializedName("_city")
  private String city = null;

  @SerializedName("_region")
  private String region = null;

  @SerializedName("_country")
  private String country = null;

  @SerializedName("_zipcode")
  private String zipcode = null;

  @SerializedName("_isOfficeAddress")
  private Boolean isOfficeAddress = null;

  @SerializedName("_isHomeAddress")
  private Boolean isHomeAddress = null;

  public ShippingAddress name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Provide the full name associated with the address here. Concatenate first name and last name together if you collect them separately in your system.
   * @return name
  **/
  @ApiModelProperty(value = "Provide the full name associated with the address here. Concatenate first name and last name together if you collect them separately in your system.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ShippingAddress phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * The phone number associated with this address. Provide the phone number as a string starting with the country code. Use E.164 format or send in the standard national format of number&#39;s origin.
   * @return phone
  **/
  @ApiModelProperty(value = "The phone number associated with this address. Provide the phone number as a string starting with the country code. Use E.164 format or send in the standard national format of number's origin.")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public ShippingAddress address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Address first line, e.g., \&quot;C802 Nirvana Courtyard\&quot;.
   * @return address1
  **/
  @ApiModelProperty(value = "Address first line, e.g., \"C802 Nirvana Courtyard\".")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public ShippingAddress address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Address second line, e.g., \&quot;Nirvana Country, Sector 50\&quot;.
   * @return address2
  **/
  @ApiModelProperty(value = "Address second line, e.g., \"Nirvana Country, Sector 50\".")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public ShippingAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city or town name, e.g., \&quot;Gurgaon\&quot; .
   * @return city
  **/
  @ApiModelProperty(value = "The city or town name, e.g., \"Gurgaon\" .")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ShippingAddress region(String region) {
    this.region = region;
    return this;
  }

   /**
   * The region portion of the address. In the India, this corresponds to the state.
   * @return region
  **/
  @ApiModelProperty(value = "The region portion of the address. In the India, this corresponds to the state.")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public ShippingAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The [ISO-3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code for the billing address, e.g., \&quot;IN\&quot; in case of India.
   * @return country
  **/
  @ApiModelProperty(value = "The [ISO-3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code for the billing address, e.g., \"IN\" in case of India.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ShippingAddress zipcode(String zipcode) {
    this.zipcode = zipcode;
    return this;
  }

   /**
   * The postal code associated with the address, e.g., \&quot;122002\&quot;.
   * @return zipcode
  **/
  @ApiModelProperty(value = "The postal code associated with the address, e.g., \"122002\".")
  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public ShippingAddress isOfficeAddress(Boolean isOfficeAddress) {
    this.isOfficeAddress = isOfficeAddress;
    return this;
  }

   /**
   * Is user chosen this address as office address.
   * @return isOfficeAddress
  **/
  @ApiModelProperty(value = "Is user chosen this address as office address.")
  public Boolean getIsOfficeAddress() {
    return isOfficeAddress;
  }

  public void setIsOfficeAddress(Boolean isOfficeAddress) {
    this.isOfficeAddress = isOfficeAddress;
  }

  public ShippingAddress isHomeAddress(Boolean isHomeAddress) {
    this.isHomeAddress = isHomeAddress;
    return this;
  }

   /**
   * Is user chosen this address as home address.
   * @return isHomeAddress
  **/
  @ApiModelProperty(value = "Is user chosen this address as home address.")
  public Boolean getIsHomeAddress() {
    return isHomeAddress;
  }

  public void setIsHomeAddress(Boolean isHomeAddress) {
    this.isHomeAddress = isHomeAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingAddress shippingAddress = (ShippingAddress) o;
    return Objects.equals(this.name, shippingAddress.name) &&
        Objects.equals(this.phone, shippingAddress.phone) &&
        Objects.equals(this.address1, shippingAddress.address1) &&
        Objects.equals(this.address2, shippingAddress.address2) &&
        Objects.equals(this.city, shippingAddress.city) &&
        Objects.equals(this.region, shippingAddress.region) &&
        Objects.equals(this.country, shippingAddress.country) &&
        Objects.equals(this.zipcode, shippingAddress.zipcode) &&
        Objects.equals(this.isOfficeAddress, shippingAddress.isOfficeAddress) &&
        Objects.equals(this.isHomeAddress, shippingAddress.isHomeAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phone, address1, address2, city, region, country, zipcode, isOfficeAddress, isHomeAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingAddress {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    isOfficeAddress: ").append(toIndentedString(isOfficeAddress)).append("\n");
    sb.append("    isHomeAddress: ").append(toIndentedString(isHomeAddress)).append("\n");
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
