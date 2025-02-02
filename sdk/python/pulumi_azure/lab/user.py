# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['UserArgs', 'User']

@pulumi.input_type
class UserArgs:
    def __init__(__self__, *,
                 email: pulumi.Input[str],
                 lab_id: pulumi.Input[str],
                 additional_usage_quota: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a User resource.
        :param pulumi.Input[str] email: The email address of the Lab Service User. Changing this forces a new resource to be created.
        :param pulumi.Input[str] lab_id: The resource ID of the Lab Service Lab. Changing this forces a new resource to be created.
        :param pulumi.Input[str] additional_usage_quota: The amount of usage quota time the Lab Service User gets in addition to the lab usage quota. Defaults to `PT0S`.
        :param pulumi.Input[str] name: The name which should be used for this Lab Service User. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "email", email)
        pulumi.set(__self__, "lab_id", lab_id)
        if additional_usage_quota is not None:
            pulumi.set(__self__, "additional_usage_quota", additional_usage_quota)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def email(self) -> pulumi.Input[str]:
        """
        The email address of the Lab Service User. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: pulumi.Input[str]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter(name="labId")
    def lab_id(self) -> pulumi.Input[str]:
        """
        The resource ID of the Lab Service Lab. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "lab_id")

    @lab_id.setter
    def lab_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "lab_id", value)

    @property
    @pulumi.getter(name="additionalUsageQuota")
    def additional_usage_quota(self) -> Optional[pulumi.Input[str]]:
        """
        The amount of usage quota time the Lab Service User gets in addition to the lab usage quota. Defaults to `PT0S`.
        """
        return pulumi.get(self, "additional_usage_quota")

    @additional_usage_quota.setter
    def additional_usage_quota(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "additional_usage_quota", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this Lab Service User. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _UserState:
    def __init__(__self__, *,
                 additional_usage_quota: Optional[pulumi.Input[str]] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 lab_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering User resources.
        :param pulumi.Input[str] additional_usage_quota: The amount of usage quota time the Lab Service User gets in addition to the lab usage quota. Defaults to `PT0S`.
        :param pulumi.Input[str] email: The email address of the Lab Service User. Changing this forces a new resource to be created.
        :param pulumi.Input[str] lab_id: The resource ID of the Lab Service Lab. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name which should be used for this Lab Service User. Changing this forces a new resource to be created.
        """
        if additional_usage_quota is not None:
            pulumi.set(__self__, "additional_usage_quota", additional_usage_quota)
        if email is not None:
            pulumi.set(__self__, "email", email)
        if lab_id is not None:
            pulumi.set(__self__, "lab_id", lab_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="additionalUsageQuota")
    def additional_usage_quota(self) -> Optional[pulumi.Input[str]]:
        """
        The amount of usage quota time the Lab Service User gets in addition to the lab usage quota. Defaults to `PT0S`.
        """
        return pulumi.get(self, "additional_usage_quota")

    @additional_usage_quota.setter
    def additional_usage_quota(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "additional_usage_quota", value)

    @property
    @pulumi.getter
    def email(self) -> Optional[pulumi.Input[str]]:
        """
        The email address of the Lab Service User. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter(name="labId")
    def lab_id(self) -> Optional[pulumi.Input[str]]:
        """
        The resource ID of the Lab Service Lab. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "lab_id")

    @lab_id.setter
    def lab_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "lab_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this Lab Service User. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class User(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 additional_usage_quota: Optional[pulumi.Input[str]] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 lab_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Lab Service User.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_lab = azure.lab.Lab("exampleLab",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            title="Test Title",
            security=azure.lab.LabSecurityArgs(
                open_access_enabled=False,
            ),
            virtual_machine=azure.lab.LabVirtualMachineArgs(
                admin_user=azure.lab.LabVirtualMachineAdminUserArgs(
                    username="testadmin",
                    password="Password1234!",
                ),
                image_reference=azure.lab.LabVirtualMachineImageReferenceArgs(
                    offer="0001-com-ubuntu-server-focal",
                    publisher="canonical",
                    sku="20_04-lts",
                    version="latest",
                ),
                sku=azure.lab.LabVirtualMachineSkuArgs(
                    name="Classic_Fsv2_2_4GB_128_S_SSD",
                    capacity=1,
                ),
            ))
        example_user = azure.lab.User("exampleUser",
            lab_id=example_lab.id,
            email="terraform-acctest@hashicorp.com")
        ```

        ## Import

        Lab Service Users can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:lab/user:User example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.LabServices/labs/lab1/users/user1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] additional_usage_quota: The amount of usage quota time the Lab Service User gets in addition to the lab usage quota. Defaults to `PT0S`.
        :param pulumi.Input[str] email: The email address of the Lab Service User. Changing this forces a new resource to be created.
        :param pulumi.Input[str] lab_id: The resource ID of the Lab Service Lab. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name which should be used for this Lab Service User. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Lab Service User.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_lab = azure.lab.Lab("exampleLab",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            title="Test Title",
            security=azure.lab.LabSecurityArgs(
                open_access_enabled=False,
            ),
            virtual_machine=azure.lab.LabVirtualMachineArgs(
                admin_user=azure.lab.LabVirtualMachineAdminUserArgs(
                    username="testadmin",
                    password="Password1234!",
                ),
                image_reference=azure.lab.LabVirtualMachineImageReferenceArgs(
                    offer="0001-com-ubuntu-server-focal",
                    publisher="canonical",
                    sku="20_04-lts",
                    version="latest",
                ),
                sku=azure.lab.LabVirtualMachineSkuArgs(
                    name="Classic_Fsv2_2_4GB_128_S_SSD",
                    capacity=1,
                ),
            ))
        example_user = azure.lab.User("exampleUser",
            lab_id=example_lab.id,
            email="terraform-acctest@hashicorp.com")
        ```

        ## Import

        Lab Service Users can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:lab/user:User example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.LabServices/labs/lab1/users/user1
        ```

        :param str resource_name: The name of the resource.
        :param UserArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 additional_usage_quota: Optional[pulumi.Input[str]] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 lab_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserArgs.__new__(UserArgs)

            __props__.__dict__["additional_usage_quota"] = additional_usage_quota
            if email is None and not opts.urn:
                raise TypeError("Missing required property 'email'")
            __props__.__dict__["email"] = email
            if lab_id is None and not opts.urn:
                raise TypeError("Missing required property 'lab_id'")
            __props__.__dict__["lab_id"] = lab_id
            __props__.__dict__["name"] = name
        super(User, __self__).__init__(
            'azure:lab/user:User',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            additional_usage_quota: Optional[pulumi.Input[str]] = None,
            email: Optional[pulumi.Input[str]] = None,
            lab_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'User':
        """
        Get an existing User resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] additional_usage_quota: The amount of usage quota time the Lab Service User gets in addition to the lab usage quota. Defaults to `PT0S`.
        :param pulumi.Input[str] email: The email address of the Lab Service User. Changing this forces a new resource to be created.
        :param pulumi.Input[str] lab_id: The resource ID of the Lab Service Lab. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name which should be used for this Lab Service User. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserState.__new__(_UserState)

        __props__.__dict__["additional_usage_quota"] = additional_usage_quota
        __props__.__dict__["email"] = email
        __props__.__dict__["lab_id"] = lab_id
        __props__.__dict__["name"] = name
        return User(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="additionalUsageQuota")
    def additional_usage_quota(self) -> pulumi.Output[Optional[str]]:
        """
        The amount of usage quota time the Lab Service User gets in addition to the lab usage quota. Defaults to `PT0S`.
        """
        return pulumi.get(self, "additional_usage_quota")

    @property
    @pulumi.getter
    def email(self) -> pulumi.Output[str]:
        """
        The email address of the Lab Service User. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter(name="labId")
    def lab_id(self) -> pulumi.Output[str]:
        """
        The resource ID of the Lab Service Lab. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "lab_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name which should be used for this Lab Service User. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

