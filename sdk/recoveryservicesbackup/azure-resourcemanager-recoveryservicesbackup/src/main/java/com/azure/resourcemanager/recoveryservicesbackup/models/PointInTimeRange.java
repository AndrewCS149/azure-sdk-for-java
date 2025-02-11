// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Provides details for log ranges. */
@Fluent
public final class PointInTimeRange {
    /*
     * Start time of the time range for log recovery.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * End time of the time range for log recovery.
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /**
     * Get the startTime property: Start time of the time range for log recovery.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time of the time range for log recovery.
     *
     * @param startTime the startTime value to set.
     * @return the PointInTimeRange object itself.
     */
    public PointInTimeRange withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: End time of the time range for log recovery.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: End time of the time range for log recovery.
     *
     * @param endTime the endTime value to set.
     * @return the PointInTimeRange object itself.
     */
    public PointInTimeRange withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
