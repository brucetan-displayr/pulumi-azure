// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IntegrationRuntimeSelfHostedRbacAuthorization {
    /**
     * @return The resource identifier of the integration runtime to be shared.
     * 
     */
    private String resourceId;

    private IntegrationRuntimeSelfHostedRbacAuthorization() {}
    /**
     * @return The resource identifier of the integration runtime to be shared.
     * 
     */
    public String resourceId() {
        return this.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeSelfHostedRbacAuthorization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String resourceId;
        public Builder() {}
        public Builder(IntegrationRuntimeSelfHostedRbacAuthorization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
        }

        @CustomType.Setter
        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public IntegrationRuntimeSelfHostedRbacAuthorization build() {
            final var o = new IntegrationRuntimeSelfHostedRbacAuthorization();
            o.resourceId = resourceId;
            return o;
        }
    }
}
