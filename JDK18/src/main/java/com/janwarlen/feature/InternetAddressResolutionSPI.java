package com.janwarlen.feature;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InternetAddressResolutionSPI {
    public static void func() {
        try {
            InetAddress ids = InetAddress.getByName("null");
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
