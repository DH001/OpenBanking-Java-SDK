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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadAccount4Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T15:59:01.633+01:00")
public class OBReadAccount4Data {
    @JsonProperty("Account")
    private List<OBAccount4> account = null;

    public OBReadAccount4Data account(List<OBAccount4> account) {
        this.account = account;
        return this;
    }

    public OBReadAccount4Data addAccountItem(OBAccount4 accountItem) {
        if (this.account == null) {
            this.account = new ArrayList<OBAccount4>();
        }
        this.account.add(accountItem);
        return this;
    }

    /**
     * Get account
     *
     * @return account
     **/
    @Valid
    @ApiModelProperty(value = "")
    public List<OBAccount4> getAccount() {
        return account;
    }

    public void setAccount(List<OBAccount4> account) {
        this.account = account;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadAccount4Data obReadAccount4Data = (OBReadAccount4Data) o;
        return Objects.equals(this.account, obReadAccount4Data.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadAccount4Data {\n");

        sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

