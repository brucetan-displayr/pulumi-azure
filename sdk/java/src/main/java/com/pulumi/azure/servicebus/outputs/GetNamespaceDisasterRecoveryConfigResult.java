// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicebus.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNamespaceDisasterRecoveryConfigResult {
    private @Nullable String aliasAuthorizationRuleId;
    private String defaultPrimaryKey;
    private String defaultSecondaryKey;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    private @Nullable String namespaceId;
    private @Nullable String namespaceName;
    private String partnerNamespaceId;
    private String primaryConnectionStringAlias;
    private @Nullable String resourceGroupName;
    private String secondaryConnectionStringAlias;

    private GetNamespaceDisasterRecoveryConfigResult() {}
    public Optional<String> aliasAuthorizationRuleId() {
        return Optional.ofNullable(this.aliasAuthorizationRuleId);
    }
    public String defaultPrimaryKey() {
        return this.defaultPrimaryKey;
    }
    public String defaultSecondaryKey() {
        return this.defaultSecondaryKey;
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
    public Optional<String> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }
    public Optional<String> namespaceName() {
        return Optional.ofNullable(this.namespaceName);
    }
    public String partnerNamespaceId() {
        return this.partnerNamespaceId;
    }
    public String primaryConnectionStringAlias() {
        return this.primaryConnectionStringAlias;
    }
    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }
    public String secondaryConnectionStringAlias() {
        return this.secondaryConnectionStringAlias;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceDisasterRecoveryConfigResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aliasAuthorizationRuleId;
        private String defaultPrimaryKey;
        private String defaultSecondaryKey;
        private String id;
        private String name;
        private @Nullable String namespaceId;
        private @Nullable String namespaceName;
        private String partnerNamespaceId;
        private String primaryConnectionStringAlias;
        private @Nullable String resourceGroupName;
        private String secondaryConnectionStringAlias;
        public Builder() {}
        public Builder(GetNamespaceDisasterRecoveryConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasAuthorizationRuleId = defaults.aliasAuthorizationRuleId;
    	      this.defaultPrimaryKey = defaults.defaultPrimaryKey;
    	      this.defaultSecondaryKey = defaults.defaultSecondaryKey;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.namespaceId = defaults.namespaceId;
    	      this.namespaceName = defaults.namespaceName;
    	      this.partnerNamespaceId = defaults.partnerNamespaceId;
    	      this.primaryConnectionStringAlias = defaults.primaryConnectionStringAlias;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secondaryConnectionStringAlias = defaults.secondaryConnectionStringAlias;
        }

        @CustomType.Setter
        public Builder aliasAuthorizationRuleId(@Nullable String aliasAuthorizationRuleId) {
            this.aliasAuthorizationRuleId = aliasAuthorizationRuleId;
            return this;
        }
        @CustomType.Setter
        public Builder defaultPrimaryKey(String defaultPrimaryKey) {
            this.defaultPrimaryKey = Objects.requireNonNull(defaultPrimaryKey);
            return this;
        }
        @CustomType.Setter
        public Builder defaultSecondaryKey(String defaultSecondaryKey) {
            this.defaultSecondaryKey = Objects.requireNonNull(defaultSecondaryKey);
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
        public Builder namespaceId(@Nullable String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        @CustomType.Setter
        public Builder namespaceName(@Nullable String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        @CustomType.Setter
        public Builder partnerNamespaceId(String partnerNamespaceId) {
            this.partnerNamespaceId = Objects.requireNonNull(partnerNamespaceId);
            return this;
        }
        @CustomType.Setter
        public Builder primaryConnectionStringAlias(String primaryConnectionStringAlias) {
            this.primaryConnectionStringAlias = Objects.requireNonNull(primaryConnectionStringAlias);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(@Nullable String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder secondaryConnectionStringAlias(String secondaryConnectionStringAlias) {
            this.secondaryConnectionStringAlias = Objects.requireNonNull(secondaryConnectionStringAlias);
            return this;
        }
        public GetNamespaceDisasterRecoveryConfigResult build() {
            final var o = new GetNamespaceDisasterRecoveryConfigResult();
            o.aliasAuthorizationRuleId = aliasAuthorizationRuleId;
            o.defaultPrimaryKey = defaultPrimaryKey;
            o.defaultSecondaryKey = defaultSecondaryKey;
            o.id = id;
            o.name = name;
            o.namespaceId = namespaceId;
            o.namespaceName = namespaceName;
            o.partnerNamespaceId = partnerNamespaceId;
            o.primaryConnectionStringAlias = primaryConnectionStringAlias;
            o.resourceGroupName = resourceGroupName;
            o.secondaryConnectionStringAlias = secondaryConnectionStringAlias;
            return o;
        }
    }
}
