/*
 * $Id$
 *
 * Copyright 2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.struts2;

import javax.servlet.ServletContext;

import org.apache.struts2.config.Configuration;
import org.apache.struts2.dispatcher.DispatcherUtils;
import org.springframework.mock.web.MockServletContext;

import com.opensymphony.xwork2.XWorkTestCase;
import com.opensymphony.xwork2.util.LocalizedTextUtil;

/**
 * Base test case for unit testing Struts.
 */
public abstract class StrutsTestCase extends XWorkTestCase {

    
    
    protected void setUp() throws Exception {
        super.setUp();
        Configuration.reset();
        LocalizedTextUtil.clearDefaultResourceBundles();
        DispatcherUtils du = new DispatcherUtils(new MockServletContext());
        du.setInstance(du);
        du.setConfigurationManager(configurationManager);
        
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

}
