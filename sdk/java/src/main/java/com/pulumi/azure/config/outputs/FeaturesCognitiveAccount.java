// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.config.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeaturesCognitiveAccount {
    private @Nullable Boolean purgeSoftDeleteOnDestroy;

    private FeaturesCognitiveAccount() {}
    public Optional<Boolean> purgeSoftDeleteOnDestroy() {
        return Optional.ofNullable(this.purgeSoftDeleteOnDestroy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeaturesCognitiveAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean purgeSoftDeleteOnDestroy;
        public Builder() {}
        public Builder(FeaturesCognitiveAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.purgeSoftDeleteOnDestroy = defaults.purgeSoftDeleteOnDestroy;
        }

        @CustomType.Setter
        public Builder purgeSoftDeleteOnDestroy(@Nullable Boolean purgeSoftDeleteOnDestroy) {
            this.purgeSoftDeleteOnDestroy = purgeSoftDeleteOnDestroy;
            return this;
        }
        public FeaturesCognitiveAccount build() {
            final var o = new FeaturesCognitiveAccount();
            o.purgeSoftDeleteOnDestroy = purgeSoftDeleteOnDestroy;
            return o;
        }
    }
}
