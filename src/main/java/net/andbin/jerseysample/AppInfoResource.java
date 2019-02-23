/*
 * Copyright (C) 2019 Andrea Binello ("andbin")
 *
 * This file is part of the "Jersey Servlet3 Jackson2 Webapp Sample" project
 * and is released under the MIT License. See one of the license files
 * included in the root of the project for the full text of the license.
 */

package net.andbin.jerseysample;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

@Path("app-info")
public class AppInfoResource {
    @Context
    private ServletContext servletContext;

    @GET
    @Produces(APPLICATION_JSON)
    public AppInfo getAppInfo() {
        AppInfo appInfo = new AppInfo();
        appInfo.setJavaRuntimeVersion(RuntimeUtils.getJavaRuntimeVersion());
        appInfo.setJerseyVersion(RuntimeUtils.getJerseyVersion());
        appInfo.setJacksonCoreVersion(RuntimeUtils.getJacksonCoreVersion());
        appInfo.setJacksonDatabindVersion(RuntimeUtils.getJacksonDatabindVersion());
        appInfo.setServerInfo(servletContext.getServerInfo());
        appInfo.setVmStartTime(RuntimeUtils.getVmStartTime());
        appInfo.setCurrentTime(RuntimeUtils.getCurrentTime());
        return appInfo;
    }
}
