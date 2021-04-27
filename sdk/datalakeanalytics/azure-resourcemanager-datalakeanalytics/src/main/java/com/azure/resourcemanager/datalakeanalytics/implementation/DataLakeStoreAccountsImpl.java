// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datalakeanalytics.fluent.DataLakeStoreAccountsClient;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.DataLakeStoreAccountInformationInner;
import com.azure.resourcemanager.datalakeanalytics.models.AddDataLakeStoreParameters;
import com.azure.resourcemanager.datalakeanalytics.models.DataLakeStoreAccountInformation;
import com.azure.resourcemanager.datalakeanalytics.models.DataLakeStoreAccounts;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DataLakeStoreAccountsImpl implements DataLakeStoreAccounts {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataLakeStoreAccountsImpl.class);

    private final DataLakeStoreAccountsClient innerClient;

    private final com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager serviceManager;

    public DataLakeStoreAccountsImpl(
        DataLakeStoreAccountsClient innerClient,
        com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DataLakeStoreAccountInformation> listByAccount(String resourceGroupName, String accountName) {
        PagedIterable<DataLakeStoreAccountInformationInner> inner =
            this.serviceClient().listByAccount(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new DataLakeStoreAccountInformationImpl(inner1, this.manager()));
    }

    public PagedIterable<DataLakeStoreAccountInformation> listByAccount(
        String resourceGroupName,
        String accountName,
        String filter,
        Integer top,
        Integer skip,
        String select,
        String orderby,
        Boolean count,
        Context context) {
        PagedIterable<DataLakeStoreAccountInformationInner> inner =
            this
                .serviceClient()
                .listByAccount(resourceGroupName, accountName, filter, top, skip, select, orderby, count, context);
        return Utils.mapPage(inner, inner1 -> new DataLakeStoreAccountInformationImpl(inner1, this.manager()));
    }

    public void add(String resourceGroupName, String accountName, String dataLakeStoreAccountName) {
        this.serviceClient().add(resourceGroupName, accountName, dataLakeStoreAccountName);
    }

    public Response<Void> addWithResponse(
        String resourceGroupName,
        String accountName,
        String dataLakeStoreAccountName,
        AddDataLakeStoreParameters parameters,
        Context context) {
        return this
            .serviceClient()
            .addWithResponse(resourceGroupName, accountName, dataLakeStoreAccountName, parameters, context);
    }

    public DataLakeStoreAccountInformation get(
        String resourceGroupName, String accountName, String dataLakeStoreAccountName) {
        DataLakeStoreAccountInformationInner inner =
            this.serviceClient().get(resourceGroupName, accountName, dataLakeStoreAccountName);
        if (inner != null) {
            return new DataLakeStoreAccountInformationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DataLakeStoreAccountInformation> getWithResponse(
        String resourceGroupName, String accountName, String dataLakeStoreAccountName, Context context) {
        Response<DataLakeStoreAccountInformationInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, dataLakeStoreAccountName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DataLakeStoreAccountInformationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String dataLakeStoreAccountName) {
        this.serviceClient().delete(resourceGroupName, accountName, dataLakeStoreAccountName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String dataLakeStoreAccountName, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, accountName, dataLakeStoreAccountName, context);
    }

    private DataLakeStoreAccountsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager manager() {
        return this.serviceManager;
    }
}