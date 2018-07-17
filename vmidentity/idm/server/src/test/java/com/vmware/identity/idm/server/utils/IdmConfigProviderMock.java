/*
 *
 *  Copyright (c) 2018 VMware, Inc.  All Rights Reserved.
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
 *
 */

package com.vmware.identity.idm.server.utils;

import com.vmware.identity.idm.server.config.IIdmConfig;
import com.vmware.identity.idm.server.config.IIdmConfigProvider;

import org.easymock.EasyMock;

public class IdmConfigProviderMock implements IIdmConfigProvider, AutoCloseable {
	IIdmConfig config;

    public IdmConfigProviderMock(IMockInitializer<IIdmConfig> init) {
        this.config = EasyMock.<IIdmConfig>createMock(IIdmConfig.class);
        if (init != null){
            init.initialize(this.config);
        }
        EasyMock.replay(this.config);
    }

	@Override
	public IIdmConfig getConfig() {
		return this.config;
	}

	@Override
	public void close() throws Exception {
		EasyMock.verify(this.config);
	}
}