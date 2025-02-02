// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lab.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePlanDefaultAutoShutdownArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePlanDefaultAutoShutdownArgs Empty = new ServicePlanDefaultAutoShutdownArgs();

    /**
     * The amount of time a VM will stay running after a user disconnects if this behavior is enabled. This value must be formatted as an ISO 8601 string.
     * 
     */
    @Import(name="disconnectDelay")
    private @Nullable Output<String> disconnectDelay;

    /**
     * @return The amount of time a VM will stay running after a user disconnects if this behavior is enabled. This value must be formatted as an ISO 8601 string.
     * 
     */
    public Optional<Output<String>> disconnectDelay() {
        return Optional.ofNullable(this.disconnectDelay);
    }

    /**
     * The amount of time a VM will idle before it is shutdown if this behavior is enabled. This value must be formatted as an ISO 8601 string.
     * 
     */
    @Import(name="idleDelay")
    private @Nullable Output<String> idleDelay;

    /**
     * @return The amount of time a VM will idle before it is shutdown if this behavior is enabled. This value must be formatted as an ISO 8601 string.
     * 
     */
    public Optional<Output<String>> idleDelay() {
        return Optional.ofNullable(this.idleDelay);
    }

    /**
     * The amount of time a VM will stay running before it is shutdown if no connection is made and this behavior is enabled. This value must be formatted as an ISO 8601 string.
     * 
     */
    @Import(name="noConnectDelay")
    private @Nullable Output<String> noConnectDelay;

    /**
     * @return The amount of time a VM will stay running before it is shutdown if no connection is made and this behavior is enabled. This value must be formatted as an ISO 8601 string.
     * 
     */
    public Optional<Output<String>> noConnectDelay() {
        return Optional.ofNullable(this.noConnectDelay);
    }

    /**
     * Will a VM get shutdown when it has idled for a period of time? Possible values are `LowUsage` and `UserAbsence`.
     * 
     */
    @Import(name="shutdownOnIdle")
    private @Nullable Output<String> shutdownOnIdle;

    /**
     * @return Will a VM get shutdown when it has idled for a period of time? Possible values are `LowUsage` and `UserAbsence`.
     * 
     */
    public Optional<Output<String>> shutdownOnIdle() {
        return Optional.ofNullable(this.shutdownOnIdle);
    }

    private ServicePlanDefaultAutoShutdownArgs() {}

    private ServicePlanDefaultAutoShutdownArgs(ServicePlanDefaultAutoShutdownArgs $) {
        this.disconnectDelay = $.disconnectDelay;
        this.idleDelay = $.idleDelay;
        this.noConnectDelay = $.noConnectDelay;
        this.shutdownOnIdle = $.shutdownOnIdle;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePlanDefaultAutoShutdownArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePlanDefaultAutoShutdownArgs $;

        public Builder() {
            $ = new ServicePlanDefaultAutoShutdownArgs();
        }

        public Builder(ServicePlanDefaultAutoShutdownArgs defaults) {
            $ = new ServicePlanDefaultAutoShutdownArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disconnectDelay The amount of time a VM will stay running after a user disconnects if this behavior is enabled. This value must be formatted as an ISO 8601 string.
         * 
         * @return builder
         * 
         */
        public Builder disconnectDelay(@Nullable Output<String> disconnectDelay) {
            $.disconnectDelay = disconnectDelay;
            return this;
        }

        /**
         * @param disconnectDelay The amount of time a VM will stay running after a user disconnects if this behavior is enabled. This value must be formatted as an ISO 8601 string.
         * 
         * @return builder
         * 
         */
        public Builder disconnectDelay(String disconnectDelay) {
            return disconnectDelay(Output.of(disconnectDelay));
        }

        /**
         * @param idleDelay The amount of time a VM will idle before it is shutdown if this behavior is enabled. This value must be formatted as an ISO 8601 string.
         * 
         * @return builder
         * 
         */
        public Builder idleDelay(@Nullable Output<String> idleDelay) {
            $.idleDelay = idleDelay;
            return this;
        }

        /**
         * @param idleDelay The amount of time a VM will idle before it is shutdown if this behavior is enabled. This value must be formatted as an ISO 8601 string.
         * 
         * @return builder
         * 
         */
        public Builder idleDelay(String idleDelay) {
            return idleDelay(Output.of(idleDelay));
        }

        /**
         * @param noConnectDelay The amount of time a VM will stay running before it is shutdown if no connection is made and this behavior is enabled. This value must be formatted as an ISO 8601 string.
         * 
         * @return builder
         * 
         */
        public Builder noConnectDelay(@Nullable Output<String> noConnectDelay) {
            $.noConnectDelay = noConnectDelay;
            return this;
        }

        /**
         * @param noConnectDelay The amount of time a VM will stay running before it is shutdown if no connection is made and this behavior is enabled. This value must be formatted as an ISO 8601 string.
         * 
         * @return builder
         * 
         */
        public Builder noConnectDelay(String noConnectDelay) {
            return noConnectDelay(Output.of(noConnectDelay));
        }

        /**
         * @param shutdownOnIdle Will a VM get shutdown when it has idled for a period of time? Possible values are `LowUsage` and `UserAbsence`.
         * 
         * @return builder
         * 
         */
        public Builder shutdownOnIdle(@Nullable Output<String> shutdownOnIdle) {
            $.shutdownOnIdle = shutdownOnIdle;
            return this;
        }

        /**
         * @param shutdownOnIdle Will a VM get shutdown when it has idled for a period of time? Possible values are `LowUsage` and `UserAbsence`.
         * 
         * @return builder
         * 
         */
        public Builder shutdownOnIdle(String shutdownOnIdle) {
            return shutdownOnIdle(Output.of(shutdownOnIdle));
        }

        public ServicePlanDefaultAutoShutdownArgs build() {
            return $;
        }
    }

}
