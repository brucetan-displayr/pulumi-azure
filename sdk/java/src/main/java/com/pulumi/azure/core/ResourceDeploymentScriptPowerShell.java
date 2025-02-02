// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.core.ResourceDeploymentScriptPowerShellArgs;
import com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellState;
import com.pulumi.azure.core.outputs.ResourceDeploymentScriptPowerShellContainer;
import com.pulumi.azure.core.outputs.ResourceDeploymentScriptPowerShellEnvironmentVariable;
import com.pulumi.azure.core.outputs.ResourceDeploymentScriptPowerShellIdentity;
import com.pulumi.azure.core.outputs.ResourceDeploymentScriptPowerShellStorageAccount;
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
 * Manages a Resource Deployment Script of Azure PowerShell.
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
 * import com.pulumi.azure.authorization.UserAssignedIdentity;
 * import com.pulumi.azure.authorization.UserAssignedIdentityArgs;
 * import com.pulumi.azure.core.ResourceDeploymentScriptPowerShell;
 * import com.pulumi.azure.core.ResourceDeploymentScriptPowerShellArgs;
 * import com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellIdentityArgs;
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
 *         var exampleUserAssignedIdentity = new UserAssignedIdentity(&#34;exampleUserAssignedIdentity&#34;, UserAssignedIdentityArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleResourceDeploymentScriptPowerShell = new ResourceDeploymentScriptPowerShell(&#34;exampleResourceDeploymentScriptPowerShell&#34;, ResourceDeploymentScriptPowerShellArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(&#34;West Europe&#34;)
 *             .version(&#34;8.3&#34;)
 *             .retentionInterval(&#34;P1D&#34;)
 *             .commandLine(&#34;-name \&#34;John Dole\&#34;&#34;)
 *             .cleanupPreference(&#34;OnSuccess&#34;)
 *             .forceUpdateTag(&#34;1&#34;)
 *             .timeout(&#34;PT30M&#34;)
 *             .scriptContent(&#34;&#34;&#34;
 *           param([string] $name)
 *             $output = &#39;Hello {0}.&#39; -f $name
 *             Write-Output $output
 *             $DeploymentScriptOutputs = @{}
 *             $DeploymentScriptOutputs[&#39;text&#39;] = $output
 *             &#34;&#34;&#34;)
 *             .identity(ResourceDeploymentScriptPowerShellIdentityArgs.builder()
 *                 .type(&#34;UserAssigned&#34;)
 *                 .identityIds(exampleUserAssignedIdentity.id())
 *                 .build())
 *             .tags(Map.of(&#34;key&#34;, &#34;value&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Resource Deployment Script can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:core/resourceDeploymentScriptPowerShell:ResourceDeploymentScriptPowerShell example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Resources/deploymentScripts/script1
 * ```
 * 
 */
@ResourceType(type="azure:core/resourceDeploymentScriptPowerShell:ResourceDeploymentScriptPowerShell")
public class ResourceDeploymentScriptPowerShell extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the cleanup preference when the script execution gets in a terminal state. Possible values are `Always`, `OnExpiration`, `OnSuccess`. Defaults to `Always`. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    @Export(name="cleanupPreference", type=String.class, parameters={})
    private Output</* @Nullable */ String> cleanupPreference;

    /**
     * @return Specifies the cleanup preference when the script execution gets in a terminal state. Possible values are `Always`, `OnExpiration`, `OnSuccess`. Defaults to `Always`. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    public Output<Optional<String>> cleanupPreference() {
        return Codegen.optional(this.cleanupPreference);
    }
    /**
     * Command line arguments to pass to the script. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    @Export(name="commandLine", type=String.class, parameters={})
    private Output</* @Nullable */ String> commandLine;

    /**
     * @return Command line arguments to pass to the script. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    public Output<Optional<String>> commandLine() {
        return Codegen.optional(this.commandLine);
    }
    /**
     * A `container` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    @Export(name="container", type=ResourceDeploymentScriptPowerShellContainer.class, parameters={})
    private Output</* @Nullable */ ResourceDeploymentScriptPowerShellContainer> container;

    /**
     * @return A `container` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    public Output<Optional<ResourceDeploymentScriptPowerShellContainer>> container() {
        return Codegen.optional(this.container);
    }
    /**
     * An `environment_variable` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    @Export(name="environmentVariables", type=List.class, parameters={ResourceDeploymentScriptPowerShellEnvironmentVariable.class})
    private Output</* @Nullable */ List<ResourceDeploymentScriptPowerShellEnvironmentVariable>> environmentVariables;

    /**
     * @return An `environment_variable` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    public Output<Optional<List<ResourceDeploymentScriptPowerShellEnvironmentVariable>>> environmentVariables() {
        return Codegen.optional(this.environmentVariables);
    }
    /**
     * Gets or sets how the deployment script should be forced to execute even if the script resource has not changed. Can be current time stamp or a GUID. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    @Export(name="forceUpdateTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> forceUpdateTag;

    /**
     * @return Gets or sets how the deployment script should be forced to execute even if the script resource has not changed. Can be current time stamp or a GUID. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    public Output<Optional<String>> forceUpdateTag() {
        return Codegen.optional(this.forceUpdateTag);
    }
    /**
     * An `identity` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    @Export(name="identity", type=ResourceDeploymentScriptPowerShellIdentity.class, parameters={})
    private Output</* @Nullable */ ResourceDeploymentScriptPowerShellIdentity> identity;

    /**
     * @return An `identity` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    public Output<Optional<ResourceDeploymentScriptPowerShellIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * Specifies the Azure Region where the Resource Deployment Script should exist. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the Azure Region where the Resource Deployment Script should exist. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name which should be used for this Resource Deployment Script. The name length must be from 1 to 260 characters. The name can only contain alphanumeric, underscore, parentheses, hyphen and period, and it cannot end with a period. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name which should be used for this Resource Deployment Script. The name length must be from 1 to 260 characters. The name can only contain alphanumeric, underscore, parentheses, hyphen and period, and it cannot end with a period. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * List of script outputs.
     * 
     */
    @Export(name="outputs", type=String.class, parameters={})
    private Output<String> outputs;

    /**
     * @return List of script outputs.
     * 
     */
    public Output<String> outputs() {
        return this.outputs;
    }
    /**
     * Uri for the script. This is the entry point for the external script. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    @Export(name="primaryScriptUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> primaryScriptUri;

    /**
     * @return Uri for the script. This is the entry point for the external script. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    public Output<Optional<String>> primaryScriptUri() {
        return Codegen.optional(this.primaryScriptUri);
    }
    /**
     * Specifies the name of the Resource Group where the Resource Deployment Script should exist. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group where the Resource Deployment Script should exist. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Interval for which the service retains the script resource after it reaches a terminal state. Resource will be deleted when this duration expires. The time duration should be between `1` hour and `26` hours (inclusive) and should be specified in ISO 8601 format. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    @Export(name="retentionInterval", type=String.class, parameters={})
    private Output<String> retentionInterval;

    /**
     * @return Interval for which the service retains the script resource after it reaches a terminal state. Resource will be deleted when this duration expires. The time duration should be between `1` hour and `26` hours (inclusive) and should be specified in ISO 8601 format. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    public Output<String> retentionInterval() {
        return this.retentionInterval;
    }
    /**
     * Script body. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    @Export(name="scriptContent", type=String.class, parameters={})
    private Output</* @Nullable */ String> scriptContent;

    /**
     * @return Script body. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    public Output<Optional<String>> scriptContent() {
        return Codegen.optional(this.scriptContent);
    }
    /**
     * A `storage_account` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    @Export(name="storageAccount", type=ResourceDeploymentScriptPowerShellStorageAccount.class, parameters={})
    private Output</* @Nullable */ ResourceDeploymentScriptPowerShellStorageAccount> storageAccount;

    /**
     * @return A `storage_account` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    public Output<Optional<ResourceDeploymentScriptPowerShellStorageAccount>> storageAccount() {
        return Codegen.optional(this.storageAccount);
    }
    /**
     * Supporting files for the external script. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    @Export(name="supportingScriptUris", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> supportingScriptUris;

    /**
     * @return Supporting files for the external script. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    public Output<Optional<List<String>>> supportingScriptUris() {
        return Codegen.optional(this.supportingScriptUris);
    }
    /**
     * A mapping of tags which should be assigned to the Resource Deployment Script.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Resource Deployment Script.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Maximum allowed script execution time specified in ISO 8601 format. Needs to be greater than 0 and smaller than 1 day. Defaults to `P1D`. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    @Export(name="timeout", type=String.class, parameters={})
    private Output</* @Nullable */ String> timeout;

    /**
     * @return Maximum allowed script execution time specified in ISO 8601 format. Needs to be greater than 0 and smaller than 1 day. Defaults to `P1D`. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    public Output<Optional<String>> timeout() {
        return Codegen.optional(this.timeout);
    }
    /**
     * Azure PowerShell module version to be used. The supported versions are `2.7`, `2.8`, `3.0`, `3.1`, `3.2`, `3.3`, `3.4`, `3.5`, `3.6`, `3.7`, `3.8`, `4.1`, `4.2`, `4.3`, `4.4`, `4.5`, `4.6`, `4.7`, `4.8`, `5.0`, `5.1`, `5.2`, `5.3`, `5.4`, `5.5`, `5.6`, `5.7`, `5.8`, `5.9`, `6.0`, `6.1`, `6.2`, `6.3`, `6.4`, `6.5`, `6.6`, `7.0`, `7.1`, `7.2`, `7.3`, `7.4`, `7.5`, `8.0`, `8.1`, `8.2`, `8.3`, `9.0`. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return Azure PowerShell module version to be used. The supported versions are `2.7`, `2.8`, `3.0`, `3.1`, `3.2`, `3.3`, `3.4`, `3.5`, `3.6`, `3.7`, `3.8`, `4.1`, `4.2`, `4.3`, `4.4`, `4.5`, `4.6`, `4.7`, `4.8`, `5.0`, `5.1`, `5.2`, `5.3`, `5.4`, `5.5`, `5.6`, `5.7`, `5.8`, `5.9`, `6.0`, `6.1`, `6.2`, `6.3`, `6.4`, `6.5`, `6.6`, `7.0`, `7.1`, `7.2`, `7.3`, `7.4`, `7.5`, `8.0`, `8.1`, `8.2`, `8.3`, `9.0`. Changing this forces a new Resource Deployment Script to be created.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceDeploymentScriptPowerShell(String name) {
        this(name, ResourceDeploymentScriptPowerShellArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceDeploymentScriptPowerShell(String name, ResourceDeploymentScriptPowerShellArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceDeploymentScriptPowerShell(String name, ResourceDeploymentScriptPowerShellArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:core/resourceDeploymentScriptPowerShell:ResourceDeploymentScriptPowerShell", name, args == null ? ResourceDeploymentScriptPowerShellArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourceDeploymentScriptPowerShell(String name, Output<String> id, @Nullable ResourceDeploymentScriptPowerShellState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:core/resourceDeploymentScriptPowerShell:ResourceDeploymentScriptPowerShell", name, state, makeResourceOptions(options, id));
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
    public static ResourceDeploymentScriptPowerShell get(String name, Output<String> id, @Nullable ResourceDeploymentScriptPowerShellState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourceDeploymentScriptPowerShell(name, id, state, options);
    }
}
