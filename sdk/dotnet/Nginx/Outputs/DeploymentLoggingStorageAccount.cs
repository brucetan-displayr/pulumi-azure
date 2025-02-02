// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Nginx.Outputs
{

    [OutputType]
    public sealed class DeploymentLoggingStorageAccount
    {
        /// <summary>
        /// Specify the container name of Stoage Account for logging.
        /// </summary>
        public readonly string? ContainerName;
        /// <summary>
        /// The account name of the StorageAccount for Nginx Logging.
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private DeploymentLoggingStorageAccount(
            string? containerName,

            string? name)
        {
            ContainerName = containerName;
            Name = name;
        }
    }
}
