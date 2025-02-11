// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** StaticSiteUserInvitationRequestResource resource specific properties. */
@Fluent
public final class StaticSiteUserInvitationRequestResourceProperties {
    /*
     * The domain name for the static site custom domain.
     */
    @JsonProperty(value = "domain")
    private String domain;

    /*
     * The identity provider for the static site user.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /*
     * The user id for the static site user.
     */
    @JsonProperty(value = "userDetails")
    private String userDetails;

    /*
     * The roles for the static site user, in free-form string format
     */
    @JsonProperty(value = "roles")
    private String roles;

    /*
     * The number of hours the sas token stays valid
     */
    @JsonProperty(value = "numHoursToExpiration")
    private Integer numHoursToExpiration;

    /**
     * Get the domain property: The domain name for the static site custom domain.
     *
     * @return the domain value.
     */
    public String domain() {
        return this.domain;
    }

    /**
     * Set the domain property: The domain name for the static site custom domain.
     *
     * @param domain the domain value to set.
     * @return the StaticSiteUserInvitationRequestResourceProperties object itself.
     */
    public StaticSiteUserInvitationRequestResourceProperties withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Get the provider property: The identity provider for the static site user.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: The identity provider for the static site user.
     *
     * @param provider the provider value to set.
     * @return the StaticSiteUserInvitationRequestResourceProperties object itself.
     */
    public StaticSiteUserInvitationRequestResourceProperties withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the userDetails property: The user id for the static site user.
     *
     * @return the userDetails value.
     */
    public String userDetails() {
        return this.userDetails;
    }

    /**
     * Set the userDetails property: The user id for the static site user.
     *
     * @param userDetails the userDetails value to set.
     * @return the StaticSiteUserInvitationRequestResourceProperties object itself.
     */
    public StaticSiteUserInvitationRequestResourceProperties withUserDetails(String userDetails) {
        this.userDetails = userDetails;
        return this;
    }

    /**
     * Get the roles property: The roles for the static site user, in free-form string format.
     *
     * @return the roles value.
     */
    public String roles() {
        return this.roles;
    }

    /**
     * Set the roles property: The roles for the static site user, in free-form string format.
     *
     * @param roles the roles value to set.
     * @return the StaticSiteUserInvitationRequestResourceProperties object itself.
     */
    public StaticSiteUserInvitationRequestResourceProperties withRoles(String roles) {
        this.roles = roles;
        return this;
    }

    /**
     * Get the numHoursToExpiration property: The number of hours the sas token stays valid.
     *
     * @return the numHoursToExpiration value.
     */
    public Integer numHoursToExpiration() {
        return this.numHoursToExpiration;
    }

    /**
     * Set the numHoursToExpiration property: The number of hours the sas token stays valid.
     *
     * @param numHoursToExpiration the numHoursToExpiration value to set.
     * @return the StaticSiteUserInvitationRequestResourceProperties object itself.
     */
    public StaticSiteUserInvitationRequestResourceProperties withNumHoursToExpiration(Integer numHoursToExpiration) {
        this.numHoursToExpiration = numHoursToExpiration;
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
