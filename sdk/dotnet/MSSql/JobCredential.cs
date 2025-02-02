// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MSSql
{
    /// <summary>
    /// Manages an Elastic Job Credential.
    /// 
    /// ## Example Usage
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
    ///         Location = "northeurope",
    ///     });
    /// 
    ///     var exampleServer = new Azure.MSSql.Server("exampleServer", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         Version = "12.0",
    ///         AdministratorLogin = "4dm1n157r470r",
    ///         AdministratorLoginPassword = "4-v3ry-53cr37-p455w0rd",
    ///     });
    /// 
    ///     var exampleDatabase = new Azure.MSSql.Database("exampleDatabase", new()
    ///     {
    ///         ServerId = exampleServer.Id,
    ///         Collation = "SQL_Latin1_General_CP1_CI_AS",
    ///         SkuName = "S1",
    ///     });
    /// 
    ///     var exampleJobAgent = new Azure.MSSql.JobAgent("exampleJobAgent", new()
    ///     {
    ///         Location = exampleResourceGroup.Location,
    ///         DatabaseId = exampleDatabase.Id,
    ///     });
    /// 
    ///     var exampleJobCredential = new Azure.MSSql.JobCredential("exampleJobCredential", new()
    ///     {
    ///         JobAgentId = exampleJobAgent.Id,
    ///         Username = "my-username",
    ///         Password = "MyP4ssw0rd!!!",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Elastic Job Credentials can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:mssql/jobCredential:JobCredential example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Sql/servers/myserver1/jobAgents/myjobagent1/credentials/credential1
    /// ```
    /// </summary>
    [AzureResourceType("azure:mssql/jobCredential:JobCredential")]
    public partial class JobCredential : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Elastic Job Agent. Changing this forces a new Elastic Job Credential to be created.
        /// </summary>
        [Output("jobAgentId")]
        public Output<string> JobAgentId { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Elastic Job Credential. Changing this forces a new Elastic Job Credential to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The password part of the credential.
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        /// <summary>
        /// The username part of the credential.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;


        /// <summary>
        /// Create a JobCredential resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public JobCredential(string name, JobCredentialArgs args, CustomResourceOptions? options = null)
            : base("azure:mssql/jobCredential:JobCredential", name, args ?? new JobCredentialArgs(), MakeResourceOptions(options, ""))
        {
        }

        private JobCredential(string name, Input<string> id, JobCredentialState? state = null, CustomResourceOptions? options = null)
            : base("azure:mssql/jobCredential:JobCredential", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "password",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing JobCredential resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static JobCredential Get(string name, Input<string> id, JobCredentialState? state = null, CustomResourceOptions? options = null)
        {
            return new JobCredential(name, id, state, options);
        }
    }

    public sealed class JobCredentialArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Elastic Job Agent. Changing this forces a new Elastic Job Credential to be created.
        /// </summary>
        [Input("jobAgentId", required: true)]
        public Input<string> JobAgentId { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this Elastic Job Credential. Changing this forces a new Elastic Job Credential to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("password", required: true)]
        private Input<string>? _password;

        /// <summary>
        /// The password part of the credential.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The username part of the credential.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public JobCredentialArgs()
        {
        }
        public static new JobCredentialArgs Empty => new JobCredentialArgs();
    }

    public sealed class JobCredentialState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Elastic Job Agent. Changing this forces a new Elastic Job Credential to be created.
        /// </summary>
        [Input("jobAgentId")]
        public Input<string>? JobAgentId { get; set; }

        /// <summary>
        /// The name which should be used for this Elastic Job Credential. Changing this forces a new Elastic Job Credential to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The password part of the credential.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The username part of the credential.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public JobCredentialState()
        {
        }
        public static new JobCredentialState Empty => new JobCredentialState();
    }
}
