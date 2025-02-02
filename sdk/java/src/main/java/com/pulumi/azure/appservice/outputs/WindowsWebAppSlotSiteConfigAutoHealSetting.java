// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotSiteConfigAutoHealSettingAction;
import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotSiteConfigAutoHealSettingTrigger;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class WindowsWebAppSlotSiteConfigAutoHealSetting {
    /**
     * @return A `action` block as defined above.
     * 
     */
    private WindowsWebAppSlotSiteConfigAutoHealSettingAction action;
    /**
     * @return A `trigger` block as defined below.
     * 
     */
    private WindowsWebAppSlotSiteConfigAutoHealSettingTrigger trigger;

    private WindowsWebAppSlotSiteConfigAutoHealSetting() {}
    /**
     * @return A `action` block as defined above.
     * 
     */
    public WindowsWebAppSlotSiteConfigAutoHealSettingAction action() {
        return this.action;
    }
    /**
     * @return A `trigger` block as defined below.
     * 
     */
    public WindowsWebAppSlotSiteConfigAutoHealSettingTrigger trigger() {
        return this.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsWebAppSlotSiteConfigAutoHealSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private WindowsWebAppSlotSiteConfigAutoHealSettingAction action;
        private WindowsWebAppSlotSiteConfigAutoHealSettingTrigger trigger;
        public Builder() {}
        public Builder(WindowsWebAppSlotSiteConfigAutoHealSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.trigger = defaults.trigger;
        }

        @CustomType.Setter
        public Builder action(WindowsWebAppSlotSiteConfigAutoHealSettingAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        @CustomType.Setter
        public Builder trigger(WindowsWebAppSlotSiteConfigAutoHealSettingTrigger trigger) {
            this.trigger = Objects.requireNonNull(trigger);
            return this;
        }
        public WindowsWebAppSlotSiteConfigAutoHealSetting build() {
            final var o = new WindowsWebAppSlotSiteConfigAutoHealSetting();
            o.action = action;
            o.trigger = trigger;
            return o;
        }
    }
}
