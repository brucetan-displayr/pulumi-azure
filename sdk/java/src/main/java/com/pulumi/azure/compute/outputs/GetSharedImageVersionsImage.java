// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.azure.compute.outputs.GetSharedImageVersionsImageTargetRegion;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSharedImageVersionsImage {
    /**
     * @return Is this Image Version excluded from the `latest` filter?
     * 
     */
    private Boolean excludeFromLatest;
    /**
     * @return The supported Azure location where the Shared Image Gallery exists.
     * 
     */
    private String location;
    /**
     * @return The ID of the Managed Image which was the source of this Shared Image Version.
     * 
     */
    private String managedImageId;
    /**
     * @return The Azure Region in which this Image Version exists.
     * 
     */
    private String name;
    /**
     * @return A mapping of tags assigned to the Shared Image.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return One or more `target_region` blocks as documented below.
     * 
     */
    private List<GetSharedImageVersionsImageTargetRegion> targetRegions;

    private GetSharedImageVersionsImage() {}
    /**
     * @return Is this Image Version excluded from the `latest` filter?
     * 
     */
    public Boolean excludeFromLatest() {
        return this.excludeFromLatest;
    }
    /**
     * @return The supported Azure location where the Shared Image Gallery exists.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The ID of the Managed Image which was the source of this Shared Image Version.
     * 
     */
    public String managedImageId() {
        return this.managedImageId;
    }
    /**
     * @return The Azure Region in which this Image Version exists.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A mapping of tags assigned to the Shared Image.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return One or more `target_region` blocks as documented below.
     * 
     */
    public List<GetSharedImageVersionsImageTargetRegion> targetRegions() {
        return this.targetRegions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSharedImageVersionsImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean excludeFromLatest;
        private String location;
        private String managedImageId;
        private String name;
        private Map<String,String> tags;
        private List<GetSharedImageVersionsImageTargetRegion> targetRegions;
        public Builder() {}
        public Builder(GetSharedImageVersionsImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludeFromLatest = defaults.excludeFromLatest;
    	      this.location = defaults.location;
    	      this.managedImageId = defaults.managedImageId;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.targetRegions = defaults.targetRegions;
        }

        @CustomType.Setter
        public Builder excludeFromLatest(Boolean excludeFromLatest) {
            this.excludeFromLatest = Objects.requireNonNull(excludeFromLatest);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder managedImageId(String managedImageId) {
            this.managedImageId = Objects.requireNonNull(managedImageId);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder targetRegions(List<GetSharedImageVersionsImageTargetRegion> targetRegions) {
            this.targetRegions = Objects.requireNonNull(targetRegions);
            return this;
        }
        public Builder targetRegions(GetSharedImageVersionsImageTargetRegion... targetRegions) {
            return targetRegions(List.of(targetRegions));
        }
        public GetSharedImageVersionsImage build() {
            final var o = new GetSharedImageVersionsImage();
            o.excludeFromLatest = excludeFromLatest;
            o.location = location;
            o.managedImageId = managedImageId;
            o.name = name;
            o.tags = tags;
            o.targetRegions = targetRegions;
            return o;
        }
    }
}
