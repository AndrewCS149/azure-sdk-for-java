// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;

/** Samples for Issue Get. */
public final class IssueGetSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementGetIssue.json
     */
    /**
     * Sample code: ApiManagementGetIssue.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetIssue(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.issues().getWithResponse("rg1", "apimService1", "57d2ef278aa04f0ad01d6cdc", Context.NONE);
    }
}
