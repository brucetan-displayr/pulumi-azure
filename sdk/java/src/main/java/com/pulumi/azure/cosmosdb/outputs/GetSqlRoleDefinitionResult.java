// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.outputs;

import com.pulumi.azure.cosmosdb.outputs.GetSqlRoleDefinitionPermission;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSqlRoleDefinitionResult {
    private String accountName;
    /**
     * @return A list of fully qualified scopes at or below which Role Assignments may be created using this Cosmos DB SQL Role Definition.
     * 
     */
    private List<String> assignableScopes;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The role name of the Cosmos DB SQL Role Definition.
     * 
     */
    private String name;
    /**
     * @return A `permissions` block as defined below.
     * 
     */
    private List<GetSqlRoleDefinitionPermission> permissions;
    private String resourceGroupName;
    private String roleDefinitionId;
    /**
     * @return The type of the Cosmos DB SQL Role Definition.
     * 
     */
    private String type;

    private GetSqlRoleDefinitionResult() {}
    public String accountName() {
        return this.accountName;
    }
    /**
     * @return A list of fully qualified scopes at or below which Role Assignments may be created using this Cosmos DB SQL Role Definition.
     * 
     */
    public List<String> assignableScopes() {
        return this.assignableScopes;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The role name of the Cosmos DB SQL Role Definition.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A `permissions` block as defined below.
     * 
     */
    public List<GetSqlRoleDefinitionPermission> permissions() {
        return this.permissions;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    public String roleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * @return The type of the Cosmos DB SQL Role Definition.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSqlRoleDefinitionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountName;
        private List<String> assignableScopes;
        private String id;
        private String name;
        private List<GetSqlRoleDefinitionPermission> permissions;
        private String resourceGroupName;
        private String roleDefinitionId;
        private String type;
        public Builder() {}
        public Builder(GetSqlRoleDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.assignableScopes = defaults.assignableScopes;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.permissions = defaults.permissions;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        @CustomType.Setter
        public Builder assignableScopes(List<String> assignableScopes) {
            this.assignableScopes = Objects.requireNonNull(assignableScopes);
            return this;
        }
        public Builder assignableScopes(String... assignableScopes) {
            return assignableScopes(List.of(assignableScopes));
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
        public Builder permissions(List<GetSqlRoleDefinitionPermission> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public Builder permissions(GetSqlRoleDefinitionPermission... permissions) {
            return permissions(List.of(permissions));
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder roleDefinitionId(String roleDefinitionId) {
            this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetSqlRoleDefinitionResult build() {
            final var o = new GetSqlRoleDefinitionResult();
            o.accountName = accountName;
            o.assignableScopes = assignableScopes;
            o.id = id;
            o.name = name;
            o.permissions = permissions;
            o.resourceGroupName = resourceGroupName;
            o.roleDefinitionId = roleDefinitionId;
            o.type = type;
            return o;
        }
    }
}
