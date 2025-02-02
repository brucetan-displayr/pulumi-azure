// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFrontdoorCustomDomainPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFrontdoorCustomDomainPlainArgs Empty = new GetFrontdoorCustomDomainPlainArgs();

    /**
     * The name of the Front Door Custom Domain.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Front Door Custom Domain.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the Front Door Profile which the Front Door Custom Domain is bound to.
     * 
     */
    @Import(name="profileName", required=true)
    private String profileName;

    /**
     * @return The name of the Front Door Profile which the Front Door Custom Domain is bound to.
     * 
     */
    public String profileName() {
        return this.profileName;
    }

    /**
     * The name of the Resource Group where the Front Door Profile exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Resource Group where the Front Door Profile exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetFrontdoorCustomDomainPlainArgs() {}

    private GetFrontdoorCustomDomainPlainArgs(GetFrontdoorCustomDomainPlainArgs $) {
        this.name = $.name;
        this.profileName = $.profileName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFrontdoorCustomDomainPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFrontdoorCustomDomainPlainArgs $;

        public Builder() {
            $ = new GetFrontdoorCustomDomainPlainArgs();
        }

        public Builder(GetFrontdoorCustomDomainPlainArgs defaults) {
            $ = new GetFrontdoorCustomDomainPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Front Door Custom Domain.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param profileName The name of the Front Door Profile which the Front Door Custom Domain is bound to.
         * 
         * @return builder
         * 
         */
        public Builder profileName(String profileName) {
            $.profileName = profileName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Front Door Profile exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetFrontdoorCustomDomainPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.profileName = Objects.requireNonNull($.profileName, "expected parameter 'profileName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
