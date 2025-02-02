// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devtest.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduleWeeklyRecurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduleWeeklyRecurrenceArgs Empty = new ScheduleWeeklyRecurrenceArgs();

    /**
     * The time when the schedule takes effect.
     * 
     */
    @Import(name="time", required=true)
    private Output<String> time;

    /**
     * @return The time when the schedule takes effect.
     * 
     */
    public Output<String> time() {
        return this.time;
    }

    /**
     * A list of days that this schedule takes effect . Possible values include `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday` and `Sunday`.
     * 
     */
    @Import(name="weekDays")
    private @Nullable Output<List<String>> weekDays;

    /**
     * @return A list of days that this schedule takes effect . Possible values include `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday` and `Sunday`.
     * 
     */
    public Optional<Output<List<String>>> weekDays() {
        return Optional.ofNullable(this.weekDays);
    }

    private ScheduleWeeklyRecurrenceArgs() {}

    private ScheduleWeeklyRecurrenceArgs(ScheduleWeeklyRecurrenceArgs $) {
        this.time = $.time;
        this.weekDays = $.weekDays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduleWeeklyRecurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduleWeeklyRecurrenceArgs $;

        public Builder() {
            $ = new ScheduleWeeklyRecurrenceArgs();
        }

        public Builder(ScheduleWeeklyRecurrenceArgs defaults) {
            $ = new ScheduleWeeklyRecurrenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param time The time when the schedule takes effect.
         * 
         * @return builder
         * 
         */
        public Builder time(Output<String> time) {
            $.time = time;
            return this;
        }

        /**
         * @param time The time when the schedule takes effect.
         * 
         * @return builder
         * 
         */
        public Builder time(String time) {
            return time(Output.of(time));
        }

        /**
         * @param weekDays A list of days that this schedule takes effect . Possible values include `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday` and `Sunday`.
         * 
         * @return builder
         * 
         */
        public Builder weekDays(@Nullable Output<List<String>> weekDays) {
            $.weekDays = weekDays;
            return this;
        }

        /**
         * @param weekDays A list of days that this schedule takes effect . Possible values include `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday` and `Sunday`.
         * 
         * @return builder
         * 
         */
        public Builder weekDays(List<String> weekDays) {
            return weekDays(Output.of(weekDays));
        }

        /**
         * @param weekDays A list of days that this schedule takes effect . Possible values include `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday` and `Sunday`.
         * 
         * @return builder
         * 
         */
        public Builder weekDays(String... weekDays) {
            return weekDays(List.of(weekDays));
        }

        public ScheduleWeeklyRecurrenceArgs build() {
            $.time = Objects.requireNonNull($.time, "expected parameter 'time' to be non-null");
            return $;
        }
    }

}
