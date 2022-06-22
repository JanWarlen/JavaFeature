package com.janwarlen.feature.InetAddressSPI;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.spi.InetAddressResolver;
import java.util.Arrays;
import java.util.stream.Stream;

public class AddressResolver implements InetAddressResolver {
    @Override
    public Stream<InetAddress> lookupByName(String host, LookupPolicy lookupPolicy) {
        // 自定义根据hostname生成InetAddress流
        // 可查找DNS 或者本地的 /etc/hosts
        System.out.println("AddressResolver:lookupByName");
        InetAddress localHost = Inet4Address.getLoopbackAddress();
        return Arrays.stream(new InetAddress[]{localHost});
    }

    @Override
    public String lookupByAddress(byte[] addr) {
        // 根据ip找hostname
        System.out.println("AddressResolver:lookupByAddress");
        return "null";
    }
}
