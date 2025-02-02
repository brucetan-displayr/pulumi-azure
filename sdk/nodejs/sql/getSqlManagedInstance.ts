// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.sql.getSqlManagedInstance({
 *     name: "example_mi",
 *     resourceGroupName: "example-resources",
 * });
 * export const sqlInstanceId = example.then(example => example.id);
 * ```
 */
export function getSqlManagedInstance(args: GetSqlManagedInstanceArgs, opts?: pulumi.InvokeOptions): Promise<GetSqlManagedInstanceResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:sql/getSqlManagedInstance:getSqlManagedInstance", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getSqlManagedInstance.
 */
export interface GetSqlManagedInstanceArgs {
    /**
     * The name of the SQL Managed Instance.
     */
    name: string;
    /**
     * The name of the Resource Group in which the SQL Managed Instance exists.
     */
    resourceGroupName: string;
    /**
     * A mapping of tags assigned to the resource.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getSqlManagedInstance.
 */
export interface GetSqlManagedInstanceResult {
    /**
     * The administrator login name for the new server.
     */
    readonly administratorLogin: string;
    /**
     * Specifies how the SQL Managed Instance is collated.
     */
    readonly collation: string;
    /**
     * The ID of the Managed Instance which is sharing the DNS zone.
     */
    readonly dnsZonePartnerId: string;
    /**
     * The fully qualified domain name of the Azure Managed SQL Instance.
     */
    readonly fqdn: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * An `identity` block as defined below.
     */
    readonly identities: outputs.sql.GetSqlManagedInstanceIdentity[];
    /**
     * Type of license the Managed Instance uses.
     */
    readonly licenseType: string;
    /**
     * Location where the resource exists.
     */
    readonly location: string;
    /**
     * The Minimum TLS Version.
     */
    readonly minimumTlsVersion: string;
    readonly name: string;
    /**
     * How the SQL Managed Instance is accessed.
     */
    readonly proxyOverride: string;
    /**
     * Is the public data endpoint enabled?
     */
    readonly publicDataEndpointEnabled: boolean;
    readonly resourceGroupName: string;
    /**
     * SKU Name for the SQL Managed Instance.
     */
    readonly skuName: string;
    /**
     * Storage account type used to store backups for this SQL Managed Instance.
     */
    readonly storageAccountType: string;
    /**
     * Maximum storage space for your instance.
     */
    readonly storageSizeInGb: number;
    /**
     * The subnet resource id that the SQL Managed Instance is associated with.
     */
    readonly subnetId: string;
    /**
     * A mapping of tags assigned to the resource.
     */
    readonly tags?: {[key: string]: string};
    /**
     * The TimeZone ID that the SQL Managed Instance is operating in.
     */
    readonly timezoneId: string;
    /**
     * Number of cores assigned to your instance.
     */
    readonly vcores: number;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.sql.getSqlManagedInstance({
 *     name: "example_mi",
 *     resourceGroupName: "example-resources",
 * });
 * export const sqlInstanceId = example.then(example => example.id);
 * ```
 */
export function getSqlManagedInstanceOutput(args: GetSqlManagedInstanceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSqlManagedInstanceResult> {
    return pulumi.output(args).apply((a: any) => getSqlManagedInstance(a, opts))
}

/**
 * A collection of arguments for invoking getSqlManagedInstance.
 */
export interface GetSqlManagedInstanceOutputArgs {
    /**
     * The name of the SQL Managed Instance.
     */
    name: pulumi.Input<string>;
    /**
     * The name of the Resource Group in which the SQL Managed Instance exists.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A mapping of tags assigned to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
