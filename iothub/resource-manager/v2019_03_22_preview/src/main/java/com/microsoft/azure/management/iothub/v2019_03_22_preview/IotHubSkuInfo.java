/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_03_22_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about the SKU of the IoT hub.
 */
public class IotHubSkuInfo {
    /**
     * The name of the SKU. Possible values include: 'F1', 'S1', 'S2', 'S3',
     * 'B1', 'B2', 'B3'.
     */
    @JsonProperty(value = "name", required = true)
    private IotHubSku name;

    /**
     * The billing tier for the IoT hub. Possible values include: 'Free',
     * 'Standard', 'Basic'.
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private IotHubSkuTier tier;

    /**
     * The number of provisioned IoT Hub units. See:
     * https://docs.microsoft.com/azure/azure-subscription-service-limits#iot-hub-limits.
     */
    @JsonProperty(value = "capacity")
    private Long capacity;

    /**
     * Get the name of the SKU. Possible values include: 'F1', 'S1', 'S2', 'S3', 'B1', 'B2', 'B3'.
     *
     * @return the name value
     */
    public IotHubSku name() {
        return this.name;
    }

    /**
     * Set the name of the SKU. Possible values include: 'F1', 'S1', 'S2', 'S3', 'B1', 'B2', 'B3'.
     *
     * @param name the name value to set
     * @return the IotHubSkuInfo object itself.
     */
    public IotHubSkuInfo withName(IotHubSku name) {
        this.name = name;
        return this;
    }

    /**
     * Get the billing tier for the IoT hub. Possible values include: 'Free', 'Standard', 'Basic'.
     *
     * @return the tier value
     */
    public IotHubSkuTier tier() {
        return this.tier;
    }

    /**
     * Get the number of provisioned IoT Hub units. See: https://docs.microsoft.com/azure/azure-subscription-service-limits#iot-hub-limits.
     *
     * @return the capacity value
     */
    public Long capacity() {
        return this.capacity;
    }

    /**
     * Set the number of provisioned IoT Hub units. See: https://docs.microsoft.com/azure/azure-subscription-service-limits#iot-hub-limits.
     *
     * @param capacity the capacity value to set
     * @return the IotHubSkuInfo object itself.
     */
    public IotHubSkuInfo withCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }

}
