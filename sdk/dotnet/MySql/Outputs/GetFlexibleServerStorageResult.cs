// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MySql.Outputs
{

    [OutputType]
    public sealed class GetFlexibleServerStorageResult
    {
        /// <summary>
        /// Is Storage Auto Grow enabled?
        /// </summary>
        public readonly bool AutoGrowEnabled;
        /// <summary>
        /// The storage IOPS of the MySQL Flexible Server.
        /// </summary>
        public readonly int Iops;
        /// <summary>
        /// The max storage allowed for the MySQL Flexible Server.
        /// </summary>
        public readonly int SizeGb;

        [OutputConstructor]
        private GetFlexibleServerStorageResult(
            bool autoGrowEnabled,

            int iops,

            int sizeGb)
        {
            AutoGrowEnabled = autoGrowEnabled;
            Iops = iops;
            SizeGb = sizeGb;
        }
    }
}
