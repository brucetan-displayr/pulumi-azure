// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.azure.monitoring.outputs.AlertProcessingRuleActionGroupScheduleRecurrenceDaily;
import com.pulumi.azure.monitoring.outputs.AlertProcessingRuleActionGroupScheduleRecurrenceMonthly;
import com.pulumi.azure.monitoring.outputs.AlertProcessingRuleActionGroupScheduleRecurrenceWeekly;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AlertProcessingRuleActionGroupScheduleRecurrence {
    /**
     * @return One or more `daily` blocks as defined above.
     * 
     */
    private @Nullable List<AlertProcessingRuleActionGroupScheduleRecurrenceDaily> dailies;
    /**
     * @return One or more `monthly` blocks as defined above.
     * 
     */
    private @Nullable List<AlertProcessingRuleActionGroupScheduleRecurrenceMonthly> monthlies;
    /**
     * @return One or more `weekly` blocks as defined below.
     * 
     */
    private @Nullable List<AlertProcessingRuleActionGroupScheduleRecurrenceWeekly> weeklies;

    private AlertProcessingRuleActionGroupScheduleRecurrence() {}
    /**
     * @return One or more `daily` blocks as defined above.
     * 
     */
    public List<AlertProcessingRuleActionGroupScheduleRecurrenceDaily> dailies() {
        return this.dailies == null ? List.of() : this.dailies;
    }
    /**
     * @return One or more `monthly` blocks as defined above.
     * 
     */
    public List<AlertProcessingRuleActionGroupScheduleRecurrenceMonthly> monthlies() {
        return this.monthlies == null ? List.of() : this.monthlies;
    }
    /**
     * @return One or more `weekly` blocks as defined below.
     * 
     */
    public List<AlertProcessingRuleActionGroupScheduleRecurrenceWeekly> weeklies() {
        return this.weeklies == null ? List.of() : this.weeklies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertProcessingRuleActionGroupScheduleRecurrence defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<AlertProcessingRuleActionGroupScheduleRecurrenceDaily> dailies;
        private @Nullable List<AlertProcessingRuleActionGroupScheduleRecurrenceMonthly> monthlies;
        private @Nullable List<AlertProcessingRuleActionGroupScheduleRecurrenceWeekly> weeklies;
        public Builder() {}
        public Builder(AlertProcessingRuleActionGroupScheduleRecurrence defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailies = defaults.dailies;
    	      this.monthlies = defaults.monthlies;
    	      this.weeklies = defaults.weeklies;
        }

        @CustomType.Setter
        public Builder dailies(@Nullable List<AlertProcessingRuleActionGroupScheduleRecurrenceDaily> dailies) {
            this.dailies = dailies;
            return this;
        }
        public Builder dailies(AlertProcessingRuleActionGroupScheduleRecurrenceDaily... dailies) {
            return dailies(List.of(dailies));
        }
        @CustomType.Setter
        public Builder monthlies(@Nullable List<AlertProcessingRuleActionGroupScheduleRecurrenceMonthly> monthlies) {
            this.monthlies = monthlies;
            return this;
        }
        public Builder monthlies(AlertProcessingRuleActionGroupScheduleRecurrenceMonthly... monthlies) {
            return monthlies(List.of(monthlies));
        }
        @CustomType.Setter
        public Builder weeklies(@Nullable List<AlertProcessingRuleActionGroupScheduleRecurrenceWeekly> weeklies) {
            this.weeklies = weeklies;
            return this;
        }
        public Builder weeklies(AlertProcessingRuleActionGroupScheduleRecurrenceWeekly... weeklies) {
            return weeklies(List.of(weeklies));
        }
        public AlertProcessingRuleActionGroupScheduleRecurrence build() {
            final var o = new AlertProcessingRuleActionGroupScheduleRecurrence();
            o.dailies = dailies;
            o.monthlies = monthlies;
            o.weeklies = weeklies;
            return o;
        }
    }
}
