// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.automation.inputs.GetAccountArgs;
import com.pulumi.azure.automation.inputs.GetAccountPlainArgs;
import com.pulumi.azure.automation.inputs.GetBoolVariableArgs;
import com.pulumi.azure.automation.inputs.GetBoolVariablePlainArgs;
import com.pulumi.azure.automation.inputs.GetDateTimeVariableArgs;
import com.pulumi.azure.automation.inputs.GetDateTimeVariablePlainArgs;
import com.pulumi.azure.automation.inputs.GetIntVariableArgs;
import com.pulumi.azure.automation.inputs.GetIntVariablePlainArgs;
import com.pulumi.azure.automation.inputs.GetStringVariableArgs;
import com.pulumi.azure.automation.inputs.GetStringVariablePlainArgs;
import com.pulumi.azure.automation.outputs.GetAccountResult;
import com.pulumi.azure.automation.outputs.GetBoolVariableResult;
import com.pulumi.azure.automation.outputs.GetDateTimeVariableResult;
import com.pulumi.azure.automation.outputs.GetIntVariableResult;
import com.pulumi.azure.automation.outputs.GetStringVariableResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AutomationFunctions {
    /**
     * Use this data source to access information about an existing Automation Account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.automation.AutomationFunctions;
     * import com.pulumi.azure.automation.inputs.GetAccountArgs;
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
     *         final var example = AutomationFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;example-account&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;automationAccountId&#34;, example.applyValue(getAccountResult -&gt; getAccountResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAccountResult> getAccount(GetAccountArgs args) {
        return getAccount(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Automation Account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.automation.AutomationFunctions;
     * import com.pulumi.azure.automation.inputs.GetAccountArgs;
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
     *         final var example = AutomationFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;example-account&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;automationAccountId&#34;, example.applyValue(getAccountResult -&gt; getAccountResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccountPlain(GetAccountPlainArgs args) {
        return getAccountPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Automation Account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.automation.AutomationFunctions;
     * import com.pulumi.azure.automation.inputs.GetAccountArgs;
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
     *         final var example = AutomationFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;example-account&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;automationAccountId&#34;, example.applyValue(getAccountResult -&gt; getAccountResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAccountResult> getAccount(GetAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:automation/getAccount:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Automation Account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.automation.AutomationFunctions;
     * import com.pulumi.azure.automation.inputs.GetAccountArgs;
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
     *         final var example = AutomationFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;example-account&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;automationAccountId&#34;, example.applyValue(getAccountResult -&gt; getAccountResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccountPlain(GetAccountPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:automation/getAccount:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Automation Bool Variable.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.automation.AutomationFunctions;
     * import com.pulumi.azure.automation.inputs.GetBoolVariableArgs;
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
     *         final var example = AutomationFunctions.getBoolVariable(GetBoolVariableArgs.builder()
     *             .name(&#34;tfex-example-var&#34;)
     *             .resourceGroupName(&#34;tfex-example-rg&#34;)
     *             .automationAccountName(&#34;tfex-example-account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;variableId&#34;, example.applyValue(getBoolVariableResult -&gt; getBoolVariableResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetBoolVariableResult> getBoolVariable(GetBoolVariableArgs args) {
        return getBoolVariable(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Automation Bool Variable.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.automation.AutomationFunctions;
     * import com.pulumi.azure.automation.inputs.GetBoolVariableArgs;
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
     *         final var example = AutomationFunctions.getBoolVariable(GetBoolVariableArgs.builder()
     *             .name(&#34;tfex-example-var&#34;)
     *             .resourceGroupName(&#34;tfex-example-rg&#34;)
     *             .automationAccountName(&#34;tfex-example-account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;variableId&#34;, example.applyValue(getBoolVariableResult -&gt; getBoolVariableResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetBoolVariableResult> getBoolVariablePlain(GetBoolVariablePlainArgs args) {
        return getBoolVariablePlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Automation Bool Variable.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.automation.AutomationFunctions;
     * import com.pulumi.azure.automation.inputs.GetBoolVariableArgs;
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
     *         final var example = AutomationFunctions.getBoolVariable(GetBoolVariableArgs.builder()
     *             .name(&#34;tfex-example-var&#34;)
     *             .resourceGroupName(&#34;tfex-example-rg&#34;)
     *             .automationAccountName(&#34;tfex-example-account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;variableId&#34;, example.applyValue(getBoolVariableResult -&gt; getBoolVariableResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetBoolVariableResult> getBoolVariable(GetBoolVariableArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:automation/getBoolVariable:getBoolVariable", TypeShape.of(GetBoolVariableResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Automation Bool Variable.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.automation.AutomationFunctions;
     * import com.pulumi.azure.automation.inputs.GetBoolVariableArgs;
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
     *         final var example = AutomationFunctions.getBoolVariable(GetBoolVariableArgs.builder()
     *             .name(&#34;tfex-example-var&#34;)
     *             .resourceGroupName(&#34;tfex-example-rg&#34;)
     *             .automationAccountName(&#34;tfex-example-account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;variableId&#34;, example.applyValue(getBoolVariableResult -&gt; getBoolVariableResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetBoolVariableResult> getBoolVariablePlain(GetBoolVariablePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:automation/getBoolVariable:getBoolVariable", TypeShape.of(GetBoolVariableResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Automation Datetime Variable.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.automation.AutomationFunctions;
     * import com.pulumi.azure.automation.inputs.GetDateTimeVariableArgs;
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
     *         final var example = AutomationFunctions.getDateTimeVariable(GetDateTimeVariableArgs.builder()
     *             .name(&#34;tfex-example-var&#34;)
     *             .resourceGroupName(&#34;tfex-example-rg&#34;)
     *             .automationAccountName(&#34;tfex-example-account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;variableId&#34;, example.applyValue(getDateTimeVariableResult -&gt; getDateTimeVariableResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDateTimeVariableResult> getDateTimeVariable(GetDateTimeVariableArgs args) {
        return getDateTimeVariable(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Automation Datetime Variable.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.automation.AutomationFunctions;
     * import com.pulumi.azure.automation.inputs.GetDateTimeVariableArgs;
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
     *         final var example = AutomationFunctions.getDateTimeVariable(GetDateTimeVariableArgs.builder()
     *             .name(&#34;tfex-example-var&#34;)
     *             .resourceGroupName(&#34;tfex-example-rg&#34;)
     *             .automationAccountName(&#34;tfex-example-account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;variableId&#34;, example.applyValue(getDateTimeVariableResult -&gt; getDateTimeVariableResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDateTimeVariableResult> getDateTimeVariablePlain(GetDateTimeVariablePlainArgs args) {
        return getDateTimeVariablePlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Automation Datetime Variable.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.automation.AutomationFunctions;
     * import com.pulumi.azure.automation.inputs.GetDateTimeVariableArgs;
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
     *         final var example = AutomationFunctions.getDateTimeVariable(GetDateTimeVariableArgs.builder()
     *             .name(&#34;tfex-example-var&#34;)
     *             .resourceGroupName(&#34;tfex-example-rg&#34;)
     *             .automationAccountName(&#34;tfex-example-account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;variableId&#34;, example.applyValue(getDateTimeVariableResult -&gt; getDateTimeVariableResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDateTimeVariableResult> getDateTimeVariable(GetDateTimeVariableArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:automation/getDateTimeVariable:getDateTimeVariable", TypeShape.of(GetDateTimeVariableResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Automation Datetime Variable.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.automation.AutomationFunctions;
     * import com.pulumi.azure.automation.inputs.GetDateTimeVariableArgs;
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
     *         final var example = AutomationFunctions.getDateTimeVariable(GetDateTimeVariableArgs.builder()
     *             .name(&#34;tfex-example-var&#34;)
     *             .resourceGroupName(&#34;tfex-example-rg&#34;)
     *             .automationAccountName(&#34;tfex-example-account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;variableId&#34;, example.applyValue(getDateTimeVariableResult -&gt; getDateTimeVariableResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDateTimeVariableResult> getDateTimeVariablePlain(GetDateTimeVariablePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:automation/getDateTimeVariable:getDateTimeVariable", TypeShape.of(GetDateTimeVariableResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Automation Int Variable.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.automation.AutomationFunctions;
     * import com.pulumi.azure.automation.inputs.GetIntVariableArgs;
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
     *         final var example = AutomationFunctions.getIntVariable(GetIntVariableArgs.builder()
     *             .name(&#34;tfex-example-var&#34;)
     *             .resourceGroupName(&#34;tfex-example-rg&#34;)
     *             .automationAccountName(&#34;tfex-example-account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;variableId&#34;, example.applyValue(getIntVariableResult -&gt; getIntVariableResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetIntVariableResult> getIntVariable(GetIntVariableArgs args) {
        return getIntVariable(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Automation Int Variable.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.automation.AutomationFunctions;
     * import com.pulumi.azure.automation.inputs.GetIntVariableArgs;
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
     *         final var example = AutomationFunctions.getIntVariable(GetIntVariableArgs.builder()
     *             .name(&#34;tfex-example-var&#34;)
     *             .resourceGroupName(&#34;tfex-example-rg&#34;)
     *             .automationAccountName(&#34;tfex-example-account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;variableId&#34;, example.applyValue(getIntVariableResult -&gt; getIntVariableResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetIntVariableResult> getIntVariablePlain(GetIntVariablePlainArgs args) {
        return getIntVariablePlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Automation Int Variable.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.automation.AutomationFunctions;
     * import com.pulumi.azure.automation.inputs.GetIntVariableArgs;
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
     *         final var example = AutomationFunctions.getIntVariable(GetIntVariableArgs.builder()
     *             .name(&#34;tfex-example-var&#34;)
     *             .resourceGroupName(&#34;tfex-example-rg&#34;)
     *             .automationAccountName(&#34;tfex-example-account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;variableId&#34;, example.applyValue(getIntVariableResult -&gt; getIntVariableResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetIntVariableResult> getIntVariable(GetIntVariableArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:automation/getIntVariable:getIntVariable", TypeShape.of(GetIntVariableResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Automation Int Variable.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.automation.AutomationFunctions;
     * import com.pulumi.azure.automation.inputs.GetIntVariableArgs;
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
     *         final var example = AutomationFunctions.getIntVariable(GetIntVariableArgs.builder()
     *             .name(&#34;tfex-example-var&#34;)
     *             .resourceGroupName(&#34;tfex-example-rg&#34;)
     *             .automationAccountName(&#34;tfex-example-account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;variableId&#34;, example.applyValue(getIntVariableResult -&gt; getIntVariableResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetIntVariableResult> getIntVariablePlain(GetIntVariablePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:automation/getIntVariable:getIntVariable", TypeShape.of(GetIntVariableResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Automation String Variable.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.automation.AutomationFunctions;
     * import com.pulumi.azure.automation.inputs.GetStringVariableArgs;
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
     *         final var example = AutomationFunctions.getStringVariable(GetStringVariableArgs.builder()
     *             .name(&#34;tfex-example-var&#34;)
     *             .resourceGroupName(&#34;tfex-example-rg&#34;)
     *             .automationAccountName(&#34;tfex-example-account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;variableId&#34;, example.applyValue(getStringVariableResult -&gt; getStringVariableResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetStringVariableResult> getStringVariable(GetStringVariableArgs args) {
        return getStringVariable(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Automation String Variable.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.automation.AutomationFunctions;
     * import com.pulumi.azure.automation.inputs.GetStringVariableArgs;
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
     *         final var example = AutomationFunctions.getStringVariable(GetStringVariableArgs.builder()
     *             .name(&#34;tfex-example-var&#34;)
     *             .resourceGroupName(&#34;tfex-example-rg&#34;)
     *             .automationAccountName(&#34;tfex-example-account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;variableId&#34;, example.applyValue(getStringVariableResult -&gt; getStringVariableResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetStringVariableResult> getStringVariablePlain(GetStringVariablePlainArgs args) {
        return getStringVariablePlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Automation String Variable.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.automation.AutomationFunctions;
     * import com.pulumi.azure.automation.inputs.GetStringVariableArgs;
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
     *         final var example = AutomationFunctions.getStringVariable(GetStringVariableArgs.builder()
     *             .name(&#34;tfex-example-var&#34;)
     *             .resourceGroupName(&#34;tfex-example-rg&#34;)
     *             .automationAccountName(&#34;tfex-example-account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;variableId&#34;, example.applyValue(getStringVariableResult -&gt; getStringVariableResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetStringVariableResult> getStringVariable(GetStringVariableArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:automation/getStringVariable:getStringVariable", TypeShape.of(GetStringVariableResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Automation String Variable.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.automation.AutomationFunctions;
     * import com.pulumi.azure.automation.inputs.GetStringVariableArgs;
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
     *         final var example = AutomationFunctions.getStringVariable(GetStringVariableArgs.builder()
     *             .name(&#34;tfex-example-var&#34;)
     *             .resourceGroupName(&#34;tfex-example-rg&#34;)
     *             .automationAccountName(&#34;tfex-example-account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;variableId&#34;, example.applyValue(getStringVariableResult -&gt; getStringVariableResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetStringVariableResult> getStringVariablePlain(GetStringVariablePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:automation/getStringVariable:getStringVariable", TypeShape.of(GetStringVariableResult.class), args, Utilities.withVersion(options));
    }
}
