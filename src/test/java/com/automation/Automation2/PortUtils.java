package com.automation.Automation2;

import java.io.IOException;
import java.net.ServerSocket;

public class PortUtils {
    public static int getAvailablePort() throws IOException {
        try (ServerSocket socket = new ServerSocket(0)) {
            return socket.getLocalPort();
        }
    }
}
