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
        String connectRequest = "CONNECT %s HTTP/1.1\r\nHost: %s\r\nConnection: Keep-Alive\r\n";
        connectRequest = String.format(connectRequest, hostName, hostName);
        connectRequest = connectRequest.concat("\r\n");
        return connectRequest;
    }

    @Override
    public Boolean validateProxyReply(ByteBuffer buffer) {
        return true;
    }
}
