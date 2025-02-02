// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appservice.FunctionAppFunctionArgs;
import com.pulumi.azure.appservice.inputs.FunctionAppFunctionState;
import com.pulumi.azure.appservice.outputs.FunctionAppFunctionFile;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Function App Function.
 * 
 * ## Example Usage
 * ### Basic HTTP Trigger
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.appservice.ServicePlan;
 * import com.pulumi.azure.appservice.ServicePlanArgs;
 * import com.pulumi.azure.appservice.LinuxFunctionApp;
 * import com.pulumi.azure.appservice.LinuxFunctionAppArgs;
 * import com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigArgs;
 * import com.pulumi.azure.appservice.inputs.LinuxFunctionAppSiteConfigApplicationStackArgs;
 * import com.pulumi.azure.appservice.FunctionAppFunction;
 * import com.pulumi.azure.appservice.FunctionAppFunctionArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleServicePlan = new ServicePlan(&#34;exampleServicePlan&#34;, ServicePlanArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .osType(&#34;Linux&#34;)
 *             .skuName(&#34;S1&#34;)
 *             .build());
 * 
 *         var exampleLinuxFunctionApp = new LinuxFunctionApp(&#34;exampleLinuxFunctionApp&#34;, LinuxFunctionAppArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .servicePlanId(exampleServicePlan.id())
 *             .storageAccountName(exampleAccount.name())
 *             .storageAccountAccessKey(exampleAccount.primaryAccessKey())
 *             .siteConfig(LinuxFunctionAppSiteConfigArgs.builder()
 *                 .applicationStack(LinuxFunctionAppSiteConfigApplicationStackArgs.builder()
 *                     .pythonVersion(&#34;3.9&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleFunctionAppFunction = new FunctionAppFunction(&#34;exampleFunctionAppFunction&#34;, FunctionAppFunctionArgs.builder()        
 *             .functionAppId(exampleLinuxFunctionApp.id())
 *             .language(&#34;Python&#34;)
 *             .testData(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;name&#34;, &#34;Azure&#34;)
 *                 )))
 *             .configJson(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;bindings&#34;, jsonArray(
 *                         jsonObject(
 *                             jsonProperty(&#34;authLevel&#34;, &#34;function&#34;),
 *                             jsonProperty(&#34;direction&#34;, &#34;in&#34;),
 *                             jsonProperty(&#34;methods&#34;, jsonArray(
 *                                 &#34;get&#34;, 
 *                                 &#34;post&#34;
 *                             )),
 *                             jsonProperty(&#34;name&#34;, &#34;req&#34;),
 *                             jsonProperty(&#34;type&#34;, &#34;httpTrigger&#34;)
 *                         ), 
 *                         jsonObject(
 *                             jsonProperty(&#34;direction&#34;, &#34;out&#34;),
 *                             jsonProperty(&#34;name&#34;, &#34;$return&#34;),
 *                             jsonProperty(&#34;type&#34;, &#34;http&#34;)
 *                         )
 *                     ))
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### HTTP Trigger With Code Upload
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.appservice.ServicePlan;
 * import com.pulumi.azure.appservice.ServicePlanArgs;
 * import com.pulumi.azure.appservice.WindowsFunctionApp;
 * import com.pulumi.azure.appservice.WindowsFunctionAppArgs;
 * import com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigArgs;
 * import com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigApplicationStackArgs;
 * import com.pulumi.azure.appservice.FunctionAppFunction;
 * import com.pulumi.azure.appservice.FunctionAppFunctionArgs;
 * import com.pulumi.azure.appservice.inputs.FunctionAppFunctionFileArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleServicePlan = new ServicePlan(&#34;exampleServicePlan&#34;, ServicePlanArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .osType(&#34;Windows&#34;)
 *             .skuName(&#34;S1&#34;)
 *             .build());
 * 
 *         var test = new WindowsFunctionApp(&#34;test&#34;, WindowsFunctionAppArgs.builder()        
 *             .location(azurerm_resource_group.test().location())
 *             .resourceGroupName(azurerm_resource_group.test().name())
 *             .servicePlanId(azurerm_service_plan.test().id())
 *             .storageAccountName(azurerm_storage_account.test().name())
 *             .storageAccountAccessKey(azurerm_storage_account.test().primary_access_key())
 *             .siteConfig(WindowsFunctionAppSiteConfigArgs.builder()
 *                 .applicationStack(WindowsFunctionAppSiteConfigApplicationStackArgs.builder()
 *                     .dotnetVersion(&#34;6&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleFunctionAppFunction = new FunctionAppFunction(&#34;exampleFunctionAppFunction&#34;, FunctionAppFunctionArgs.builder()        
 *             .functionAppId(azurerm_linux_function_app.example().id())
 *             .language(&#34;CSharp&#34;)
 *             .files(FunctionAppFunctionFileArgs.builder()
 *                 .name(&#34;run.csx&#34;)
 *                 .content(Files.readString(Paths.get(&#34;exampledata/run.csx&#34;)))
 *                 .build())
 *             .testData(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;name&#34;, &#34;Azure&#34;)
 *                 )))
 *             .configJson(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;bindings&#34;, jsonArray(
 *                         jsonObject(
 *                             jsonProperty(&#34;authLevel&#34;, &#34;function&#34;),
 *                             jsonProperty(&#34;direction&#34;, &#34;in&#34;),
 *                             jsonProperty(&#34;methods&#34;, jsonArray(
 *                                 &#34;get&#34;, 
 *                                 &#34;post&#34;
 *                             )),
 *                             jsonProperty(&#34;name&#34;, &#34;req&#34;),
 *                             jsonProperty(&#34;type&#34;, &#34;httpTrigger&#34;)
 *                         ), 
 *                         jsonObject(
 *                             jsonProperty(&#34;direction&#34;, &#34;out&#34;),
 *                             jsonProperty(&#34;name&#34;, &#34;$return&#34;),
 *                             jsonProperty(&#34;type&#34;, &#34;http&#34;)
 *                         )
 *                     ))
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * a Function App Function can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appservice/functionAppFunction:FunctionAppFunction example &#34;/subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Web/sites/site1/functions/function1&#34;
 * ```
 * 
 */
@ResourceType(type="azure:appservice/functionAppFunction:FunctionAppFunction")
public class FunctionAppFunction extends com.pulumi.resources.CustomResource {
    /**
     * The config for this Function in JSON format.
     * 
     */
    @Export(name="configJson", type=String.class, parameters={})
    private Output<String> configJson;

    /**
     * @return The config for this Function in JSON format.
     * 
     */
    public Output<String> configJson() {
        return this.configJson;
    }
    /**
     * The URL of the configuration JSON.
     * 
     */
    @Export(name="configUrl", type=String.class, parameters={})
    private Output<String> configUrl;

    /**
     * @return The URL of the configuration JSON.
     * 
     */
    public Output<String> configUrl() {
        return this.configUrl;
    }
    /**
     * Should this function be enabled. Defaults to `true`.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Should this function be enabled. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * A `file` block as detailed below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="files", type=List.class, parameters={FunctionAppFunctionFile.class})
    private Output</* @Nullable */ List<FunctionAppFunctionFile>> files;

    /**
     * @return A `file` block as detailed below. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<List<FunctionAppFunctionFile>>> files() {
        return Codegen.optional(this.files);
    }
    /**
     * The ID of the Function App in which this function should reside. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="functionAppId", type=String.class, parameters={})
    private Output<String> functionAppId;

    /**
     * @return The ID of the Function App in which this function should reside. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> functionAppId() {
        return this.functionAppId;
    }
    /**
     * The invocation URL.
     * 
     */
    @Export(name="invocationUrl", type=String.class, parameters={})
    private Output<String> invocationUrl;

    /**
     * @return The invocation URL.
     * 
     */
    public Output<String> invocationUrl() {
        return this.invocationUrl;
    }
    /**
     * The language the Function is written in. Possible values are `CSharp`, `Custom`, `Java`, `Javascript`, `Python`, `PowerShell`, and `TypeScript`.
     * 
     */
    @Export(name="language", type=String.class, parameters={})
    private Output</* @Nullable */ String> language;

    /**
     * @return The language the Function is written in. Possible values are `CSharp`, `Custom`, `Java`, `Javascript`, `Python`, `PowerShell`, and `TypeScript`.
     * 
     */
    public Output<Optional<String>> language() {
        return Codegen.optional(this.language);
    }
    /**
     * The name of the function. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the function. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Script root path URL.
     * 
     */
    @Export(name="scriptRootPathUrl", type=String.class, parameters={})
    private Output<String> scriptRootPathUrl;

    /**
     * @return The Script root path URL.
     * 
     */
    public Output<String> scriptRootPathUrl() {
        return this.scriptRootPathUrl;
    }
    /**
     * The script URL.
     * 
     */
    @Export(name="scriptUrl", type=String.class, parameters={})
    private Output<String> scriptUrl;

    /**
     * @return The script URL.
     * 
     */
    public Output<String> scriptUrl() {
        return this.scriptUrl;
    }
    /**
     * The URL for the Secrets File.
     * 
     */
    @Export(name="secretsFileUrl", type=String.class, parameters={})
    private Output<String> secretsFileUrl;

    /**
     * @return The URL for the Secrets File.
     * 
     */
    public Output<String> secretsFileUrl() {
        return this.secretsFileUrl;
    }
    /**
     * The test data for the function.
     * 
     */
    @Export(name="testData", type=String.class, parameters={})
    private Output</* @Nullable */ String> testData;

    /**
     * @return The test data for the function.
     * 
     */
    public Output<Optional<String>> testData() {
        return Codegen.optional(this.testData);
    }
    /**
     * The Test data URL.
     * 
     */
    @Export(name="testDataUrl", type=String.class, parameters={})
    private Output<String> testDataUrl;

    /**
     * @return The Test data URL.
     * 
     */
    public Output<String> testDataUrl() {
        return this.testDataUrl;
    }
    /**
     * The function URL.
     * 
     */
    @Export(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return The function URL.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FunctionAppFunction(String name) {
        this(name, FunctionAppFunctionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FunctionAppFunction(String name, FunctionAppFunctionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FunctionAppFunction(String name, FunctionAppFunctionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/functionAppFunction:FunctionAppFunction", name, args == null ? FunctionAppFunctionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FunctionAppFunction(String name, Output<String> id, @Nullable FunctionAppFunctionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/functionAppFunction:FunctionAppFunction", name, state, makeResourceOptions(options, id));
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
    public static FunctionAppFunction get(String name, Output<String> id, @Nullable FunctionAppFunctionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FunctionAppFunction(name, id, state, options);
    }
}
