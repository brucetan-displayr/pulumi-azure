// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerApp.Inputs
{

    public sealed class AppTemplateGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("containers", required: true)]
        private InputList<Inputs.AppTemplateContainerGetArgs>? _containers;

        /// <summary>
        /// One or more `container` blocks as detailed below.
        /// </summary>
        public InputList<Inputs.AppTemplateContainerGetArgs> Containers
        {
            get => _containers ?? (_containers = new InputList<Inputs.AppTemplateContainerGetArgs>());
            set => _containers = value;
        }

        /// <summary>
        /// The maximum number of replicas for this container.
        /// </summary>
        [Input("maxReplicas")]
        public Input<int>? MaxReplicas { get; set; }

        /// <summary>
        /// The minimum number of replicas for this container.
        /// </summary>
        [Input("minReplicas")]
        public Input<int>? MinReplicas { get; set; }

        /// <summary>
        /// The suffix for the revision. This value must be unique for the lifetime of the Resource. If omitted the service will use a hash function to create one.
        /// </summary>
        [Input("revisionSuffix")]
        public Input<string>? RevisionSuffix { get; set; }

        [Input("volumes")]
        private InputList<Inputs.AppTemplateVolumeGetArgs>? _volumes;

        /// <summary>
        /// A `volume` block as detailed below.
        /// </summary>
        public InputList<Inputs.AppTemplateVolumeGetArgs> Volumes
        {
            get => _volumes ?? (_volumes = new InputList<Inputs.AppTemplateVolumeGetArgs>());
            set => _volumes = value;
        }

        public AppTemplateGetArgs()
        {
        }
        public static new AppTemplateGetArgs Empty => new AppTemplateGetArgs();
    }
}
