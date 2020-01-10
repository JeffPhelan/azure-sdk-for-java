/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Detailed runtime information of the rollout.
 */
public class RolloutOperationInfo {
    /**
     * The ordinal count of the number of retry attempts on a rollout. 0 if no
     * retries of the rollout have been performed. If the rollout is updated
     * with a PUT, this count is reset to 0.
     */
    @JsonProperty(value = "retryAttempt", access = JsonProperty.Access.WRITE_ONLY)
    private Integer retryAttempt;

    /**
     * True, if all steps that succeeded on the previous run/attempt were
     * chosen to be skipped in this retry attempt. False, otherwise.
     */
    @JsonProperty(value = "skipSucceededOnRetry", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean skipSucceededOnRetry;

    /**
     * The start time of the rollout in UTC.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startTime;

    /**
     * The start time of the rollout in UTC. This property will not be set if
     * the rollout has not completed yet.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endTime;

    /**
     * The detailed error information for any failure.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private CloudErrorBody error;

    /**
     * Get the ordinal count of the number of retry attempts on a rollout. 0 if no retries of the rollout have been performed. If the rollout is updated with a PUT, this count is reset to 0.
     *
     * @return the retryAttempt value
     */
    public Integer retryAttempt() {
        return this.retryAttempt;
    }

    /**
     * Get true, if all steps that succeeded on the previous run/attempt were chosen to be skipped in this retry attempt. False, otherwise.
     *
     * @return the skipSucceededOnRetry value
     */
    public Boolean skipSucceededOnRetry() {
        return this.skipSucceededOnRetry;
    }

    /**
     * Get the start time of the rollout in UTC.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the start time of the rollout in UTC. This property will not be set if the rollout has not completed yet.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the detailed error information for any failure.
     *
     * @return the error value
     */
    public CloudErrorBody error() {
        return this.error;
    }

}