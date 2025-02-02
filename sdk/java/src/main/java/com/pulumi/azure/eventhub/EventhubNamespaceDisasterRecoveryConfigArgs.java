// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventhubNamespaceDisasterRecoveryConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventhubNamespaceDisasterRecoveryConfigArgs Empty = new EventhubNamespaceDisasterRecoveryConfigArgs();

    /**
     * Specifies the name of the Disaster Recovery Config. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Disaster Recovery Config. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the name of the primary EventHub Namespace to replicate. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="namespaceName", required=true)
    private Output<String> namespaceName;

    /**
     * @return Specifies the name of the primary EventHub Namespace to replicate. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * The ID of the EventHub Namespace to replicate to.
     * 
     */
    @Import(name="partnerNamespaceId", required=true)
    private Output<String> partnerNamespaceId;

    /**
     * @return The ID of the EventHub Namespace to replicate to.
     * 
     */
    public Output<String> partnerNamespaceId() {
        return this.partnerNamespaceId;
    }

    /**
     * The name of the resource group in which the Disaster Recovery Config exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Disaster Recovery Config exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private EventhubNamespaceDisasterRecoveryConfigArgs() {}

    private EventhubNamespaceDisasterRecoveryConfigArgs(EventhubNamespaceDisasterRecoveryConfigArgs $) {
        this.name = $.name;
        this.namespaceName = $.namespaceName;
        this.partnerNamespaceId = $.partnerNamespaceId;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventhubNamespaceDisasterRecoveryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventhubNamespaceDisasterRecoveryConfigArgs $;

        public Builder() {
            $ = new EventhubNamespaceDisasterRecoveryConfigArgs();
        }

        public Builder(EventhubNamespaceDisasterRecoveryConfigArgs defaults) {
            $ = new EventhubNamespaceDisasterRecoveryConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the Disaster Recovery Config. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Disaster Recovery Config. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceName Specifies the name of the primary EventHub Namespace to replicate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName Specifies the name of the primary EventHub Namespace to replicate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param partnerNamespaceId The ID of the EventHub Namespace to replicate to.
         * 
         * @return builder
         * 
         */
        public Builder partnerNamespaceId(Output<String> partnerNamespaceId) {
            $.partnerNamespaceId = partnerNamespaceId;
            return this;
        }

        /**
         * @param partnerNamespaceId The ID of the EventHub Namespace to replicate to.
         * 
         * @return builder
         * 
         */
        public Builder partnerNamespaceId(String partnerNamespaceId) {
            return partnerNamespaceId(Output.of(partnerNamespaceId));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Disaster Recovery Config exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Disaster Recovery Config exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public EventhubNamespaceDisasterRecoveryConfigArgs build() {
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.partnerNamespaceId = Objects.requireNonNull($.partnerNamespaceId, "expected parameter 'partnerNamespaceId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
