// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.mobile.NetworkSiteArgs;
import com.pulumi.azure.mobile.inputs.NetworkSiteState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Mobile Network Site.
 * 
 * ## Import
 * 
 * Mobile Network Site can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:mobile/networkSite:NetworkSite example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.MobileNetwork/mobileNetworks/mobileNetwork1/sites/site1
 * ```
 * 
 */
@ResourceType(type="azure:mobile/networkSite:NetworkSite")
public class NetworkSite extends com.pulumi.resources.CustomResource {
    /**
     * The Azure Region where the Mobile Network Site should exist. Changing this forces a new Mobile Network Site to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where the Mobile Network Site should exist. Changing this forces a new Mobile Network Site to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * the ID of the Mobile Network which the Mobile Network Site belongs to. Changing this forces a new Mobile Network Site to be created.
     * 
     */
    @Export(name="mobileNetworkId", type=String.class, parameters={})
    private Output<String> mobileNetworkId;

    /**
     * @return the ID of the Mobile Network which the Mobile Network Site belongs to. Changing this forces a new Mobile Network Site to be created.
     * 
     */
    public Output<String> mobileNetworkId() {
        return this.mobileNetworkId;
    }
    /**
     * The name which should be used for this Mobile Network Site. Changing this forces a new Mobile Network Site to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Mobile Network Site. Changing this forces a new Mobile Network Site to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * An array of Id of Network Functions deployed on the site.
     * 
     */
    @Export(name="networkFunctionIds", type=List.class, parameters={String.class})
    private Output<List<String>> networkFunctionIds;

    /**
     * @return An array of Id of Network Functions deployed on the site.
     * 
     */
    public Output<List<String>> networkFunctionIds() {
        return this.networkFunctionIds;
    }
    /**
     * A mapping of tags which should be assigned to the Mobile Network Site.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Mobile Network Site.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkSite(String name) {
        this(name, NetworkSiteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkSite(String name, NetworkSiteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkSite(String name, NetworkSiteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mobile/networkSite:NetworkSite", name, args == null ? NetworkSiteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkSite(String name, Output<String> id, @Nullable NetworkSiteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mobile/networkSite:NetworkSite", name, state, makeResourceOptions(options, id));
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
    public static NetworkSite get(String name, Output<String> id, @Nullable NetworkSiteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkSite(name, id, state, options);
    }
}
