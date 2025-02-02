// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.azure.apimanagement.outputs.ServiceAdditionalLocationVirtualNetworkConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceAdditionalLocation {
    /**
     * @return The number of compute units in this region. Defaults to the capacity of the main region.
     * 
     */
    private @Nullable Integer capacity;
    /**
     * @return Only valid for an Api Management service deployed in multiple locations. This can be used to disable the gateway in this additional location.
     * 
     */
    private @Nullable Boolean gatewayDisabled;
    /**
     * @return The URL of the Regional Gateway for the API Management Service in the specified region.
     * 
     */
    private @Nullable String gatewayRegionalUrl;
    /**
     * @return The name of the Azure Region in which the API Management Service should be expanded to.
     * 
     */
    private String location;
    /**
     * @return The Private IP addresses of the API Management Service. Available only when the API Manager instance is using Virtual Network mode.
     * 
     */
    private @Nullable List<String> privateIpAddresses;
    /**
     * @return ID of a standard SKU IPv4 Public IP.
     * 
     */
    private @Nullable String publicIpAddressId;
    /**
     * @return Public Static Load Balanced IP addresses of the API Management service in the additional location. Available only for Basic, Standard and Premium SKU.
     * 
     */
    private @Nullable List<String> publicIpAddresses;
    /**
     * @return A `virtual_network_configuration` block as defined below. Required when `virtual_network_type` is `External` or `Internal`.
     * 
     */
    private @Nullable ServiceAdditionalLocationVirtualNetworkConfiguration virtualNetworkConfiguration;
    /**
     * @return A list of availability zones. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable List<String> zones;

    private ServiceAdditionalLocation() {}
    /**
     * @return The number of compute units in this region. Defaults to the capacity of the main region.
     * 
     */
    public Optional<Integer> capacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * @return Only valid for an Api Management service deployed in multiple locations. This can be used to disable the gateway in this additional location.
     * 
     */
    public Optional<Boolean> gatewayDisabled() {
        return Optional.ofNullable(this.gatewayDisabled);
    }
    /**
     * @return The URL of the Regional Gateway for the API Management Service in the specified region.
     * 
     */
    public Optional<String> gatewayRegionalUrl() {
        return Optional.ofNullable(this.gatewayRegionalUrl);
    }
    /**
     * @return The name of the Azure Region in which the API Management Service should be expanded to.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The Private IP addresses of the API Management Service. Available only when the API Manager instance is using Virtual Network mode.
     * 
     */
    public List<String> privateIpAddresses() {
        return this.privateIpAddresses == null ? List.of() : this.privateIpAddresses;
    }
    /**
     * @return ID of a standard SKU IPv4 Public IP.
     * 
     */
    public Optional<String> publicIpAddressId() {
        return Optional.ofNullable(this.publicIpAddressId);
    }
    /**
     * @return Public Static Load Balanced IP addresses of the API Management service in the additional location. Available only for Basic, Standard and Premium SKU.
     * 
     */
    public List<String> publicIpAddresses() {
        return this.publicIpAddresses == null ? List.of() : this.publicIpAddresses;
    }
    /**
     * @return A `virtual_network_configuration` block as defined below. Required when `virtual_network_type` is `External` or `Internal`.
     * 
     */
    public Optional<ServiceAdditionalLocationVirtualNetworkConfiguration> virtualNetworkConfiguration() {
        return Optional.ofNullable(this.virtualNetworkConfiguration);
    }
    /**
     * @return A list of availability zones. Changing this forces a new resource to be created.
     * 
     */
    public List<String> zones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAdditionalLocation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer capacity;
        private @Nullable Boolean gatewayDisabled;
        private @Nullable String gatewayRegionalUrl;
        private String location;
        private @Nullable List<String> privateIpAddresses;
        private @Nullable String publicIpAddressId;
        private @Nullable List<String> publicIpAddresses;
        private @Nullable ServiceAdditionalLocationVirtualNetworkConfiguration virtualNetworkConfiguration;
        private @Nullable List<String> zones;
        public Builder() {}
        public Builder(ServiceAdditionalLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.gatewayDisabled = defaults.gatewayDisabled;
    	      this.gatewayRegionalUrl = defaults.gatewayRegionalUrl;
    	      this.location = defaults.location;
    	      this.privateIpAddresses = defaults.privateIpAddresses;
    	      this.publicIpAddressId = defaults.publicIpAddressId;
    	      this.publicIpAddresses = defaults.publicIpAddresses;
    	      this.virtualNetworkConfiguration = defaults.virtualNetworkConfiguration;
    	      this.zones = defaults.zones;
        }

        @CustomType.Setter
        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        @CustomType.Setter
        public Builder gatewayDisabled(@Nullable Boolean gatewayDisabled) {
            this.gatewayDisabled = gatewayDisabled;
            return this;
        }
        @CustomType.Setter
        public Builder gatewayRegionalUrl(@Nullable String gatewayRegionalUrl) {
            this.gatewayRegionalUrl = gatewayRegionalUrl;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder privateIpAddresses(@Nullable List<String> privateIpAddresses) {
            this.privateIpAddresses = privateIpAddresses;
            return this;
        }
        public Builder privateIpAddresses(String... privateIpAddresses) {
            return privateIpAddresses(List.of(privateIpAddresses));
        }
        @CustomType.Setter
        public Builder publicIpAddressId(@Nullable String publicIpAddressId) {
            this.publicIpAddressId = publicIpAddressId;
            return this;
        }
        @CustomType.Setter
        public Builder publicIpAddresses(@Nullable List<String> publicIpAddresses) {
            this.publicIpAddresses = publicIpAddresses;
            return this;
        }
        public Builder publicIpAddresses(String... publicIpAddresses) {
            return publicIpAddresses(List.of(publicIpAddresses));
        }
        @CustomType.Setter
        public Builder virtualNetworkConfiguration(@Nullable ServiceAdditionalLocationVirtualNetworkConfiguration virtualNetworkConfiguration) {
            this.virtualNetworkConfiguration = virtualNetworkConfiguration;
            return this;
        }
        @CustomType.Setter
        public Builder zones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }
        public ServiceAdditionalLocation build() {
            final var o = new ServiceAdditionalLocation();
            o.capacity = capacity;
            o.gatewayDisabled = gatewayDisabled;
            o.gatewayRegionalUrl = gatewayRegionalUrl;
            o.location = location;
            o.privateIpAddresses = privateIpAddresses;
            o.publicIpAddressId = publicIpAddressId;
            o.publicIpAddresses = publicIpAddresses;
            o.virtualNetworkConfiguration = virtualNetworkConfiguration;
            o.zones = zones;
            return o;
        }
    }
}
