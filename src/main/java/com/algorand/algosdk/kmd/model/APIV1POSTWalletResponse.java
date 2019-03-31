/*
 * for KMD HTTP API
 * API for KMD (Key Management Daemon)
 *
 * OpenAPI spec version: 0.0.1
 * Contact: contact@algorand.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.algorand.algosdk.kmd.model;

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.ObjectUtils;

/**
 * APIV1POSTWalletResponse is the response to &#x60;POST /v1/wallet&#x60; friendly:CreateWalletResponse
 */
public class APIV1POSTWalletResponse {

  @SerializedName("error")
  private Boolean error = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("wallet")
  private APIV1Wallet wallet = null;
  public APIV1POSTWalletResponse error(Boolean error) {
    this.error = error;
    return this;
  }

  

  /**
  * Get error
  * @return error
  **/
  public Boolean isError() {
    return error;
  }
  public void setError(Boolean error) {
    this.error = error;
  }
  public APIV1POSTWalletResponse message(String message) {
    this.message = message;
    return this;
  }

  

  /**
  * Get message
  * @return message
  **/
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  public APIV1POSTWalletResponse wallet(APIV1Wallet wallet) {
    this.wallet = wallet;
    return this;
  }

  

  /**
  * Get wallet
  * @return wallet
  **/
  public APIV1Wallet getWallet() {
    return wallet;
  }
  public void setWallet(APIV1Wallet wallet) {
    this.wallet = wallet;
  }
  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    APIV1POSTWalletResponse apIV1POSTWalletResponse = (APIV1POSTWalletResponse) o;
    return ObjectUtils.equals(this.error, apIV1POSTWalletResponse.error) &&
    ObjectUtils.equals(this.message, apIV1POSTWalletResponse.message) &&
    ObjectUtils.equals(this.wallet, apIV1POSTWalletResponse.wallet);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(error, message, wallet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIV1POSTWalletResponse {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
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