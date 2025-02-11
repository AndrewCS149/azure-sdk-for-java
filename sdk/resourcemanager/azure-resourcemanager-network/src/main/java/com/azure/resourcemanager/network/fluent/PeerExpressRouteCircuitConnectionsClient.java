// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.PeerExpressRouteCircuitConnectionInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in PeerExpressRouteCircuitConnectionsClient.
 */
public interface PeerExpressRouteCircuitConnectionsClient {
    /**
     * Gets the specified Peer Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the peer express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Peer Express Route Circuit Connection from the specified express route circuit along with
     *     {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PeerExpressRouteCircuitConnectionInner>> getWithResponseAsync(
        String resourceGroupName, String circuitName, String peeringName, String connectionName);

    /**
     * Gets the specified Peer Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the peer express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Peer Express Route Circuit Connection from the specified express route circuit on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PeerExpressRouteCircuitConnectionInner> getAsync(
        String resourceGroupName, String circuitName, String peeringName, String connectionName);

    /**
     * Gets the specified Peer Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the peer express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Peer Express Route Circuit Connection from the specified express route circuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PeerExpressRouteCircuitConnectionInner get(
        String resourceGroupName, String circuitName, String peeringName, String connectionName);

    /**
     * Gets the specified Peer Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the peer express route circuit connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Peer Express Route Circuit Connection from the specified express route circuit along with
     *     {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PeerExpressRouteCircuitConnectionInner> getWithResponse(
        String resourceGroupName, String circuitName, String peeringName, String connectionName, Context context);

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all global reach peer connections associated with a private peering in an express route circuit as
     *     paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<PeerExpressRouteCircuitConnectionInner> listAsync(
        String resourceGroupName, String circuitName, String peeringName);

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all global reach peer connections associated with a private peering in an express route circuit as
     *     paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PeerExpressRouteCircuitConnectionInner> list(
        String resourceGroupName, String circuitName, String peeringName);

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all global reach peer connections associated with a private peering in an express route circuit as
     *     paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PeerExpressRouteCircuitConnectionInner> list(
        String resourceGroupName, String circuitName, String peeringName, Context context);
}
