/*
 * Forgerock AM Authentication API
 * An OAuth2 Client for Forgerock AM based on tests
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.gov.hmcts.reform.idam.api.fr.am.oidc.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * JsonWebKey
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-21T15:18:22.935Z")
public class JsonWebKey {
  @JsonProperty("alg")
  private String alg = null;

  @JsonProperty("kty")
  private String kty = null;

  @JsonProperty("use")
  private String use = null;

  @JsonProperty("kid")
  private String kid = null;

  @JsonProperty("n")
  private String n = null;

  @JsonProperty("e")
  private String e = null;

  @JsonProperty("x5c")
  private String x5c = null;

  @JsonProperty("x5t")
  private String x5t = null;

  @JsonProperty("crv")
  private String crv = null;

  @JsonProperty("d")
  private String d = null;

  @JsonProperty("dp")
  private String dp = null;

  @JsonProperty("dq")
  private String dq = null;

  @JsonProperty("k")
  private String k = null;

  @JsonProperty("p")
  private String p = null;

  @JsonProperty("q")
  private String q = null;

  @JsonProperty("qi")
  private String qi = null;

  @JsonProperty("x")
  private String x = null;

  @JsonProperty("y")
  private String y = null;

  public JsonWebKey alg(String alg) {
    this.alg = alg;
    return this;
  }

   /**
   * Get alg
   * @return alg
  **/
  @ApiModelProperty(value = "")
  public String getAlg() {
    return alg;
  }

  public void setAlg(String alg) {
    this.alg = alg;
  }

  public JsonWebKey kty(String kty) {
    this.kty = kty;
    return this;
  }

   /**
   * Get kty
   * @return kty
  **/
  @ApiModelProperty(value = "")
  public String getKty() {
    return kty;
  }

  public void setKty(String kty) {
    this.kty = kty;
  }

  public JsonWebKey use(String use) {
    this.use = use;
    return this;
  }

   /**
   * Get use
   * @return use
  **/
  @ApiModelProperty(value = "")
  public String getUse() {
    return use;
  }

  public void setUse(String use) {
    this.use = use;
  }

  public JsonWebKey kid(String kid) {
    this.kid = kid;
    return this;
  }

   /**
   * Get kid
   * @return kid
  **/
  @ApiModelProperty(value = "")
  public String getKid() {
    return kid;
  }

  public void setKid(String kid) {
    this.kid = kid;
  }

  public JsonWebKey n(String n) {
    this.n = n;
    return this;
  }

   /**
   * Get n
   * @return n
  **/
  @ApiModelProperty(value = "")
  public String getN() {
    return n;
  }

  public void setN(String n) {
    this.n = n;
  }

  public JsonWebKey e(String e) {
    this.e = e;
    return this;
  }

   /**
   * Get e
   * @return e
  **/
  @ApiModelProperty(value = "")
  public String getE() {
    return e;
  }

  public void setE(String e) {
    this.e = e;
  }

  public JsonWebKey x5c(String x5c) {
    this.x5c = x5c;
    return this;
  }

   /**
   * Get x5c
   * @return x5c
  **/
  @ApiModelProperty(value = "")
  public String getX5c() {
    return x5c;
  }

  public void setX5c(String x5c) {
    this.x5c = x5c;
  }

  public JsonWebKey x5t(String x5t) {
    this.x5t = x5t;
    return this;
  }

   /**
   * Get x5t
   * @return x5t
  **/
  @ApiModelProperty(value = "")
  public String getX5t() {
    return x5t;
  }

  public void setX5t(String x5t) {
    this.x5t = x5t;
  }

  public JsonWebKey crv(String crv) {
    this.crv = crv;
    return this;
  }

   /**
   * Get crv
   * @return crv
  **/
  @ApiModelProperty(value = "")
  public String getCrv() {
    return crv;
  }

  public void setCrv(String crv) {
    this.crv = crv;
  }

  public JsonWebKey d(String d) {
    this.d = d;
    return this;
  }

   /**
   * Get d
   * @return d
  **/
  @ApiModelProperty(value = "")
  public String getD() {
    return d;
  }

  public void setD(String d) {
    this.d = d;
  }

  public JsonWebKey dp(String dp) {
    this.dp = dp;
    return this;
  }

   /**
   * Get dp
   * @return dp
  **/
  @ApiModelProperty(value = "")
  public String getDp() {
    return dp;
  }

  public void setDp(String dp) {
    this.dp = dp;
  }

  public JsonWebKey dq(String dq) {
    this.dq = dq;
    return this;
  }

   /**
   * Get dq
   * @return dq
  **/
  @ApiModelProperty(value = "")
  public String getDq() {
    return dq;
  }

  public void setDq(String dq) {
    this.dq = dq;
  }

  public JsonWebKey k(String k) {
    this.k = k;
    return this;
  }

   /**
   * Get k
   * @return k
  **/
  @ApiModelProperty(value = "")
  public String getK() {
    return k;
  }

  public void setK(String k) {
    this.k = k;
  }

  public JsonWebKey p(String p) {
    this.p = p;
    return this;
  }

   /**
   * Get p
   * @return p
  **/
  @ApiModelProperty(value = "")
  public String getP() {
    return p;
  }

  public void setP(String p) {
    this.p = p;
  }

  public JsonWebKey q(String q) {
    this.q = q;
    return this;
  }

   /**
   * Get q
   * @return q
  **/
  @ApiModelProperty(value = "")
  public String getQ() {
    return q;
  }

  public void setQ(String q) {
    this.q = q;
  }

  public JsonWebKey qi(String qi) {
    this.qi = qi;
    return this;
  }

   /**
   * Get qi
   * @return qi
  **/
  @ApiModelProperty(value = "")
  public String getQi() {
    return qi;
  }

  public void setQi(String qi) {
    this.qi = qi;
  }

  public JsonWebKey x(String x) {
    this.x = x;
    return this;
  }

   /**
   * Get x
   * @return x
  **/
  @ApiModelProperty(value = "")
  public String getX() {
    return x;
  }

  public void setX(String x) {
    this.x = x;
  }

  public JsonWebKey y(String y) {
    this.y = y;
    return this;
  }

   /**
   * Get y
   * @return y
  **/
  @ApiModelProperty(value = "")
  public String getY() {
    return y;
  }

  public void setY(String y) {
    this.y = y;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonWebKey jsonWebKey = (JsonWebKey) o;
    return Objects.equals(this.alg, jsonWebKey.alg) &&
        Objects.equals(this.kty, jsonWebKey.kty) &&
        Objects.equals(this.use, jsonWebKey.use) &&
        Objects.equals(this.kid, jsonWebKey.kid) &&
        Objects.equals(this.n, jsonWebKey.n) &&
        Objects.equals(this.e, jsonWebKey.e) &&
        Objects.equals(this.x5c, jsonWebKey.x5c) &&
        Objects.equals(this.x5t, jsonWebKey.x5t) &&
        Objects.equals(this.crv, jsonWebKey.crv) &&
        Objects.equals(this.d, jsonWebKey.d) &&
        Objects.equals(this.dp, jsonWebKey.dp) &&
        Objects.equals(this.dq, jsonWebKey.dq) &&
        Objects.equals(this.k, jsonWebKey.k) &&
        Objects.equals(this.p, jsonWebKey.p) &&
        Objects.equals(this.q, jsonWebKey.q) &&
        Objects.equals(this.qi, jsonWebKey.qi) &&
        Objects.equals(this.x, jsonWebKey.x) &&
        Objects.equals(this.y, jsonWebKey.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alg, kty, use, kid, n, e, x5c, x5t, crv, d, dp, dq, k, p, q, qi, x, y);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonWebKey {\n");
    
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    kty: ").append(toIndentedString(kty)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    e: ").append(toIndentedString(e)).append("\n");
    sb.append("    x5c: ").append(toIndentedString(x5c)).append("\n");
    sb.append("    x5t: ").append(toIndentedString(x5t)).append("\n");
    sb.append("    crv: ").append(toIndentedString(crv)).append("\n");
    sb.append("    d: ").append(toIndentedString(d)).append("\n");
    sb.append("    dp: ").append(toIndentedString(dp)).append("\n");
    sb.append("    dq: ").append(toIndentedString(dq)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    p: ").append(toIndentedString(p)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    qi: ").append(toIndentedString(qi)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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

