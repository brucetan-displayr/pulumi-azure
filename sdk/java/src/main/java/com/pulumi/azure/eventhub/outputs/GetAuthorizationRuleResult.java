// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAuthorizationRuleResult {
    private String eventhubName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable Boolean listen;
    private @Nullable Boolean manage;
    private String name;
    private String namespaceName;
    /**
     * @return The Primary Connection String for the Event Hubs Authorization Rule.
     * 
     */
    private String primaryConnectionString;
    /**
     * @return The alias of the Primary Connection String for the Event Hubs Authorization Rule.
     * 
     */
    private String primaryConnectionStringAlias;
    /**
     * @return The Primary Key for the Event Hubs Authorization Rule.
     * 
     */
    private String primaryKey;
    private String resourceGroupName;
    /**
     * @return The Secondary Connection String for the Event Hubs Authorization Rule.
     * 
     */
    private String secondaryConnectionString;
    /**
     * @return The alias of the Secondary Connection String for the Event Hubs Authorization Rule.
     * 
     */
    private String secondaryConnectionStringAlias;
    /**
     * @return The Secondary Key for the Event Hubs Authorization Rule.
     * 
     */
    private String secondaryKey;
    private @Nullable Boolean send;

    private GetAuthorizationRuleResult() {}
    public String eventhubName() {
        return this.eventhubName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<Boolean> listen() {
        return Optional.ofNullable(this.listen);
    }
    public Optional<Boolean> manage() {
        return Optional.ofNullable(this.manage);
    }
    public String name() {
        return this.name;
    }
    public String namespaceName() {
        return this.namespaceName;
    }
    /**
     * @return The Primary Connection String for the Event Hubs Authorization Rule.
     * 
     */
    public String primaryConnectionString() {
        return this.primaryConnectionString;
    }
    /**
     * @return The alias of the Primary Connection String for the Event Hubs Authorization Rule.
     * 
     */
    public String primaryConnectionStringAlias() {
        return this.primaryConnectionStringAlias;
    }
    /**
     * @return The Primary Key for the Event Hubs Authorization Rule.
     * 
     */
    public String primaryKey() {
        return this.primaryKey;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The Secondary Connection String for the Event Hubs Authorization Rule.
     * 
     */
    public String secondaryConnectionString() {
        return this.secondaryConnectionString;
    }
    /**
     * @return The alias of the Secondary Connection String for the Event Hubs Authorization Rule.
     * 
     */
    public String secondaryConnectionStringAlias() {
        return this.secondaryConnectionStringAlias;
    }
    /**
     * @return The Secondary Key for the Event Hubs Authorization Rule.
     * 
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }
    public Optional<Boolean> send() {
        return Optional.ofNullable(this.send);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthorizationRuleResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String eventhubName;
        private String id;
        private @Nullable Boolean listen;
        private @Nullable Boolean manage;
        private String name;
        private String namespaceName;
        private String primaryConnectionString;
        private String primaryConnectionStringAlias;
        private String primaryKey;
        private String resourceGroupName;
        private String secondaryConnectionString;
        private String secondaryConnectionStringAlias;
        private String secondaryKey;
        private @Nullable Boolean send;
        public Builder() {}
        public Builder(GetAuthorizationRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventhubName = defaults.eventhubName;
    	      this.id = defaults.id;
    	      this.listen = defaults.listen;
    	      this.manage = defaults.manage;
    	      this.name = defaults.name;
    	      this.namespaceName = defaults.namespaceName;
    	      this.primaryConnectionString = defaults.primaryConnectionString;
    	      this.primaryConnectionStringAlias = defaults.primaryConnectionStringAlias;
    	      this.primaryKey = defaults.primaryKey;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secondaryConnectionString = defaults.secondaryConnectionString;
    	      this.secondaryConnectionStringAlias = defaults.secondaryConnectionStringAlias;
    	      this.secondaryKey = defaults.secondaryKey;
    	      this.send = defaults.send;
        }

        @CustomType.Setter
        public Builder eventhubName(String eventhubName) {
            this.eventhubName = Objects.requireNonNull(eventhubName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder listen(@Nullable Boolean listen) {
            this.listen = listen;
            return this;
        }
        @CustomType.Setter
        public Builder manage(@Nullable Boolean manage) {
            this.manage = manage;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }
        @CustomType.Setter
        public Builder primaryConnectionString(String primaryConnectionString) {
            this.primaryConnectionString = Objects.requireNonNull(primaryConnectionString);
            return this;
        }
        @CustomType.Setter
        public Builder primaryConnectionStringAlias(String primaryConnectionStringAlias) {
            this.primaryConnectionStringAlias = Objects.requireNonNull(primaryConnectionStringAlias);
            return this;
        }
        @CustomType.Setter
        public Builder primaryKey(String primaryKey) {
            this.primaryKey = Objects.requireNonNull(primaryKey);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder secondaryConnectionString(String secondaryConnectionString) {
            this.secondaryConnectionString = Objects.requireNonNull(secondaryConnectionString);
            return this;
        }
        @CustomType.Setter
        public Builder secondaryConnectionStringAlias(String secondaryConnectionStringAlias) {
            this.secondaryConnectionStringAlias = Objects.requireNonNull(secondaryConnectionStringAlias);
            return this;
        }
        @CustomType.Setter
        public Builder secondaryKey(String secondaryKey) {
            this.secondaryKey = Objects.requireNonNull(secondaryKey);
            return this;
        }
        @CustomType.Setter
        public Builder send(@Nullable Boolean send) {
            this.send = send;
            return this;
        }
        public GetAuthorizationRuleResult build() {
            final var o = new GetAuthorizationRuleResult();
            o.eventhubName = eventhubName;
            o.id = id;
            o.listen = listen;
            o.manage = manage;
            o.name = name;
            o.namespaceName = namespaceName;
            o.primaryConnectionString = primaryConnectionString;
            o.primaryConnectionStringAlias = primaryConnectionStringAlias;
            o.primaryKey = primaryKey;
            o.resourceGroupName = resourceGroupName;
            o.secondaryConnectionString = secondaryConnectionString;
            o.secondaryConnectionStringAlias = secondaryConnectionStringAlias;
            o.secondaryKey = secondaryKey;
            o.send = send;
            return o;
        }
    }
}
