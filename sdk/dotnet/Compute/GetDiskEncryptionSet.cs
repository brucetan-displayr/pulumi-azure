// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute
{
    public static class GetDiskEncryptionSet
    {
        /// <summary>
        /// Use this data source to access information about an existing Disk Encryption Set.
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
        ///     var existing = Azure.Compute.GetDiskEncryptionSet.Invoke(new()
        ///     {
        ///         Name = "example-des",
        ///         ResourceGroupName = "example-resources",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = existing.Apply(getDiskEncryptionSetResult =&gt; getDiskEncryptionSetResult.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDiskEncryptionSetResult> InvokeAsync(GetDiskEncryptionSetArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDiskEncryptionSetResult>("azure:compute/getDiskEncryptionSet:getDiskEncryptionSet", args ?? new GetDiskEncryptionSetArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Disk Encryption Set.
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
        ///     var existing = Azure.Compute.GetDiskEncryptionSet.Invoke(new()
        ///     {
        ///         Name = "example-des",
        ///         ResourceGroupName = "example-resources",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = existing.Apply(getDiskEncryptionSetResult =&gt; getDiskEncryptionSetResult.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDiskEncryptionSetResult> Invoke(GetDiskEncryptionSetInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDiskEncryptionSetResult>("azure:compute/getDiskEncryptionSet:getDiskEncryptionSet", args ?? new GetDiskEncryptionSetInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDiskEncryptionSetArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Disk Encryption Set exists.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Disk Encryption Set exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetDiskEncryptionSetArgs()
        {
        }
        public static new GetDiskEncryptionSetArgs Empty => new GetDiskEncryptionSetArgs();
    }

    public sealed class GetDiskEncryptionSetInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Disk Encryption Set exists.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Disk Encryption Set exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetDiskEncryptionSetInvokeArgs()
        {
        }
        public static new GetDiskEncryptionSetInvokeArgs Empty => new GetDiskEncryptionSetInvokeArgs();
    }


    [OutputType]
    public sealed class GetDiskEncryptionSetResult
    {
        /// <summary>
        /// Is the Azure Disk Encryption Set Key automatically rotated to latest version?
        /// </summary>
        public readonly bool AutoKeyRotationEnabled;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The location where the Disk Encryption Set exists.
        /// </summary>
        public readonly string Location;
        public readonly string Name;
        public readonly string ResourceGroupName;
        /// <summary>
        /// A mapping of tags assigned to the Disk Encryption Set.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetDiskEncryptionSetResult(
            bool autoKeyRotationEnabled,

            string id,

            string location,

            string name,

            string resourceGroupName,

            ImmutableDictionary<string, string> tags)
        {
            AutoKeyRotationEnabled = autoKeyRotationEnabled;
            Id = id;
            Location = location;
            Name = name;
            ResourceGroupName = resourceGroupName;
            Tags = tags;
        }
    }
}
