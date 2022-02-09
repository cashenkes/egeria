/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.userinterface.uichassis.springboot.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.BAD_REQUEST)
public class GlossaryNotFoundException extends RuntimeException {

    /**
     *
     * @param message text to display to client
     */
    public GlossaryNotFoundException(String message) {
        super(message);
    }
}
