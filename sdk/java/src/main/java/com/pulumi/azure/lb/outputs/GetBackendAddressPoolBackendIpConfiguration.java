// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBackendAddressPoolBackendIpConfiguration {
    /**
     * @return The ID of the Backend Address Pool.
     * 
     */
    private String id;

    private GetBackendAddressPoolBackendIpConfiguration() {}
    /**
     * @return The ID of the Backend Address Pool.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendAddressPoolBackendIpConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(GetBackendAddressPoolBackendIpConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetBackendAddressPoolBackendIpConfiguration build() {
            final var o = new GetBackendAddressPoolBackendIpConfiguration();
            o.id = id;
            return o;
        }
    }
}
