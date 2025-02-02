// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.backup.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyVMInstantRestoreResourceGroup {
    private String prefix;
    private @Nullable String suffix;

    private PolicyVMInstantRestoreResourceGroup() {}
    public String prefix() {
        return this.prefix;
    }
    public Optional<String> suffix() {
        return Optional.ofNullable(this.suffix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyVMInstantRestoreResourceGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String prefix;
        private @Nullable String suffix;
        public Builder() {}
        public Builder(PolicyVMInstantRestoreResourceGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefix = defaults.prefix;
    	      this.suffix = defaults.suffix;
        }

        @CustomType.Setter
        public Builder prefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }
        @CustomType.Setter
        public Builder suffix(@Nullable String suffix) {
            this.suffix = suffix;
            return this;
        }
        public PolicyVMInstantRestoreResourceGroup build() {
            final var o = new PolicyVMInstantRestoreResourceGroup();
            o.prefix = prefix;
            o.suffix = suffix;
            return o;
        }
    }
}
