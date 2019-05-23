/**
 *
 * The contents of this file are subject to the terms of the Common Development and
 *  Distribution License (the License). You may not use this file except in compliance with the
 *  License.
 *
 *  You can obtain a copy of the License at https://forgerock.org/cddlv1-0/. See the License for the
 *  specific language governing permission and limitations under the License.
 *
 *  When distributing Covered Software, include this CDDL Header Notice in each file and include
 *  the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 *  Header, with the fields enclosed by brackets [] replaced by your own identifying
 *  information: "Portions copyright [year] [name of copyright owner]".
 *
 *  Copyright 2019 ForgeRock AS.
 */
/*
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.1
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
 * Provides overdraft details for a specific tier or band
 */
@ApiModel(description = "Provides overdraft details for a specific tier or band")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-23T11:27:41.089+01:00")
public class Overdraft1OverdraftTierBand {
    @JsonProperty("Identification")
    private String identification = null;

    @JsonProperty("TierValueMin")
    private String tierValueMin = null;

    @JsonProperty("TierValueMax")
    private String tierValueMax = null;
    @JsonProperty("OverdraftInterestChargingCoverage")
    private OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage = null;
    @JsonProperty("BankGuaranteedIndicator")
    private Boolean bankGuaranteedIndicator = null;
    @JsonProperty("EAR")
    private String EAR = null;
    @JsonProperty("Notes")
    private List<String> notes = null;
    @JsonProperty("OverdraftFeesCharges")
    private List<Overdraft1OverdraftFeesCharges> overdraftFeesCharges = null;

    public Overdraft1OverdraftTierBand identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Unique and unambiguous identification of a  Tier Band for a overdraft.
     *
     * @return identification
     **/
    @Size(min = 1, max = 35)
    @ApiModelProperty(value = "Unique and unambiguous identification of a  Tier Band for a overdraft.")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public Overdraft1OverdraftTierBand tierValueMin(String tierValueMin) {
        this.tierValueMin = tierValueMin;
        return this;
    }

    /**
     * Minimum value of Overdraft Tier/Band
     *
     * @return tierValueMin
     **/
    @NotNull
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @ApiModelProperty(required = true, value = "Minimum value of Overdraft Tier/Band")
    public String getTierValueMin() {
        return tierValueMin;
    }

    public void setTierValueMin(String tierValueMin) {
        this.tierValueMin = tierValueMin;
    }

    public Overdraft1OverdraftTierBand tierValueMax(String tierValueMax) {
        this.tierValueMax = tierValueMax;
        return this;
    }

    /**
     * Maximum value of Overdraft Tier/Band
     *
     * @return tierValueMax
     **/
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @ApiModelProperty(value = "Maximum value of Overdraft Tier/Band")
    public String getTierValueMax() {
        return tierValueMax;
    }

    public void setTierValueMax(String tierValueMax) {
        this.tierValueMax = tierValueMax;
    }

    public Overdraft1OverdraftTierBand overdraftInterestChargingCoverage(OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage) {
        this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
        return this;
    }

    /**
     * Interest charged on whole amount or tiered/banded
     *
     * @return overdraftInterestChargingCoverage
     **/
    @ApiModelProperty(value = "Interest charged on whole amount or tiered/banded")
    public OverdraftInterestChargingCoverageEnum getOverdraftInterestChargingCoverage() {
        return overdraftInterestChargingCoverage;
    }

    public void setOverdraftInterestChargingCoverage(OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage) {
        this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
    }

