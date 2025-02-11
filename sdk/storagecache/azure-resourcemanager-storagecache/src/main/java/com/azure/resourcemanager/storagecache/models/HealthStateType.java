// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for HealthStateType. */
public final class HealthStateType extends ExpandableStringEnum<HealthStateType> {
    /** Static value Unknown for HealthStateType. */
    public static final HealthStateType UNKNOWN = fromString("Unknown");

    /** Static value Healthy for HealthStateType. */
    public static final HealthStateType HEALTHY = fromString("Healthy");

    /** Static value Degraded for HealthStateType. */
    public static final HealthStateType DEGRADED = fromString("Degraded");

    /** Static value Down for HealthStateType. */
    public static final HealthStateType DOWN = fromString("Down");

    /** Static value Transitioning for HealthStateType. */
    public static final HealthStateType TRANSITIONING = fromString("Transitioning");

    /** Static value Stopping for HealthStateType. */
    public static final HealthStateType STOPPING = fromString("Stopping");

    /** Static value Stopped for HealthStateType. */
    public static final HealthStateType STOPPED = fromString("Stopped");

    /** Static value Upgrading for HealthStateType. */
    public static final HealthStateType UPGRADING = fromString("Upgrading");

    /** Static value Flushing for HealthStateType. */
    public static final HealthStateType FLUSHING = fromString("Flushing");

    /** Static value WaitingForKey for HealthStateType. */
    public static final HealthStateType WAITING_FOR_KEY = fromString("WaitingForKey");

    /** Static value StartFailed for HealthStateType. */
    public static final HealthStateType START_FAILED = fromString("StartFailed");

    /** Static value UpgradeFailed for HealthStateType. */
    public static final HealthStateType UPGRADE_FAILED = fromString("UpgradeFailed");

    /**
     * Creates or finds a HealthStateType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HealthStateType.
     */
    @JsonCreator
    public static HealthStateType fromString(String name) {
        return fromString(name, HealthStateType.class);
    }

    /**
     * Gets known HealthStateType values.
     *
     * @return known HealthStateType values.
     */
    public static Collection<HealthStateType> values() {
        return values(HealthStateType.class);
    }
}
