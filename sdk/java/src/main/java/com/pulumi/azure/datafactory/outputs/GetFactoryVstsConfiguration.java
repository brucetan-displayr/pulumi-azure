// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFactoryVstsConfiguration {
    /**
     * @return The VSTS account name.
     * 
     */
    private String accountName;
    /**
     * @return The branch of the repository to get code from.
     * 
     */
    private String branchName;
    /**
     * @return The name of the VSTS project.
     * 
     */
    private String projectName;
    /**
     * @return The name of the git repository.
     * 
     */
    private String repositoryName;
    /**
     * @return The root folder within the repository.
     * 
     */
    private String rootFolder;
    /**
     * @return The Tenant ID associated with the VSTS account.
     * 
     */
    private String tenantId;

    private GetFactoryVstsConfiguration() {}
    /**
     * @return The VSTS account name.
     * 
     */
    public String accountName() {
        return this.accountName;
    }
    /**
     * @return The branch of the repository to get code from.
     * 
     */
    public String branchName() {
        return this.branchName;
    }
    /**
     * @return The name of the VSTS project.
     * 
     */
    public String projectName() {
        return this.projectName;
    }
    /**
     * @return The name of the git repository.
     * 
     */
    public String repositoryName() {
        return this.repositoryName;
    }
    /**
     * @return The root folder within the repository.
     * 
     */
    public String rootFolder() {
        return this.rootFolder;
    }
    /**
     * @return The Tenant ID associated with the VSTS account.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFactoryVstsConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountName;
        private String branchName;
        private String projectName;
        private String repositoryName;
        private String rootFolder;
        private String tenantId;
        public Builder() {}
        public Builder(GetFactoryVstsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.branchName = defaults.branchName;
    	      this.projectName = defaults.projectName;
    	      this.repositoryName = defaults.repositoryName;
    	      this.rootFolder = defaults.rootFolder;
    	      this.tenantId = defaults.tenantId;
        }

        @CustomType.Setter
        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        @CustomType.Setter
        public Builder branchName(String branchName) {
            this.branchName = Objects.requireNonNull(branchName);
            return this;
        }
        @CustomType.Setter
        public Builder projectName(String projectName) {
            this.projectName = Objects.requireNonNull(projectName);
            return this;
        }
        @CustomType.Setter
        public Builder repositoryName(String repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }
        @CustomType.Setter
        public Builder rootFolder(String rootFolder) {
            this.rootFolder = Objects.requireNonNull(rootFolder);
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public GetFactoryVstsConfiguration build() {
            final var o = new GetFactoryVstsConfiguration();
            o.accountName = accountName;
            o.branchName = branchName;
            o.projectName = projectName;
            o.repositoryName = repositoryName;
            o.rootFolder = rootFolder;
            o.tenantId = tenantId;
            return o;
        }
    }
}
