// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hybrid.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetComputeMachineOsProfileLinuxConfigurationPatchSetting {
    /**
     * @return Specifies the assessment mode.
     * 
     */
    private String assessmentMode;
    /**
     * @return Specifies the patch mode.
     * 
     */
    private String patchMode;

    private GetComputeMachineOsProfileLinuxConfigurationPatchSetting() {}
    /**
     * @return Specifies the assessment mode.
     * 
     */
    public String assessmentMode() {
        return this.assessmentMode;
    }
    /**
     * @return Specifies the patch mode.
     * 
     */
    public String patchMode() {
        return this.patchMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetComputeMachineOsProfileLinuxConfigurationPatchSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String assessmentMode;
        private String patchMode;
        public Builder() {}
        public Builder(GetComputeMachineOsProfileLinuxConfigurationPatchSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessmentMode = defaults.assessmentMode;
    	      this.patchMode = defaults.patchMode;
        }

        @CustomType.Setter
        public Builder assessmentMode(String assessmentMode) {
            this.assessmentMode = Objects.requireNonNull(assessmentMode);
            return this;
        }
        @CustomType.Setter
        public Builder patchMode(String patchMode) {
            this.patchMode = Objects.requireNonNull(patchMode);
            return this;
        }
        public GetComputeMachineOsProfileLinuxConfigurationPatchSetting build() {
            final var o = new GetComputeMachineOsProfileLinuxConfigurationPatchSetting();
            o.assessmentMode = assessmentMode;
            o.patchMode = patchMode;
            return o;
        }
    }
}