    public Overdraft1OverdraftTierBand bankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
        this.bankGuaranteedIndicator = bankGuaranteedIndicator;
        return this;
    }

    /**
     * Indicates that a bank provides the overdraft limit up to TierValueMIn to all customers automatically
     *
     * @return bankGuaranteedIndicator
     **/
    @ApiModelProperty(value = "Indicates that a bank provides the overdraft limit up to TierValueMIn to all customers automatically")
    public Boolean isBankGuaranteedIndicator() {
        return bankGuaranteedIndicator;
    }

    public void setBankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
        this.bankGuaranteedIndicator = bankGuaranteedIndicator;
    }

    public Overdraft1OverdraftTierBand EAR(String EAR) {
        this.EAR = EAR;
        return this;
    }

    /**
     * EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.
     *
     * @return EAR
     **/
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @ApiModelProperty(value = "EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.")
    public String getEAR() {
        return EAR;
    }

    public void setEAR(String EAR) {
        this.EAR = EAR;
    }

    public Overdraft1OverdraftTierBand notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public Overdraft1OverdraftTierBand addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<String>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Optional additional notes to supplement the Tier/band details
     *
     * @return notes
     **/
    @ApiModelProperty(value = "Optional additional notes to supplement the Tier/band details")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public Overdraft1OverdraftTierBand overdraftFeesCharges(List<Overdraft1OverdraftFeesCharges> overdraftFeesCharges) {
        this.overdraftFeesCharges = overdraftFeesCharges;
        return this;
    }

    public Overdraft1OverdraftTierBand addOverdraftFeesChargesItem(Overdraft1OverdraftFeesCharges overdraftFeesChargesItem) {
        if (this.overdraftFeesCharges == null) {
            this.overdraftFeesCharges = new ArrayList<Overdraft1OverdraftFeesCharges>();
        }
        this.overdraftFeesCharges.add(overdraftFeesChargesItem);
        return this;
    }

    /**
     * Overdraft fees and charges
     *
     * @return overdraftFeesCharges
     **/
    @Valid
    @ApiModelProperty(value = "Overdraft fees and charges")
    public List<Overdraft1OverdraftFeesCharges> getOverdraftFeesCharges() {
        return overdraftFeesCharges;
    }

    public void setOverdraftFeesCharges(List<Overdraft1OverdraftFeesCharges> overdraftFeesCharges) {
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
        Overdraft1OverdraftTierBand overdraft1OverdraftTierBand = (Overdraft1OverdraftTierBand) o;
        return Objects.equals(this.identification, overdraft1OverdraftTierBand.identification) &&
                Objects.equals(this.tierValueMin, overdraft1OverdraftTierBand.tierValueMin) &&
                Objects.equals(this.tierValueMax, overdraft1OverdraftTierBand.tierValueMax) &&
                Objects.equals(this.overdraftInterestChargingCoverage, overdraft1OverdraftTierBand.overdraftInterestChargingCoverage) &&
                Objects.equals(this.bankGuaranteedIndicator, overdraft1OverdraftTierBand.bankGuaranteedIndicator) &&
                Objects.equals(this.EAR, overdraft1OverdraftTierBand.EAR) &&
                Objects.equals(this.notes, overdraft1OverdraftTierBand.notes) &&
                Objects.equals(this.overdraftFeesCharges, overdraft1OverdraftTierBand.overdraftFeesCharges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identification, tierValueMin, tierValueMax, overdraftInterestChargingCoverage, bankGuaranteedIndicator, EAR, notes, overdraftFeesCharges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Overdraft1OverdraftTierBand {\n");

        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    tierValueMin: ").append(toIndentedString(tierValueMin)).append("\n");
        sb.append("    tierValueMax: ").append(toIndentedString(tierValueMax)).append("\n");
        sb.append("    overdraftInterestChargingCoverage: ").append(toIndentedString(overdraftInterestChargingCoverage)).append("\n");
        sb.append("    bankGuaranteedIndicator: ").append(toIndentedString(bankGuaranteedIndicator)).append("\n");
        sb.append("    EAR: ").append(toIndentedString(EAR)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
     * Interest charged on whole amount or tiered/banded
     */
    public enum OverdraftInterestChargingCoverageEnum {
        TIERED("Tiered"),

        WHOLE("Whole");

        private String value;

        OverdraftInterestChargingCoverageEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static OverdraftInterestChargingCoverageEnum fromValue(String text) {
            for (OverdraftInterestChargingCoverageEnum b : OverdraftInterestChargingCoverageEnum.values()) {
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

