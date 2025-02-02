// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.CapacityReservationGroupArgs;
import com.pulumi.azure.compute.inputs.CapacityReservationGroupState;
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
 * Manages a Capacity Reservation Group.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.compute.CapacityReservationGroup;
 * import com.pulumi.azure.compute.CapacityReservationGroupArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleCapacityReservationGroup = new CapacityReservationGroup(&#34;exampleCapacityReservationGroup&#34;, CapacityReservationGroupArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Capacity Reservation Groups can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:compute/capacityReservationGroup:CapacityReservationGroup example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Compute/capacityReservationGroups/capacityReservationGroup1
 * ```
 * 
 */
@ResourceType(type="azure:compute/capacityReservationGroup:CapacityReservationGroup")
public class CapacityReservationGroup extends com.pulumi.resources.CustomResource {
    /**
     * The Azure location where the Capacity Reservation Group exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure location where the Capacity Reservation Group exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name of this Capacity Reservation Group. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of this Capacity Reservation Group. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the name of the resource group the Capacity Reservation Group is located in. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the resource group the Capacity Reservation Group is located in. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Specifies a list of Availability Zones for this Capacity Reservation Group. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return Specifies a list of Availability Zones for this Capacity Reservation Group. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<List<String>>> zones() {
        return Codegen.optional(this.zones);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CapacityReservationGroup(String name) {
        this(name, CapacityReservationGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CapacityReservationGroup(String name, CapacityReservationGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CapacityReservationGroup(String name, CapacityReservationGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/capacityReservationGroup:CapacityReservationGroup", name, args == null ? CapacityReservationGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CapacityReservationGroup(String name, Output<String> id, @Nullable CapacityReservationGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/capacityReservationGroup:CapacityReservationGroup", name, state, makeResourceOptions(options, id));
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
    public static CapacityReservationGroup get(String name, Output<String> id, @Nullable CapacityReservationGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CapacityReservationGroup(name, id, state, options);
    }
}
