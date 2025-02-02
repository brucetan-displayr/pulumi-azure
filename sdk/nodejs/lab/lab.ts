// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

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
 */
export class Lab extends pulumi.CustomResource {
    /**
     * Get an existing Lab resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LabState, opts?: pulumi.CustomResourceOptions): Lab {
        return new Lab(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:lab/lab:Lab';

    /**
     * Returns true if the given object is an instance of Lab.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Lab {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Lab.__pulumiType;
    }

    /**
     * An `autoShutdown` block as defined below.
     */
    public readonly autoShutdown!: pulumi.Output<outputs.lab.LabAutoShutdown | undefined>;
    /**
     * A `connectionSetting` block as defined below.
     */
    public readonly connectionSetting!: pulumi.Output<outputs.lab.LabConnectionSetting | undefined>;
    /**
     * The description of the Lab Service Lab.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The resource ID of the Lab Plan that is used during resource creation to provide defaults and acts as a permission container when creating a Lab Service Lab via `labs.azure.com`.
     */
    public readonly labPlanId!: pulumi.Output<string | undefined>;
    /**
     * The Azure Region where the Lab Service Lab should exist. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The name which should be used for this Lab Service Lab. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A `network` block as defined below.
     */
    public readonly network!: pulumi.Output<outputs.lab.LabNetwork | undefined>;
    /**
     * The name of the Resource Group where the Lab Service Lab should exist. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * A `roster` block as defined below.
     */
    public readonly roster!: pulumi.Output<outputs.lab.LabRoster | undefined>;
    /**
     * A `security` block as defined below.
     */
    public readonly security!: pulumi.Output<outputs.lab.LabSecurity>;
    /**
     * A mapping of tags which should be assigned to the Lab Service Lab.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The title of the Lab Service Lab.
     */
    public readonly title!: pulumi.Output<string>;
    /**
     * A `virtualMachine` block as defined below.
     */
    public readonly virtualMachine!: pulumi.Output<outputs.lab.LabVirtualMachine>;

    /**
     * Create a Lab resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LabArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LabArgs | LabState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LabState | undefined;
            resourceInputs["autoShutdown"] = state ? state.autoShutdown : undefined;
            resourceInputs["connectionSetting"] = state ? state.connectionSetting : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["labPlanId"] = state ? state.labPlanId : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["roster"] = state ? state.roster : undefined;
            resourceInputs["security"] = state ? state.security : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["title"] = state ? state.title : undefined;
            resourceInputs["virtualMachine"] = state ? state.virtualMachine : undefined;
        } else {
            const args = argsOrState as LabArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.security === undefined) && !opts.urn) {
                throw new Error("Missing required property 'security'");
            }
            if ((!args || args.title === undefined) && !opts.urn) {
                throw new Error("Missing required property 'title'");
            }
            if ((!args || args.virtualMachine === undefined) && !opts.urn) {
                throw new Error("Missing required property 'virtualMachine'");
            }
            resourceInputs["autoShutdown"] = args ? args.autoShutdown : undefined;
            resourceInputs["connectionSetting"] = args ? args.connectionSetting : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["labPlanId"] = args ? args.labPlanId : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["network"] = args ? args.network : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["roster"] = args ? args.roster : undefined;
            resourceInputs["security"] = args ? args.security : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["title"] = args ? args.title : undefined;
            resourceInputs["virtualMachine"] = args ? args.virtualMachine : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Lab.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Lab resources.
 */
export interface LabState {
    /**
     * An `autoShutdown` block as defined below.
     */
    autoShutdown?: pulumi.Input<inputs.lab.LabAutoShutdown>;
    /**
     * A `connectionSetting` block as defined below.
     */
    connectionSetting?: pulumi.Input<inputs.lab.LabConnectionSetting>;
    /**
     * The description of the Lab Service Lab.
     */
    description?: pulumi.Input<string>;
    /**
     * The resource ID of the Lab Plan that is used during resource creation to provide defaults and acts as a permission container when creating a Lab Service Lab via `labs.azure.com`.
     */
    labPlanId?: pulumi.Input<string>;
    /**
     * The Azure Region where the Lab Service Lab should exist. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name which should be used for this Lab Service Lab. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A `network` block as defined below.
     */
    network?: pulumi.Input<inputs.lab.LabNetwork>;
    /**
     * The name of the Resource Group where the Lab Service Lab should exist. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * A `roster` block as defined below.
     */
    roster?: pulumi.Input<inputs.lab.LabRoster>;
    /**
     * A `security` block as defined below.
     */
    security?: pulumi.Input<inputs.lab.LabSecurity>;
    /**
     * A mapping of tags which should be assigned to the Lab Service Lab.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The title of the Lab Service Lab.
     */
    title?: pulumi.Input<string>;
    /**
     * A `virtualMachine` block as defined below.
     */
    virtualMachine?: pulumi.Input<inputs.lab.LabVirtualMachine>;
}

/**
 * The set of arguments for constructing a Lab resource.
 */
export interface LabArgs {
    /**
     * An `autoShutdown` block as defined below.
     */
    autoShutdown?: pulumi.Input<inputs.lab.LabAutoShutdown>;
    /**
     * A `connectionSetting` block as defined below.
     */
    connectionSetting?: pulumi.Input<inputs.lab.LabConnectionSetting>;
    /**
     * The description of the Lab Service Lab.
     */
    description?: pulumi.Input<string>;
    /**
     * The resource ID of the Lab Plan that is used during resource creation to provide defaults and acts as a permission container when creating a Lab Service Lab via `labs.azure.com`.
     */
    labPlanId?: pulumi.Input<string>;
    /**
     * The Azure Region where the Lab Service Lab should exist. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name which should be used for this Lab Service Lab. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A `network` block as defined below.
     */
    network?: pulumi.Input<inputs.lab.LabNetwork>;
    /**
     * The name of the Resource Group where the Lab Service Lab should exist. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A `roster` block as defined below.
     */
    roster?: pulumi.Input<inputs.lab.LabRoster>;
    /**
     * A `security` block as defined below.
     */
    security: pulumi.Input<inputs.lab.LabSecurity>;
    /**
     * A mapping of tags which should be assigned to the Lab Service Lab.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The title of the Lab Service Lab.
     */
    title: pulumi.Input<string>;
    /**
     * A `virtualMachine` block as defined below.
     */
    virtualMachine: pulumi.Input<inputs.lab.LabVirtualMachine>;
}
