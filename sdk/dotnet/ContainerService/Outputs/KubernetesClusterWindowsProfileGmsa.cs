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
    public sealed class KubernetesClusterWindowsProfileGmsa
    {
        /// <summary>
        /// Specifies the DNS server for Windows gMSA. Set this to an empty string if you have configured the DNS server in the VNet which was used to create the managed cluster.
        /// </summary>
        public readonly string DnsServer;
        /// <summary>
        /// Specifies the root domain name for Windows gMSA. Set this to an empty string if you have configured the DNS server in the VNet which was used to create the managed cluster.
        /// </summary>
        public readonly string RootDomain;

        [OutputConstructor]
        private KubernetesClusterWindowsProfileGmsa(
            string dnsServer,

            string rootDomain)
        {
            DnsServer = dnsServer;
            RootDomain = rootDomain;
        }
    }
}
