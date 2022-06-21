package com.janwarlen.feature;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryHandles;
import jdk.incubator.foreign.MemorySegment;

import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;

public class ForeignMemory {

    public void func() {
        VarHandle intHandle = MemoryHandles.varHandle(int.class,
                ByteOrder.nativeOrder());
        try (MemorySegment segment = MemorySegment.allocateNative(100)) {
            MemoryAddress base = segment.baseAddress();
            for (int i = 0; i < 25; i++) {
                intHandle.set(base.addOffset(i * 4), i);
            }
        }

        VarHandle intElemHandle = MemoryHandles.withStride(intHandle, 4);
        try (MemorySegment segment = MemorySegment.allocateNative(100)) {
            MemoryAddress base = segment.baseAddress();
            for (int i = 0; i < 25; i++) {
                intElemHandle.set(base, (long) i, i);
            }
        }
    }
}
