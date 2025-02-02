// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.outputs;

import com.pulumi.azure.media.outputs.StreamingPolicyCommonEncryptionCencDefaultContentKey;
import com.pulumi.azure.media.outputs.StreamingPolicyCommonEncryptionCencDrmPlayready;
import com.pulumi.azure.media.outputs.StreamingPolicyCommonEncryptionCencEnabledProtocols;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StreamingPolicyCommonEncryptionCenc {
    /**
     * @return A `default_content_key` block as defined below. Changing this forces a new Streaming Policy to be created.
     * 
     */
    private @Nullable StreamingPolicyCommonEncryptionCencDefaultContentKey defaultContentKey;
    /**
     * @return A `drm_playready` block as defined below. Changing this forces a new Streaming Policy to be created.
     * 
     */
    private @Nullable StreamingPolicyCommonEncryptionCencDrmPlayready drmPlayready;
    /**
     * @return Template for the URL of the custom service delivering licenses to end user players. Not required when using Azure Media Services for issuing licenses. The template supports replaceable tokens that the service will update at runtime with the value specific to the request. The currently supported token values are `{AlternativeMediaId}`, which is replaced with the value of `StreamingLocatorId.AlternativeMediaId`, and `{ContentKeyId}`, which is replaced with the value of identifier of the key being requested. Changing this forces a new Streaming Policy to be created.
     * 
     */
    private @Nullable String drmWidevineCustomLicenseAcquisitionUrlTemplate;
    /**
     * @return A `enabled_protocols` block as defined below. Changing this forces a new Streaming Policy to be created.
     * 
     */
    private @Nullable StreamingPolicyCommonEncryptionCencEnabledProtocols enabledProtocols;

    private StreamingPolicyCommonEncryptionCenc() {}
    /**
     * @return A `default_content_key` block as defined below. Changing this forces a new Streaming Policy to be created.
     * 
     */
    public Optional<StreamingPolicyCommonEncryptionCencDefaultContentKey> defaultContentKey() {
        return Optional.ofNullable(this.defaultContentKey);
    }
    /**
     * @return A `drm_playready` block as defined below. Changing this forces a new Streaming Policy to be created.
     * 
     */
    public Optional<StreamingPolicyCommonEncryptionCencDrmPlayready> drmPlayready() {
        return Optional.ofNullable(this.drmPlayready);
    }
    /**
     * @return Template for the URL of the custom service delivering licenses to end user players. Not required when using Azure Media Services for issuing licenses. The template supports replaceable tokens that the service will update at runtime with the value specific to the request. The currently supported token values are `{AlternativeMediaId}`, which is replaced with the value of `StreamingLocatorId.AlternativeMediaId`, and `{ContentKeyId}`, which is replaced with the value of identifier of the key being requested. Changing this forces a new Streaming Policy to be created.
     * 
     */
    public Optional<String> drmWidevineCustomLicenseAcquisitionUrlTemplate() {
        return Optional.ofNullable(this.drmWidevineCustomLicenseAcquisitionUrlTemplate);
    }
    /**
     * @return A `enabled_protocols` block as defined below. Changing this forces a new Streaming Policy to be created.
     * 
     */
    public Optional<StreamingPolicyCommonEncryptionCencEnabledProtocols> enabledProtocols() {
        return Optional.ofNullable(this.enabledProtocols);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingPolicyCommonEncryptionCenc defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable StreamingPolicyCommonEncryptionCencDefaultContentKey defaultContentKey;
        private @Nullable StreamingPolicyCommonEncryptionCencDrmPlayready drmPlayready;
        private @Nullable String drmWidevineCustomLicenseAcquisitionUrlTemplate;
        private @Nullable StreamingPolicyCommonEncryptionCencEnabledProtocols enabledProtocols;
        public Builder() {}
        public Builder(StreamingPolicyCommonEncryptionCenc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultContentKey = defaults.defaultContentKey;
    	      this.drmPlayready = defaults.drmPlayready;
    	      this.drmWidevineCustomLicenseAcquisitionUrlTemplate = defaults.drmWidevineCustomLicenseAcquisitionUrlTemplate;
    	      this.enabledProtocols = defaults.enabledProtocols;
        }

        @CustomType.Setter
        public Builder defaultContentKey(@Nullable StreamingPolicyCommonEncryptionCencDefaultContentKey defaultContentKey) {
            this.defaultContentKey = defaultContentKey;
            return this;
        }
        @CustomType.Setter
        public Builder drmPlayready(@Nullable StreamingPolicyCommonEncryptionCencDrmPlayready drmPlayready) {
            this.drmPlayready = drmPlayready;
            return this;
        }
        @CustomType.Setter
        public Builder drmWidevineCustomLicenseAcquisitionUrlTemplate(@Nullable String drmWidevineCustomLicenseAcquisitionUrlTemplate) {
            this.drmWidevineCustomLicenseAcquisitionUrlTemplate = drmWidevineCustomLicenseAcquisitionUrlTemplate;
            return this;
        }
        @CustomType.Setter
        public Builder enabledProtocols(@Nullable StreamingPolicyCommonEncryptionCencEnabledProtocols enabledProtocols) {
            this.enabledProtocols = enabledProtocols;
            return this;
        }
        public StreamingPolicyCommonEncryptionCenc build() {
            final var o = new StreamingPolicyCommonEncryptionCenc();
            o.defaultContentKey = defaultContentKey;
            o.drmPlayready = drmPlayready;
            o.drmWidevineCustomLicenseAcquisitionUrlTemplate = drmWidevineCustomLicenseAcquisitionUrlTemplate;
            o.enabledProtocols = enabledProtocols;
            return o;
        }
    }
}
