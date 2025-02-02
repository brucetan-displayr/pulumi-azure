// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppDaprArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppDaprArgs Empty = new AppDaprArgs();

    /**
     * The Dapr Application Identifier.
     * 
     */
    @Import(name="appId", required=true)
    private Output<String> appId;

    /**
     * @return The Dapr Application Identifier.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }

    /**
     * The port which the application is listening on. This is the same as the `ingress` port.
     * 
     */
    @Import(name="appPort", required=true)
    private Output<Integer> appPort;

    /**
     * @return The port which the application is listening on. This is the same as the `ingress` port.
     * 
     */
    public Output<Integer> appPort() {
        return this.appPort;
    }

    /**
     * The protocol for the app. Possible values include `http` and `grpc`. Defaults to `http`.
     * 
     */
    @Import(name="appProtocol")
    private @Nullable Output<String> appProtocol;

    /**
     * @return The protocol for the app. Possible values include `http` and `grpc`. Defaults to `http`.
     * 
     */
    public Optional<Output<String>> appProtocol() {
        return Optional.ofNullable(this.appProtocol);
    }

    private AppDaprArgs() {}

    private AppDaprArgs(AppDaprArgs $) {
        this.appId = $.appId;
        this.appPort = $.appPort;
        this.appProtocol = $.appProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppDaprArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppDaprArgs $;

        public Builder() {
            $ = new AppDaprArgs();
        }

        public Builder(AppDaprArgs defaults) {
            $ = new AppDaprArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The Dapr Application Identifier.
         * 
         * @return builder
         * 
         */
        public Builder appId(Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The Dapr Application Identifier.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param appPort The port which the application is listening on. This is the same as the `ingress` port.
         * 
         * @return builder
         * 
         */
        public Builder appPort(Output<Integer> appPort) {
            $.appPort = appPort;
            return this;
        }

        /**
         * @param appPort The port which the application is listening on. This is the same as the `ingress` port.
         * 
         * @return builder
         * 
         */
        public Builder appPort(Integer appPort) {
            return appPort(Output.of(appPort));
        }

        /**
         * @param appProtocol The protocol for the app. Possible values include `http` and `grpc`. Defaults to `http`.
         * 
         * @return builder
         * 
         */
        public Builder appProtocol(@Nullable Output<String> appProtocol) {
            $.appProtocol = appProtocol;
            return this;
        }

        /**
         * @param appProtocol The protocol for the app. Possible values include `http` and `grpc`. Defaults to `http`.
         * 
         * @return builder
         * 
         */
        public Builder appProtocol(String appProtocol) {
            return appProtocol(Output.of(appProtocol));
        }

        public AppDaprArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            $.appPort = Objects.requireNonNull($.appPort, "expected parameter 'appPort' to be non-null");
            return $;
        }
    }

}
