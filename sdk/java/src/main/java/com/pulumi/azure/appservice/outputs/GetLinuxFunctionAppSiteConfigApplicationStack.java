// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.GetLinuxFunctionAppSiteConfigApplicationStackDocker;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLinuxFunctionAppSiteConfigApplicationStack {
    /**
     * @return One or more `docker` blocks as defined below.
     * 
     */
    private List<GetLinuxFunctionAppSiteConfigApplicationStackDocker> dockers;
    /**
     * @return The version of .NET used.
     * 
     */
    private String dotnetVersion;
    /**
     * @return The Version of Java used.
     * 
     */
    private String javaVersion;
    /**
     * @return The version of Node used.
     * 
     */
    private String nodeVersion;
    /**
     * @return The version of PowerShell Core used.
     * 
     */
    private String powershellCoreVersion;
    /**
     * @return The version of Python used.
     * 
     */
    private String pythonVersion;
    /**
     * @return Does the Linux Function App use a custom runtime?
     * 
     */
    private Boolean useCustomRuntime;
    private Boolean useDotnetIsolatedRuntime;

    private GetLinuxFunctionAppSiteConfigApplicationStack() {}
    /**
     * @return One or more `docker` blocks as defined below.
     * 
     */
    public List<GetLinuxFunctionAppSiteConfigApplicationStackDocker> dockers() {
        return this.dockers;
    }
    /**
     * @return The version of .NET used.
     * 
     */
    public String dotnetVersion() {
        return this.dotnetVersion;
    }
    /**
     * @return The Version of Java used.
     * 
     */
    public String javaVersion() {
        return this.javaVersion;
    }
    /**
     * @return The version of Node used.
     * 
     */
    public String nodeVersion() {
        return this.nodeVersion;
    }
    /**
     * @return The version of PowerShell Core used.
     * 
     */
    public String powershellCoreVersion() {
        return this.powershellCoreVersion;
    }
    /**
     * @return The version of Python used.
     * 
     */
    public String pythonVersion() {
        return this.pythonVersion;
    }
    /**
     * @return Does the Linux Function App use a custom runtime?
     * 
     */
    public Boolean useCustomRuntime() {
        return this.useCustomRuntime;
    }
    public Boolean useDotnetIsolatedRuntime() {
        return this.useDotnetIsolatedRuntime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinuxFunctionAppSiteConfigApplicationStack defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetLinuxFunctionAppSiteConfigApplicationStackDocker> dockers;
        private String dotnetVersion;
        private String javaVersion;
        private String nodeVersion;
        private String powershellCoreVersion;
        private String pythonVersion;
        private Boolean useCustomRuntime;
        private Boolean useDotnetIsolatedRuntime;
        public Builder() {}
        public Builder(GetLinuxFunctionAppSiteConfigApplicationStack defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dockers = defaults.dockers;
    	      this.dotnetVersion = defaults.dotnetVersion;
    	      this.javaVersion = defaults.javaVersion;
    	      this.nodeVersion = defaults.nodeVersion;
    	      this.powershellCoreVersion = defaults.powershellCoreVersion;
    	      this.pythonVersion = defaults.pythonVersion;
    	      this.useCustomRuntime = defaults.useCustomRuntime;
    	      this.useDotnetIsolatedRuntime = defaults.useDotnetIsolatedRuntime;
        }

        @CustomType.Setter
        public Builder dockers(List<GetLinuxFunctionAppSiteConfigApplicationStackDocker> dockers) {
            this.dockers = Objects.requireNonNull(dockers);
            return this;
        }
        public Builder dockers(GetLinuxFunctionAppSiteConfigApplicationStackDocker... dockers) {
            return dockers(List.of(dockers));
        }
        @CustomType.Setter
        public Builder dotnetVersion(String dotnetVersion) {
            this.dotnetVersion = Objects.requireNonNull(dotnetVersion);
            return this;
        }
        @CustomType.Setter
        public Builder javaVersion(String javaVersion) {
            this.javaVersion = Objects.requireNonNull(javaVersion);
            return this;
        }
        @CustomType.Setter
        public Builder nodeVersion(String nodeVersion) {
            this.nodeVersion = Objects.requireNonNull(nodeVersion);
            return this;
        }
        @CustomType.Setter
        public Builder powershellCoreVersion(String powershellCoreVersion) {
            this.powershellCoreVersion = Objects.requireNonNull(powershellCoreVersion);
            return this;
        }
        @CustomType.Setter
        public Builder pythonVersion(String pythonVersion) {
            this.pythonVersion = Objects.requireNonNull(pythonVersion);
            return this;
        }
        @CustomType.Setter
        public Builder useCustomRuntime(Boolean useCustomRuntime) {
            this.useCustomRuntime = Objects.requireNonNull(useCustomRuntime);
            return this;
        }
        @CustomType.Setter
        public Builder useDotnetIsolatedRuntime(Boolean useDotnetIsolatedRuntime) {
            this.useDotnetIsolatedRuntime = Objects.requireNonNull(useDotnetIsolatedRuntime);
            return this;
        }
        public GetLinuxFunctionAppSiteConfigApplicationStack build() {
            final var o = new GetLinuxFunctionAppSiteConfigApplicationStack();
            o.dockers = dockers;
            o.dotnetVersion = dotnetVersion;
            o.javaVersion = javaVersion;
            o.nodeVersion = nodeVersion;
            o.powershellCoreVersion = powershellCoreVersion;
            o.pythonVersion = pythonVersion;
            o.useCustomRuntime = useCustomRuntime;
            o.useDotnetIsolatedRuntime = useDotnetIsolatedRuntime;
            return o;
        }
    }
}
