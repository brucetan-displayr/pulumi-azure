// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesClusterNodePoolNodeNetworkProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesClusterNodePoolNodeNetworkProfileArgs Empty = new KubernetesClusterNodePoolNodeNetworkProfileArgs();

    /**
     * Specifies a mapping of tags to the instance-level public IPs. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="nodePublicIpTags")
    private @Nullable Output<Map<String,String>> nodePublicIpTags;

    /**
     * @return Specifies a mapping of tags to the instance-level public IPs. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Map<String,String>>> nodePublicIpTags() {
        return Optional.ofNullable(this.nodePublicIpTags);
    }

    private KubernetesClusterNodePoolNodeNetworkProfileArgs() {}

    private KubernetesClusterNodePoolNodeNetworkProfileArgs(KubernetesClusterNodePoolNodeNetworkProfileArgs $) {
        this.nodePublicIpTags = $.nodePublicIpTags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterNodePoolNodeNetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterNodePoolNodeNetworkProfileArgs $;

        public Builder() {
            $ = new KubernetesClusterNodePoolNodeNetworkProfileArgs();
        }

        public Builder(KubernetesClusterNodePoolNodeNetworkProfileArgs defaults) {
            $ = new KubernetesClusterNodePoolNodeNetworkProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodePublicIpTags Specifies a mapping of tags to the instance-level public IPs. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder nodePublicIpTags(@Nullable Output<Map<String,String>> nodePublicIpTags) {
            $.nodePublicIpTags = nodePublicIpTags;
            return this;
        }

        /**
         * @param nodePublicIpTags Specifies a mapping of tags to the instance-level public IPs. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder nodePublicIpTags(Map<String,String> nodePublicIpTags) {
            return nodePublicIpTags(Output.of(nodePublicIpTags));
        }

        public KubernetesClusterNodePoolNodeNetworkProfileArgs build() {
            return $;
        }
    }

}
