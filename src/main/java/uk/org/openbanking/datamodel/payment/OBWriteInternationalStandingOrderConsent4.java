/*
 * Payment Initiation API
 * Swagger for Payment Initiation API Specification
 *
 * OpenAPI spec version: v3.1.2-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OBWriteInternationalStandingOrderConsent4
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T16:03:12.161+01:00")
public class OBWriteInternationalStandingOrderConsent4 {
    @JsonProperty("Data")
    private OBWriteInternationalStandingOrderConsent4Data data = null;

    @JsonProperty("Risk")
    private OBRisk1 risk = null;

    public OBWriteInternationalStandingOrderConsent4 data(OBWriteInternationalStandingOrderConsent4Data data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBWriteInternationalStandingOrderConsent4Data getData() {
        return data;
    }

    public void setData(OBWriteInternationalStandingOrderConsent4Data data) {
        this.data = data;
    }

    public OBWriteInternationalStandingOrderConsent4 risk(OBRisk1 risk) {
        this.risk = risk;
        return this;
    }

    /**
     * Get risk
     *
     * @return risk
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBRisk1 getRisk() {
        return risk;
    }

    public void setRisk(OBRisk1 risk) {
        this.risk = risk;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternationalStandingOrderConsent4 obWriteInternationalStandingOrderConsent4 = (OBWriteInternationalStandingOrderConsent4) o;
        return Objects.equals(this.data, obWriteInternationalStandingOrderConsent4.data) &&
                Objects.equals(this.risk, obWriteInternationalStandingOrderConsent4.risk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, risk);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalStandingOrderConsent4 {\n");

        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
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

