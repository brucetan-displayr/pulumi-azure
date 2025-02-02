// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage
{
    public static class GetAccountSAS
    {
        /// <summary>
        /// Use this data source to obtain a Shared Access Signature (SAS Token) for an existing Storage Account.
        /// 
        /// Shared access signatures allow fine-grained, ephemeral access control to various aspects of an Azure Storage Account.
        /// 
        /// Note that this is an [Account SAS](https://docs.microsoft.com/rest/api/storageservices/constructing-an-account-sas)
        /// and *not* a [Service SAS](https://docs.microsoft.com/rest/api/storageservices/constructing-a-service-sas).
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
        ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new()
        ///     {
        ///         Location = "West Europe",
        ///     });
        /// 
        ///     var exampleAccount = new Azure.Storage.Account("exampleAccount", new()
        ///     {
        ///         ResourceGroupName = exampleResourceGroup.Name,
        ///         Location = exampleResourceGroup.Location,
        ///         AccountTier = "Standard",
        ///         AccountReplicationType = "GRS",
        ///         Tags = 
        ///         {
        ///             { "environment", "staging" },
        ///         },
        ///     });
        /// 
        ///     var exampleAccountSAS = Azure.Storage.GetAccountSAS.Invoke(new()
        ///     {
        ///         ConnectionString = exampleAccount.PrimaryConnectionString,
        ///         HttpsOnly = true,
        ///         SignedVersion = "2017-07-29",
        ///         ResourceTypes = new Azure.Storage.Inputs.GetAccountSASResourceTypesInputArgs
        ///         {
        ///             Service = true,
        ///             Container = false,
        ///             Object = false,
        ///         },
        ///         Services = new Azure.Storage.Inputs.GetAccountSASServicesInputArgs
        ///         {
        ///             Blob = true,
        ///             Queue = false,
        ///             Table = false,
        ///             File = false,
        ///         },
        ///         Start = "2018-03-21T00:00:00Z",
        ///         Expiry = "2020-03-21T00:00:00Z",
        ///         Permissions = new Azure.Storage.Inputs.GetAccountSASPermissionsInputArgs
        ///         {
        ///             Read = true,
        ///             Write = true,
        ///             Delete = false,
        ///             List = false,
        ///             Add = true,
        ///             Create = true,
        ///             Update = false,
        ///             Process = false,
        ///             Tag = false,
        ///             Filter = false,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["sasUrlQueryString"] = exampleAccountSAS.Apply(getAccountSASResult =&gt; getAccountSASResult.Sas),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAccountSASResult> InvokeAsync(GetAccountSASArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAccountSASResult>("azure:storage/getAccountSAS:getAccountSAS", args ?? new GetAccountSASArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to obtain a Shared Access Signature (SAS Token) for an existing Storage Account.
        /// 
        /// Shared access signatures allow fine-grained, ephemeral access control to various aspects of an Azure Storage Account.
        /// 
        /// Note that this is an [Account SAS](https://docs.microsoft.com/rest/api/storageservices/constructing-an-account-sas)
        /// and *not* a [Service SAS](https://docs.microsoft.com/rest/api/storageservices/constructing-a-service-sas).
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
        ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new()
        ///     {
        ///         Location = "West Europe",
        ///     });
        /// 
        ///     var exampleAccount = new Azure.Storage.Account("exampleAccount", new()
        ///     {
        ///         ResourceGroupName = exampleResourceGroup.Name,
        ///         Location = exampleResourceGroup.Location,
        ///         AccountTier = "Standard",
        ///         AccountReplicationType = "GRS",
        ///         Tags = 
        ///         {
        ///             { "environment", "staging" },
        ///         },
        ///     });
        /// 
        ///     var exampleAccountSAS = Azure.Storage.GetAccountSAS.Invoke(new()
        ///     {
        ///         ConnectionString = exampleAccount.PrimaryConnectionString,
        ///         HttpsOnly = true,
        ///         SignedVersion = "2017-07-29",
        ///         ResourceTypes = new Azure.Storage.Inputs.GetAccountSASResourceTypesInputArgs
        ///         {
        ///             Service = true,
        ///             Container = false,
        ///             Object = false,
        ///         },
        ///         Services = new Azure.Storage.Inputs.GetAccountSASServicesInputArgs
        ///         {
        ///             Blob = true,
        ///             Queue = false,
        ///             Table = false,
        ///             File = false,
        ///         },
        ///         Start = "2018-03-21T00:00:00Z",
        ///         Expiry = "2020-03-21T00:00:00Z",
        ///         Permissions = new Azure.Storage.Inputs.GetAccountSASPermissionsInputArgs
        ///         {
        ///             Read = true,
        ///             Write = true,
        ///             Delete = false,
        ///             List = false,
        ///             Add = true,
        ///             Create = true,
        ///             Update = false,
        ///             Process = false,
        ///             Tag = false,
        ///             Filter = false,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["sasUrlQueryString"] = exampleAccountSAS.Apply(getAccountSASResult =&gt; getAccountSASResult.Sas),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetAccountSASResult> Invoke(GetAccountSASInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccountSASResult>("azure:storage/getAccountSAS:getAccountSAS", args ?? new GetAccountSASInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAccountSASArgs : global::Pulumi.InvokeArgs
    {
        [Input("connectionString", required: true)]
        private string? _connectionString;

        /// <summary>
        /// The connection string for the storage account to which this SAS applies. Typically directly from the `primary_connection_string` attribute of a `azure.storage.Account` resource.
        /// </summary>
        public string? ConnectionString
        {
            get => _connectionString;
            set => _connectionString = value;
        }

        /// <summary>
        /// The expiration time and date of this SAS. Must be a valid ISO-8601 format time/date string.
        /// </summary>
        [Input("expiry", required: true)]
        public string Expiry { get; set; } = null!;

        /// <summary>
        /// Only permit `https` access. If `false`, both `http` and `https` are permitted. Defaults to `true`.
        /// </summary>
        [Input("httpsOnly")]
        public bool? HttpsOnly { get; set; }

        /// <summary>
        /// IP address, or a range of IP addresses, from which to accept requests. When specifying a range, note that the range is inclusive.
        /// </summary>
        [Input("ipAddresses")]
        public string? IpAddresses { get; set; }

        /// <summary>
        /// A `permissions` block as defined below.
        /// </summary>
        [Input("permissions", required: true)]
        public Inputs.GetAccountSASPermissionsArgs Permissions { get; set; } = null!;

        /// <summary>
        /// A `resource_types` block as defined below.
        /// </summary>
        [Input("resourceTypes", required: true)]
        public Inputs.GetAccountSASResourceTypesArgs ResourceTypes { get; set; } = null!;

        /// <summary>
        /// A `services` block as defined below.
        /// </summary>
        [Input("services", required: true)]
        public Inputs.GetAccountSASServicesArgs Services { get; set; } = null!;

        /// <summary>
        /// Specifies the signed storage service version to use to authorize requests made with this account SAS. Defaults to `2017-07-29`.
        /// </summary>
        [Input("signedVersion")]
        public string? SignedVersion { get; set; }

        /// <summary>
        /// The starting time and date of validity of this SAS. Must be a valid ISO-8601 format time/date string.
        /// </summary>
        [Input("start", required: true)]
        public string Start { get; set; } = null!;

        public GetAccountSASArgs()
        {
        }
        public static new GetAccountSASArgs Empty => new GetAccountSASArgs();
    }

    public sealed class GetAccountSASInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("connectionString", required: true)]
        private Input<string>? _connectionString;

        /// <summary>
        /// The connection string for the storage account to which this SAS applies. Typically directly from the `primary_connection_string` attribute of a `azure.storage.Account` resource.
        /// </summary>
        public Input<string>? ConnectionString
        {
            get => _connectionString;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _connectionString = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The expiration time and date of this SAS. Must be a valid ISO-8601 format time/date string.
        /// </summary>
        [Input("expiry", required: true)]
        public Input<string> Expiry { get; set; } = null!;

        /// <summary>
        /// Only permit `https` access. If `false`, both `http` and `https` are permitted. Defaults to `true`.
        /// </summary>
        [Input("httpsOnly")]
        public Input<bool>? HttpsOnly { get; set; }

        /// <summary>
        /// IP address, or a range of IP addresses, from which to accept requests. When specifying a range, note that the range is inclusive.
        /// </summary>
        [Input("ipAddresses")]
        public Input<string>? IpAddresses { get; set; }

        /// <summary>
        /// A `permissions` block as defined below.
        /// </summary>
        [Input("permissions", required: true)]
        public Input<Inputs.GetAccountSASPermissionsInputArgs> Permissions { get; set; } = null!;

        /// <summary>
        /// A `resource_types` block as defined below.
        /// </summary>
        [Input("resourceTypes", required: true)]
        public Input<Inputs.GetAccountSASResourceTypesInputArgs> ResourceTypes { get; set; } = null!;

        /// <summary>
        /// A `services` block as defined below.
        /// </summary>
        [Input("services", required: true)]
        public Input<Inputs.GetAccountSASServicesInputArgs> Services { get; set; } = null!;

        /// <summary>
        /// Specifies the signed storage service version to use to authorize requests made with this account SAS. Defaults to `2017-07-29`.
        /// </summary>
        [Input("signedVersion")]
        public Input<string>? SignedVersion { get; set; }

        /// <summary>
        /// The starting time and date of validity of this SAS. Must be a valid ISO-8601 format time/date string.
        /// </summary>
        [Input("start", required: true)]
        public Input<string> Start { get; set; } = null!;

        public GetAccountSASInvokeArgs()
        {
        }
        public static new GetAccountSASInvokeArgs Empty => new GetAccountSASInvokeArgs();
    }


    [OutputType]
    public sealed class GetAccountSASResult
    {
        public readonly string ConnectionString;
        public readonly string Expiry;
        public readonly bool? HttpsOnly;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? IpAddresses;
        public readonly Outputs.GetAccountSASPermissionsResult Permissions;
        public readonly Outputs.GetAccountSASResourceTypesResult ResourceTypes;
        /// <summary>
        /// The computed Account Shared Access Signature (SAS).
        /// </summary>
        public readonly string Sas;
        public readonly Outputs.GetAccountSASServicesResult Services;
        public readonly string? SignedVersion;
        public readonly string Start;

        [OutputConstructor]
        private GetAccountSASResult(
            string connectionString,

            string expiry,

            bool? httpsOnly,

            string id,

            string? ipAddresses,

            Outputs.GetAccountSASPermissionsResult permissions,

            Outputs.GetAccountSASResourceTypesResult resourceTypes,

            string sas,

            Outputs.GetAccountSASServicesResult services,

            string? signedVersion,

            string start)
        {
            ConnectionString = connectionString;
            Expiry = expiry;
            HttpsOnly = httpsOnly;
            Id = id;
            IpAddresses = ipAddresses;
            Permissions = permissions;
            ResourceTypes = resourceTypes;
            Sas = sas;
            Services = services;
            SignedVersion = signedVersion;
            Start = start;
        }
    }
}
