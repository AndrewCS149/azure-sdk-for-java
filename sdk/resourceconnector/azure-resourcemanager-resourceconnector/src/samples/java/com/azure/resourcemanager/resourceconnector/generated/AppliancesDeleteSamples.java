// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourceconnector.generated;

import com.azure.core.util.Context;

/** Samples for Appliances Delete. */
public final class AppliancesDeleteSamples {
    /*
     * x-ms-original-file: specification/resourceconnector/resource-manager/Microsoft.ResourceConnector/preview/2022-04-15-preview/examples/AppliancesDelete.json
     */
    /**
     * Sample code: Delete Appliance.
     *
     * @param manager Entry point to AppliancesManager.
     */
    public static void deleteAppliance(com.azure.resourcemanager.resourceconnector.AppliancesManager manager) {
        manager.appliances().delete("testresourcegroup", "appliance01", Context.NONE);
    }
}
