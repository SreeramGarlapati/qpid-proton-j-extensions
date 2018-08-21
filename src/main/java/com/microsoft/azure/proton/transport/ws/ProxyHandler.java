/*
 * Copyright (c) Microsoft. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */
package com.microsoft.azure.proton.transport.ws;

import java.nio.ByteBuffer;

public interface ProxyHandler {
    Boolean validateProxyReply(ByteBuffer buffer);
}
