/*
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.2-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OBReadStandingOrder4
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T15:59:01.633+01:00")
public class OBReadStandingOrder4 {
  @JsonProperty("Data")
  private OBReadStandingOrder4Data data = null;

  @JsonProperty("Links")
  private Links links = null;

  @JsonProperty("Meta")
  private Meta meta = null;

  public OBReadStandingOrder4 data(OBReadStandingOrder4Data data) {
    this.data = data;
    return this;
  }

    /**
   * Get data
   * @return data
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  public OBReadStandingOrder4Data getData() {
    return data;
  }

  public void setData(OBReadStandingOrder4Data data) {
    this.data = data;
  }

  public OBReadStandingOrder4 links(Links links) {
    this.links = links;
    return this;
  }

    /**
   * Get links
   * @return links
  **/
  @Valid
  @ApiModelProperty(value = "")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public OBReadStandingOrder4 meta(Meta meta) {
    this.meta = meta;
    return this;
  }

    /**
   * Get meta
   * @return meta
  **/
  @Valid
  @ApiModelProperty(value = "")
  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadStandingOrder4 obReadStandingOrder4 = (OBReadStandingOrder4) o;
    return Objects.equals(this.data, obReadStandingOrder4.data) &&
        Objects.equals(this.links, obReadStandingOrder4.links) &&
        Objects.equals(this.meta, obReadStandingOrder4.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadStandingOrder4 {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

