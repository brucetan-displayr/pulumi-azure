// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GroupContainerGpuLimit {
    /**
     * @return The upper limit of the number of GPUs which should be assigned to this container.
     * 
     */
    private @Nullable Integer count;
    /**
     * @return The allowed SKU which should be used for the GPU. Possible values are `K80`, `P100`, or `V100`.
     * 
     */
    private @Nullable String sku;

    private GroupContainerGpuLimit() {}
    /**
     * @return The upper limit of the number of GPUs which should be assigned to this container.
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }
    /**
     * @return The allowed SKU which should be used for the GPU. Possible values are `K80`, `P100`, or `V100`.
     * 
     */
    public Optional<String> sku() {
        return Optional.ofNullable(this.sku);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupContainerGpuLimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String sku;
        public Builder() {}
        public Builder(GroupContainerGpuLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.sku = defaults.sku;
        }

        @CustomType.Setter
        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }
        @CustomType.Setter
        public Builder sku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }
        public GroupContainerGpuLimit build() {
            final var o = new GroupContainerGpuLimit();
            o.count = count;
            o.sku = sku;
            return o;
        }
    }
}
