// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network
{
    public static class GetApplicationGateway
    {
        /// <summary>
        /// Use this data source to access information about an existing Application Gateway.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.Network.GetApplicationGateway.Invoke(new()
        ///     {
        ///         Name = "existing-app-gateway",
        ///         ResourceGroupName = "existing-resources",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getApplicationGatewayResult =&gt; getApplicationGatewayResult.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetApplicationGatewayResult> InvokeAsync(GetApplicationGatewayArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetApplicationGatewayResult>("azure:network/getApplicationGateway:getApplicationGateway", args ?? new GetApplicationGatewayArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Application Gateway.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.Network.GetApplicationGateway.Invoke(new()
        ///     {
        ///         Name = "existing-app-gateway",
        ///         ResourceGroupName = "existing-resources",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getApplicationGatewayResult =&gt; getApplicationGatewayResult.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetApplicationGatewayResult> Invoke(GetApplicationGatewayInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplicationGatewayResult>("azure:network/getApplicationGateway:getApplicationGateway", args ?? new GetApplicationGatewayInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetApplicationGatewayArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of this Application Gateway.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Application Gateway exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetApplicationGatewayArgs()
        {
        }
        public static new GetApplicationGatewayArgs Empty => new GetApplicationGatewayArgs();
    }

    public sealed class GetApplicationGatewayInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of this Application Gateway.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Application Gateway exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetApplicationGatewayInvokeArgs()
        {
        }
        public static new GetApplicationGatewayInvokeArgs Empty => new GetApplicationGatewayInvokeArgs();
    }


    [OutputType]
    public sealed class GetApplicationGatewayResult
    {
        /// <summary>
        /// A `backend_address_pool` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetApplicationGatewayBackendAddressPoolResult> BackendAddressPools;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A `identity` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetApplicationGatewayIdentityResult> Identities;
        /// <summary>
        /// The Azure Region where the Application Gateway exists.
        /// </summary>
        public readonly string Location;
        /// <summary>
        /// The name of the Backend Address Pool.
        /// </summary>
        public readonly string Name;
        public readonly string ResourceGroupName;
        /// <summary>
        /// A mapping of tags assigned to the Application Gateway.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetApplicationGatewayResult(
            ImmutableArray<Outputs.GetApplicationGatewayBackendAddressPoolResult> backendAddressPools,

            string id,

            ImmutableArray<Outputs.GetApplicationGatewayIdentityResult> identities,

            string location,

            string name,

            string resourceGroupName,

            ImmutableDictionary<string, string> tags)
        {
            BackendAddressPools = backendAddressPools;
            Id = id;
            Identities = identities;
            Location = location;
            Name = name;
            ResourceGroupName = resourceGroupName;
            Tags = tags;
        }
    }
}
