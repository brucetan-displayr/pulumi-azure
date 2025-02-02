// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appconfiguration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConfigurationFeatureTargetingFilterGroup {
    /**
     * @return The name of the group.
     * 
     */
    private String name;
    /**
     * @return Rollout percentage of the group.
     * 
     */
    private Integer rolloutPercentage;

    private ConfigurationFeatureTargetingFilterGroup() {}
    /**
     * @return The name of the group.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Rollout percentage of the group.
     * 
     */
    public Integer rolloutPercentage() {
        return this.rolloutPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationFeatureTargetingFilterGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private Integer rolloutPercentage;
        public Builder() {}
        public Builder(ConfigurationFeatureTargetingFilterGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.rolloutPercentage = defaults.rolloutPercentage;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder rolloutPercentage(Integer rolloutPercentage) {
            this.rolloutPercentage = Objects.requireNonNull(rolloutPercentage);
            return this;
        }
        public ConfigurationFeatureTargetingFilterGroup build() {
            final var o = new ConfigurationFeatureTargetingFilterGroup();
            o.name = name;
            o.rolloutPercentage = rolloutPercentage;
            return o;
        }
    }
}
