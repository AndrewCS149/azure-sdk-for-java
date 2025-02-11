// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The resource limits. */
@Fluent
public final class ResourceLimits {
    /*
     * The memory limit in GB of this container instance.
     */
    @JsonProperty(value = "memoryInGB")
    private Double memoryInGB;

    /*
     * The CPU limit of this container instance.
     */
    @JsonProperty(value = "cpu")
    private Double cpu;

    /*
     * The GPU limit of this container instance.
     */
    @JsonProperty(value = "gpu")
    private GpuResource gpu;

    /**
     * Get the memoryInGB property: The memory limit in GB of this container instance.
     *
     * @return the memoryInGB value.
     */
    public Double memoryInGB() {
        return this.memoryInGB;
    }

    /**
     * Set the memoryInGB property: The memory limit in GB of this container instance.
     *
     * @param memoryInGB the memoryInGB value to set.
     * @return the ResourceLimits object itself.
     */
    public ResourceLimits withMemoryInGB(Double memoryInGB) {
        this.memoryInGB = memoryInGB;
        return this;
    }

    /**
     * Get the cpu property: The CPU limit of this container instance.
     *
     * @return the cpu value.
     */
    public Double cpu() {
        return this.cpu;
    }

    /**
     * Set the cpu property: The CPU limit of this container instance.
     *
     * @param cpu the cpu value to set.
     * @return the ResourceLimits object itself.
     */
    public ResourceLimits withCpu(Double cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * Get the gpu property: The GPU limit of this container instance.
     *
     * @return the gpu value.
     */
    public GpuResource gpu() {
        return this.gpu;
    }

    /**
     * Set the gpu property: The GPU limit of this container instance.
     *
     * @param gpu the gpu value to set.
     * @return the ResourceLimits object itself.
     */
    public ResourceLimits withGpu(GpuResource gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (gpu() != null) {
            gpu().validate();
        }
    }
}
