/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.customerinsights;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Azure Blob connector properties.
 */
public class AzureBlobConnectorProperties {
    /**
     * The connection KeyVault URL.
     */
    @JsonProperty(value = "connectionKeyVaultUrl", required = true)
    private String connectionKeyVaultUrl;

    /**
     * Get the connectionKeyVaultUrl value.
     *
     * @return the connectionKeyVaultUrl value
     */
    public String connectionKeyVaultUrl() {
        return this.connectionKeyVaultUrl;
    }

    /**
     * Set the connectionKeyVaultUrl value.
     *
     * @param connectionKeyVaultUrl the connectionKeyVaultUrl value to set
     * @return the AzureBlobConnectorProperties object itself.
     */
    public AzureBlobConnectorProperties withConnectionKeyVaultUrl(String connectionKeyVaultUrl) {
        this.connectionKeyVaultUrl = connectionKeyVaultUrl;
        return this;
    }

}
