/*
 * Copyright (C) 2019 Andrea Binello ("andbin")
 *
 * This file is part of the "Jersey Servlet3 Jackson2 Webapp Sample" project
 * and is released under the MIT License. See one of the license files
 * included in the root of the project for the full text of the license.
 */

package net.andbin.jerseysample;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.Date;
import com.fasterxml.jackson.core.Versioned;

public class RuntimeUtils {
    private RuntimeUtils() {}

    public static String getJavaRuntimeVersion() {
        return System.getProperty("java.runtime.version");
    }

    public static String getJerseyVersion() {
        return org.glassfish.jersey.internal.Version.getVersion();
    }

    public static String getJacksonCoreVersion() {
        Versioned v = new com.fasterxml.jackson.core.json.PackageVersion();
        return v.version().toString();
    }

    public static String getJacksonDatabindVersion() {
        Versioned v = new com.fasterxml.jackson.databind.cfg.PackageVersion();
        return v.version().toString();
    }

    public static Date getVmStartTime() {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        return new Date(runtimeMXBean.getStartTime());
    }

    public static Date getCurrentTime() {
        return new Date();
    }
}
