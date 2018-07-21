package com.vmware.directory.rest.client.test.integration;

/*
 *  Copyright (c) 2012-2015 VMware, Inc.  All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  use this file except in compliance with the License.  You may obtain a copy
 *  of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, without
 *  warranties or conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the
 *  License for the specific language governing permissions and limitations
 *  under the License.
 */

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.apache.http.HttpException;

import com.vmware.directory.rest.client.VmdirClient;
import com.vmware.directory.rest.client.test.integration.util.TestClientFactory;
import com.vmware.identity.rest.core.client.exceptions.ClientException;
import com.vmware.identity.rest.core.client.test.integration.IntegrationTestProperties;

public class IntegrationTestBase {

    protected static IntegrationTestProperties properties;

    protected static VmdirClient systemAdminClient;
    protected static String systemTenant;
    protected static String hostname;

    public static void init() throws IOException, GeneralSecurityException, ClientException, HttpException {
        properties = new IntegrationTestProperties();

        systemTenant = properties.getSystemTenant();
        hostname = properties.getHost();
        systemAdminClient = TestClientFactory.createClient(hostname,
                systemTenant,
                properties.getSystemAdminUsername(),
                properties.getSystemDomain(),
                properties.getSystemAdminPassword());

    }
}
