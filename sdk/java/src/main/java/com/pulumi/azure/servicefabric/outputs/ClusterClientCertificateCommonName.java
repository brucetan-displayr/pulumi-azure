// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicefabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterClientCertificateCommonName {
    /**
     * @return The common or subject name of the certificate.
     * 
     */
    private String commonName;
    /**
     * @return Does the Client Certificate have Admin Access to the cluster? Non-admin clients can only perform read only operations on the cluster.
     * 
     */
    private Boolean isAdmin;
    /**
     * @return The Issuer Thumbprint of the Certificate.
     * 
     */
    private @Nullable String issuerThumbprint;

    private ClusterClientCertificateCommonName() {}
    /**
     * @return The common or subject name of the certificate.
     * 
     */
    public String commonName() {
        return this.commonName;
    }
    /**
     * @return Does the Client Certificate have Admin Access to the cluster? Non-admin clients can only perform read only operations on the cluster.
     * 
     */
    public Boolean isAdmin() {
        return this.isAdmin;
    }
    /**
     * @return The Issuer Thumbprint of the Certificate.
     * 
     */
    public Optional<String> issuerThumbprint() {
        return Optional.ofNullable(this.issuerThumbprint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClientCertificateCommonName defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String commonName;
        private Boolean isAdmin;
        private @Nullable String issuerThumbprint;
        public Builder() {}
        public Builder(ClusterClientCertificateCommonName defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonName = defaults.commonName;
    	      this.isAdmin = defaults.isAdmin;
    	      this.issuerThumbprint = defaults.issuerThumbprint;
        }

        @CustomType.Setter
        public Builder commonName(String commonName) {
            this.commonName = Objects.requireNonNull(commonName);
            return this;
        }
        @CustomType.Setter
        public Builder isAdmin(Boolean isAdmin) {
            this.isAdmin = Objects.requireNonNull(isAdmin);
            return this;
        }
        @CustomType.Setter
        public Builder issuerThumbprint(@Nullable String issuerThumbprint) {
            this.issuerThumbprint = issuerThumbprint;
            return this;
        }
        public ClusterClientCertificateCommonName build() {
            final var o = new ClusterClientCertificateCommonName();
            o.commonName = commonName;
            o.isAdmin = isAdmin;
            o.issuerThumbprint = issuerThumbprint;
            return o;
        }
    }
}
