// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScaleSetStorageProfileDataDisk {
    /**
     * @return Specifies the caching requirements. Possible values include: `None` (default), `ReadOnly`, `ReadWrite`.
     * 
     */
    private @Nullable String caching;
    /**
     * @return Specifies how the data disk should be created. The only possible options are `FromImage` and `Empty`.
     * 
     */
    private String createOption;
    /**
     * @return Specifies the size of the disk in GB. This element is required when creating an empty disk.
     * 
     */
    private @Nullable Integer diskSizeGb;
    /**
     * @return Specifies the Logical Unit Number of the disk in each virtual machine in the scale set.
     * 
     */
    private Integer lun;
    /**
     * @return Specifies the type of managed disk to create. Value must be either `Standard_LRS`, `StandardSSD_LRS` or `Premium_LRS`.
     * 
     */
    private @Nullable String managedDiskType;

    private ScaleSetStorageProfileDataDisk() {}
    /**
     * @return Specifies the caching requirements. Possible values include: `None` (default), `ReadOnly`, `ReadWrite`.
     * 
     */
    public Optional<String> caching() {
        return Optional.ofNullable(this.caching);
    }
    /**
     * @return Specifies how the data disk should be created. The only possible options are `FromImage` and `Empty`.
     * 
     */
    public String createOption() {
        return this.createOption;
    }
    /**
     * @return Specifies the size of the disk in GB. This element is required when creating an empty disk.
     * 
     */
    public Optional<Integer> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }
    /**
     * @return Specifies the Logical Unit Number of the disk in each virtual machine in the scale set.
     * 
     */
    public Integer lun() {
        return this.lun;
    }
    /**
     * @return Specifies the type of managed disk to create. Value must be either `Standard_LRS`, `StandardSSD_LRS` or `Premium_LRS`.
     * 
     */
    public Optional<String> managedDiskType() {
        return Optional.ofNullable(this.managedDiskType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleSetStorageProfileDataDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String caching;
        private String createOption;
        private @Nullable Integer diskSizeGb;
        private Integer lun;
        private @Nullable String managedDiskType;
        public Builder() {}
        public Builder(ScaleSetStorageProfileDataDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caching = defaults.caching;
    	      this.createOption = defaults.createOption;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.lun = defaults.lun;
    	      this.managedDiskType = defaults.managedDiskType;
        }

        @CustomType.Setter
        public Builder caching(@Nullable String caching) {
            this.caching = caching;
            return this;
        }
        @CustomType.Setter
        public Builder createOption(String createOption) {
            this.createOption = Objects.requireNonNull(createOption);
            return this;
        }
        @CustomType.Setter
        public Builder diskSizeGb(@Nullable Integer diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }
        @CustomType.Setter
        public Builder lun(Integer lun) {
            this.lun = Objects.requireNonNull(lun);
            return this;
        }
        @CustomType.Setter
        public Builder managedDiskType(@Nullable String managedDiskType) {
            this.managedDiskType = managedDiskType;
            return this;
        }
        public ScaleSetStorageProfileDataDisk build() {
            final var o = new ScaleSetStorageProfileDataDisk();
            o.caching = caching;
            o.createOption = createOption;
            o.diskSizeGb = diskSizeGb;
            o.lun = lun;
            o.managedDiskType = managedDiskType;
            return o;
        }
    }
}
