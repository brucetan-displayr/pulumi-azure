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
from ._inputs import *

__all__ = ['ServiceAccountArgs', 'ServiceAccount']

@pulumi.input_type
class ServiceAccountArgs:
    def __init__(__self__, *,
                 resource_group_name: pulumi.Input[str],
                 storage_accounts: pulumi.Input[Sequence[pulumi.Input['ServiceAccountStorageAccountArgs']]],
                 encryption: Optional[pulumi.Input['ServiceAccountEncryptionArgs']] = None,
                 identity: Optional[pulumi.Input['ServiceAccountIdentityArgs']] = None,
                 key_delivery_access_control: Optional[pulumi.Input['ServiceAccountKeyDeliveryAccessControlArgs']] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 public_network_access_enabled: Optional[pulumi.Input[bool]] = None,
                 storage_authentication_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a ServiceAccount resource.
        :param pulumi.Input[str] resource_group_name: The name of the resource group in which to create the Media Services Account. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input['ServiceAccountStorageAccountArgs']]] storage_accounts: One or more `storage_account` blocks as defined below.
        :param pulumi.Input['ServiceAccountEncryptionArgs'] encryption: An `encryption` block as defined below.
        :param pulumi.Input['ServiceAccountIdentityArgs'] identity: An `identity` block as defined below.
        :param pulumi.Input['ServiceAccountKeyDeliveryAccessControlArgs'] key_delivery_access_control: A `key_delivery_access_control` block as defined below.
        :param pulumi.Input[str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: Specifies the name of the Media Services Account. Only lowercase Alphanumeric characters allowed. Changing this forces a new resource to be created.
        :param pulumi.Input[bool] public_network_access_enabled: Whether public network access is allowed for this server. Defaults to `true`.
        :param pulumi.Input[str] storage_authentication_type: Specifies the storage authentication type. Possible value is `ManagedIdentity` or `System`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags assigned to the resource.
        """
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        pulumi.set(__self__, "storage_accounts", storage_accounts)
        if encryption is not None:
            pulumi.set(__self__, "encryption", encryption)
        if identity is not None:
            pulumi.set(__self__, "identity", identity)
        if key_delivery_access_control is not None:
            pulumi.set(__self__, "key_delivery_access_control", key_delivery_access_control)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if public_network_access_enabled is not None:
            pulumi.set(__self__, "public_network_access_enabled", public_network_access_enabled)
        if storage_authentication_type is not None:
            pulumi.set(__self__, "storage_authentication_type", storage_authentication_type)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[str]:
        """
        The name of the resource group in which to create the Media Services Account. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter(name="storageAccounts")
    def storage_accounts(self) -> pulumi.Input[Sequence[pulumi.Input['ServiceAccountStorageAccountArgs']]]:
        """
        One or more `storage_account` blocks as defined below.
        """
        return pulumi.get(self, "storage_accounts")

    @storage_accounts.setter
    def storage_accounts(self, value: pulumi.Input[Sequence[pulumi.Input['ServiceAccountStorageAccountArgs']]]):
        pulumi.set(self, "storage_accounts", value)

    @property
    @pulumi.getter
    def encryption(self) -> Optional[pulumi.Input['ServiceAccountEncryptionArgs']]:
        """
        An `encryption` block as defined below.
        """
        return pulumi.get(self, "encryption")

    @encryption.setter
    def encryption(self, value: Optional[pulumi.Input['ServiceAccountEncryptionArgs']]):
        pulumi.set(self, "encryption", value)

    @property
    @pulumi.getter
    def identity(self) -> Optional[pulumi.Input['ServiceAccountIdentityArgs']]:
        """
        An `identity` block as defined below.
        """
        return pulumi.get(self, "identity")

    @identity.setter
    def identity(self, value: Optional[pulumi.Input['ServiceAccountIdentityArgs']]):
        pulumi.set(self, "identity", value)

    @property
    @pulumi.getter(name="keyDeliveryAccessControl")
    def key_delivery_access_control(self) -> Optional[pulumi.Input['ServiceAccountKeyDeliveryAccessControlArgs']]:
        """
        A `key_delivery_access_control` block as defined below.
        """
        return pulumi.get(self, "key_delivery_access_control")

    @key_delivery_access_control.setter
    def key_delivery_access_control(self, value: Optional[pulumi.Input['ServiceAccountKeyDeliveryAccessControlArgs']]):
        pulumi.set(self, "key_delivery_access_control", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Media Services Account. Only lowercase Alphanumeric characters allowed. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="publicNetworkAccessEnabled")
    def public_network_access_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether public network access is allowed for this server. Defaults to `true`.
        """
        return pulumi.get(self, "public_network_access_enabled")

    @public_network_access_enabled.setter
    def public_network_access_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "public_network_access_enabled", value)

    @property
    @pulumi.getter(name="storageAuthenticationType")
    def storage_authentication_type(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the storage authentication type. Possible value is `ManagedIdentity` or `System`.
        """
        return pulumi.get(self, "storage_authentication_type")

    @storage_authentication_type.setter
    def storage_authentication_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_authentication_type", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A mapping of tags assigned to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _ServiceAccountState:
    def __init__(__self__, *,
                 encryption: Optional[pulumi.Input['ServiceAccountEncryptionArgs']] = None,
                 identity: Optional[pulumi.Input['ServiceAccountIdentityArgs']] = None,
                 key_delivery_access_control: Optional[pulumi.Input['ServiceAccountKeyDeliveryAccessControlArgs']] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 public_network_access_enabled: Optional[pulumi.Input[bool]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 storage_accounts: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceAccountStorageAccountArgs']]]] = None,
                 storage_authentication_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering ServiceAccount resources.
        :param pulumi.Input['ServiceAccountEncryptionArgs'] encryption: An `encryption` block as defined below.
        :param pulumi.Input['ServiceAccountIdentityArgs'] identity: An `identity` block as defined below.
        :param pulumi.Input['ServiceAccountKeyDeliveryAccessControlArgs'] key_delivery_access_control: A `key_delivery_access_control` block as defined below.
        :param pulumi.Input[str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: Specifies the name of the Media Services Account. Only lowercase Alphanumeric characters allowed. Changing this forces a new resource to be created.
        :param pulumi.Input[bool] public_network_access_enabled: Whether public network access is allowed for this server. Defaults to `true`.
        :param pulumi.Input[str] resource_group_name: The name of the resource group in which to create the Media Services Account. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input['ServiceAccountStorageAccountArgs']]] storage_accounts: One or more `storage_account` blocks as defined below.
        :param pulumi.Input[str] storage_authentication_type: Specifies the storage authentication type. Possible value is `ManagedIdentity` or `System`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags assigned to the resource.
        """
        if encryption is not None:
            pulumi.set(__self__, "encryption", encryption)
        if identity is not None:
            pulumi.set(__self__, "identity", identity)
        if key_delivery_access_control is not None:
            pulumi.set(__self__, "key_delivery_access_control", key_delivery_access_control)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if public_network_access_enabled is not None:
            pulumi.set(__self__, "public_network_access_enabled", public_network_access_enabled)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if storage_accounts is not None:
            pulumi.set(__self__, "storage_accounts", storage_accounts)
        if storage_authentication_type is not None:
            pulumi.set(__self__, "storage_authentication_type", storage_authentication_type)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def encryption(self) -> Optional[pulumi.Input['ServiceAccountEncryptionArgs']]:
        """
        An `encryption` block as defined below.
        """
        return pulumi.get(self, "encryption")

    @encryption.setter
    def encryption(self, value: Optional[pulumi.Input['ServiceAccountEncryptionArgs']]):
        pulumi.set(self, "encryption", value)

    @property
    @pulumi.getter
    def identity(self) -> Optional[pulumi.Input['ServiceAccountIdentityArgs']]:
        """
        An `identity` block as defined below.
        """
        return pulumi.get(self, "identity")

    @identity.setter
    def identity(self, value: Optional[pulumi.Input['ServiceAccountIdentityArgs']]):
        pulumi.set(self, "identity", value)

    @property
    @pulumi.getter(name="keyDeliveryAccessControl")
    def key_delivery_access_control(self) -> Optional[pulumi.Input['ServiceAccountKeyDeliveryAccessControlArgs']]:
        """
        A `key_delivery_access_control` block as defined below.
        """
        return pulumi.get(self, "key_delivery_access_control")

    @key_delivery_access_control.setter
    def key_delivery_access_control(self, value: Optional[pulumi.Input['ServiceAccountKeyDeliveryAccessControlArgs']]):
        pulumi.set(self, "key_delivery_access_control", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Media Services Account. Only lowercase Alphanumeric characters allowed. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="publicNetworkAccessEnabled")
    def public_network_access_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether public network access is allowed for this server. Defaults to `true`.
        """
        return pulumi.get(self, "public_network_access_enabled")

    @public_network_access_enabled.setter
    def public_network_access_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "public_network_access_enabled", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the resource group in which to create the Media Services Account. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter(name="storageAccounts")
    def storage_accounts(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ServiceAccountStorageAccountArgs']]]]:
        """
        One or more `storage_account` blocks as defined below.
        """
        return pulumi.get(self, "storage_accounts")

    @storage_accounts.setter
    def storage_accounts(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceAccountStorageAccountArgs']]]]):
        pulumi.set(self, "storage_accounts", value)

    @property
    @pulumi.getter(name="storageAuthenticationType")
    def storage_authentication_type(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the storage authentication type. Possible value is `ManagedIdentity` or `System`.
        """
        return pulumi.get(self, "storage_authentication_type")

    @storage_authentication_type.setter
    def storage_authentication_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_authentication_type", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A mapping of tags assigned to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


class ServiceAccount(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 encryption: Optional[pulumi.Input[pulumi.InputType['ServiceAccountEncryptionArgs']]] = None,
                 identity: Optional[pulumi.Input[pulumi.InputType['ServiceAccountIdentityArgs']]] = None,
                 key_delivery_access_control: Optional[pulumi.Input[pulumi.InputType['ServiceAccountKeyDeliveryAccessControlArgs']]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 public_network_access_enabled: Optional[pulumi.Input[bool]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 storage_accounts: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceAccountStorageAccountArgs']]]]] = None,
                 storage_authentication_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Manages a Media Services Account.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_account = azure.storage.Account("exampleAccount",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            account_tier="Standard",
            account_replication_type="GRS")
        example_service_account = azure.media.ServiceAccount("exampleServiceAccount",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            storage_accounts=[azure.media.ServiceAccountStorageAccountArgs(
                id=example_account.id,
                is_primary=True,
            )])
        ```

        ## Import

        Media Services Accounts can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:media/serviceAccount:ServiceAccount account /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Media/mediaServices/account1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ServiceAccountEncryptionArgs']] encryption: An `encryption` block as defined below.
        :param pulumi.Input[pulumi.InputType['ServiceAccountIdentityArgs']] identity: An `identity` block as defined below.
        :param pulumi.Input[pulumi.InputType['ServiceAccountKeyDeliveryAccessControlArgs']] key_delivery_access_control: A `key_delivery_access_control` block as defined below.
        :param pulumi.Input[str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: Specifies the name of the Media Services Account. Only lowercase Alphanumeric characters allowed. Changing this forces a new resource to be created.
        :param pulumi.Input[bool] public_network_access_enabled: Whether public network access is allowed for this server. Defaults to `true`.
        :param pulumi.Input[str] resource_group_name: The name of the resource group in which to create the Media Services Account. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceAccountStorageAccountArgs']]]] storage_accounts: One or more `storage_account` blocks as defined below.
        :param pulumi.Input[str] storage_authentication_type: Specifies the storage authentication type. Possible value is `ManagedIdentity` or `System`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags assigned to the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceAccountArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Media Services Account.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_account = azure.storage.Account("exampleAccount",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            account_tier="Standard",
            account_replication_type="GRS")
        example_service_account = azure.media.ServiceAccount("exampleServiceAccount",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            storage_accounts=[azure.media.ServiceAccountStorageAccountArgs(
                id=example_account.id,
                is_primary=True,
            )])
        ```

        ## Import

        Media Services Accounts can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:media/serviceAccount:ServiceAccount account /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Media/mediaServices/account1
        ```

        :param str resource_name: The name of the resource.
        :param ServiceAccountArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceAccountArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 encryption: Optional[pulumi.Input[pulumi.InputType['ServiceAccountEncryptionArgs']]] = None,
                 identity: Optional[pulumi.Input[pulumi.InputType['ServiceAccountIdentityArgs']]] = None,
                 key_delivery_access_control: Optional[pulumi.Input[pulumi.InputType['ServiceAccountKeyDeliveryAccessControlArgs']]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 public_network_access_enabled: Optional[pulumi.Input[bool]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 storage_accounts: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceAccountStorageAccountArgs']]]]] = None,
                 storage_authentication_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceAccountArgs.__new__(ServiceAccountArgs)

            __props__.__dict__["encryption"] = encryption
            __props__.__dict__["identity"] = identity
            __props__.__dict__["key_delivery_access_control"] = key_delivery_access_control
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            __props__.__dict__["public_network_access_enabled"] = public_network_access_enabled
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            if storage_accounts is None and not opts.urn:
                raise TypeError("Missing required property 'storage_accounts'")
            __props__.__dict__["storage_accounts"] = storage_accounts
            __props__.__dict__["storage_authentication_type"] = storage_authentication_type
            __props__.__dict__["tags"] = tags
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="azure:mediaservices/account:Account")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(ServiceAccount, __self__).__init__(
            'azure:media/serviceAccount:ServiceAccount',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            encryption: Optional[pulumi.Input[pulumi.InputType['ServiceAccountEncryptionArgs']]] = None,
            identity: Optional[pulumi.Input[pulumi.InputType['ServiceAccountIdentityArgs']]] = None,
            key_delivery_access_control: Optional[pulumi.Input[pulumi.InputType['ServiceAccountKeyDeliveryAccessControlArgs']]] = None,
            location: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            public_network_access_enabled: Optional[pulumi.Input[bool]] = None,
            resource_group_name: Optional[pulumi.Input[str]] = None,
            storage_accounts: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceAccountStorageAccountArgs']]]]] = None,
            storage_authentication_type: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'ServiceAccount':
        """
        Get an existing ServiceAccount resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ServiceAccountEncryptionArgs']] encryption: An `encryption` block as defined below.
        :param pulumi.Input[pulumi.InputType['ServiceAccountIdentityArgs']] identity: An `identity` block as defined below.
        :param pulumi.Input[pulumi.InputType['ServiceAccountKeyDeliveryAccessControlArgs']] key_delivery_access_control: A `key_delivery_access_control` block as defined below.
        :param pulumi.Input[str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: Specifies the name of the Media Services Account. Only lowercase Alphanumeric characters allowed. Changing this forces a new resource to be created.
        :param pulumi.Input[bool] public_network_access_enabled: Whether public network access is allowed for this server. Defaults to `true`.
        :param pulumi.Input[str] resource_group_name: The name of the resource group in which to create the Media Services Account. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceAccountStorageAccountArgs']]]] storage_accounts: One or more `storage_account` blocks as defined below.
        :param pulumi.Input[str] storage_authentication_type: Specifies the storage authentication type. Possible value is `ManagedIdentity` or `System`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags assigned to the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceAccountState.__new__(_ServiceAccountState)

        __props__.__dict__["encryption"] = encryption
        __props__.__dict__["identity"] = identity
        __props__.__dict__["key_delivery_access_control"] = key_delivery_access_control
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["public_network_access_enabled"] = public_network_access_enabled
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["storage_accounts"] = storage_accounts
        __props__.__dict__["storage_authentication_type"] = storage_authentication_type
        __props__.__dict__["tags"] = tags
        return ServiceAccount(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def encryption(self) -> pulumi.Output['outputs.ServiceAccountEncryption']:
        """
        An `encryption` block as defined below.
        """
        return pulumi.get(self, "encryption")

    @property
    @pulumi.getter
    def identity(self) -> pulumi.Output[Optional['outputs.ServiceAccountIdentity']]:
        """
        An `identity` block as defined below.
        """
        return pulumi.get(self, "identity")

    @property
    @pulumi.getter(name="keyDeliveryAccessControl")
    def key_delivery_access_control(self) -> pulumi.Output['outputs.ServiceAccountKeyDeliveryAccessControl']:
        """
        A `key_delivery_access_control` block as defined below.
        """
        return pulumi.get(self, "key_delivery_access_control")

    @property
    @pulumi.getter
    def location(self) -> pulumi.Output[str]:
        """
        Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the Media Services Account. Only lowercase Alphanumeric characters allowed. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="publicNetworkAccessEnabled")
    def public_network_access_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether public network access is allowed for this server. Defaults to `true`.
        """
        return pulumi.get(self, "public_network_access_enabled")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[str]:
        """
        The name of the resource group in which to create the Media Services Account. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter(name="storageAccounts")
    def storage_accounts(self) -> pulumi.Output[Sequence['outputs.ServiceAccountStorageAccount']]:
        """
        One or more `storage_account` blocks as defined below.
        """
        return pulumi.get(self, "storage_accounts")

    @property
    @pulumi.getter(name="storageAuthenticationType")
    def storage_authentication_type(self) -> pulumi.Output[str]:
        """
        Specifies the storage authentication type. Possible value is `ManagedIdentity` or `System`.
        """
        return pulumi.get(self, "storage_authentication_type")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A mapping of tags assigned to the resource.
        """
        return pulumi.get(self, "tags")

