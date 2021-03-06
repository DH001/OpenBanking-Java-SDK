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
 * Payment Initiation API
 * Swagger for Payment Initiation API Specification
 *
 * OpenAPI spec version: v3.1.1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Set of elements used to provide details of a charge for the payment initiation.
 */
@ApiModel(description = "Set of elements used to provide details of a charge for the payment initiation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-23T11:45:43.255+01:00")
public class OBCharge2 {
    @JsonProperty("ChargeBearer")
    private OBChargeBearerType1Code chargeBearer = null;

    @JsonProperty("Type")
    private String type = null;

    @JsonProperty("Amount")
    private OBCharge2Amount amount = null;

    public OBCharge2 chargeBearer(OBChargeBearerType1Code chargeBearer) {
        this.chargeBearer = chargeBearer;
        return this;
    }

    /**
     * Get chargeBearer
     *
     * @return chargeBearer
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBChargeBearerType1Code getChargeBearer() {
        return chargeBearer;
    }

    public void setChargeBearer(OBChargeBearerType1Code chargeBearer) {
        this.chargeBearer = chargeBearer;
    }

    public OBCharge2 type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @NotNull
    @Size(min = 1, max = 40)
    @ApiModelProperty(required = true, value = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OBCharge2 amount(OBCharge2Amount amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBCharge2Amount getAmount() {
        return amount;
    }

    public void setAmount(OBCharge2Amount amount) {
        this.amount = amount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBCharge2 obCharge2 = (OBCharge2) o;
        return Objects.equals(this.chargeBearer, obCharge2.chargeBearer) &&
                Objects.equals(this.type, obCharge2.type) &&
                Objects.equals(this.amount, obCharge2.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargeBearer, type, amount);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBCharge2 {\n");

        sb.append("    chargeBearer: ").append(toIndentedString(chargeBearer)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

