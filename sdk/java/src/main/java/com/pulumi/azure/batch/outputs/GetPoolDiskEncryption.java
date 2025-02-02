// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPoolDiskEncryption {
    /**
     * @return On Linux pool, only `TemporaryDisk` is supported; on Windows pool, `OsDisk` and `TemporaryDisk` must be specified.
     * 
     */
    private String diskEncryptionTarget;

    private GetPoolDiskEncryption() {}
    /**
     * @return On Linux pool, only `TemporaryDisk` is supported; on Windows pool, `OsDisk` and `TemporaryDisk` must be specified.
     * 
     */
    public String diskEncryptionTarget() {
        return this.diskEncryptionTarget;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPoolDiskEncryption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String diskEncryptionTarget;
        public Builder() {}
        public Builder(GetPoolDiskEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionTarget = defaults.diskEncryptionTarget;
        }

        @CustomType.Setter
        public Builder diskEncryptionTarget(String diskEncryptionTarget) {
            this.diskEncryptionTarget = Objects.requireNonNull(diskEncryptionTarget);
            return this;
        }
        public GetPoolDiskEncryption build() {
            final var o = new GetPoolDiskEncryption();
            o.diskEncryptionTarget = diskEncryptionTarget;
            return o;
        }
    }
}
