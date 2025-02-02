// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class KubernetesClusterDefaultNodePoolUpgradeSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The maximum number or percentage of nodes which will be added to the Node Pool size during an upgrade.
        /// </summary>
        [Input("maxSurge", required: true)]
        public Input<string> MaxSurge { get; set; } = null!;

        public KubernetesClusterDefaultNodePoolUpgradeSettingsArgs()
        {
        }
        public static new KubernetesClusterDefaultNodePoolUpgradeSettingsArgs Empty => new KubernetesClusterDefaultNodePoolUpgradeSettingsArgs();
    }
}
