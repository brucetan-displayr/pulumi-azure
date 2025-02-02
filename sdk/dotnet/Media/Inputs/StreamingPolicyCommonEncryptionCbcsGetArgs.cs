// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Inputs
{

    public sealed class StreamingPolicyCommonEncryptionCbcsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `default_content_key` block as defined below. Changing this forces a new Streaming Policy to be created.
        /// </summary>
        [Input("defaultContentKey")]
        public Input<Inputs.StreamingPolicyCommonEncryptionCbcsDefaultContentKeyGetArgs>? DefaultContentKey { get; set; }

        /// <summary>
        /// A `drm_fairplay` block as defined below. Changing this forces a new Streaming Policy to be created.
        /// </summary>
        [Input("drmFairplay")]
        public Input<Inputs.StreamingPolicyCommonEncryptionCbcsDrmFairplayGetArgs>? DrmFairplay { get; set; }

        /// <summary>
        /// A `enabled_protocols` block as defined below. Changing this forces a new Streaming Policy to be created.
        /// </summary>
        [Input("enabledProtocols")]
        public Input<Inputs.StreamingPolicyCommonEncryptionCbcsEnabledProtocolsGetArgs>? EnabledProtocols { get; set; }

        public StreamingPolicyCommonEncryptionCbcsGetArgs()
        {
        }
        public static new StreamingPolicyCommonEncryptionCbcsGetArgs Empty => new StreamingPolicyCommonEncryptionCbcsGetArgs();
    }
}
