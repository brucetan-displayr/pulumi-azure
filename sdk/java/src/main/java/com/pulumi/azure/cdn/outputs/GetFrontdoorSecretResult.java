// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.outputs;

import com.pulumi.azure.cdn.outputs.GetFrontdoorSecretSecret;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFrontdoorSecretResult {
    /**
     * @return Specifies the ID of the Front Door Profile within which this Front Door Secret exists.
     * 
     */
    private String cdnFrontdoorProfileId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    private String profileName;
    private String resourceGroupName;
    /**
     * @return A `secret` block as defined below.
     * 
     */
    private List<GetFrontdoorSecretSecret> secrets;

    private GetFrontdoorSecretResult() {}
    /**
     * @return Specifies the ID of the Front Door Profile within which this Front Door Secret exists.
     * 
     */
    public String cdnFrontdoorProfileId() {
        return this.cdnFrontdoorProfileId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public String profileName() {
        return this.profileName;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return A `secret` block as defined below.
     * 
     */
    public List<GetFrontdoorSecretSecret> secrets() {
        return this.secrets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFrontdoorSecretResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cdnFrontdoorProfileId;
        private String id;
        private String name;
        private String profileName;
        private String resourceGroupName;
        private List<GetFrontdoorSecretSecret> secrets;
        public Builder() {}
        public Builder(GetFrontdoorSecretResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cdnFrontdoorProfileId = defaults.cdnFrontdoorProfileId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secrets = defaults.secrets;
        }

        @CustomType.Setter
        public Builder cdnFrontdoorProfileId(String cdnFrontdoorProfileId) {
            this.cdnFrontdoorProfileId = Objects.requireNonNull(cdnFrontdoorProfileId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder profileName(String profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder secrets(List<GetFrontdoorSecretSecret> secrets) {
            this.secrets = Objects.requireNonNull(secrets);
            return this;
        }
        public Builder secrets(GetFrontdoorSecretSecret... secrets) {
            return secrets(List.of(secrets));
        }
        public GetFrontdoorSecretResult build() {
            final var o = new GetFrontdoorSecretResult();
            o.cdnFrontdoorProfileId = cdnFrontdoorProfileId;
            o.id = id;
            o.name = name;
            o.profileName = profileName;
            o.resourceGroupName = resourceGroupName;
            o.secrets = secrets;
            return o;
        }
    }
}
