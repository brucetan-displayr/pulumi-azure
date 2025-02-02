// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.LogicApps.Outputs
{

    [OutputType]
    public sealed class GetStandardSiteConfigResult
    {
        public readonly bool? AlwaysOn;
        public readonly int AppScaleLimit;
        public readonly Outputs.GetStandardSiteConfigCorsResult Cors;
        public readonly string? DotnetFrameworkVersion;
        public readonly int ElasticInstanceMinimum;
        public readonly string FtpsState;
        public readonly string? HealthCheckPath;
        public readonly bool? Http2Enabled;
        public readonly ImmutableArray<Outputs.GetStandardSiteConfigIpRestrictionResult> IpRestrictions;
        public readonly string LinuxFxVersion;
        public readonly string MinTlsVersion;
        public readonly int PreWarmedInstanceCount;
        public readonly bool? RuntimeScaleMonitoringEnabled;
        public readonly ImmutableArray<Outputs.GetStandardSiteConfigScmIpRestrictionResult> ScmIpRestrictions;
        public readonly string ScmMinTlsVersion;
        public readonly string ScmType;
        public readonly bool? ScmUseMainIpRestriction;
        public readonly bool? Use32BitWorkerProcess;
        public readonly bool VnetRouteAllEnabled;
        public readonly bool? WebsocketsEnabled;

        [OutputConstructor]
        private GetStandardSiteConfigResult(
            bool? alwaysOn,

            int appScaleLimit,

            Outputs.GetStandardSiteConfigCorsResult cors,

            string? dotnetFrameworkVersion,

            int elasticInstanceMinimum,

            string ftpsState,

            string? healthCheckPath,

            bool? http2Enabled,

            ImmutableArray<Outputs.GetStandardSiteConfigIpRestrictionResult> ipRestrictions,

            string linuxFxVersion,

            string minTlsVersion,

            int preWarmedInstanceCount,

            bool? runtimeScaleMonitoringEnabled,

            ImmutableArray<Outputs.GetStandardSiteConfigScmIpRestrictionResult> scmIpRestrictions,

            string scmMinTlsVersion,

            string scmType,

            bool? scmUseMainIpRestriction,

            bool? use32BitWorkerProcess,

            bool vnetRouteAllEnabled,

            bool? websocketsEnabled)
        {
            AlwaysOn = alwaysOn;
            AppScaleLimit = appScaleLimit;
            Cors = cors;
            DotnetFrameworkVersion = dotnetFrameworkVersion;
            ElasticInstanceMinimum = elasticInstanceMinimum;
            FtpsState = ftpsState;
            HealthCheckPath = healthCheckPath;
            Http2Enabled = http2Enabled;
            IpRestrictions = ipRestrictions;
            LinuxFxVersion = linuxFxVersion;
            MinTlsVersion = minTlsVersion;
            PreWarmedInstanceCount = preWarmedInstanceCount;
            RuntimeScaleMonitoringEnabled = runtimeScaleMonitoringEnabled;
            ScmIpRestrictions = scmIpRestrictions;
            ScmMinTlsVersion = scmMinTlsVersion;
            ScmType = scmType;
            ScmUseMainIpRestriction = scmUseMainIpRestriction;
            Use32BitWorkerProcess = use32BitWorkerProcess;
            VnetRouteAllEnabled = vnetRouteAllEnabled;
            WebsocketsEnabled = websocketsEnabled;
        }
    }
}
