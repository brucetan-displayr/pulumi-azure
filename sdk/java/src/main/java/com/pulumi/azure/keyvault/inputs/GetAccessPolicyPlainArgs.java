// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAccessPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccessPolicyPlainArgs Empty = new GetAccessPolicyPlainArgs();

    /**
     * Specifies the name of the Management Template. Possible values are: `Key Management`,
     * `Secret Management`, `Certificate Management`, `Key &amp; Secret Management`, `Key &amp; Certificate Management`,
     * `Secret &amp; Certificate Management`,  `Key, Secret, &amp; Certificate Management`
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Specifies the name of the Management Template. Possible values are: `Key Management`,
     * `Secret Management`, `Certificate Management`, `Key &amp; Secret Management`, `Key &amp; Certificate Management`,
     * `Secret &amp; Certificate Management`,  `Key, Secret, &amp; Certificate Management`
     * 
     */
    public String name() {
        return this.name;
    }

    private GetAccessPolicyPlainArgs() {}

    private GetAccessPolicyPlainArgs(GetAccessPolicyPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccessPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccessPolicyPlainArgs $;

        public Builder() {
            $ = new GetAccessPolicyPlainArgs();
        }

        public Builder(GetAccessPolicyPlainArgs defaults) {
            $ = new GetAccessPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the Management Template. Possible values are: `Key Management`,
         * `Secret Management`, `Certificate Management`, `Key &amp; Secret Management`, `Key &amp; Certificate Management`,
         * `Secret &amp; Certificate Management`,  `Key, Secret, &amp; Certificate Management`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetAccessPolicyPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
