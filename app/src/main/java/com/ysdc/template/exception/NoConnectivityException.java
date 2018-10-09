package com.ysdc.template.exception;

import java.io.IOException;

/**
 * Created by david on 14/3/18.
 */

public class NoConnectivityException extends IOException {
    @Override
    public String getMessage() {
        return "No connectivity exception";
    }
}
