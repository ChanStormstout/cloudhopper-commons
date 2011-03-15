/**
 * Copyright (C) 2011 Twitter, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.cloudhopper.commons.gsm;

/**
 * Enum class that represents a Numbering Plan Indicator (NPI) in the GSM world.
 * 
 * @author joelauer
 */
public enum Npi {

    UNKNOWN (GsmConstants.NPI_UNKNOWN),
    ISDN (GsmConstants.NPI_ISDN),
    DATA (GsmConstants.NPI_DATA),
    TELEX (GsmConstants.NPI_TELEX),
    SERVICE (GsmConstants.NPI_SERVICE),
    NATIONAL (GsmConstants.NPI_NATIONAL),
    PRIVATE (GsmConstants.NPI_PRIVATE),
    ERMES (GsmConstants.NPI_ERMES);
    
    private final int npi;

    Npi(final int npi) {
        this.npi = npi;
    }

    public int toInt() {
        return this.npi;
    }

    public static Npi fromInt(final int npi) {
        for (Npi e : Npi.values()) {
            if (e.npi == npi) {
                return e;
            }
        }
        return null;
    }

}
