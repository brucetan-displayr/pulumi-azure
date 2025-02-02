// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScaleSetOsProfileWindowsConfigWinrm {
    /**
     * @return Specifies URL of the certificate with which new Virtual Machines is provisioned.
     * 
     */
    private @Nullable String certificateUrl;
    /**
     * @return Specifies the protocol of listener
     * 
     */
    private String protocol;

    private ScaleSetOsProfileWindowsConfigWinrm() {}
    /**
     * @return Specifies URL of the certificate with which new Virtual Machines is provisioned.
     * 
     */
    public Optional<String> certificateUrl() {
        return Optional.ofNullable(this.certificateUrl);
    }
    /**
     * @return Specifies the protocol of listener
     * 
     */
    public String protocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleSetOsProfileWindowsConfigWinrm defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String certificateUrl;
        private String protocol;
        public Builder() {}
        public Builder(ScaleSetOsProfileWindowsConfigWinrm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateUrl = defaults.certificateUrl;
    	      this.protocol = defaults.protocol;
        }

        @CustomType.Setter
        public Builder certificateUrl(@Nullable String certificateUrl) {
            this.certificateUrl = certificateUrl;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public ScaleSetOsProfileWindowsConfigWinrm build() {
            final var o = new ScaleSetOsProfileWindowsConfigWinrm();
            o.certificateUrl = certificateUrl;
            o.protocol = protocol;
            return o;
        }
    }
}
