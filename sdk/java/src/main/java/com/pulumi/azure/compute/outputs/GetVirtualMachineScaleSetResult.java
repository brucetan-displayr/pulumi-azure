// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.azure.compute.outputs.GetVirtualMachineScaleSetIdentity;
import com.pulumi.azure.compute.outputs.GetVirtualMachineScaleSetInstance;
import com.pulumi.azure.compute.outputs.GetVirtualMachineScaleSetNetworkInterface;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualMachineScaleSetResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A `identity` block as defined below.
     * 
     */
    private List<GetVirtualMachineScaleSetIdentity> identities;
    /**
     * @return A list of `instances` blocks as defined below.
     * 
     */
    private List<GetVirtualMachineScaleSetInstance> instances;
    /**
     * @return The Azure Region in which this Virtual Machine Scale Set exists.
     * 
     */
    private String location;
    /**
     * @return The name of the public IP address configuration
     * 
     */
    private String name;
    /**
     * @return A list of `network_interface` blocks as defined below.
     * 
     */
    private List<GetVirtualMachineScaleSetNetworkInterface> networkInterfaces;
    private String resourceGroupName;

    private GetVirtualMachineScaleSetResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A `identity` block as defined below.
     * 
     */
    public List<GetVirtualMachineScaleSetIdentity> identities() {
        return this.identities;
    }
    /**
     * @return A list of `instances` blocks as defined below.
     * 
     */
    public List<GetVirtualMachineScaleSetInstance> instances() {
        return this.instances;
    }
    /**
     * @return The Azure Region in which this Virtual Machine Scale Set exists.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The name of the public IP address configuration
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A list of `network_interface` blocks as defined below.
     * 
     */
    public List<GetVirtualMachineScaleSetNetworkInterface> networkInterfaces() {
        return this.networkInterfaces;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachineScaleSetResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetVirtualMachineScaleSetIdentity> identities;
        private List<GetVirtualMachineScaleSetInstance> instances;
        private String location;
        private String name;
        private List<GetVirtualMachineScaleSetNetworkInterface> networkInterfaces;
        private String resourceGroupName;
        public Builder() {}
        public Builder(GetVirtualMachineScaleSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identities = defaults.identities;
    	      this.instances = defaults.instances;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder identities(List<GetVirtualMachineScaleSetIdentity> identities) {
            this.identities = Objects.requireNonNull(identities);
            return this;
        }
        public Builder identities(GetVirtualMachineScaleSetIdentity... identities) {
            return identities(List.of(identities));
        }
        @CustomType.Setter
        public Builder instances(List<GetVirtualMachineScaleSetInstance> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }
        public Builder instances(GetVirtualMachineScaleSetInstance... instances) {
            return instances(List.of(instances));
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder networkInterfaces(List<GetVirtualMachineScaleSetNetworkInterface> networkInterfaces) {
            this.networkInterfaces = Objects.requireNonNull(networkInterfaces);
            return this;
        }
        public Builder networkInterfaces(GetVirtualMachineScaleSetNetworkInterface... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetVirtualMachineScaleSetResult build() {
            final var o = new GetVirtualMachineScaleSetResult();
            o.id = id;
            o.identities = identities;
            o.instances = instances;
            o.location = location;
            o.name = name;
            o.networkInterfaces = networkInterfaces;
            o.resourceGroupName = resourceGroupName;
            return o;
        }
    }
}
