// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiContact {
    /**
     * @return The email address of the contact person/organization.
     * 
     */
    private @Nullable String email;
    /**
     * @return The name of the contact person/organization.
     * 
     */
    private @Nullable String name;
    /**
     * @return Absolute URL of the contact information.
     * 
     */
    private @Nullable String url;

    private ApiContact() {}
    /**
     * @return The email address of the contact person/organization.
     * 
     */
    public Optional<String> email() {
        return Optional.ofNullable(this.email);
    }
    /**
     * @return The name of the contact person/organization.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Absolute URL of the contact information.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiContact defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String email;
        private @Nullable String name;
        private @Nullable String url;
        public Builder() {}
        public Builder(ApiContact defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.name = defaults.name;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder email(@Nullable String email) {
            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }
        public ApiContact build() {
            final var o = new ApiContact();
            o.email = email;
            o.name = name;
            o.url = url;
            return o;
        }
    }
}
