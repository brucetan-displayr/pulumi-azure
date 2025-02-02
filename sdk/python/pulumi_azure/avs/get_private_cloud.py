# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetPrivateCloudResult',
    'AwaitableGetPrivateCloudResult',
    'get_private_cloud',
    'get_private_cloud_output',
]

@pulumi.output_type
class GetPrivateCloudResult:
    """
    A collection of values returned by getPrivateCloud.
    """
    def __init__(__self__, circuits=None, hcx_cloud_manager_endpoint=None, id=None, internet_connection_enabled=None, location=None, management_clusters=None, management_subnet_cidr=None, name=None, network_subnet_cidr=None, nsxt_certificate_thumbprint=None, nsxt_manager_endpoint=None, provisioning_subnet_cidr=None, resource_group_name=None, sku_name=None, tags=None, vcenter_certificate_thumbprint=None, vcsa_endpoint=None, vmotion_subnet_cidr=None):
        if circuits and not isinstance(circuits, list):
            raise TypeError("Expected argument 'circuits' to be a list")
        pulumi.set(__self__, "circuits", circuits)
        if hcx_cloud_manager_endpoint and not isinstance(hcx_cloud_manager_endpoint, str):
            raise TypeError("Expected argument 'hcx_cloud_manager_endpoint' to be a str")
        pulumi.set(__self__, "hcx_cloud_manager_endpoint", hcx_cloud_manager_endpoint)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if internet_connection_enabled and not isinstance(internet_connection_enabled, bool):
            raise TypeError("Expected argument 'internet_connection_enabled' to be a bool")
        pulumi.set(__self__, "internet_connection_enabled", internet_connection_enabled)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if management_clusters and not isinstance(management_clusters, list):
            raise TypeError("Expected argument 'management_clusters' to be a list")
        pulumi.set(__self__, "management_clusters", management_clusters)
        if management_subnet_cidr and not isinstance(management_subnet_cidr, str):
            raise TypeError("Expected argument 'management_subnet_cidr' to be a str")
        pulumi.set(__self__, "management_subnet_cidr", management_subnet_cidr)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if network_subnet_cidr and not isinstance(network_subnet_cidr, str):
            raise TypeError("Expected argument 'network_subnet_cidr' to be a str")
        pulumi.set(__self__, "network_subnet_cidr", network_subnet_cidr)
        if nsxt_certificate_thumbprint and not isinstance(nsxt_certificate_thumbprint, str):
            raise TypeError("Expected argument 'nsxt_certificate_thumbprint' to be a str")
        pulumi.set(__self__, "nsxt_certificate_thumbprint", nsxt_certificate_thumbprint)
        if nsxt_manager_endpoint and not isinstance(nsxt_manager_endpoint, str):
            raise TypeError("Expected argument 'nsxt_manager_endpoint' to be a str")
        pulumi.set(__self__, "nsxt_manager_endpoint", nsxt_manager_endpoint)
        if provisioning_subnet_cidr and not isinstance(provisioning_subnet_cidr, str):
            raise TypeError("Expected argument 'provisioning_subnet_cidr' to be a str")
        pulumi.set(__self__, "provisioning_subnet_cidr", provisioning_subnet_cidr)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if sku_name and not isinstance(sku_name, str):
            raise TypeError("Expected argument 'sku_name' to be a str")
        pulumi.set(__self__, "sku_name", sku_name)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if vcenter_certificate_thumbprint and not isinstance(vcenter_certificate_thumbprint, str):
            raise TypeError("Expected argument 'vcenter_certificate_thumbprint' to be a str")
        pulumi.set(__self__, "vcenter_certificate_thumbprint", vcenter_certificate_thumbprint)
        if vcsa_endpoint and not isinstance(vcsa_endpoint, str):
            raise TypeError("Expected argument 'vcsa_endpoint' to be a str")
        pulumi.set(__self__, "vcsa_endpoint", vcsa_endpoint)
        if vmotion_subnet_cidr and not isinstance(vmotion_subnet_cidr, str):
            raise TypeError("Expected argument 'vmotion_subnet_cidr' to be a str")
        pulumi.set(__self__, "vmotion_subnet_cidr", vmotion_subnet_cidr)

    @property
    @pulumi.getter
    def circuits(self) -> Sequence['outputs.GetPrivateCloudCircuitResult']:
        """
        A `circuit` block as defined below.
        """
        return pulumi.get(self, "circuits")

    @property
    @pulumi.getter(name="hcxCloudManagerEndpoint")
    def hcx_cloud_manager_endpoint(self) -> str:
        """
        The endpoint for the HCX Cloud Manager.
        """
        return pulumi.get(self, "hcx_cloud_manager_endpoint")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="internetConnectionEnabled")
    def internet_connection_enabled(self) -> bool:
        """
        Is the VMware Private Cluster connected to the internet?
        """
        return pulumi.get(self, "internet_connection_enabled")

    @property
    @pulumi.getter
    def location(self) -> str:
        """
        The Azure Region where the VMware Private Cloud exists.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter(name="managementClusters")
    def management_clusters(self) -> Sequence['outputs.GetPrivateCloudManagementClusterResult']:
        """
        A `management_cluster` block as defined below.
        """
        return pulumi.get(self, "management_clusters")

    @property
    @pulumi.getter(name="managementSubnetCidr")
    def management_subnet_cidr(self) -> str:
        """
        The network used to access vCenter Server and NSX-T Manager.
        """
        return pulumi.get(self, "management_subnet_cidr")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="networkSubnetCidr")
    def network_subnet_cidr(self) -> str:
        """
        The subnet CIDR of the VMware Private Cloud.
        """
        return pulumi.get(self, "network_subnet_cidr")

    @property
    @pulumi.getter(name="nsxtCertificateThumbprint")
    def nsxt_certificate_thumbprint(self) -> str:
        """
        The thumbprint of the NSX-T Manager SSL certificate.
        """
        return pulumi.get(self, "nsxt_certificate_thumbprint")

    @property
    @pulumi.getter(name="nsxtManagerEndpoint")
    def nsxt_manager_endpoint(self) -> str:
        """
        The endpoint for the NSX-T Data Center manager.
        """
        return pulumi.get(self, "nsxt_manager_endpoint")

    @property
    @pulumi.getter(name="provisioningSubnetCidr")
    def provisioning_subnet_cidr(self) -> str:
        """
        The network which isused for virtual machine cold migration, cloning, and snapshot migration.
        """
        return pulumi.get(self, "provisioning_subnet_cidr")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> str:
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter(name="skuName")
    def sku_name(self) -> str:
        """
        The Name of the SKU used for this Private Cloud.
        """
        return pulumi.get(self, "sku_name")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        A mapping of tags assigned to the VMware Private Cloud.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="vcenterCertificateThumbprint")
    def vcenter_certificate_thumbprint(self) -> str:
        """
        The thumbprint of the vCenter Server SSL certificate.
        """
        return pulumi.get(self, "vcenter_certificate_thumbprint")

    @property
    @pulumi.getter(name="vcsaEndpoint")
    def vcsa_endpoint(self) -> str:
        """
        The endpoint for Virtual Center Server Appliance.
        """
        return pulumi.get(self, "vcsa_endpoint")

    @property
    @pulumi.getter(name="vmotionSubnetCidr")
    def vmotion_subnet_cidr(self) -> str:
        """
        The network which is used for live migration of virtual machines.
        """
        return pulumi.get(self, "vmotion_subnet_cidr")


class AwaitableGetPrivateCloudResult(GetPrivateCloudResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPrivateCloudResult(
            circuits=self.circuits,
            hcx_cloud_manager_endpoint=self.hcx_cloud_manager_endpoint,
            id=self.id,
            internet_connection_enabled=self.internet_connection_enabled,
            location=self.location,
            management_clusters=self.management_clusters,
            management_subnet_cidr=self.management_subnet_cidr,
            name=self.name,
            network_subnet_cidr=self.network_subnet_cidr,
            nsxt_certificate_thumbprint=self.nsxt_certificate_thumbprint,
            nsxt_manager_endpoint=self.nsxt_manager_endpoint,
            provisioning_subnet_cidr=self.provisioning_subnet_cidr,
            resource_group_name=self.resource_group_name,
            sku_name=self.sku_name,
            tags=self.tags,
            vcenter_certificate_thumbprint=self.vcenter_certificate_thumbprint,
            vcsa_endpoint=self.vcsa_endpoint,
            vmotion_subnet_cidr=self.vmotion_subnet_cidr)


def get_private_cloud(name: Optional[str] = None,
                      resource_group_name: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPrivateCloudResult:
    """
    Use this data source to access information about an existing resource.

    :param str name: The name of this VMware Private Cloud.
    :param str resource_group_name: The name of the Resource Group where the VMware Private Cloud exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:avs/getPrivateCloud:getPrivateCloud', __args__, opts=opts, typ=GetPrivateCloudResult).value

    return AwaitableGetPrivateCloudResult(
        circuits=__ret__.circuits,
        hcx_cloud_manager_endpoint=__ret__.hcx_cloud_manager_endpoint,
        id=__ret__.id,
        internet_connection_enabled=__ret__.internet_connection_enabled,
        location=__ret__.location,
        management_clusters=__ret__.management_clusters,
        management_subnet_cidr=__ret__.management_subnet_cidr,
        name=__ret__.name,
        network_subnet_cidr=__ret__.network_subnet_cidr,
        nsxt_certificate_thumbprint=__ret__.nsxt_certificate_thumbprint,
        nsxt_manager_endpoint=__ret__.nsxt_manager_endpoint,
        provisioning_subnet_cidr=__ret__.provisioning_subnet_cidr,
        resource_group_name=__ret__.resource_group_name,
        sku_name=__ret__.sku_name,
        tags=__ret__.tags,
        vcenter_certificate_thumbprint=__ret__.vcenter_certificate_thumbprint,
        vcsa_endpoint=__ret__.vcsa_endpoint,
        vmotion_subnet_cidr=__ret__.vmotion_subnet_cidr)


@_utilities.lift_output_func(get_private_cloud)
def get_private_cloud_output(name: Optional[pulumi.Input[str]] = None,
                             resource_group_name: Optional[pulumi.Input[str]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPrivateCloudResult]:
    """
    Use this data source to access information about an existing resource.

    :param str name: The name of this VMware Private Cloud.
    :param str resource_group_name: The name of the Resource Group where the VMware Private Cloud exists.
    """
    ...
