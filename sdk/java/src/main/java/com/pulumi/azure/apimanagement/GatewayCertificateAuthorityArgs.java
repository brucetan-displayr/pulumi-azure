// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayCertificateAuthorityArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayCertificateAuthorityArgs Empty = new GatewayCertificateAuthorityArgs();

    /**
     * The ID of the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="apiManagementId", required=true)
    private Output<String> apiManagementId;

    /**
     * @return The ID of the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> apiManagementId() {
        return this.apiManagementId;
    }

    /**
     * The name of the API Management Certificate. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="certificateName", required=true)
    private Output<String> certificateName;

    /**
     * @return The name of the API Management Certificate. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> certificateName() {
        return this.certificateName;
    }

    /**
     * The name of the API Management Gateway. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="gatewayName", required=true)
    private Output<String> gatewayName;

    /**
     * @return The name of the API Management Gateway. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> gatewayName() {
        return this.gatewayName;
    }

    /**
     * Whether the API Management Gateway Certificate Authority is trusted.
     * 
     */
    @Import(name="isTrusted")
    private @Nullable Output<Boolean> isTrusted;

    /**
     * @return Whether the API Management Gateway Certificate Authority is trusted.
     * 
     */
    public Optional<Output<Boolean>> isTrusted() {
        return Optional.ofNullable(this.isTrusted);
    }

    private GatewayCertificateAuthorityArgs() {}

    private GatewayCertificateAuthorityArgs(GatewayCertificateAuthorityArgs $) {
        this.apiManagementId = $.apiManagementId;
        this.certificateName = $.certificateName;
        this.gatewayName = $.gatewayName;
        this.isTrusted = $.isTrusted;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayCertificateAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayCertificateAuthorityArgs $;

        public Builder() {
            $ = new GatewayCertificateAuthorityArgs();
        }

        public Builder(GatewayCertificateAuthorityArgs defaults) {
            $ = new GatewayCertificateAuthorityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiManagementId The ID of the API Management Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementId(Output<String> apiManagementId) {
            $.apiManagementId = apiManagementId;
            return this;
        }

        /**
         * @param apiManagementId The ID of the API Management Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementId(String apiManagementId) {
            return apiManagementId(Output.of(apiManagementId));
        }

        /**
         * @param certificateName The name of the API Management Certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder certificateName(Output<String> certificateName) {
            $.certificateName = certificateName;
            return this;
        }

        /**
         * @param certificateName The name of the API Management Certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder certificateName(String certificateName) {
            return certificateName(Output.of(certificateName));
        }

        /**
         * @param gatewayName The name of the API Management Gateway. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder gatewayName(Output<String> gatewayName) {
            $.gatewayName = gatewayName;
            return this;
        }

        /**
         * @param gatewayName The name of the API Management Gateway. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder gatewayName(String gatewayName) {
            return gatewayName(Output.of(gatewayName));
        }

        /**
         * @param isTrusted Whether the API Management Gateway Certificate Authority is trusted.
         * 
         * @return builder
         * 
         */
        public Builder isTrusted(@Nullable Output<Boolean> isTrusted) {
            $.isTrusted = isTrusted;
            return this;
        }

        /**
         * @param isTrusted Whether the API Management Gateway Certificate Authority is trusted.
         * 
         * @return builder
         * 
         */
        public Builder isTrusted(Boolean isTrusted) {
            return isTrusted(Output.of(isTrusted));
        }

        public GatewayCertificateAuthorityArgs build() {
            $.apiManagementId = Objects.requireNonNull($.apiManagementId, "expected parameter 'apiManagementId' to be non-null");
            $.certificateName = Objects.requireNonNull($.certificateName, "expected parameter 'certificateName' to be non-null");
            $.gatewayName = Objects.requireNonNull($.gatewayName, "expected parameter 'gatewayName' to be non-null");
            return $;
        }
    }

}
