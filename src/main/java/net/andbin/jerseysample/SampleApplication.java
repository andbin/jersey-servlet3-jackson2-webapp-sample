/*
 * Copyright (C) 2019 Andrea Binello ("andbin")
 *
 * This file is part of the "Jersey Servlet3 Jackson2 Webapp Sample" project
 * and is released under the MIT License. See one of the license files
 * included in the root of the project for the full text of the license.
 */

package net.andbin.jerseysample;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class SampleApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(AppInfoResource.class);
        return classes;
    }
}
