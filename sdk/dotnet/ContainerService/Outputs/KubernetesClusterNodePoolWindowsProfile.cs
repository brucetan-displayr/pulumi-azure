// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Outputs
{

    [OutputType]
    public sealed class KubernetesClusterNodePoolWindowsProfile
    {
        /// <summary>
        /// Should the Windows nodes in this Node Pool have outbound NAT enabled? Defaults to `true`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly bool? OutboundNatEnabled;

        [OutputConstructor]
        private KubernetesClusterNodePoolWindowsProfile(bool? outboundNatEnabled)
        {
            OutboundNatEnabled = outboundNatEnabled;
        }
    }
}
