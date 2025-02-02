// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appservice.StaticSiteCustomDomainArgs;
import com.pulumi.azure.appservice.inputs.StaticSiteCustomDomainState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### CNAME validation
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.appservice.StaticSite;
 * import com.pulumi.azure.appservice.StaticSiteArgs;
 * import com.pulumi.azure.dns.CNameRecord;
 * import com.pulumi.azure.dns.CNameRecordArgs;
 * import com.pulumi.azure.appservice.StaticSiteCustomDomain;
 * import com.pulumi.azure.appservice.StaticSiteCustomDomainArgs;
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
 *         var exampleStaticSite = new StaticSite(&#34;exampleStaticSite&#34;, StaticSiteArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .build());
 * 
 *         var exampleCNameRecord = new CNameRecord(&#34;exampleCNameRecord&#34;, CNameRecordArgs.builder()        
 *             .zoneName(&#34;contoso.com&#34;)
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .ttl(300)
 *             .record(exampleStaticSite.defaultHostName())
 *             .build());
 * 
 *         var exampleStaticSiteCustomDomain = new StaticSiteCustomDomain(&#34;exampleStaticSiteCustomDomain&#34;, StaticSiteCustomDomainArgs.builder()        
 *             .staticSiteId(exampleStaticSite.id())
 *             .domainName(Output.tuple(exampleCNameRecord.name(), exampleCNameRecord.zoneName()).applyValue(values -&gt; {
 *                 var name = values.t1;
 *                 var zoneName = values.t2;
 *                 return String.format(&#34;%s.%s&#34;, name,zoneName);
 *             }))
 *             .validationType(&#34;cname-delegation&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Static Site Custom Domains can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appservice/staticSiteCustomDomain:StaticSiteCustomDomain example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.Web/staticSites/my-static-site1/customDomains/name.contoso.com
 * ```
 * 
 */
@ResourceType(type="azure:appservice/staticSiteCustomDomain:StaticSiteCustomDomain")
public class StaticSiteCustomDomain extends com.pulumi.resources.CustomResource {
    /**
     * The Domain Name which should be associated with this Static Site. Changing this forces a new Static Site Custom Domain to be created.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return The Domain Name which should be associated with this Static Site. Changing this forces a new Static Site Custom Domain to be created.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * The ID of the Static Site. Changing this forces a new Static Site Custom Domain to be created.
     * 
     */
    @Export(name="staticSiteId", type=String.class, parameters={})
    private Output<String> staticSiteId;

    /**
     * @return The ID of the Static Site. Changing this forces a new Static Site Custom Domain to be created.
     * 
     */
    public Output<String> staticSiteId() {
        return this.staticSiteId;
    }
    /**
     * Token to be used with `dns-txt-token` validation.
     * 
     */
    @Export(name="validationToken", type=String.class, parameters={})
    private Output<String> validationToken;

    /**
     * @return Token to be used with `dns-txt-token` validation.
     * 
     */
    public Output<String> validationToken() {
        return this.validationToken;
    }
    /**
     * One of `cname-delegation` or `dns-txt-token`. Changing this forces a new Static Site Custom Domain to be created.
     * 
     */
    @Export(name="validationType", type=String.class, parameters={})
    private Output</* @Nullable */ String> validationType;

    /**
     * @return One of `cname-delegation` or `dns-txt-token`. Changing this forces a new Static Site Custom Domain to be created.
     * 
     */
    public Output<Optional<String>> validationType() {
        return Codegen.optional(this.validationType);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StaticSiteCustomDomain(String name) {
        this(name, StaticSiteCustomDomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StaticSiteCustomDomain(String name, StaticSiteCustomDomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StaticSiteCustomDomain(String name, StaticSiteCustomDomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/staticSiteCustomDomain:StaticSiteCustomDomain", name, args == null ? StaticSiteCustomDomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StaticSiteCustomDomain(String name, Output<String> id, @Nullable StaticSiteCustomDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/staticSiteCustomDomain:StaticSiteCustomDomain", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "validationToken"
            ))
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
    public static StaticSiteCustomDomain get(String name, Output<String> id, @Nullable StaticSiteCustomDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StaticSiteCustomDomain(name, id, state, options);
    }
}
