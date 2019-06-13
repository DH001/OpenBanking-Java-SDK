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

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Other tariff type which is not in the standard list.
 */
@ApiModel(description = "Other tariff type which is not in the standard list.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T15:59:01.633+01:00")
public class OBReadProduct2DataOtherProductTypeOtherTariffType {
    @JsonProperty("Code")
    private String code = null;

    @JsonProperty("Name")
    private String name = null;

    @JsonProperty("Description")
    private String description = null;

    public OBReadProduct2DataOtherProductTypeOtherTariffType code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     **/
    @Pattern(regexp = "^\\w{0,4}$")
    @ApiModelProperty(value = "")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OBReadProduct2DataOtherProductTypeOtherTariffType name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @NotNull
    @Size(min = 1, max = 70)
    @ApiModelProperty(required = true, value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBReadProduct2DataOtherProductTypeOtherTariffType description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @NotNull
    @Size(min = 1, max = 350)
    @ApiModelProperty(required = true, value = "")
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
        OBReadProduct2DataOtherProductTypeOtherTariffType obReadProduct2DataOtherProductTypeOtherTariffType = (OBReadProduct2DataOtherProductTypeOtherTariffType) o;
        return Objects.equals(this.code, obReadProduct2DataOtherProductTypeOtherTariffType.code) &&
                Objects.equals(this.name, obReadProduct2DataOtherProductTypeOtherTariffType.name) &&
                Objects.equals(this.description, obReadProduct2DataOtherProductTypeOtherTariffType.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, description);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeOtherTariffType {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

}

