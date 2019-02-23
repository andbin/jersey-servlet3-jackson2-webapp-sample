/*
 * Copyright (C) 2019 Andrea Binello ("andbin")
 *
 * This file is part of the "Jersey Servlet3 Jackson2 Webapp Sample" project
 * and is released under the MIT License. See one of the license files
 * included in the root of the project for the full text of the license.
 */

package net.andbin.jerseysample;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "javaRuntimeVersion",
    "jerseyVersion",
    "jacksonCoreVersion", "jacksonDatabindVersion",
    "serverInfo",
    "vmStartTime", "vmStartTimeStr",
    "currentTime", "currentTimeStr"
})
public class AppInfo {
    private String javaRuntimeVersion;
    private String jerseyVersion;
    private String jacksonCoreVersion;
    private String jacksonDatabindVersion;
    private String serverInfo;
    private Date vmStartTime;
    private Date currentTime;

    public String getJavaRuntimeVersion() {
        return javaRuntimeVersion;
    }

    public void setJavaRuntimeVersion(String javaRuntimeVersion) {
        this.javaRuntimeVersion = javaRuntimeVersion;
    }

    public String getJerseyVersion() {
        return jerseyVersion;
    }

    public void setJerseyVersion(String jerseyVersion) {
        this.jerseyVersion = jerseyVersion;
    }

    public String getJacksonCoreVersion() {
        return jacksonCoreVersion;
    }

    public void setJacksonCoreVersion(String jacksonCoreVersion) {
        this.jacksonCoreVersion = jacksonCoreVersion;
    }

    public String getJacksonDatabindVersion() {
        return jacksonDatabindVersion;
    }

    public void setJacksonDatabindVersion(String jacksonDatabindVersion) {
        this.jacksonDatabindVersion = jacksonDatabindVersion;
    }

    public String getServerInfo() {
        return serverInfo;
    }

    public void setServerInfo(String serverInfo) {
        this.serverInfo = serverInfo;
    }

    public Date getVmStartTime() {
        return vmStartTime;
    }

    public void setVmStartTime(Date vmStartTime) {
        this.vmStartTime = vmStartTime;
    }

    public String getVmStartTimeStr() {
        return vmStartTime != null ? vmStartTime.toString() : null;
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public String getCurrentTimeStr() {
        return currentTime != null ? currentTime.toString() : null;
    }
}
