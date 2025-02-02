// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.PacketCaptureArgs;
import com.pulumi.azure.compute.inputs.PacketCaptureState;
import com.pulumi.azure.compute.outputs.PacketCaptureFilter;
import com.pulumi.azure.compute.outputs.PacketCaptureStorageLocation;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Configures Network Packet Capturing against a Virtual Machine using a Network Watcher.
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
 * import com.pulumi.azure.network.NetworkWatcher;
 * import com.pulumi.azure.network.NetworkWatcherArgs;
 * import com.pulumi.azure.network.VirtualNetwork;
 * import com.pulumi.azure.network.VirtualNetworkArgs;
 * import com.pulumi.azure.network.Subnet;
 * import com.pulumi.azure.network.SubnetArgs;
 * import com.pulumi.azure.network.NetworkInterface;
 * import com.pulumi.azure.network.NetworkInterfaceArgs;
 * import com.pulumi.azure.network.inputs.NetworkInterfaceIpConfigurationArgs;
 * import com.pulumi.azure.compute.VirtualMachine;
 * import com.pulumi.azure.compute.VirtualMachineArgs;
 * import com.pulumi.azure.compute.inputs.VirtualMachineStorageImageReferenceArgs;
 * import com.pulumi.azure.compute.inputs.VirtualMachineStorageOsDiskArgs;
 * import com.pulumi.azure.compute.inputs.VirtualMachineOsProfileArgs;
 * import com.pulumi.azure.compute.inputs.VirtualMachineOsProfileLinuxConfigArgs;
 * import com.pulumi.azure.compute.Extension;
 * import com.pulumi.azure.compute.ExtensionArgs;
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.compute.PacketCapture;
 * import com.pulumi.azure.compute.PacketCaptureArgs;
 * import com.pulumi.azure.compute.inputs.PacketCaptureStorageLocationArgs;
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
 *         var exampleNetworkWatcher = new NetworkWatcher(&#34;exampleNetworkWatcher&#34;, NetworkWatcherArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes(&#34;10.0.2.0/24&#34;)
 *             .build());
 * 
 *         var exampleNetworkInterface = new NetworkInterface(&#34;exampleNetworkInterface&#34;, NetworkInterfaceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .ipConfigurations(NetworkInterfaceIpConfigurationArgs.builder()
 *                 .name(&#34;testconfiguration1&#34;)
 *                 .subnetId(exampleSubnet.id())
 *                 .privateIpAddressAllocation(&#34;Dynamic&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleVirtualMachine = new VirtualMachine(&#34;exampleVirtualMachine&#34;, VirtualMachineArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .networkInterfaceIds(exampleNetworkInterface.id())
 *             .vmSize(&#34;Standard_F2&#34;)
 *             .storageImageReference(VirtualMachineStorageImageReferenceArgs.builder()
 *                 .publisher(&#34;Canonical&#34;)
 *                 .offer(&#34;UbuntuServer&#34;)
 *                 .sku(&#34;16.04-LTS&#34;)
 *                 .version(&#34;latest&#34;)
 *                 .build())
 *             .storageOsDisk(VirtualMachineStorageOsDiskArgs.builder()
 *                 .name(&#34;osdisk&#34;)
 *                 .caching(&#34;ReadWrite&#34;)
 *                 .createOption(&#34;FromImage&#34;)
 *                 .managedDiskType(&#34;Standard_LRS&#34;)
 *                 .build())
 *             .osProfile(VirtualMachineOsProfileArgs.builder()
 *                 .computerName(&#34;pctest-vm&#34;)
 *                 .adminUsername(&#34;testadmin&#34;)
 *                 .adminPassword(&#34;Password1234!&#34;)
 *                 .build())
 *             .osProfileLinuxConfig(VirtualMachineOsProfileLinuxConfigArgs.builder()
 *                 .disablePasswordAuthentication(false)
 *                 .build())
 *             .build());
 * 
 *         var exampleExtension = new Extension(&#34;exampleExtension&#34;, ExtensionArgs.builder()        
 *             .virtualMachineId(exampleVirtualMachine.id())
 *             .publisher(&#34;Microsoft.Azure.NetworkWatcher&#34;)
 *             .type(&#34;NetworkWatcherAgentLinux&#34;)
 *             .typeHandlerVersion(&#34;1.4&#34;)
 *             .autoUpgradeMinorVersion(true)
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var examplePacketCapture = new PacketCapture(&#34;examplePacketCapture&#34;, PacketCaptureArgs.builder()        
 *             .networkWatcherId(exampleNetworkWatcher.id())
 *             .virtualMachineId(exampleVirtualMachine.id())
 *             .storageLocation(PacketCaptureStorageLocationArgs.builder()
 *                 .storageAccountId(exampleAccount.id())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleExtension)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * &gt; **NOTE:** This Resource requires that [the Network Watcher Virtual Machine Extension](https://docs.microsoft.com/azure/network-watcher/network-watcher-packet-capture-manage-portal#before-you-begin) is installed on the Virtual Machine before capturing can be enabled which can be installed via the `azure.compute.Extension` resource.
 * 
 * ## Import
 * 
 * Virtual Machine Packet Captures can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:compute/packetCapture:PacketCapture capture1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/networkWatchers/watcher1/packetCaptures/capture1
 * ```
 * 
 */
@ResourceType(type="azure:compute/packetCapture:PacketCapture")
public class PacketCapture extends com.pulumi.resources.CustomResource {
    /**
     * One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="filters", type=List.class, parameters={PacketCaptureFilter.class})
    private Output</* @Nullable */ List<PacketCaptureFilter>> filters;

    /**
     * @return One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<List<PacketCaptureFilter>>> filters() {
        return Codegen.optional(this.filters);
    }
    /**
     * The number of bytes captured per packet. The remaining bytes are truncated. Defaults to `0` (Entire Packet Captured). Changing this forces a new resource to be created.
     * 
     */
    @Export(name="maximumBytesPerPacket", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maximumBytesPerPacket;

    /**
     * @return The number of bytes captured per packet. The remaining bytes are truncated. Defaults to `0` (Entire Packet Captured). Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Integer>> maximumBytesPerPacket() {
        return Codegen.optional(this.maximumBytesPerPacket);
    }
    /**
     * Maximum size of the capture in Bytes. Defaults to `1073741824` (1GB). Changing this forces a new resource to be created.
     * 
     */
    @Export(name="maximumBytesPerSession", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maximumBytesPerSession;

    /**
     * @return Maximum size of the capture in Bytes. Defaults to `1073741824` (1GB). Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Integer>> maximumBytesPerSession() {
        return Codegen.optional(this.maximumBytesPerSession);
    }
    /**
     * The maximum duration of the capture session in seconds. Defaults to `18000` (5 hours). Changing this forces a new resource to be created.
     * 
     */
    @Export(name="maximumCaptureDurationInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maximumCaptureDurationInSeconds;

    /**
     * @return The maximum duration of the capture session in seconds. Defaults to `18000` (5 hours). Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Integer>> maximumCaptureDurationInSeconds() {
        return Codegen.optional(this.maximumCaptureDurationInSeconds);
    }
    /**
     * The name to use for this Network Packet Capture. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name to use for this Network Packet Capture. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The resource ID of the Network Watcher. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="networkWatcherId", type=String.class, parameters={})
    private Output<String> networkWatcherId;

    /**
     * @return The resource ID of the Network Watcher. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> networkWatcherId() {
        return this.networkWatcherId;
    }
    /**
     * A `storage_location` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="storageLocation", type=PacketCaptureStorageLocation.class, parameters={})
    private Output<PacketCaptureStorageLocation> storageLocation;

    /**
     * @return A `storage_location` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<PacketCaptureStorageLocation> storageLocation() {
        return this.storageLocation;
    }
    /**
     * The resource ID of the target Virtual Machine to capture packets from. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="virtualMachineId", type=String.class, parameters={})
    private Output<String> virtualMachineId;

    /**
     * @return The resource ID of the target Virtual Machine to capture packets from. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> virtualMachineId() {
        return this.virtualMachineId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PacketCapture(String name) {
        this(name, PacketCaptureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PacketCapture(String name, PacketCaptureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PacketCapture(String name, PacketCaptureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/packetCapture:PacketCapture", name, args == null ? PacketCaptureArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PacketCapture(String name, Output<String> id, @Nullable PacketCaptureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/packetCapture:PacketCapture", name, state, makeResourceOptions(options, id));
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
    public static PacketCapture get(String name, Output<String> id, @Nullable PacketCaptureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PacketCapture(name, id, state, options);
    }
}
