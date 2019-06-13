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
 * OBReadDataStatement2
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T15:59:01.633+01:00")
public class OBReadDataStatement2 {
    @JsonProperty("Statement")
    private List<OBStatement2> statement = null;

    public OBReadDataStatement2 statement(List<OBStatement2> statement) {
        this.statement = statement;
        return this;
    }

    public OBReadDataStatement2 addStatementItem(OBStatement2 statementItem) {
        if (this.statement == null) {
            this.statement = new ArrayList<OBStatement2>();
        }
        this.statement.add(statementItem);
        return this;
    }

    /**
     * Get statement
     *
     * @return statement
     **/
    @Valid
    @ApiModelProperty(value = "")
    public List<OBStatement2> getStatement() {
        return statement;
    }

    public void setStatement(List<OBStatement2> statement) {
        this.statement = statement;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadDataStatement2 obReadDataStatement2 = (OBReadDataStatement2) o;
        return Objects.equals(this.statement, obReadDataStatement2.statement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statement);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadDataStatement2 {\n");

        sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
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

