// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lab;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.lab.LabArgs;
import com.pulumi.azure.lab.inputs.LabState;
import com.pulumi.azure.lab.outputs.LabAutoShutdown;
import com.pulumi.azure.lab.outputs.LabConnectionSetting;
import com.pulumi.azure.lab.outputs.LabNetwork;
import com.pulumi.azure.lab.outputs.LabRoster;
import com.pulumi.azure.lab.outputs.LabSecurity;
import com.pulumi.azure.lab.outputs.LabVirtualMachine;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Lab Service Lab.
 * 
 * ## Import
 * 
 * Lab Service Labs can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:lab/lab:Lab example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.LabServices/labs/lab1
 * ```
 * 
 */
@ResourceType(type="azure:lab/lab:Lab")
public class Lab extends com.pulumi.resources.CustomResource {
    /**
     * An `auto_shutdown` block as defined below.
     * 
     */
    @Export(name="autoShutdown", type=LabAutoShutdown.class, parameters={})
    private Output</* @Nullable */ LabAutoShutdown> autoShutdown;

    /**
     * @return An `auto_shutdown` block as defined below.
     * 
     */
    public Output<Optional<LabAutoShutdown>> autoShutdown() {
        return Codegen.optional(this.autoShutdown);
    }
    /**
     * A `connection_setting` block as defined below.
     * 
     */
    @Export(name="connectionSetting", type=LabConnectionSetting.class, parameters={})
    private Output</* @Nullable */ LabConnectionSetting> connectionSetting;

    /**
     * @return A `connection_setting` block as defined below.
     * 
     */
    public Output<Optional<LabConnectionSetting>> connectionSetting() {
        return Codegen.optional(this.connectionSetting);
    }
    /**
     * The description of the Lab Service Lab.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the Lab Service Lab.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The resource ID of the Lab Plan that is used during resource creation to provide defaults and acts as a permission container when creating a Lab Service Lab via `labs.azure.com`.
     * 
     */
    @Export(name="labPlanId", type=String.class, parameters={})
    private Output</* @Nullable */ String> labPlanId;

    /**
     * @return The resource ID of the Lab Plan that is used during resource creation to provide defaults and acts as a permission container when creating a Lab Service Lab via `labs.azure.com`.
     * 
     */
    public Output<Optional<String>> labPlanId() {
        return Codegen.optional(this.labPlanId);
    }
    /**
     * The Azure Region where the Lab Service Lab should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where the Lab Service Lab should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name which should be used for this Lab Service Lab. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Lab Service Lab. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A `network` block as defined below.
     * 
     */
    @Export(name="network", type=LabNetwork.class, parameters={})
    private Output</* @Nullable */ LabNetwork> network;

    /**
     * @return A `network` block as defined below.
     * 
     */
    public Output<Optional<LabNetwork>> network() {
        return Codegen.optional(this.network);
    }
    /**
     * The name of the Resource Group where the Lab Service Lab should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Lab Service Lab should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A `roster` block as defined below.
     * 
     */
    @Export(name="roster", type=LabRoster.class, parameters={})
    private Output</* @Nullable */ LabRoster> roster;

    /**
     * @return A `roster` block as defined below.
     * 
     */
    public Output<Optional<LabRoster>> roster() {
        return Codegen.optional(this.roster);
    }
    /**
     * A `security` block as defined below.
     * 
     */
    @Export(name="security", type=LabSecurity.class, parameters={})
    private Output<LabSecurity> security;

    /**
     * @return A `security` block as defined below.
     * 
     */
    public Output<LabSecurity> security() {
        return this.security;
    }
    /**
     * A mapping of tags which should be assigned to the Lab Service Lab.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Lab Service Lab.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The title of the Lab Service Lab.
     * 
     */
    @Export(name="title", type=String.class, parameters={})
    private Output<String> title;

    /**
     * @return The title of the Lab Service Lab.
     * 
     */
    public Output<String> title() {
        return this.title;
    }
    /**
     * A `virtual_machine` block as defined below.
     * 
     */
    @Export(name="virtualMachine", type=LabVirtualMachine.class, parameters={})
    private Output<LabVirtualMachine> virtualMachine;

    /**
     * @return A `virtual_machine` block as defined below.
     * 
     */
    public Output<LabVirtualMachine> virtualMachine() {
        return this.virtualMachine;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Lab(String name) {
        this(name, LabArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Lab(String name, LabArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Lab(String name, LabArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:lab/lab:Lab", name, args == null ? LabArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Lab(String name, Output<String> id, @Nullable LabState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:lab/lab:Lab", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Lab get(String name, Output<String> id, @Nullable LabState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Lab(name, id, state, options);
    }
}
