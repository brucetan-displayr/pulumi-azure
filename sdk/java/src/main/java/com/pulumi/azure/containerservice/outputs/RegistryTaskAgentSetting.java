// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class RegistryTaskAgentSetting {
    /**
     * @return The number of cores required for the Container Registry Task.
     * 
     */
    private Integer cpu;

    private RegistryTaskAgentSetting() {}
    /**
     * @return The number of cores required for the Container Registry Task.
     * 
     */
    public Integer cpu() {
        return this.cpu;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryTaskAgentSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer cpu;
        public Builder() {}
        public Builder(RegistryTaskAgentSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
        }

        @CustomType.Setter
        public Builder cpu(Integer cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }
        public RegistryTaskAgentSetting build() {
            final var o = new RegistryTaskAgentSetting();
            o.cpu = cpu;
            return o;
        }
    }
}
