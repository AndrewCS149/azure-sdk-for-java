// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The JSON object that contains the properties to secure a custom domain. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "certificateSource",
    defaultImpl = CustomDomainHttpsParameters.class)
@JsonTypeName("CustomDomainHttpsParameters")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Cdn", value = CdnManagedHttpsParameters.class),
    @JsonSubTypes.Type(name = "AzureKeyVault", value = UserManagedHttpsParameters.class)
})
@Fluent
public class CustomDomainHttpsParameters {
    /*
     * Defines the TLS extension protocol that is used for secure delivery.
     */
    @JsonProperty(value = "protocolType", required = true)
    private ProtocolType protocolType;

    /*
     * TLS protocol version that will be used for Https
     */
    @JsonProperty(value = "minimumTlsVersion")
    private MinimumTlsVersion minimumTlsVersion;

    /**
     * Get the protocolType property: Defines the TLS extension protocol that is used for secure delivery.
     *
     * @return the protocolType value.
     */
    public ProtocolType protocolType() {
        return this.protocolType;
    }

    /**
     * Set the protocolType property: Defines the TLS extension protocol that is used for secure delivery.
     *
     * @param protocolType the protocolType value to set.
     * @return the CustomDomainHttpsParameters object itself.
     */
    public CustomDomainHttpsParameters withProtocolType(ProtocolType protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * Get the minimumTlsVersion property: TLS protocol version that will be used for Https.
     *
     * @return the minimumTlsVersion value.
     */
    public MinimumTlsVersion minimumTlsVersion() {
        return this.minimumTlsVersion;
    }

    /**
     * Set the minimumTlsVersion property: TLS protocol version that will be used for Https.
     *
     * @param minimumTlsVersion the minimumTlsVersion value to set.
     * @return the CustomDomainHttpsParameters object itself.
     */
    public CustomDomainHttpsParameters withMinimumTlsVersion(MinimumTlsVersion minimumTlsVersion) {
        this.minimumTlsVersion = minimumTlsVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (protocolType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property protocolType in model CustomDomainHttpsParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CustomDomainHttpsParameters.class);
}
