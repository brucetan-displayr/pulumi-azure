// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.notificationhub;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.notificationhub.NamespaceArgs;
import com.pulumi.azure.notificationhub.inputs.NamespaceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Notification Hub Namespace.
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
 * import com.pulumi.azure.notificationhub.Namespace;
 * import com.pulumi.azure.notificationhub.NamespaceArgs;
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
 *         var exampleNamespace = new Namespace(&#34;exampleNamespace&#34;, NamespaceArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .namespaceType(&#34;NotificationHub&#34;)
 *             .skuName(&#34;Free&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Notification Hub Namespaces can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:notificationhub/namespace:Namespace namespace1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.NotificationHubs/namespaces/namespace1
 * ```
 * 
 */
@ResourceType(type="azure:notificationhub/namespace:Namespace")
public class Namespace extends com.pulumi.resources.CustomResource {
    /**
     * Is this Notification Hub Namespace enabled? Defaults to `true`.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Is this Notification Hub Namespace enabled? Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The Azure Region in which this Notification Hub Namespace should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region in which this Notification Hub Namespace should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name to use for this Notification Hub Namespace. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name to use for this Notification Hub Namespace. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Type of Namespace - possible values are `Messaging` or `NotificationHub`.
     * 
     */
    @Export(name="namespaceType", type=String.class, parameters={})
    private Output<String> namespaceType;

    /**
     * @return The Type of Namespace - possible values are `Messaging` or `NotificationHub`.
     * 
     */
    public Output<String> namespaceType() {
        return this.namespaceType;
    }
    /**
     * The name of the Resource Group in which the Notification Hub Namespace should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Notification Hub Namespace should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The ServiceBus Endpoint for this Notification Hub Namespace.
     * 
     */
    @Export(name="servicebusEndpoint", type=String.class, parameters={})
    private Output<String> servicebusEndpoint;

    /**
     * @return The ServiceBus Endpoint for this Notification Hub Namespace.
     * 
     */
    public Output<String> servicebusEndpoint() {
        return this.servicebusEndpoint;
    }
    /**
     * The name of the SKU to use for this Notification Hub Namespace. Possible values are `Free`, `Basic` or `Standard`.
     * 
     */
    @Export(name="skuName", type=String.class, parameters={})
    private Output<String> skuName;

    /**
     * @return The name of the SKU to use for this Notification Hub Namespace. Possible values are `Free`, `Basic` or `Standard`.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Namespace(String name) {
        this(name, NamespaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Namespace(String name, NamespaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Namespace(String name, NamespaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:notificationhub/namespace:Namespace", name, args == null ? NamespaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Namespace(String name, Output<String> id, @Nullable NamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:notificationhub/namespace:Namespace", name, state, makeResourceOptions(options, id));
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
    public static Namespace get(String name, Output<String> id, @Nullable NamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Namespace(name, id, state, options);
    }
}
