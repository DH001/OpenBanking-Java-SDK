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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBWriteDomesticStandingOrderResponse4Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T16:03:12.161+01:00")
public class OBWriteDomesticStandingOrderResponse4Data {
    @JsonProperty("DomesticStandingOrderId")
    private String domesticStandingOrderId = null;

    @JsonProperty("ConsentId")
    private String consentId = null;

    @JsonProperty("CreationDateTime")
    private OffsetDateTime creationDateTime = null;
    @JsonProperty("Status")
    private StatusEnum status = null;
    @JsonProperty("StatusUpdateDateTime")
    private OffsetDateTime statusUpdateDateTime = null;
    @JsonProperty("Charges")
    private List<OBWriteDomesticConsentResponse3DataCharges> charges = null;
    @JsonProperty("Initiation")
    private OBWriteDomesticStandingOrder3DataInitiation initiation = null;
    @JsonProperty("MultiAuthorisation")
    private OBWriteDomesticResponse3DataMultiAuthorisation multiAuthorisation = null;

    public OBWriteDomesticStandingOrderResponse4Data domesticStandingOrderId(String domesticStandingOrderId) {
        this.domesticStandingOrderId = domesticStandingOrderId;
        return this;
    }

    /**
     * OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic standing order resource.
     *
     * @return domesticStandingOrderId
     **/
    @NotNull
    @Size(min = 1, max = 40)
    @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic standing order resource.")
    public String getDomesticStandingOrderId() {
        return domesticStandingOrderId;
    }

    public void setDomesticStandingOrderId(String domesticStandingOrderId) {
        this.domesticStandingOrderId = domesticStandingOrderId;
    }

    public OBWriteDomesticStandingOrderResponse4Data consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
     *
     * @return consentId
     **/
    @NotNull
    @Size(min = 1, max = 128)
    @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public OBWriteDomesticStandingOrderResponse4Data creationDateTime(OffsetDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return creationDateTime
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public OffsetDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(OffsetDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBWriteDomesticStandingOrderResponse4Data status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Specifies the status of the payment order resource.
     *
     * @return status
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Specifies the status of the payment order resource.")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OBWriteDomesticStandingOrderResponse4Data statusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    /**
     * Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return statusUpdateDateTime
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public OffsetDateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBWriteDomesticStandingOrderResponse4Data charges(List<OBWriteDomesticConsentResponse3DataCharges> charges) {
        this.charges = charges;
        return this;
    }

    public OBWriteDomesticStandingOrderResponse4Data addChargesItem(OBWriteDomesticConsentResponse3DataCharges chargesItem) {
        if (this.charges == null) {
            this.charges = new ArrayList<OBWriteDomesticConsentResponse3DataCharges>();
        }
        this.charges.add(chargesItem);
        return this;
    }

    /**
     * Get charges
     *
     * @return charges
     **/
    @Valid
    @ApiModelProperty(value = "")
    public List<OBWriteDomesticConsentResponse3DataCharges> getCharges() {
        return charges;
    }

    public void setCharges(List<OBWriteDomesticConsentResponse3DataCharges> charges) {
        this.charges = charges;
    }

    public OBWriteDomesticStandingOrderResponse4Data initiation(OBWriteDomesticStandingOrder3DataInitiation initiation) {
        this.initiation = initiation;
        return this;
    }

    /**
     * Get initiation
     *
     * @return initiation
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBWriteDomesticStandingOrder3DataInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBWriteDomesticStandingOrder3DataInitiation initiation) {
        this.initiation = initiation;
    }

    public OBWriteDomesticStandingOrderResponse4Data multiAuthorisation(OBWriteDomesticResponse3DataMultiAuthorisation multiAuthorisation) {
        this.multiAuthorisation = multiAuthorisation;
        return this;
    }

    /**
     * Get multiAuthorisation
     *
     * @return multiAuthorisation
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBWriteDomesticResponse3DataMultiAuthorisation getMultiAuthorisation() {
        return multiAuthorisation;
    }

    public void setMultiAuthorisation(OBWriteDomesticResponse3DataMultiAuthorisation multiAuthorisation) {
        this.multiAuthorisation = multiAuthorisation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDomesticStandingOrderResponse4Data obWriteDomesticStandingOrderResponse4Data = (OBWriteDomesticStandingOrderResponse4Data) o;
        return Objects.equals(this.domesticStandingOrderId, obWriteDomesticStandingOrderResponse4Data.domesticStandingOrderId) &&
                Objects.equals(this.consentId, obWriteDomesticStandingOrderResponse4Data.consentId) &&
                Objects.equals(this.creationDateTime, obWriteDomesticStandingOrderResponse4Data.creationDateTime) &&
                Objects.equals(this.status, obWriteDomesticStandingOrderResponse4Data.status) &&
                Objects.equals(this.statusUpdateDateTime, obWriteDomesticStandingOrderResponse4Data.statusUpdateDateTime) &&
                Objects.equals(this.charges, obWriteDomesticStandingOrderResponse4Data.charges) &&
                Objects.equals(this.initiation, obWriteDomesticStandingOrderResponse4Data.initiation) &&
                Objects.equals(this.multiAuthorisation, obWriteDomesticStandingOrderResponse4Data.multiAuthorisation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domesticStandingOrderId, consentId, creationDateTime, status, statusUpdateDateTime, charges, initiation, multiAuthorisation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticStandingOrderResponse4Data {\n");

        sb.append("    domesticStandingOrderId: ").append(toIndentedString(domesticStandingOrderId)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
        sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
        sb.append("    multiAuthorisation: ").append(toIndentedString(multiAuthorisation)).append("\n");
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

    /**
     * Specifies the status of the payment order resource.
     */
    public enum StatusEnum {
        CANCELLED("Cancelled"),

        INITIATIONCOMPLETED("InitiationCompleted"),

        INITIATIONFAILED("InitiationFailed"),

        INITIATIONPENDING("InitiationPending");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

}

