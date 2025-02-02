// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile.outputs;

import com.pulumi.azure.mobile.outputs.GetNetworkServicePccRule;
import com.pulumi.azure.mobile.outputs.GetNetworkServiceServiceQosPolicy;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNetworkServiceResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The Azure Region where the Mobile Network Service should exist.
     * 
     */
    private String location;
    private String mobileNetworkId;
    /**
     * @return The name of the data flow template. This must be unique within the parent data flow policy rule.
     * 
     */
    private String name;
    /**
     * @return A `pcc_rule` block as defined below. The set of PCC Rules that make up this service.
     * 
     */
    private List<GetNetworkServicePccRule> pccRules;
    /**
     * @return A precedence value that is used to decide between services when identifying the QoS values to use for a particular SIM. A lower value means a higher priority.
     * 
     */
    private Integer servicePrecedence;
    /**
     * @return A `service_qos_policy` block as defined below. The QoS policy to use for packets matching this service.
     * 
     */
    private List<GetNetworkServiceServiceQosPolicy> serviceQosPolicies;
    /**
     * @return A mapping of tags which should be assigned to the Mobile Network Service.
     * 
     */
    private Map<String,String> tags;

    private GetNetworkServiceResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Azure Region where the Mobile Network Service should exist.
     * 
     */
    public String location() {
        return this.location;
    }
    public String mobileNetworkId() {
        return this.mobileNetworkId;
    }
    /**
     * @return The name of the data flow template. This must be unique within the parent data flow policy rule.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A `pcc_rule` block as defined below. The set of PCC Rules that make up this service.
     * 
     */
    public List<GetNetworkServicePccRule> pccRules() {
        return this.pccRules;
    }
    /**
     * @return A precedence value that is used to decide between services when identifying the QoS values to use for a particular SIM. A lower value means a higher priority.
     * 
     */
    public Integer servicePrecedence() {
        return this.servicePrecedence;
    }
    /**
     * @return A `service_qos_policy` block as defined below. The QoS policy to use for packets matching this service.
     * 
     */
    public List<GetNetworkServiceServiceQosPolicy> serviceQosPolicies() {
        return this.serviceQosPolicies;
    }
    /**
     * @return A mapping of tags which should be assigned to the Mobile Network Service.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkServiceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String location;
        private String mobileNetworkId;
        private String name;
        private List<GetNetworkServicePccRule> pccRules;
        private Integer servicePrecedence;
        private List<GetNetworkServiceServiceQosPolicy> serviceQosPolicies;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetNetworkServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.mobileNetworkId = defaults.mobileNetworkId;
    	      this.name = defaults.name;
    	      this.pccRules = defaults.pccRules;
    	      this.servicePrecedence = defaults.servicePrecedence;
    	      this.serviceQosPolicies = defaults.serviceQosPolicies;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder mobileNetworkId(String mobileNetworkId) {
            this.mobileNetworkId = Objects.requireNonNull(mobileNetworkId);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder pccRules(List<GetNetworkServicePccRule> pccRules) {
            this.pccRules = Objects.requireNonNull(pccRules);
            return this;
        }
        public Builder pccRules(GetNetworkServicePccRule... pccRules) {
            return pccRules(List.of(pccRules));
        }
        @CustomType.Setter
        public Builder servicePrecedence(Integer servicePrecedence) {
            this.servicePrecedence = Objects.requireNonNull(servicePrecedence);
            return this;
        }
        @CustomType.Setter
        public Builder serviceQosPolicies(List<GetNetworkServiceServiceQosPolicy> serviceQosPolicies) {
            this.serviceQosPolicies = Objects.requireNonNull(serviceQosPolicies);
            return this;
        }
        public Builder serviceQosPolicies(GetNetworkServiceServiceQosPolicy... serviceQosPolicies) {
            return serviceQosPolicies(List.of(serviceQosPolicies));
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetNetworkServiceResult build() {
            final var o = new GetNetworkServiceResult();
            o.id = id;
            o.location = location;
            o.mobileNetworkId = mobileNetworkId;
            o.name = name;
            o.pccRules = pccRules;
            o.servicePrecedence = servicePrecedence;
            o.serviceQosPolicies = serviceQosPolicies;
            o.tags = tags;
            return o;
        }
    }
}
