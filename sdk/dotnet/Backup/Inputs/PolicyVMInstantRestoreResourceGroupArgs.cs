// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Backup.Inputs
{

    public sealed class PolicyVMInstantRestoreResourceGroupArgs : global::Pulumi.ResourceArgs
    {
        [Input("prefix", required: true)]
        public Input<string> Prefix { get; set; } = null!;

        [Input("suffix")]
        public Input<string>? Suffix { get; set; }

        public PolicyVMInstantRestoreResourceGroupArgs()
        {
        }
        public static new PolicyVMInstantRestoreResourceGroupArgs Empty => new PolicyVMInstantRestoreResourceGroupArgs();
    }
}
