/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation.ArtifactInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation.DevTestLabsManager;
import org.joda.time.DateTime;
import java.util.Map;

/**
 * Type representing Artifact.
 */
public interface Artifact extends HasInner<ArtifactInner>, Indexable, Refreshable<Artifact>, HasManager<DevTestLabsManager> {
    /**
     * @return the createdDate value.
     */
    DateTime createdDate();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the filePath value.
     */
    String filePath();

    /**
     * @return the icon value.
     */
    String icon();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the parameters value.
     */
    Object parameters();

    /**
     * @return the publisher value.
     */
    String publisher();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the targetOsType value.
     */
    String targetOsType();

    /**
     * @return the title value.
     */
    String title();

    /**
     * @return the type value.
     */
    String type();

}