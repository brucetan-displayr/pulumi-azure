// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.synapse.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SqlPoolRestore {
    /**
     * @return Specifies the Snapshot time to restore formatted as an RFC3339 date string. Changing this forces a new Synapse SQL Pool to be created.
     * 
     */
    private String pointInTime;
    /**
     * @return The ID of the Synapse SQL Pool or SQL Database which is to restore. Changing this forces a new Synapse SQL Pool to be created.
     * 
     */
    private String sourceDatabaseId;

    private SqlPoolRestore() {}
    /**
     * @return Specifies the Snapshot time to restore formatted as an RFC3339 date string. Changing this forces a new Synapse SQL Pool to be created.
     * 
     */
    public String pointInTime() {
        return this.pointInTime;
    }
    /**
     * @return The ID of the Synapse SQL Pool or SQL Database which is to restore. Changing this forces a new Synapse SQL Pool to be created.
     * 
     */
    public String sourceDatabaseId() {
        return this.sourceDatabaseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlPoolRestore defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String pointInTime;
        private String sourceDatabaseId;
        public Builder() {}
        public Builder(SqlPoolRestore defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pointInTime = defaults.pointInTime;
    	      this.sourceDatabaseId = defaults.sourceDatabaseId;
        }

        @CustomType.Setter
        public Builder pointInTime(String pointInTime) {
            this.pointInTime = Objects.requireNonNull(pointInTime);
            return this;
        }
        @CustomType.Setter
        public Builder sourceDatabaseId(String sourceDatabaseId) {
            this.sourceDatabaseId = Objects.requireNonNull(sourceDatabaseId);
            return this;
        }
        public SqlPoolRestore build() {
            final var o = new SqlPoolRestore();
            o.pointInTime = pointInTime;
            o.sourceDatabaseId = sourceDatabaseId;
            return o;
        }
    }
}
