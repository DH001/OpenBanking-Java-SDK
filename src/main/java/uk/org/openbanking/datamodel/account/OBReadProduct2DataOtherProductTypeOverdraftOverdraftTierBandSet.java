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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Tier band set details
 */
@ApiModel(description = "Tier band set details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T15:59:01.633+01:00")
public class OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet {
    @JsonProperty("TierBandMethod")
    private TierBandMethodEnum tierBandMethod = null;
    @JsonProperty("OverdraftType")
    private OverdraftTypeEnum overdraftType = null;
    @JsonProperty("Identification")
    private String identification = null;
    @JsonProperty("AuthorisedIndicator")
    private Boolean authorisedIndicator = null;
    @JsonProperty("BufferAmount")
    private String bufferAmount = null;
    @JsonProperty("Notes")
    private List<String> notes = null;
    @JsonProperty("OverdraftTierBand")
    private List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand> overdraftTierBand = new ArrayList<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand>();
    @JsonProperty("OverdraftFeesCharges")
    private List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1> overdraftFeesCharges = null;

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet tierBandMethod(TierBandMethodEnum tierBandMethod) {
        this.tierBandMethod = tierBandMethod;
        return this;
    }

    /**
     * The methodology of how overdraft is charged. It can be: &#39;Whole&#39;  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  &#39;Tiered&#39; Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation &#39;Banded&#39; Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.
     *
     * @return tierBandMethod
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "The methodology of how overdraft is charged. It can be: 'Whole'  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  'Tiered' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation 'Banded' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.")
    public TierBandMethodEnum getTierBandMethod() {
        return tierBandMethod;
    }

    public void setTierBandMethod(TierBandMethodEnum tierBandMethod) {
        this.tierBandMethod = tierBandMethod;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet overdraftType(OverdraftTypeEnum overdraftType) {
        this.overdraftType = overdraftType;
        return this;
    }

    /**
     * An overdraft can either be &#39;committed&#39; which means that the facility cannot be withdrawn without reasonable notification before it&#39;s agreed end date, or &#39;on demand&#39; which means that the financial institution can demand repayment at any point in time.
     *
     * @return overdraftType
     **/
    @ApiModelProperty(value = "An overdraft can either be 'committed' which means that the facility cannot be withdrawn without reasonable notification before it's agreed end date, or 'on demand' which means that the financial institution can demand repayment at any point in time.")
    public OverdraftTypeEnum getOverdraftType() {
        return overdraftType;
    }

