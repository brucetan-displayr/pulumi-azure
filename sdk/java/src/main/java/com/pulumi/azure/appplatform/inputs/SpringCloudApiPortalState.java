// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.inputs;

import com.pulumi.azure.appplatform.inputs.SpringCloudApiPortalSsoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpringCloudApiPortalState extends com.pulumi.resources.ResourceArgs {

    public static final SpringCloudApiPortalState Empty = new SpringCloudApiPortalState();

    /**
     * Specifies a list of Spring Cloud Gateway.
     * 
     */
    @Import(name="gatewayIds")
    private @Nullable Output<List<String>> gatewayIds;

    /**
     * @return Specifies a list of Spring Cloud Gateway.
     * 
     */
    public Optional<Output<List<String>>> gatewayIds() {
        return Optional.ofNullable(this.gatewayIds);
    }

    /**
     * is only https is allowed?
     * 
     */
    @Import(name="httpsOnlyEnabled")
    private @Nullable Output<Boolean> httpsOnlyEnabled;

    /**
     * @return is only https is allowed?
     * 
     */
    public Optional<Output<Boolean>> httpsOnlyEnabled() {
        return Optional.ofNullable(this.httpsOnlyEnabled);
    }

    /**
     * Specifies the required instance count of the Spring Cloud API Portal. Possible Values are between `1` and `500`. Defaults to `1` if not specified.
     * 
     */
    @Import(name="instanceCount")
    private @Nullable Output<Integer> instanceCount;

    /**
     * @return Specifies the required instance count of the Spring Cloud API Portal. Possible Values are between `1` and `500`. Defaults to `1` if not specified.
     * 
     */
    public Optional<Output<Integer>> instanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }

    /**
     * The name which should be used for this Spring Cloud API Portal. Changing this forces a new Spring Cloud API Portal to be created. The only possible value is `default`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Spring Cloud API Portal. Changing this forces a new Spring Cloud API Portal to be created. The only possible value is `default`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Is the public network access enabled?
     * 
     */
    @Import(name="publicNetworkAccessEnabled")
    private @Nullable Output<Boolean> publicNetworkAccessEnabled;

    /**
     * @return Is the public network access enabled?
     * 
     */
    public Optional<Output<Boolean>> publicNetworkAccessEnabled() {
        return Optional.ofNullable(this.publicNetworkAccessEnabled);
    }

    /**
     * The ID of the Spring Cloud Service. Changing this forces a new Spring Cloud API Portal to be created.
     * 
     */
    @Import(name="springCloudServiceId")
    private @Nullable Output<String> springCloudServiceId;

    /**
     * @return The ID of the Spring Cloud Service. Changing this forces a new Spring Cloud API Portal to be created.
     * 
     */
    public Optional<Output<String>> springCloudServiceId() {
        return Optional.ofNullable(this.springCloudServiceId);
    }

    /**
     * A `sso` block as defined below.
     * 
     */
    @Import(name="sso")
    private @Nullable Output<SpringCloudApiPortalSsoArgs> sso;

    /**
     * @return A `sso` block as defined below.
     * 
     */
    public Optional<Output<SpringCloudApiPortalSsoArgs>> sso() {
        return Optional.ofNullable(this.sso);
    }

    /**
     * TODO.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return TODO.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private SpringCloudApiPortalState() {}

    private SpringCloudApiPortalState(SpringCloudApiPortalState $) {
        this.gatewayIds = $.gatewayIds;
        this.httpsOnlyEnabled = $.httpsOnlyEnabled;
        this.instanceCount = $.instanceCount;
        this.name = $.name;
        this.publicNetworkAccessEnabled = $.publicNetworkAccessEnabled;
        this.springCloudServiceId = $.springCloudServiceId;
        this.sso = $.sso;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpringCloudApiPortalState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpringCloudApiPortalState $;

        public Builder() {
            $ = new SpringCloudApiPortalState();
        }

        public Builder(SpringCloudApiPortalState defaults) {
            $ = new SpringCloudApiPortalState(Objects.requireNonNull(defaults));
        }

        /**
         * @param gatewayIds Specifies a list of Spring Cloud Gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayIds(@Nullable Output<List<String>> gatewayIds) {
            $.gatewayIds = gatewayIds;
            return this;
        }

        /**
         * @param gatewayIds Specifies a list of Spring Cloud Gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayIds(List<String> gatewayIds) {
            return gatewayIds(Output.of(gatewayIds));
        }

        /**
         * @param gatewayIds Specifies a list of Spring Cloud Gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayIds(String... gatewayIds) {
            return gatewayIds(List.of(gatewayIds));
        }

        /**
         * @param httpsOnlyEnabled is only https is allowed?
         * 
         * @return builder
         * 
         */
        public Builder httpsOnlyEnabled(@Nullable Output<Boolean> httpsOnlyEnabled) {
            $.httpsOnlyEnabled = httpsOnlyEnabled;
            return this;
        }

        /**
         * @param httpsOnlyEnabled is only https is allowed?
         * 
         * @return builder
         * 
         */
        public Builder httpsOnlyEnabled(Boolean httpsOnlyEnabled) {
            return httpsOnlyEnabled(Output.of(httpsOnlyEnabled));
        }

        /**
         * @param instanceCount Specifies the required instance count of the Spring Cloud API Portal. Possible Values are between `1` and `500`. Defaults to `1` if not specified.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(@Nullable Output<Integer> instanceCount) {
            $.instanceCount = instanceCount;
            return this;
        }

        /**
         * @param instanceCount Specifies the required instance count of the Spring Cloud API Portal. Possible Values are between `1` and `500`. Defaults to `1` if not specified.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(Integer instanceCount) {
            return instanceCount(Output.of(instanceCount));
        }

        /**
         * @param name The name which should be used for this Spring Cloud API Portal. Changing this forces a new Spring Cloud API Portal to be created. The only possible value is `default`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Spring Cloud API Portal. Changing this forces a new Spring Cloud API Portal to be created. The only possible value is `default`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param publicNetworkAccessEnabled Is the public network access enabled?
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessEnabled(@Nullable Output<Boolean> publicNetworkAccessEnabled) {
            $.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            return this;
        }

        /**
         * @param publicNetworkAccessEnabled Is the public network access enabled?
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessEnabled(Boolean publicNetworkAccessEnabled) {
            return publicNetworkAccessEnabled(Output.of(publicNetworkAccessEnabled));
        }

        /**
         * @param springCloudServiceId The ID of the Spring Cloud Service. Changing this forces a new Spring Cloud API Portal to be created.
         * 
         * @return builder
         * 
         */
        public Builder springCloudServiceId(@Nullable Output<String> springCloudServiceId) {
            $.springCloudServiceId = springCloudServiceId;
            return this;
        }

        /**
         * @param springCloudServiceId The ID of the Spring Cloud Service. Changing this forces a new Spring Cloud API Portal to be created.
         * 
         * @return builder
         * 
         */
        public Builder springCloudServiceId(String springCloudServiceId) {
            return springCloudServiceId(Output.of(springCloudServiceId));
        }

        /**
         * @param sso A `sso` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder sso(@Nullable Output<SpringCloudApiPortalSsoArgs> sso) {
            $.sso = sso;
            return this;
        }

        /**
         * @param sso A `sso` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder sso(SpringCloudApiPortalSsoArgs sso) {
            return sso(Output.of(sso));
        }

        /**
         * @param url TODO.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url TODO.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public SpringCloudApiPortalState build() {
            return $;
        }
    }

}
