// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.BgpConnectionArgs;
import com.pulumi.azure.network.inputs.BgpConnectionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Bgp Connection for a Virtual Hub.
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
 * import com.pulumi.azure.network.VirtualHub;
 * import com.pulumi.azure.network.VirtualHubArgs;
 * import com.pulumi.azure.network.PublicIp;
 * import com.pulumi.azure.network.PublicIpArgs;
 * import com.pulumi.azure.network.VirtualNetwork;
 * import com.pulumi.azure.network.VirtualNetworkArgs;
 * import com.pulumi.azure.network.Subnet;
 * import com.pulumi.azure.network.SubnetArgs;
 * import com.pulumi.azure.network.VirtualHubIp;
 * import com.pulumi.azure.network.VirtualHubIpArgs;
 * import com.pulumi.azure.network.BgpConnection;
 * import com.pulumi.azure.network.BgpConnectionArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var exampleVirtualHub = new VirtualHub(&#34;exampleVirtualHub&#34;, VirtualHubArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .sku(&#34;Standard&#34;)
 *             .build());
 * 
 *         var examplePublicIp = new PublicIp(&#34;examplePublicIp&#34;, PublicIpArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .allocationMethod(&#34;Static&#34;)
 *             .sku(&#34;Standard&#34;)
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .addressSpaces(&#34;10.5.0.0/16&#34;)
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes(&#34;10.5.1.0/24&#34;)
 *             .build());
 * 
 *         var exampleVirtualHubIp = new VirtualHubIp(&#34;exampleVirtualHubIp&#34;, VirtualHubIpArgs.builder()        
 *             .virtualHubId(exampleVirtualHub.id())
 *             .privateIpAddress(&#34;10.5.1.18&#34;)
 *             .privateIpAllocationMethod(&#34;Static&#34;)
 *             .publicIpAddressId(examplePublicIp.id())
 *             .subnetId(exampleSubnet.id())
 *             .build());
 * 
 *         var exampleBgpConnection = new BgpConnection(&#34;exampleBgpConnection&#34;, BgpConnectionArgs.builder()        
 *             .virtualHubId(exampleVirtualHub.id())
 *             .peerAsn(65514)
 *             .peerIp(&#34;169.254.21.5&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleVirtualHubIp)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Virtual Hub Bgp Connections can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:network/bgpConnection:BgpConnection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/virtualHubs/virtualHub1/bgpConnections/connection1
 * ```
 * 
 */
@ResourceType(type="azure:network/bgpConnection:BgpConnection")
public class BgpConnection extends com.pulumi.resources.CustomResource {
    /**
     * The name which should be used for this Virtual Hub Bgp Connection. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Virtual Hub Bgp Connection. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The peer autonomous system number for the Virtual Hub Bgp Connection. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="peerAsn", type=Integer.class, parameters={})
    private Output<Integer> peerAsn;

    /**
     * @return The peer autonomous system number for the Virtual Hub Bgp Connection. Changing this forces a new resource to be created.
     * 
     */
    public Output<Integer> peerAsn() {
        return this.peerAsn;
    }
    /**
     * The peer IP address for the Virtual Hub Bgp Connection. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="peerIp", type=String.class, parameters={})
    private Output<String> peerIp;

    /**
     * @return The peer IP address for the Virtual Hub Bgp Connection. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> peerIp() {
        return this.peerIp;
    }
    /**
     * The ID of the Virtual Hub within which this Bgp connection should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="virtualHubId", type=String.class, parameters={})
    private Output<String> virtualHubId;

    /**
     * @return The ID of the Virtual Hub within which this Bgp connection should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> virtualHubId() {
        return this.virtualHubId;
    }
    /**
     * The ID of virtual network connection.
     * 
     */
    @Export(name="virtualNetworkConnectionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> virtualNetworkConnectionId;

    /**
     * @return The ID of virtual network connection.
     * 
     */
    public Output<Optional<String>> virtualNetworkConnectionId() {
        return Codegen.optional(this.virtualNetworkConnectionId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BgpConnection(String name) {
        this(name, BgpConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BgpConnection(String name, BgpConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BgpConnection(String name, BgpConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/bgpConnection:BgpConnection", name, args == null ? BgpConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BgpConnection(String name, Output<String> id, @Nullable BgpConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/bgpConnection:BgpConnection", name, state, makeResourceOptions(options, id));
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
    public static BgpConnection get(String name, Output<String> id, @Nullable BgpConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BgpConnection(name, id, state, options);
    }
}
