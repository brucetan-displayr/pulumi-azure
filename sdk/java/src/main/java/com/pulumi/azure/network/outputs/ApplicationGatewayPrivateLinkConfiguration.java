// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.ApplicationGatewayPrivateLinkConfigurationIpConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayPrivateLinkConfiguration {
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    private @Nullable String id;
    /**
     * @return One or more `ip_configuration` blocks as defined below.
     * 
     */
    private List<ApplicationGatewayPrivateLinkConfigurationIpConfiguration> ipConfigurations;
    /**
     * @return The name of the private link configuration.
     * 
     */
    private String name;

    private ApplicationGatewayPrivateLinkConfiguration() {}
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return One or more `ip_configuration` blocks as defined below.
     * 
     */
    public List<ApplicationGatewayPrivateLinkConfigurationIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }
    /**
     * @return The name of the private link configuration.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayPrivateLinkConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private List<ApplicationGatewayPrivateLinkConfigurationIpConfiguration> ipConfigurations;
        private String name;
        public Builder() {}
        public Builder(ApplicationGatewayPrivateLinkConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ipConfigurations(List<ApplicationGatewayPrivateLinkConfigurationIpConfiguration> ipConfigurations) {
            this.ipConfigurations = Objects.requireNonNull(ipConfigurations);
            return this;
        }
        public Builder ipConfigurations(ApplicationGatewayPrivateLinkConfigurationIpConfiguration... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public ApplicationGatewayPrivateLinkConfiguration build() {
            final var o = new ApplicationGatewayPrivateLinkConfiguration();
            o.id = id;
            o.ipConfigurations = ipConfigurations;
            o.name = name;
            return o;
        }
    }
}
