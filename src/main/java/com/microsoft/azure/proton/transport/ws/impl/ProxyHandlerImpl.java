package com.microsoft.azure.proton.transport.ws.impl;

import com.microsoft.azure.proton.transport.ws.ProxyHandler;

import java.nio.ByteBuffer;
import java.util.Map;

public class ProxyHandlerImpl implements ProxyHandler {

    final Map<String, String> additionalHeaders;
    public ProxyHandlerImpl(
            final Map<String, String> additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
    }

    @Override
    public String createProxyRequest(String hostName) {
        return null;
    }

    @Override
    public Boolean validateProxyReply(ByteBuffer buffer) {
        return null;
    }
}
