package com.janwarlen.feature.InetAddressSPI;

import java.net.spi.InetAddressResolver;
import java.net.spi.InetAddressResolverProvider;

public class ResolverProvider  extends InetAddressResolverProvider {

    static {
        System.out.println("classLoader load class:ResolverProvider");
    }

    @Override
    public InetAddressResolver get(Configuration configuration) {
        return new AddressResolver();
    }

    @Override
    public String name() {
        return "自定义";
    }
}
