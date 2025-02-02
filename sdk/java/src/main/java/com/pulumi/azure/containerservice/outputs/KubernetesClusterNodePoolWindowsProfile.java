// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesClusterNodePoolWindowsProfile {
    /**
     * @return Should the Windows nodes in this Node Pool have outbound NAT enabled? Defaults to `true`. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable Boolean outboundNatEnabled;

    private KubernetesClusterNodePoolWindowsProfile() {}
    /**
     * @return Should the Windows nodes in this Node Pool have outbound NAT enabled? Defaults to `true`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Boolean> outboundNatEnabled() {
        return Optional.ofNullable(this.outboundNatEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterNodePoolWindowsProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean outboundNatEnabled;
        public Builder() {}
        public Builder(KubernetesClusterNodePoolWindowsProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.outboundNatEnabled = defaults.outboundNatEnabled;
        }

        @CustomType.Setter
        public Builder outboundNatEnabled(@Nullable Boolean outboundNatEnabled) {
            this.outboundNatEnabled = outboundNatEnabled;
            return this;
        }
        public KubernetesClusterNodePoolWindowsProfile build() {
            final var o = new KubernetesClusterNodePoolWindowsProfile();
            o.outboundNatEnabled = outboundNatEnabled;
            return o;
        }
    }
}
