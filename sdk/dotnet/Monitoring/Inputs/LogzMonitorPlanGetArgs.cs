// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Inputs
{

    public sealed class LogzMonitorPlanGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Different billing cycles. Possible values are `MONTHLY` or `WEEKLY`. Changing this forces a new logz Monitor to be created.
        /// </summary>
        [Input("billingCycle", required: true)]
        public Input<string> BillingCycle { get; set; } = null!;

        /// <summary>
        /// Date when plan was applied. Changing this forces a new logz Monitor to be created.
        /// </summary>
        [Input("effectiveDate", required: true)]
        public Input<string> EffectiveDate { get; set; } = null!;

        /// <summary>
        /// Plan id as published by Logz. The only possible value is `100gb14days`. Defaults to `100gb14days`. Changing this forces a new logz Monitor to be created.
        /// </summary>
        [Input("planId")]
        public Input<string>? PlanId { get; set; }

        /// <summary>
        /// Different usage types. Possible values are `PAYG` or `COMMITTED`. Changing this forces a new logz Monitor to be created.
        /// </summary>
        [Input("usageType", required: true)]
        public Input<string> UsageType { get; set; } = null!;

        public LogzMonitorPlanGetArgs()
        {
        }
        public static new LogzMonitorPlanGetArgs Empty => new LogzMonitorPlanGetArgs();
    }
}
