// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.SignalR.Inputs
{

    public sealed class ServiceSkuGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the number of units associated with this SignalR service. Valid values are `1`, `2`, `5`, `10`, `20`, `50` and `100`.
        /// </summary>
        [Input("capacity", required: true)]
        public Input<int> Capacity { get; set; } = null!;

        /// <summary>
        /// Specifies which tier to use. Valid values are `Free_F1`, `Standard_S1` and `Premium_P1`.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public ServiceSkuGetArgs()
        {
        }
        public static new ServiceSkuGetArgs Empty => new ServiceSkuGetArgs();
    }
}
