// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.sentinel.DataConnectorAwsS3Args;
import com.pulumi.azure.sentinel.inputs.DataConnectorAwsS3State;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a AWS S3 Data Connector.
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
 * import com.pulumi.azure.operationalinsights.AnalyticsWorkspace;
 * import com.pulumi.azure.operationalinsights.AnalyticsWorkspaceArgs;
 * import com.pulumi.azure.operationalinsights.AnalyticsSolution;
 * import com.pulumi.azure.operationalinsights.AnalyticsSolutionArgs;
 * import com.pulumi.azure.operationalinsights.inputs.AnalyticsSolutionPlanArgs;
 * import com.pulumi.azure.sentinel.DataConnectorAwsS3;
 * import com.pulumi.azure.sentinel.DataConnectorAwsS3Args;
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
 *         var exampleAnalyticsWorkspace = new AnalyticsWorkspace(&#34;exampleAnalyticsWorkspace&#34;, AnalyticsWorkspaceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sku(&#34;PerGB2018&#34;)
 *             .build());
 * 
 *         var exampleAnalyticsSolution = new AnalyticsSolution(&#34;exampleAnalyticsSolution&#34;, AnalyticsSolutionArgs.builder()        
 *             .solutionName(&#34;SecurityInsights&#34;)
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .workspaceResourceId(exampleAnalyticsWorkspace.id())
 *             .workspaceName(exampleAnalyticsWorkspace.name())
 *             .plan(AnalyticsSolutionPlanArgs.builder()
 *                 .publisher(&#34;Microsoft&#34;)
 *                 .product(&#34;OMSGallery/SecurityInsights&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleDataConnectorAwsS3 = new DataConnectorAwsS3(&#34;exampleDataConnectorAwsS3&#34;, DataConnectorAwsS3Args.builder()        
 *             .logAnalyticsWorkspaceId(exampleAnalyticsSolution.workspaceResourceId())
 *             .awsRoleArn(&#34;arn:aws:iam::000000000000:role/role1&#34;)
 *             .destinationTable(&#34;AWSGuardDuty&#34;)
 *             .sqsUrls(&#34;https://sqs.us-east-1.amazonaws.com/000000000000/example&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleAnalyticsSolution)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * AWS S3 Data Connectors can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:sentinel/dataConnectorAwsS3:DataConnectorAwsS3 example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/dataConnectors/dc1
 * ```
 * 
 */
@ResourceType(type="azure:sentinel/dataConnectorAwsS3:DataConnectorAwsS3")
public class DataConnectorAwsS3 extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the AWS role, which is connected to this AWS CloudTrail Data Connector. See the [Azure document](https://docs.microsoft.com/azure/sentinel/connect-aws?tabs=s3#create-an-aws-assumed-role-and-grant-access-to-the-aws-sentinel-account) for details.
     * 
     */
    @Export(name="awsRoleArn", type=String.class, parameters={})
    private Output<String> awsRoleArn;

    /**
     * @return The ARN of the AWS role, which is connected to this AWS CloudTrail Data Connector. See the [Azure document](https://docs.microsoft.com/azure/sentinel/connect-aws?tabs=s3#create-an-aws-assumed-role-and-grant-access-to-the-aws-sentinel-account) for details.
     * 
     */
    public Output<String> awsRoleArn() {
        return this.awsRoleArn;
    }
    /**
     * The name of the Log Analytics table that will store the ingested data.
     * 
     */
    @Export(name="destinationTable", type=String.class, parameters={})
    private Output<String> destinationTable;

    /**
     * @return The name of the Log Analytics table that will store the ingested data.
     * 
     */
    public Output<String> destinationTable() {
        return this.destinationTable;
    }
    /**
     * The ID of the Log Analytics Workspace that this AWS S3 Data Connector resides in. Changing this forces a new AWS S3 Data Connector to be created.
     * 
     */
    @Export(name="logAnalyticsWorkspaceId", type=String.class, parameters={})
    private Output<String> logAnalyticsWorkspaceId;

    /**
     * @return The ID of the Log Analytics Workspace that this AWS S3 Data Connector resides in. Changing this forces a new AWS S3 Data Connector to be created.
     * 
     */
    public Output<String> logAnalyticsWorkspaceId() {
        return this.logAnalyticsWorkspaceId;
    }
    /**
     * The name which should be used for this AWS S3 Data Connector. Changing this forces a new AWS S3 Data Connector to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this AWS S3 Data Connector. Changing this forces a new AWS S3 Data Connector to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies a list of AWS SQS urls for the AWS S3 Data Connector.
     * 
     */
    @Export(name="sqsUrls", type=List.class, parameters={String.class})
    private Output<List<String>> sqsUrls;

    /**
     * @return Specifies a list of AWS SQS urls for the AWS S3 Data Connector.
     * 
     */
    public Output<List<String>> sqsUrls() {
        return this.sqsUrls;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataConnectorAwsS3(String name) {
        this(name, DataConnectorAwsS3Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataConnectorAwsS3(String name, DataConnectorAwsS3Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataConnectorAwsS3(String name, DataConnectorAwsS3Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:sentinel/dataConnectorAwsS3:DataConnectorAwsS3", name, args == null ? DataConnectorAwsS3Args.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataConnectorAwsS3(String name, Output<String> id, @Nullable DataConnectorAwsS3State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:sentinel/dataConnectorAwsS3:DataConnectorAwsS3", name, state, makeResourceOptions(options, id));
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
    public static DataConnectorAwsS3 get(String name, Output<String> id, @Nullable DataConnectorAwsS3State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataConnectorAwsS3(name, id, state, options);
    }
}
