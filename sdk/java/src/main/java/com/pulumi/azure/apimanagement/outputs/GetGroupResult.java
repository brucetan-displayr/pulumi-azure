// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGroupResult {
    private String apiManagementName;
    /**
     * @return The description of this API Management Group.
     * 
     */
    private String description;
    /**
     * @return The display name of this API Management Group.
     * 
     */
    private String displayName;
    /**
     * @return The identifier of the external Group.
     * 
     */
    private String externalId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    private String resourceGroupName;
    /**
     * @return The type of this API Management Group, such as `custom` or `external`.
     * 
     */
    private String type;

    private GetGroupResult() {}
    public String apiManagementName() {
        return this.apiManagementName;
    }
    /**
     * @return The description of this API Management Group.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The display name of this API Management Group.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The identifier of the external Group.
     * 
     */
    public String externalId() {
        return this.externalId;
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
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The type of this API Management Group, such as `custom` or `external`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String apiManagementName;
        private String description;
        private String displayName;
        private String externalId;
        private String id;
        private String name;
        private String resourceGroupName;
        private String type;
        public Builder() {}
        public Builder(GetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiManagementName = defaults.apiManagementName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.externalId = defaults.externalId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder apiManagementName(String apiManagementName) {
            this.apiManagementName = Objects.requireNonNull(apiManagementName);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder externalId(String externalId) {
            this.externalId = Objects.requireNonNull(externalId);
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
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetGroupResult build() {
            final var o = new GetGroupResult();
            o.apiManagementName = apiManagementName;
            o.description = description;
            o.displayName = displayName;
            o.externalId = externalId;
            o.id = id;
            o.name = name;
            o.resourceGroupName = resourceGroupName;
            o.type = type;
            return o;
        }
    }
}
