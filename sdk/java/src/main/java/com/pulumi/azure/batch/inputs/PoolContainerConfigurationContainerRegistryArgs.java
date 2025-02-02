// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PoolContainerConfigurationContainerRegistryArgs extends com.pulumi.resources.ResourceArgs {

    public static final PoolContainerConfigurationContainerRegistryArgs Empty = new PoolContainerConfigurationContainerRegistryArgs();

    /**
     * The password to log into the registry server. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password to log into the registry server. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The container registry URL. The default is &#34;docker.io&#34;. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="registryServer", required=true)
    private Output<String> registryServer;

    /**
     * @return The container registry URL. The default is &#34;docker.io&#34;. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> registryServer() {
        return this.registryServer;
    }

    /**
     * The reference to the user assigned identity to use to access an Azure Container Registry instead of username and password. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="userAssignedIdentityId")
    private @Nullable Output<String> userAssignedIdentityId;

    /**
     * @return The reference to the user assigned identity to use to access an Azure Container Registry instead of username and password. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> userAssignedIdentityId() {
        return Optional.ofNullable(this.userAssignedIdentityId);
    }

    /**
     * The user name to log into the registry server. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return The user name to log into the registry server. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private PoolContainerConfigurationContainerRegistryArgs() {}

    private PoolContainerConfigurationContainerRegistryArgs(PoolContainerConfigurationContainerRegistryArgs $) {
        this.password = $.password;
        this.registryServer = $.registryServer;
        this.userAssignedIdentityId = $.userAssignedIdentityId;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PoolContainerConfigurationContainerRegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PoolContainerConfigurationContainerRegistryArgs $;

        public Builder() {
            $ = new PoolContainerConfigurationContainerRegistryArgs();
        }

        public Builder(PoolContainerConfigurationContainerRegistryArgs defaults) {
            $ = new PoolContainerConfigurationContainerRegistryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password The password to log into the registry server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password to log into the registry server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param registryServer The container registry URL. The default is &#34;docker.io&#34;. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder registryServer(Output<String> registryServer) {
            $.registryServer = registryServer;
            return this;
        }

        /**
         * @param registryServer The container registry URL. The default is &#34;docker.io&#34;. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder registryServer(String registryServer) {
            return registryServer(Output.of(registryServer));
        }

        /**
         * @param userAssignedIdentityId The reference to the user assigned identity to use to access an Azure Container Registry instead of username and password. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentityId(@Nullable Output<String> userAssignedIdentityId) {
            $.userAssignedIdentityId = userAssignedIdentityId;
            return this;
        }

        /**
         * @param userAssignedIdentityId The reference to the user assigned identity to use to access an Azure Container Registry instead of username and password. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentityId(String userAssignedIdentityId) {
            return userAssignedIdentityId(Output.of(userAssignedIdentityId));
        }

        /**
         * @param userName The user name to log into the registry server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The user name to log into the registry server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public PoolContainerConfigurationContainerRegistryArgs build() {
            $.registryServer = Objects.requireNonNull($.registryServer, "expected parameter 'registryServer' to be non-null");
            return $;
        }
    }

}
