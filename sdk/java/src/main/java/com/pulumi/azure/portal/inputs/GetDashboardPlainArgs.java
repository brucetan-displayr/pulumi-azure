// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.portal.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDashboardPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDashboardPlainArgs Empty = new GetDashboardPlainArgs();

    /**
     * JSON data representing dashboard body.
     * 
     */
    @Import(name="dashboardProperties")
    private @Nullable String dashboardProperties;

    /**
     * @return JSON data representing dashboard body.
     * 
     */
    public Optional<String> dashboardProperties() {
        return Optional.ofNullable(this.dashboardProperties);
    }

    /**
     * Specifies the display name of the shared Azure Portal Dashboard.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return Specifies the display name of the shared Azure Portal Dashboard.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Specifies the name of the shared Azure Portal Dashboard.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Specifies the name of the shared Azure Portal Dashboard.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the name of the resource group the shared Azure Portal Dashboard is located in.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Specifies the name of the resource group the shared Azure Portal Dashboard is located in.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetDashboardPlainArgs() {}

    private GetDashboardPlainArgs(GetDashboardPlainArgs $) {
        this.dashboardProperties = $.dashboardProperties;
        this.displayName = $.displayName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDashboardPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDashboardPlainArgs $;

        public Builder() {
            $ = new GetDashboardPlainArgs();
        }

        public Builder(GetDashboardPlainArgs defaults) {
            $ = new GetDashboardPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dashboardProperties JSON data representing dashboard body.
         * 
         * @return builder
         * 
         */
        public Builder dashboardProperties(@Nullable String dashboardProperties) {
            $.dashboardProperties = dashboardProperties;
            return this;
        }

        /**
         * @param displayName Specifies the display name of the shared Azure Portal Dashboard.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param name Specifies the name of the shared Azure Portal Dashboard.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the resource group the shared Azure Portal Dashboard is located in.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetDashboardPlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
