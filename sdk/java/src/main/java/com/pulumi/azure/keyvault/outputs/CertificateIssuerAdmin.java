// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateIssuerAdmin {
    /**
     * @return E-mail address of the admin.
     * 
     */
    private String emailAddress;
    /**
     * @return First name of the admin.
     * 
     */
    private @Nullable String firstName;
    /**
     * @return Last name of the admin.
     * 
     */
    private @Nullable String lastName;
    /**
     * @return Phone number of the admin.
     * 
     */
    private @Nullable String phone;

    private CertificateIssuerAdmin() {}
    /**
     * @return E-mail address of the admin.
     * 
     */
    public String emailAddress() {
        return this.emailAddress;
    }
    /**
     * @return First name of the admin.
     * 
     */
    public Optional<String> firstName() {
        return Optional.ofNullable(this.firstName);
    }
    /**
     * @return Last name of the admin.
     * 
     */
    public Optional<String> lastName() {
        return Optional.ofNullable(this.lastName);
    }
    /**
     * @return Phone number of the admin.
     * 
     */
    public Optional<String> phone() {
        return Optional.ofNullable(this.phone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateIssuerAdmin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String emailAddress;
        private @Nullable String firstName;
        private @Nullable String lastName;
        private @Nullable String phone;
        public Builder() {}
        public Builder(CertificateIssuerAdmin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
    	      this.phone = defaults.phone;
        }

        @CustomType.Setter
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = Objects.requireNonNull(emailAddress);
            return this;
        }
        @CustomType.Setter
        public Builder firstName(@Nullable String firstName) {
            this.firstName = firstName;
            return this;
        }
        @CustomType.Setter
        public Builder lastName(@Nullable String lastName) {
            this.lastName = lastName;
            return this;
        }
        @CustomType.Setter
        public Builder phone(@Nullable String phone) {
            this.phone = phone;
            return this;
        }
        public CertificateIssuerAdmin build() {
            final var o = new CertificateIssuerAdmin();
            o.emailAddress = emailAddress;
            o.firstName = firstName;
            o.lastName = lastName;
            o.phone = phone;
            return o;
        }
    }
}
