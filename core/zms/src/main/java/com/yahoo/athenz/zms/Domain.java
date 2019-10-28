//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.yahoo.rdl.*;

//
// Domain - A domain is an independent partition of users, roles, and
// resources. Its name represents the definition of a namespace; the only way a
// new namespace can be created, from the top, is by creating Domains.
// Administration of a domain is governed by the parent domain (using
// reverse-DNS namespaces). The top level domains are governed by the special
// "sys.auth" domain.
//
public class Domain {
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String description;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String org;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean enabled;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean auditEnabled;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String account;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer ypmId;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String applicationId;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String certDnsDomain;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer memberExpiryDays;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer tokenExpiryMins;
    public String name;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Timestamp modified;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public UUID id;

    public Domain setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return description;
    }
    public Domain setOrg(String org) {
        this.org = org;
        return this;
    }
    public String getOrg() {
        return org;
    }
    public Domain setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return enabled;
    }
    public Domain setAuditEnabled(Boolean auditEnabled) {
        this.auditEnabled = auditEnabled;
        return this;
    }
    public Boolean getAuditEnabled() {
        return auditEnabled;
    }
    public Domain setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return account;
    }
    public Domain setYpmId(Integer ypmId) {
        this.ypmId = ypmId;
        return this;
    }
    public Integer getYpmId() {
        return ypmId;
    }
    public Domain setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return applicationId;
    }
    public Domain setCertDnsDomain(String certDnsDomain) {
        this.certDnsDomain = certDnsDomain;
        return this;
    }
    public String getCertDnsDomain() {
        return certDnsDomain;
    }
    public Domain setMemberExpiryDays(Integer memberExpiryDays) {
        this.memberExpiryDays = memberExpiryDays;
        return this;
    }
    public Integer getMemberExpiryDays() {
        return memberExpiryDays;
    }
    public Domain setTokenExpiryMins(Integer tokenExpiryMins) {
        this.tokenExpiryMins = tokenExpiryMins;
        return this;
    }
    public Integer getTokenExpiryMins() {
        return tokenExpiryMins;
    }
    public Domain setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return name;
    }
    public Domain setModified(Timestamp modified) {
        this.modified = modified;
        return this;
    }
    public Timestamp getModified() {
        return modified;
    }
    public Domain setId(UUID id) {
        this.id = id;
        return this;
    }
    public UUID getId() {
        return id;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != Domain.class) {
                return false;
            }
            Domain a = (Domain) another;
            if (description == null ? a.description != null : !description.equals(a.description)) {
                return false;
            }
            if (org == null ? a.org != null : !org.equals(a.org)) {
                return false;
            }
            if (enabled == null ? a.enabled != null : !enabled.equals(a.enabled)) {
                return false;
            }
            if (auditEnabled == null ? a.auditEnabled != null : !auditEnabled.equals(a.auditEnabled)) {
                return false;
            }
            if (account == null ? a.account != null : !account.equals(a.account)) {
                return false;
            }
            if (ypmId == null ? a.ypmId != null : !ypmId.equals(a.ypmId)) {
                return false;
            }
            if (applicationId == null ? a.applicationId != null : !applicationId.equals(a.applicationId)) {
                return false;
            }
            if (certDnsDomain == null ? a.certDnsDomain != null : !certDnsDomain.equals(a.certDnsDomain)) {
                return false;
            }
            if (memberExpiryDays == null ? a.memberExpiryDays != null : !memberExpiryDays.equals(a.memberExpiryDays)) {
                return false;
            }
            if (tokenExpiryMins == null ? a.tokenExpiryMins != null : !tokenExpiryMins.equals(a.tokenExpiryMins)) {
                return false;
            }
            if (name == null ? a.name != null : !name.equals(a.name)) {
                return false;
            }
            if (modified == null ? a.modified != null : !modified.equals(a.modified)) {
                return false;
            }
            if (id == null ? a.id != null : !id.equals(a.id)) {
                return false;
            }
        }
        return true;
    }
}
