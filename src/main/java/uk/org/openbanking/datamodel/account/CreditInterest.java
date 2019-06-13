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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Details about the interest that may be payable to the BCA account holders
 */
@ApiModel(description = "Details about the interest that may be payable to the BCA account holders")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T15:59:01.633+01:00")
public class CreditInterest {
    @JsonProperty("TierBandSet")
    private List<CreditInterestTierBandSet> tierBandSet = new ArrayList<CreditInterestTierBandSet>();

    public CreditInterest tierBandSet(List<CreditInterestTierBandSet> tierBandSet) {
        this.tierBandSet = tierBandSet;
        return this;
    }

    public CreditInterest addTierBandSetItem(CreditInterestTierBandSet tierBandSetItem) {
        this.tierBandSet.add(tierBandSetItem);
        return this;
    }

    /**
     * The group of tiers or bands for which credit interest can be applied.
     *
     * @return tierBandSet
     **/
    @NotNull
    @Valid
    @Size(min = 1)
    @ApiModelProperty(required = true, value = "The group of tiers or bands for which credit interest can be applied.")
    public List<CreditInterestTierBandSet> getTierBandSet() {
        return tierBandSet;
    }

    public void setTierBandSet(List<CreditInterestTierBandSet> tierBandSet) {
        this.tierBandSet = tierBandSet;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreditInterest creditInterest = (CreditInterest) o;
        return Objects.equals(this.tierBandSet, creditInterest.tierBandSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tierBandSet);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreditInterest {\n");

        sb.append("    tierBandSet: ").append(toIndentedString(tierBandSet)).append("\n");
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

