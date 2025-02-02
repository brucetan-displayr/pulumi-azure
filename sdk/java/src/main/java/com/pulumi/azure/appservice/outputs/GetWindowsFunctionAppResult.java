// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.GetWindowsFunctionAppAuthSetting;
import com.pulumi.azure.appservice.outputs.GetWindowsFunctionAppBackup;
import com.pulumi.azure.appservice.outputs.GetWindowsFunctionAppConnectionString;
import com.pulumi.azure.appservice.outputs.GetWindowsFunctionAppIdentity;
import com.pulumi.azure.appservice.outputs.GetWindowsFunctionAppSiteConfig;
import com.pulumi.azure.appservice.outputs.GetWindowsFunctionAppSiteCredential;
import com.pulumi.azure.appservice.outputs.GetWindowsFunctionAppStickySetting;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetWindowsFunctionAppResult {
    /**
     * @return A `map of key-value pairs for App Settings and custom values.
     * 
     */
    private Map<String,String> appSettings;
    /**
     * @return A `auth_settings` block as defined below.
     * 
     */
    private List<GetWindowsFunctionAppAuthSetting> authSettings;
    /**
     * @return A `backup` block as defined below.
     * 
     */
    private List<GetWindowsFunctionAppBackup> backups;
    /**
     * @return Is the built-in logging enabled?
     * 
     */
    private Boolean builtinLoggingEnabled;
    /**
     * @return Is the use of Client Certificates enabled?
     * 
     */
    private Boolean clientCertificateEnabled;
    /**
     * @return Paths to exclude when using client certificates, separated by ;
     * 
     */
    private String clientCertificateExclusionPaths;
    /**
     * @return The mode of the Function App&#39;s client certificates requirement for incoming requests.
     * 
     */
    private String clientCertificateMode;
    /**
     * @return One or more `connection_string` blocks as defined below.
     * 
     */
    private List<GetWindowsFunctionAppConnectionString> connectionStrings;
    /**
     * @return Are Content Share Settings disabled?
     * 
     */
    private Boolean contentShareForceDisabled;
    /**
     * @return The identifier used by App Service to perform domain ownership verification via DNS TXT record.
     * 
     */
    private String customDomainVerificationId;
    /**
     * @return The amount of memory in gigabyte-seconds that your application is allowed to consume per day.
     * 
     */
    private Integer dailyMemoryTimeQuota;
    /**
     * @return The default hostname of the Windows Function App.
     * 
     */
    private String defaultHostname;
    /**
     * @return Is the Backup Job enabled?
     * 
     */
    private Boolean enabled;
    /**
     * @return The runtime version associated with the Function App.
     * 
     */
    private String functionsExtensionVersion;
    /**
     * @return Is the Function App only accessible via HTTPS?
     * 
     */
    private Boolean httpsOnly;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A `identity` block as defined below.
     * 
     */
    private List<GetWindowsFunctionAppIdentity> identities;
    /**
     * @return The Kind value for this Windows Function App.
     * 
     */
    private String kind;
    /**
     * @return The Azure Region where the Windows Function App exists.
     * 
     */
    private String location;
    /**
     * @return The Site Credentials Username used for publishing.
     * 
     */
    private String name;
    /**
     * @return A list of outbound IP addresses.
     * 
     */
    private List<String> outboundIpAddressLists;
    /**
     * @return A comma separated list of outbound IP addresses as a string. For example `52.23.25.3,52.143.43.12`.
     * 
     */
    private String outboundIpAddresses;
    /**
     * @return AA list of possible outbound IP addresses, not all of which are necessarily in use.
     * 
     */
    private List<String> possibleOutboundIpAddressLists;
    /**
     * @return A list of possible outbound IP addresses, not all of which are necessarily in use. This is a superset of `outbound_ip_address_list`. For example `[&#34;52.23.25.3&#34;, &#34;52.143.43.12&#34;]`.
     * 
     */
    private String possibleOutboundIpAddresses;
    private String resourceGroupName;
    /**
     * @return The ID of the App Service Plan.
     * 
     */
    private String servicePlanId;
    /**
     * @return A `site_config` block as defined below.
     * 
     */
    private List<GetWindowsFunctionAppSiteConfig> siteConfigs;
    /**
     * @return A `site_credential` block as defined below.
     * 
     */
    private List<GetWindowsFunctionAppSiteCredential> siteCredentials;
    /**
     * @return A `sticky_settings` block as defined below.
     * 
     */
    private List<GetWindowsFunctionAppStickySetting> stickySettings;
    /**
     * @return The access key which is used to access the backend storage account for the Function App.
     * 
     */
    private String storageAccountAccessKey;
    /**
     * @return The backend storage account name which is used by this Function App.
     * 
     */
    private String storageAccountName;
    /**
     * @return The Key Vault Secret ID, including version, that contains the Connection String used to connect to the storage account for this Function App.
     * 
     */
    private String storageKeyVaultSecretId;
    /**
     * @return Is the Function App using a Managed Identity to access the storage account?
     * 
     */
    private Boolean storageUsesManagedIdentity;
    /**
     * @return A mapping of tags assigned to the Windows Function App.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return The subnet id which the Windows Function App is vNet Integrated with.
     * 
     */
    private String virtualNetworkSubnetId;

    private GetWindowsFunctionAppResult() {}
    /**
     * @return A `map of key-value pairs for App Settings and custom values.
     * 
     */
    public Map<String,String> appSettings() {
        return this.appSettings;
    }
    /**
     * @return A `auth_settings` block as defined below.
     * 
     */
    public List<GetWindowsFunctionAppAuthSetting> authSettings() {
        return this.authSettings;
    }
    /**
     * @return A `backup` block as defined below.
     * 
     */
    public List<GetWindowsFunctionAppBackup> backups() {
        return this.backups;
    }
    /**
     * @return Is the built-in logging enabled?
     * 
     */
    public Boolean builtinLoggingEnabled() {
        return this.builtinLoggingEnabled;
    }
    /**
     * @return Is the use of Client Certificates enabled?
     * 
     */
    public Boolean clientCertificateEnabled() {
        return this.clientCertificateEnabled;
    }
    /**
     * @return Paths to exclude when using client certificates, separated by ;
     * 
     */
    public String clientCertificateExclusionPaths() {
        return this.clientCertificateExclusionPaths;
    }
    /**
     * @return The mode of the Function App&#39;s client certificates requirement for incoming requests.
     * 
     */
    public String clientCertificateMode() {
        return this.clientCertificateMode;
    }
    /**
     * @return One or more `connection_string` blocks as defined below.
     * 
     */
    public List<GetWindowsFunctionAppConnectionString> connectionStrings() {
        return this.connectionStrings;
    }
    /**
     * @return Are Content Share Settings disabled?
     * 
     */
    public Boolean contentShareForceDisabled() {
        return this.contentShareForceDisabled;
    }
    /**
     * @return The identifier used by App Service to perform domain ownership verification via DNS TXT record.
     * 
     */
    public String customDomainVerificationId() {
        return this.customDomainVerificationId;
    }
    /**
     * @return The amount of memory in gigabyte-seconds that your application is allowed to consume per day.
     * 
     */
    public Integer dailyMemoryTimeQuota() {
        return this.dailyMemoryTimeQuota;
    }
    /**
     * @return The default hostname of the Windows Function App.
     * 
     */
    public String defaultHostname() {
        return this.defaultHostname;
    }
    /**
     * @return Is the Backup Job enabled?
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The runtime version associated with the Function App.
     * 
     */
    public String functionsExtensionVersion() {
        return this.functionsExtensionVersion;
    }
    /**
     * @return Is the Function App only accessible via HTTPS?
     * 
     */
    public Boolean httpsOnly() {
        return this.httpsOnly;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A `identity` block as defined below.
     * 
     */
    public List<GetWindowsFunctionAppIdentity> identities() {
        return this.identities;
    }
    /**
     * @return The Kind value for this Windows Function App.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The Azure Region where the Windows Function App exists.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The Site Credentials Username used for publishing.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A list of outbound IP addresses.
     * 
     */
    public List<String> outboundIpAddressLists() {
        return this.outboundIpAddressLists;
    }
    /**
     * @return A comma separated list of outbound IP addresses as a string. For example `52.23.25.3,52.143.43.12`.
     * 
     */
    public String outboundIpAddresses() {
        return this.outboundIpAddresses;
    }
    /**
     * @return AA list of possible outbound IP addresses, not all of which are necessarily in use.
     * 
     */
    public List<String> possibleOutboundIpAddressLists() {
        return this.possibleOutboundIpAddressLists;
    }
    /**
     * @return A list of possible outbound IP addresses, not all of which are necessarily in use. This is a superset of `outbound_ip_address_list`. For example `[&#34;52.23.25.3&#34;, &#34;52.143.43.12&#34;]`.
     * 
     */
    public String possibleOutboundIpAddresses() {
        return this.possibleOutboundIpAddresses;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The ID of the App Service Plan.
     * 
     */
    public String servicePlanId() {
        return this.servicePlanId;
    }
    /**
     * @return A `site_config` block as defined below.
     * 
     */
    public List<GetWindowsFunctionAppSiteConfig> siteConfigs() {
        return this.siteConfigs;
    }
    /**
     * @return A `site_credential` block as defined below.
     * 
     */
    public List<GetWindowsFunctionAppSiteCredential> siteCredentials() {
        return this.siteCredentials;
    }
    /**
     * @return A `sticky_settings` block as defined below.
     * 
     */
    public List<GetWindowsFunctionAppStickySetting> stickySettings() {
        return this.stickySettings;
    }
    /**
     * @return The access key which is used to access the backend storage account for the Function App.
     * 
     */
    public String storageAccountAccessKey() {
        return this.storageAccountAccessKey;
    }
    /**
     * @return The backend storage account name which is used by this Function App.
     * 
     */
    public String storageAccountName() {
        return this.storageAccountName;
    }
    /**
     * @return The Key Vault Secret ID, including version, that contains the Connection String used to connect to the storage account for this Function App.
     * 
     */
    public String storageKeyVaultSecretId() {
        return this.storageKeyVaultSecretId;
    }
    /**
     * @return Is the Function App using a Managed Identity to access the storage account?
     * 
     */
    public Boolean storageUsesManagedIdentity() {
        return this.storageUsesManagedIdentity;
    }
    /**
     * @return A mapping of tags assigned to the Windows Function App.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The subnet id which the Windows Function App is vNet Integrated with.
     * 
     */
    public String virtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWindowsFunctionAppResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> appSettings;
        private List<GetWindowsFunctionAppAuthSetting> authSettings;
        private List<GetWindowsFunctionAppBackup> backups;
        private Boolean builtinLoggingEnabled;
        private Boolean clientCertificateEnabled;
        private String clientCertificateExclusionPaths;
        private String clientCertificateMode;
        private List<GetWindowsFunctionAppConnectionString> connectionStrings;
        private Boolean contentShareForceDisabled;
        private String customDomainVerificationId;
        private Integer dailyMemoryTimeQuota;
        private String defaultHostname;
        private Boolean enabled;
        private String functionsExtensionVersion;
        private Boolean httpsOnly;
        private String id;
        private List<GetWindowsFunctionAppIdentity> identities;
        private String kind;
        private String location;
        private String name;
        private List<String> outboundIpAddressLists;
        private String outboundIpAddresses;
        private List<String> possibleOutboundIpAddressLists;
        private String possibleOutboundIpAddresses;
        private String resourceGroupName;
        private String servicePlanId;
        private List<GetWindowsFunctionAppSiteConfig> siteConfigs;
        private List<GetWindowsFunctionAppSiteCredential> siteCredentials;
        private List<GetWindowsFunctionAppStickySetting> stickySettings;
        private String storageAccountAccessKey;
        private String storageAccountName;
        private String storageKeyVaultSecretId;
        private Boolean storageUsesManagedIdentity;
        private Map<String,String> tags;
        private String virtualNetworkSubnetId;
        public Builder() {}
        public Builder(GetWindowsFunctionAppResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appSettings = defaults.appSettings;
    	      this.authSettings = defaults.authSettings;
    	      this.backups = defaults.backups;
    	      this.builtinLoggingEnabled = defaults.builtinLoggingEnabled;
    	      this.clientCertificateEnabled = defaults.clientCertificateEnabled;
    	      this.clientCertificateExclusionPaths = defaults.clientCertificateExclusionPaths;
    	      this.clientCertificateMode = defaults.clientCertificateMode;
    	      this.connectionStrings = defaults.connectionStrings;
    	      this.contentShareForceDisabled = defaults.contentShareForceDisabled;
    	      this.customDomainVerificationId = defaults.customDomainVerificationId;
    	      this.dailyMemoryTimeQuota = defaults.dailyMemoryTimeQuota;
    	      this.defaultHostname = defaults.defaultHostname;
    	      this.enabled = defaults.enabled;
    	      this.functionsExtensionVersion = defaults.functionsExtensionVersion;
    	      this.httpsOnly = defaults.httpsOnly;
    	      this.id = defaults.id;
    	      this.identities = defaults.identities;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.outboundIpAddressLists = defaults.outboundIpAddressLists;
    	      this.outboundIpAddresses = defaults.outboundIpAddresses;
    	      this.possibleOutboundIpAddressLists = defaults.possibleOutboundIpAddressLists;
    	      this.possibleOutboundIpAddresses = defaults.possibleOutboundIpAddresses;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.servicePlanId = defaults.servicePlanId;
    	      this.siteConfigs = defaults.siteConfigs;
    	      this.siteCredentials = defaults.siteCredentials;
    	      this.stickySettings = defaults.stickySettings;
    	      this.storageAccountAccessKey = defaults.storageAccountAccessKey;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.storageKeyVaultSecretId = defaults.storageKeyVaultSecretId;
    	      this.storageUsesManagedIdentity = defaults.storageUsesManagedIdentity;
    	      this.tags = defaults.tags;
    	      this.virtualNetworkSubnetId = defaults.virtualNetworkSubnetId;
        }

        @CustomType.Setter
        public Builder appSettings(Map<String,String> appSettings) {
            this.appSettings = Objects.requireNonNull(appSettings);
            return this;
        }
        @CustomType.Setter
        public Builder authSettings(List<GetWindowsFunctionAppAuthSetting> authSettings) {
            this.authSettings = Objects.requireNonNull(authSettings);
            return this;
        }
        public Builder authSettings(GetWindowsFunctionAppAuthSetting... authSettings) {
            return authSettings(List.of(authSettings));
        }
        @CustomType.Setter
        public Builder backups(List<GetWindowsFunctionAppBackup> backups) {
            this.backups = Objects.requireNonNull(backups);
            return this;
        }
        public Builder backups(GetWindowsFunctionAppBackup... backups) {
            return backups(List.of(backups));
        }
        @CustomType.Setter
        public Builder builtinLoggingEnabled(Boolean builtinLoggingEnabled) {
            this.builtinLoggingEnabled = Objects.requireNonNull(builtinLoggingEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder clientCertificateEnabled(Boolean clientCertificateEnabled) {
            this.clientCertificateEnabled = Objects.requireNonNull(clientCertificateEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder clientCertificateExclusionPaths(String clientCertificateExclusionPaths) {
            this.clientCertificateExclusionPaths = Objects.requireNonNull(clientCertificateExclusionPaths);
            return this;
        }
        @CustomType.Setter
        public Builder clientCertificateMode(String clientCertificateMode) {
            this.clientCertificateMode = Objects.requireNonNull(clientCertificateMode);
            return this;
        }
        @CustomType.Setter
        public Builder connectionStrings(List<GetWindowsFunctionAppConnectionString> connectionStrings) {
            this.connectionStrings = Objects.requireNonNull(connectionStrings);
            return this;
        }
        public Builder connectionStrings(GetWindowsFunctionAppConnectionString... connectionStrings) {
            return connectionStrings(List.of(connectionStrings));
        }
        @CustomType.Setter
        public Builder contentShareForceDisabled(Boolean contentShareForceDisabled) {
            this.contentShareForceDisabled = Objects.requireNonNull(contentShareForceDisabled);
            return this;
        }
        @CustomType.Setter
        public Builder customDomainVerificationId(String customDomainVerificationId) {
            this.customDomainVerificationId = Objects.requireNonNull(customDomainVerificationId);
            return this;
        }
        @CustomType.Setter
        public Builder dailyMemoryTimeQuota(Integer dailyMemoryTimeQuota) {
            this.dailyMemoryTimeQuota = Objects.requireNonNull(dailyMemoryTimeQuota);
            return this;
        }
        @CustomType.Setter
        public Builder defaultHostname(String defaultHostname) {
            this.defaultHostname = Objects.requireNonNull(defaultHostname);
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder functionsExtensionVersion(String functionsExtensionVersion) {
            this.functionsExtensionVersion = Objects.requireNonNull(functionsExtensionVersion);
            return this;
        }
        @CustomType.Setter
        public Builder httpsOnly(Boolean httpsOnly) {
            this.httpsOnly = Objects.requireNonNull(httpsOnly);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder identities(List<GetWindowsFunctionAppIdentity> identities) {
            this.identities = Objects.requireNonNull(identities);
            return this;
        }
        public Builder identities(GetWindowsFunctionAppIdentity... identities) {
            return identities(List.of(identities));
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder outboundIpAddressLists(List<String> outboundIpAddressLists) {
            this.outboundIpAddressLists = Objects.requireNonNull(outboundIpAddressLists);
            return this;
        }
        public Builder outboundIpAddressLists(String... outboundIpAddressLists) {
            return outboundIpAddressLists(List.of(outboundIpAddressLists));
        }
        @CustomType.Setter
        public Builder outboundIpAddresses(String outboundIpAddresses) {
            this.outboundIpAddresses = Objects.requireNonNull(outboundIpAddresses);
            return this;
        }
        @CustomType.Setter
        public Builder possibleOutboundIpAddressLists(List<String> possibleOutboundIpAddressLists) {
            this.possibleOutboundIpAddressLists = Objects.requireNonNull(possibleOutboundIpAddressLists);
            return this;
        }
        public Builder possibleOutboundIpAddressLists(String... possibleOutboundIpAddressLists) {
            return possibleOutboundIpAddressLists(List.of(possibleOutboundIpAddressLists));
        }
        @CustomType.Setter
        public Builder possibleOutboundIpAddresses(String possibleOutboundIpAddresses) {
            this.possibleOutboundIpAddresses = Objects.requireNonNull(possibleOutboundIpAddresses);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder servicePlanId(String servicePlanId) {
            this.servicePlanId = Objects.requireNonNull(servicePlanId);
            return this;
        }
        @CustomType.Setter
        public Builder siteConfigs(List<GetWindowsFunctionAppSiteConfig> siteConfigs) {
            this.siteConfigs = Objects.requireNonNull(siteConfigs);
            return this;
        }
        public Builder siteConfigs(GetWindowsFunctionAppSiteConfig... siteConfigs) {
            return siteConfigs(List.of(siteConfigs));
        }
        @CustomType.Setter
        public Builder siteCredentials(List<GetWindowsFunctionAppSiteCredential> siteCredentials) {
            this.siteCredentials = Objects.requireNonNull(siteCredentials);
            return this;
        }
        public Builder siteCredentials(GetWindowsFunctionAppSiteCredential... siteCredentials) {
            return siteCredentials(List.of(siteCredentials));
        }
        @CustomType.Setter
        public Builder stickySettings(List<GetWindowsFunctionAppStickySetting> stickySettings) {
            this.stickySettings = Objects.requireNonNull(stickySettings);
            return this;
        }
        public Builder stickySettings(GetWindowsFunctionAppStickySetting... stickySettings) {
            return stickySettings(List.of(stickySettings));
        }
        @CustomType.Setter
        public Builder storageAccountAccessKey(String storageAccountAccessKey) {
            this.storageAccountAccessKey = Objects.requireNonNull(storageAccountAccessKey);
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }
        @CustomType.Setter
        public Builder storageKeyVaultSecretId(String storageKeyVaultSecretId) {
            this.storageKeyVaultSecretId = Objects.requireNonNull(storageKeyVaultSecretId);
            return this;
        }
        @CustomType.Setter
        public Builder storageUsesManagedIdentity(Boolean storageUsesManagedIdentity) {
            this.storageUsesManagedIdentity = Objects.requireNonNull(storageUsesManagedIdentity);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder virtualNetworkSubnetId(String virtualNetworkSubnetId) {
            this.virtualNetworkSubnetId = Objects.requireNonNull(virtualNetworkSubnetId);
            return this;
        }
        public GetWindowsFunctionAppResult build() {
            final var o = new GetWindowsFunctionAppResult();
            o.appSettings = appSettings;
            o.authSettings = authSettings;
            o.backups = backups;
            o.builtinLoggingEnabled = builtinLoggingEnabled;
            o.clientCertificateEnabled = clientCertificateEnabled;
            o.clientCertificateExclusionPaths = clientCertificateExclusionPaths;
            o.clientCertificateMode = clientCertificateMode;
            o.connectionStrings = connectionStrings;
            o.contentShareForceDisabled = contentShareForceDisabled;
            o.customDomainVerificationId = customDomainVerificationId;
            o.dailyMemoryTimeQuota = dailyMemoryTimeQuota;
            o.defaultHostname = defaultHostname;
            o.enabled = enabled;
            o.functionsExtensionVersion = functionsExtensionVersion;
            o.httpsOnly = httpsOnly;
            o.id = id;
            o.identities = identities;
            o.kind = kind;
            o.location = location;
            o.name = name;
            o.outboundIpAddressLists = outboundIpAddressLists;
            o.outboundIpAddresses = outboundIpAddresses;
            o.possibleOutboundIpAddressLists = possibleOutboundIpAddressLists;
            o.possibleOutboundIpAddresses = possibleOutboundIpAddresses;
            o.resourceGroupName = resourceGroupName;
            o.servicePlanId = servicePlanId;
            o.siteConfigs = siteConfigs;
            o.siteCredentials = siteCredentials;
            o.stickySettings = stickySettings;
            o.storageAccountAccessKey = storageAccountAccessKey;
            o.storageAccountName = storageAccountName;
            o.storageKeyVaultSecretId = storageKeyVaultSecretId;
            o.storageUsesManagedIdentity = storageUsesManagedIdentity;
            o.tags = tags;
            o.virtualNetworkSubnetId = virtualNetworkSubnetId;
            return o;
        }
    }
}
