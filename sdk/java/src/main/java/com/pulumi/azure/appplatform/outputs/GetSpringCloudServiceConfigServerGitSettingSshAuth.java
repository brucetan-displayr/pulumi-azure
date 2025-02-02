// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSpringCloudServiceConfigServerGitSettingSshAuth {
    /**
     * @return The host key of the Git repository server.
     * 
     */
    private String hostKey;
    /**
     * @return The host key algorithm.
     * 
     */
    private String hostKeyAlgorithm;
    /**
     * @return The SSH private key to access the Git repository, needed when the URI starts with `git@` or `ssh://`.
     * 
     */
    private String privateKey;
    /**
     * @return Indicates whether the Config Server instance will fail to start if the host_key does not match.
     * 
     */
    private Boolean strictHostKeyCheckingEnabled;

    private GetSpringCloudServiceConfigServerGitSettingSshAuth() {}
    /**
     * @return The host key of the Git repository server.
     * 
     */
    public String hostKey() {
        return this.hostKey;
    }
    /**
     * @return The host key algorithm.
     * 
     */
    public String hostKeyAlgorithm() {
        return this.hostKeyAlgorithm;
    }
    /**
     * @return The SSH private key to access the Git repository, needed when the URI starts with `git@` or `ssh://`.
     * 
     */
    public String privateKey() {
        return this.privateKey;
    }
    /**
     * @return Indicates whether the Config Server instance will fail to start if the host_key does not match.
     * 
     */
    public Boolean strictHostKeyCheckingEnabled() {
        return this.strictHostKeyCheckingEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSpringCloudServiceConfigServerGitSettingSshAuth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String hostKey;
        private String hostKeyAlgorithm;
        private String privateKey;
        private Boolean strictHostKeyCheckingEnabled;
        public Builder() {}
        public Builder(GetSpringCloudServiceConfigServerGitSettingSshAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostKey = defaults.hostKey;
    	      this.hostKeyAlgorithm = defaults.hostKeyAlgorithm;
    	      this.privateKey = defaults.privateKey;
    	      this.strictHostKeyCheckingEnabled = defaults.strictHostKeyCheckingEnabled;
        }

        @CustomType.Setter
        public Builder hostKey(String hostKey) {
            this.hostKey = Objects.requireNonNull(hostKey);
            return this;
        }
        @CustomType.Setter
        public Builder hostKeyAlgorithm(String hostKeyAlgorithm) {
            this.hostKeyAlgorithm = Objects.requireNonNull(hostKeyAlgorithm);
            return this;
        }
        @CustomType.Setter
        public Builder privateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }
        @CustomType.Setter
        public Builder strictHostKeyCheckingEnabled(Boolean strictHostKeyCheckingEnabled) {
            this.strictHostKeyCheckingEnabled = Objects.requireNonNull(strictHostKeyCheckingEnabled);
            return this;
        }
        public GetSpringCloudServiceConfigServerGitSettingSshAuth build() {
            final var o = new GetSpringCloudServiceConfigServerGitSettingSshAuth();
            o.hostKey = hostKey;
            o.hostKeyAlgorithm = hostKeyAlgorithm;
            o.privateKey = privateKey;
            o.strictHostKeyCheckingEnabled = strictHostKeyCheckingEnabled;
            return o;
        }
    }
}