    public void setOverdraftType(OverdraftTypeEnum overdraftType) {
        this.overdraftType = overdraftType;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Unique and unambiguous identification of a  Tier Band for a overdraft product.
     *
     * @return identification
     **/
    @Size(min = 1, max = 35)
    @ApiModelProperty(value = "Unique and unambiguous identification of a  Tier Band for a overdraft product.")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet authorisedIndicator(Boolean authorisedIndicator) {
        this.authorisedIndicator = authorisedIndicator;
        return this;
    }

    /**
     * Indicates if the Overdraft is authorised (Y) or unauthorised (N)
     *
     * @return authorisedIndicator
     **/
    @ApiModelProperty(value = "Indicates if the Overdraft is authorised (Y) or unauthorised (N)")
    public Boolean isAuthorisedIndicator() {
        return authorisedIndicator;
    }

    public void setAuthorisedIndicator(Boolean authorisedIndicator) {
        this.authorisedIndicator = authorisedIndicator;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet bufferAmount(String bufferAmount) {
        this.bufferAmount = bufferAmount;
        return this;
    }

    /**
     * When a customer exceeds their credit limit, a financial institution will not charge the customer unauthorised overdraft charges if they do not exceed by more than the buffer amount. Note: Authorised overdraft charges may still apply.
     *
     * @return bufferAmount
     **/
    @Pattern(regexp = "^(-?\\\\d{1,14}){1}(\\\\.\\\\d{1,4}){0,1}$")
    @ApiModelProperty(value = "When a customer exceeds their credit limit, a financial institution will not charge the customer unauthorised overdraft charges if they do not exceed by more than the buffer amount. Note: Authorised overdraft charges may still apply.")
    public String getBufferAmount() {
        return bufferAmount;
    }

    public void setBufferAmount(String bufferAmount) {
        this.bufferAmount = bufferAmount;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<String>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Get notes
     *
     * @return notes
     **/
    @ApiModelProperty(value = "")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet overdraftTierBand(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand> overdraftTierBand) {
        this.overdraftTierBand = overdraftTierBand;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet addOverdraftTierBandItem(OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand overdraftTierBandItem) {
        this.overdraftTierBand.add(overdraftTierBandItem);
        return this;
    }

    /**
     * Get overdraftTierBand
     *
     * @return overdraftTierBand
     **/
    @NotNull
    @Valid
    @Size(min = 1)
    @ApiModelProperty(required = true, value = "")
    public List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand> getOverdraftTierBand() {
        return overdraftTierBand;
    }

    public void setOverdraftTierBand(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand> overdraftTierBand) {
        this.overdraftTierBand = overdraftTierBand;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet overdraftFeesCharges(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1> overdraftFeesCharges) {
        this.overdraftFeesCharges = overdraftFeesCharges;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet addOverdraftFeesChargesItem(OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1 overdraftFeesChargesItem) {
        if (this.overdraftFeesCharges == null) {
            this.overdraftFeesCharges = new ArrayList<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1>();
        }
        this.overdraftFeesCharges.add(overdraftFeesChargesItem);
        return this;
    }

    /**
     * Get overdraftFeesCharges
     *
     * @return overdraftFeesCharges
     **/
    @Valid
    @ApiModelProperty(value = "")
    public List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1> getOverdraftFeesCharges() {
        return overdraftFeesCharges;
    }

    public void setOverdraftFeesCharges(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1> overdraftFeesCharges) {
        this.overdraftFeesCharges = overdraftFeesCharges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet = (OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet) o;
        return Objects.equals(this.tierBandMethod, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet.tierBandMethod) &&
                Objects.equals(this.overdraftType, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet.overdraftType) &&
                Objects.equals(this.identification, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet.identification) &&
                Objects.equals(this.authorisedIndicator, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet.authorisedIndicator) &&
                Objects.equals(this.bufferAmount, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet.bufferAmount) &&
                Objects.equals(this.notes, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet.notes) &&
                Objects.equals(this.overdraftTierBand, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet.overdraftTierBand) &&
                Objects.equals(this.overdraftFeesCharges, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet.overdraftFeesCharges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tierBandMethod, overdraftType, identification, authorisedIndicator, bufferAmount, notes, overdraftTierBand, overdraftFeesCharges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet {\n");

        sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
        sb.append("    overdraftType: ").append(toIndentedString(overdraftType)).append("\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    authorisedIndicator: ").append(toIndentedString(authorisedIndicator)).append("\n");
        sb.append("    bufferAmount: ").append(toIndentedString(bufferAmount)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    overdraftTierBand: ").append(toIndentedString(overdraftTierBand)).append("\n");
        sb.append("    overdraftFeesCharges: ").append(toIndentedString(overdraftFeesCharges)).append("\n");
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
     * The methodology of how overdraft is charged. It can be: &#39;Whole&#39;  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  &#39;Tiered&#39; Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation &#39;Banded&#39; Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.
     */
    public enum TierBandMethodEnum {
        INBA("INBA"),

        INTI("INTI"),

        INWH("INWH");

        private String value;

        TierBandMethodEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static TierBandMethodEnum fromValue(String text) {
            for (TierBandMethodEnum b : TierBandMethodEnum.values()) {
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

    /**
     * An overdraft can either be &#39;committed&#39; which means that the facility cannot be withdrawn without reasonable notification before it&#39;s agreed end date, or &#39;on demand&#39; which means that the financial institution can demand repayment at any point in time.
     */
    public enum OverdraftTypeEnum {
        OVCO("OVCO"),

        OVOD("OVOD"),

        OVOT("OVOT");

        private String value;

        OverdraftTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static OverdraftTypeEnum fromValue(String text) {
            for (OverdraftTypeEnum b : OverdraftTypeEnum.values()) {
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

