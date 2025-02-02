// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualNetworkGatewayConnectionCustomBgpAddresses {
    /**
     * @return single IP address that is part of the `azure.network.VirtualNetworkGateway` ip_configuration (first one)
     * 
     */
    private String primary;
    /**
     * @return single IP address that is part of the `azure.network.VirtualNetworkGateway` ip_configuration (second one)
     * 
     */
    private String secondary;

    private VirtualNetworkGatewayConnectionCustomBgpAddresses() {}
    /**
     * @return single IP address that is part of the `azure.network.VirtualNetworkGateway` ip_configuration (first one)
     * 
     */
    public String primary() {
        return this.primary;
    }
    /**
     * @return single IP address that is part of the `azure.network.VirtualNetworkGateway` ip_configuration (second one)
     * 
     */
    public String secondary() {
        return this.secondary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkGatewayConnectionCustomBgpAddresses defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String primary;
        private String secondary;
        public Builder() {}
        public Builder(VirtualNetworkGatewayConnectionCustomBgpAddresses defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primary = defaults.primary;
    	      this.secondary = defaults.secondary;
        }

        @CustomType.Setter
        public Builder primary(String primary) {
            this.primary = Objects.requireNonNull(primary);
            return this;
        }
        @CustomType.Setter
        public Builder secondary(String secondary) {
            this.secondary = Objects.requireNonNull(secondary);
            return this;
        }
        public VirtualNetworkGatewayConnectionCustomBgpAddresses build() {
            final var o = new VirtualNetworkGatewayConnectionCustomBgpAddresses();
            o.primary = primary;
            o.secondary = secondary;
            return o;
        }
    }
}
