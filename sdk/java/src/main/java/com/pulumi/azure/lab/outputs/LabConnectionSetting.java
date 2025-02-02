// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lab.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LabConnectionSetting {
    /**
     * @return The enabled access level for Client Access over RDP. Possible value is `Public`.
     * 
     */
    private @Nullable String clientRdpAccess;
    /**
     * @return The enabled access level for Client Access over SSH. Possible value is `Public`.
     * 
     */
    private @Nullable String clientSshAccess;

    private LabConnectionSetting() {}
    /**
     * @return The enabled access level for Client Access over RDP. Possible value is `Public`.
     * 
     */
    public Optional<String> clientRdpAccess() {
        return Optional.ofNullable(this.clientRdpAccess);
    }
    /**
     * @return The enabled access level for Client Access over SSH. Possible value is `Public`.
     * 
     */
    public Optional<String> clientSshAccess() {
        return Optional.ofNullable(this.clientSshAccess);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabConnectionSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clientRdpAccess;
        private @Nullable String clientSshAccess;
        public Builder() {}
        public Builder(LabConnectionSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientRdpAccess = defaults.clientRdpAccess;
    	      this.clientSshAccess = defaults.clientSshAccess;
        }

        @CustomType.Setter
        public Builder clientRdpAccess(@Nullable String clientRdpAccess) {
            this.clientRdpAccess = clientRdpAccess;
            return this;
        }
        @CustomType.Setter
        public Builder clientSshAccess(@Nullable String clientSshAccess) {
            this.clientSshAccess = clientSshAccess;
            return this;
        }
        public LabConnectionSetting build() {
            final var o = new LabConnectionSetting();
            o.clientRdpAccess = clientRdpAccess;
            o.clientSshAccess = clientSshAccess;
            return o;
        }
    }
}
