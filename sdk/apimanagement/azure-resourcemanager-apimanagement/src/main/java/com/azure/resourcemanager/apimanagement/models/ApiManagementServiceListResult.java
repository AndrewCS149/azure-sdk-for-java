// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.models.ApiManagementServiceResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response of the List API Management services operation. */
@Fluent
public final class ApiManagementServiceListResult {
    /*
     * Result of the List API Management services operation.
     */
    @JsonProperty(value = "value", required = true)
    private List<ApiManagementServiceResourceInner> value;

    /*
     * Link to the next set of results. Not empty if Value contains incomplete
     * list of API Management services.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Result of the List API Management services operation.
     *
     * @return the value value.
     */
    public List<ApiManagementServiceResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List API Management services operation.
     *
     * @param value the value value to set.
     * @return the ApiManagementServiceListResult object itself.
     */
    public ApiManagementServiceListResult withValue(List<ApiManagementServiceResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of API
     * Management services.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of API
     * Management services.
     *
     * @param nextLink the nextLink value to set.
     * @return the ApiManagementServiceListResult object itself.
     */
    public ApiManagementServiceListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model ApiManagementServiceListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApiManagementServiceListResult.class);
}
