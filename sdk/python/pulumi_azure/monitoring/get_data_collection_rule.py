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
    'GetDataCollectionRuleResult',
    'AwaitableGetDataCollectionRuleResult',
    'get_data_collection_rule',
    'get_data_collection_rule_output',
]

@pulumi.output_type
class GetDataCollectionRuleResult:
    """
    A collection of values returned by getDataCollectionRule.
    """
    def __init__(__self__, data_flows=None, data_sources=None, description=None, destinations=None, id=None, kind=None, location=None, name=None, resource_group_name=None, tags=None):
        if data_flows and not isinstance(data_flows, list):
            raise TypeError("Expected argument 'data_flows' to be a list")
        pulumi.set(__self__, "data_flows", data_flows)
        if data_sources and not isinstance(data_sources, list):
            raise TypeError("Expected argument 'data_sources' to be a list")
        pulumi.set(__self__, "data_sources", data_sources)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if destinations and not isinstance(destinations, list):
            raise TypeError("Expected argument 'destinations' to be a list")
        pulumi.set(__self__, "destinations", destinations)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kind and not isinstance(kind, str):
            raise TypeError("Expected argument 'kind' to be a str")
        pulumi.set(__self__, "kind", kind)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="dataFlows")
    def data_flows(self) -> Sequence['outputs.GetDataCollectionRuleDataFlowResult']:
        """
        One or more `data_flow` blocks as defined below.
        """
        return pulumi.get(self, "data_flows")

    @property
    @pulumi.getter(name="dataSources")
    def data_sources(self) -> Sequence['outputs.GetDataCollectionRuleDataSourceResult']:
        """
        A `data_sources` block as defined below. This property is optional and can be omitted if the rule is meant to be used via direct calls to the provisioned endpoint.
        """
        return pulumi.get(self, "data_sources")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the Data Collection Rule.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def destinations(self) -> Sequence['outputs.GetDataCollectionRuleDestinationResult']:
        """
        Specifies a list of destination names. A `azure_monitor_metrics` data source only allows for stream of kind `Microsoft-InsightsMetrics`.
        """
        return pulumi.get(self, "destinations")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def kind(self) -> str:
        """
        The kind of the Data Collection Rule. Possible values are `Linux` and `Windows`. A rule of kind `Linux` does not allow for `windows_event_log` data sources. And a rule of kind `Windows` does not allow for `syslog` data sources. If kind is not specified, all kinds of data sources are allowed.
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def location(self) -> str:
        """
        The Azure Region where the Data Collection Rule should exist. Changing this forces a new Data Collection Rule to be created.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name which should be used for this data source. This name should be unique across all data sources regardless of type within the Data Collection Rule.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> str:
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        A mapping of tags which should be assigned to the Data Collection Rule.
        """
        return pulumi.get(self, "tags")


class AwaitableGetDataCollectionRuleResult(GetDataCollectionRuleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDataCollectionRuleResult(
            data_flows=self.data_flows,
            data_sources=self.data_sources,
            description=self.description,
            destinations=self.destinations,
            id=self.id,
            kind=self.kind,
            location=self.location,
            name=self.name,
            resource_group_name=self.resource_group_name,
            tags=self.tags)


def get_data_collection_rule(name: Optional[str] = None,
                             resource_group_name: Optional[str] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDataCollectionRuleResult:
    """
    Use this data source to access information about an existing Data Collection Rule.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.monitoring.get_data_collection_rule(name="example-rule",
        resource_group_name=azurerm_resource_group["example"]["name"])
    pulumi.export("ruleId", example.id)
    ```


    :param str name: Specifies the name of the Data Collection Rule.
    :param str resource_group_name: Specifies the name of the resource group the Data Collection Rule is located in.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:monitoring/getDataCollectionRule:getDataCollectionRule', __args__, opts=opts, typ=GetDataCollectionRuleResult).value

    return AwaitableGetDataCollectionRuleResult(
        data_flows=__ret__.data_flows,
        data_sources=__ret__.data_sources,
        description=__ret__.description,
        destinations=__ret__.destinations,
        id=__ret__.id,
        kind=__ret__.kind,
        location=__ret__.location,
        name=__ret__.name,
        resource_group_name=__ret__.resource_group_name,
        tags=__ret__.tags)


@_utilities.lift_output_func(get_data_collection_rule)
def get_data_collection_rule_output(name: Optional[pulumi.Input[str]] = None,
                                    resource_group_name: Optional[pulumi.Input[str]] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDataCollectionRuleResult]:
    """
    Use this data source to access information about an existing Data Collection Rule.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.monitoring.get_data_collection_rule(name="example-rule",
        resource_group_name=azurerm_resource_group["example"]["name"])
    pulumi.export("ruleId", example.id)
    ```


    :param str name: Specifies the name of the Data Collection Rule.
    :param str resource_group_name: Specifies the name of the resource group the Data Collection Rule is located in.
    """
    ...
