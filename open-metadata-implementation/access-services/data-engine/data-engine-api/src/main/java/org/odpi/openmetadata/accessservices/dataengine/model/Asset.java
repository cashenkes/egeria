/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.accessservices.dataengine.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;

@JsonAutoDetect(getterVisibility = PUBLIC_ONLY, setterVisibility = PUBLIC_ONLY, fieldVisibility = NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class Asset extends Referenceable {

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private static final long serialVersionUID = 1L;

    /**
     * -- SETTER --
     * Sets up the stored display name property for the asset.
     * @param displayName name
     * -- GETTER --
     * Returns the stored display name property for the asset.
     * If no display name is available then null is returned.
     * @return displayName name
     */
    private String displayName;

    /**
     *  -- SETTER --
     *  Set up the stored description property associated with the asset.
     *  @param description String text
     * -- GETTER --
     * Returns the stored description property for the asset.
     * If no description is provided then null is returned.
     * @return description String text
     */
    private String description;
    /**
     * -- SETTER --
     * Set up the name of the owner for this asset.
     * @param owner String name
     * -- GETTER --
     * Returns the name of the owner for this asset.
     * @return owner String
     */
    private String owner;

    /**
     * -- SETTER --
     * Set up the owner type for this asset.
     * @param ownerType OwnerType enum
     * -- GETTER --
     * Return the type of owner stored in the owner property.
     * @return OwnerType enum
     */
    private OwnerType ownerType;

    /**
     * -- SETTER--
     * Set up the names of the zones that this asset is a member of.
     * @param zoneMembership list of zone names
     * -- GETTER --
     * Return the names of the zones that this asset is a member of.
     * @return list of zone names
     */
    private List<String> zoneMembership;

    /**
     * The GUID
     * -- GETTER --
     * Gets the GUID
     * @return the GUID
     * -- SETTER --
     * Sets the GUID
     * @param GUID the GUID
     */
    private String GUID;

    /**
     * -- SETTER --
     * Set up the unique identifier for the organization that originated this asset.
     * @param originOrganizationGUID string guid
     * -- GETTER --
     * Return the unique identifier for the organization that originated this asset.
     * @return string guid
     */
    private String originOrganizationGUID;

    /**
     * -- SETTER --
     * Set up the unique identifier of the business capability that originated this asset.
     * @param originBusinessCapabilityGUID string guid
     * -- GETTER --
     * Return the unique identifier of the business capability that originated this asset.
     * @return string guid
     */
    private String originBusinessCapabilityGUID;

    /**
     * -- SETTER --
     * Set up the properties that characterize where this asset is from.
     * @param otherOriginValues map of name value pairs, all strings
     * -- GETTER --
     * Return the properties that characterize where this asset is from.
     * @return map of name value pairs, all strings
     */
    private Map<String, String> otherOriginValues;

}
