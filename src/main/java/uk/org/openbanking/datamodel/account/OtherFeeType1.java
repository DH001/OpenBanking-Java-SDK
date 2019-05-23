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

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Other Fee/charge type which is not available in the standard code set
 */
@ApiModel(description = "Other Fee/charge type which is not available in the standard code set")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-23T11:27:41.089+01:00")
public class OtherFeeType1 {
    @JsonProperty("Code")
    private String code = null;
    @JsonProperty("FeeCategory")
    private FeeCategoryEnum feeCategory = null;
    @JsonProperty("Name")
    private String name = null;
    @JsonProperty("Description")
    private String description = null;

    public OtherFeeType1 code(String code) {
        this.code = code;
        return this;
    }

    /**
     * The four letter Mnemonic used within an XML file to identify a code
     *
     * @return code
     **/
    @Pattern(regexp = "^\\w{0,4}$")
    @Size(min = 0, max = 4)
    @ApiModelProperty(value = "The four letter Mnemonic used within an XML file to identify a code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OtherFeeType1 feeCategory(FeeCategoryEnum feeCategory) {
        this.feeCategory = feeCategory;
        return this;
    }

    /**
     * Categorisation of fees and charges into standard categories.
     *
     * @return feeCategory
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Categorisation of fees and charges into standard categories.")
    public FeeCategoryEnum getFeeCategory() {
        return feeCategory;
    }

    public void setFeeCategory(FeeCategoryEnum feeCategory) {
        this.feeCategory = feeCategory;
    }

    public OtherFeeType1 name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Long name associated with the code
     *
     * @return name
     **/
    @NotNull
    @Size(min = 1, max = 70)
    @ApiModelProperty(required = true, value = "Long name associated with the code")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OtherFeeType1 description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description to describe the purpose of the code
     *
     * @return description
     **/
    @NotNull
    @Size(min = 1, max = 350)
    @ApiModelProperty(required = true, value = "Description to describe the purpose of the code")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OtherFeeType1 otherFeeType1 = (OtherFeeType1) o;
        return Objects.equals(this.code, otherFeeType1.code) &&
                Objects.equals(this.feeCategory, otherFeeType1.feeCategory) &&
                Objects.equals(this.name, otherFeeType1.name) &&
                Objects.equals(this.description, otherFeeType1.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, feeCategory, name, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OtherFeeType1 {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    feeCategory: ").append(toIndentedString(feeCategory)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
     * Categorisation of fees and charges into standard categories.
     */
    public enum FeeCategoryEnum {
        OTHER("Other"),

        SERVICING("Servicing");

        private String value;

        FeeCategoryEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static FeeCategoryEnum fromValue(String text) {
            for (FeeCategoryEnum b : FeeCategoryEnum.values()) {
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

