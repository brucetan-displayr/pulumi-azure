// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.inputs;

import com.pulumi.azure.cdn.inputs.FrontdoorSecretSecretCustomerCertificateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class FrontdoorSecretSecretArgs extends com.pulumi.resources.ResourceArgs {

    public static final FrontdoorSecretSecretArgs Empty = new FrontdoorSecretSecretArgs();

    /**
     * A `customer_certificate` block as defined below. Changing this forces a new Front Door Secret to be created.
     * 
     */
    @Import(name="customerCertificates", required=true)
    private Output<List<FrontdoorSecretSecretCustomerCertificateArgs>> customerCertificates;

    /**
     * @return A `customer_certificate` block as defined below. Changing this forces a new Front Door Secret to be created.
     * 
     */
    public Output<List<FrontdoorSecretSecretCustomerCertificateArgs>> customerCertificates() {
        return this.customerCertificates;
    }

    private FrontdoorSecretSecretArgs() {}

    private FrontdoorSecretSecretArgs(FrontdoorSecretSecretArgs $) {
        this.customerCertificates = $.customerCertificates;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FrontdoorSecretSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FrontdoorSecretSecretArgs $;

        public Builder() {
            $ = new FrontdoorSecretSecretArgs();
        }

        public Builder(FrontdoorSecretSecretArgs defaults) {
            $ = new FrontdoorSecretSecretArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customerCertificates A `customer_certificate` block as defined below. Changing this forces a new Front Door Secret to be created.
         * 
         * @return builder
         * 
         */
        public Builder customerCertificates(Output<List<FrontdoorSecretSecretCustomerCertificateArgs>> customerCertificates) {
            $.customerCertificates = customerCertificates;
            return this;
        }

        /**
         * @param customerCertificates A `customer_certificate` block as defined below. Changing this forces a new Front Door Secret to be created.
         * 
         * @return builder
         * 
         */
        public Builder customerCertificates(List<FrontdoorSecretSecretCustomerCertificateArgs> customerCertificates) {
            return customerCertificates(Output.of(customerCertificates));
        }

        /**
         * @param customerCertificates A `customer_certificate` block as defined below. Changing this forces a new Front Door Secret to be created.
         * 
         * @return builder
         * 
         */
        public Builder customerCertificates(FrontdoorSecretSecretCustomerCertificateArgs... customerCertificates) {
            return customerCertificates(List.of(customerCertificates));
        }

        public FrontdoorSecretSecretArgs build() {
            $.customerCertificates = Objects.requireNonNull($.customerCertificates, "expected parameter 'customerCertificates' to be non-null");
            return $;
        }
    }

}
