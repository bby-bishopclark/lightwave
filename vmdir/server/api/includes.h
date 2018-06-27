/*
 * Copyright © 2018 VMware, Inc.  All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the “License”); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an “AS IS” BASIS, without
 * warranties or conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

#ifndef _WIN32

#include <config.h>
#include <vmdirsys.h>
#include <sys/types.h>
#include <ifaddrs.h>

#else

#pragma once

#include "targetver.h"
#include <windows.h>
#include <stdint.h>
#include <stdlib.h>
#include <stdio.h>
#include <assert.h>
#include <errno.h>
#include <tchar.h>

#endif

#include <vmdir.h>
#include <vmdirtypes.h>
#include <vmdirdefines.h>
#include <vmdirerrorcode.h>
#include <vmdirerrors.h>
#include <vmdircommon.h>
#include <srvcommon.h>
#include <srvcommonapi.h>

#include <backend.h>
#include <middlelayer.h>
#include <ldaphead.h>
#include <resthead.h>
#include <schema.h>
#include <vmdirserver.h>
