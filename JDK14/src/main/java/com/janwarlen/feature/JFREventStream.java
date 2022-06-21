package com.janwarlen.feature;

import jdk.jfr.EventType;
import jdk.jfr.consumer.EventStream;
import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordingStream;

import java.io.IOException;
import java.nio.file.Path;
import java.time.Duration;
import java.util.function.Consumer;

public class JFREventStream {

    public void func1() {
        try (var rs = new RecordingStream()) {
            rs.enable("jdk.CPULoad").withPeriod(Duration.ofSeconds(1));
            rs.enable("jdk.JavaMonitorEnter").withThreshold(Duration.ofMillis(10));
            rs.onEvent("jdk.CPULoad", event -> {
                System.out.println("func1:jdk.CPULoad:" + event.getFloat("machineTotal"));
            });
            rs.onEvent("jdk.JavaMonitorEnter", event -> {
                System.out.println("func1:jdk.JavaMonitorEnter:" + event.getClass("monitorClass"));
            });
            rs.start();
        }
    }

    /**
     * 外部开启记录时才能接收事件
     * 1. 通过 jcmd -l 找到进程
     * 2. 通过 jcmd 进程id JFR.start 开启JFR，此时事件开始接收
     */
    public void func2() {
        try {
            EventStream eventStream = EventStream.openRepository();
            try (eventStream) {
                eventStream.onEvent(recordedEvent -> {
                    System.out.println("func2:getEventType:" + recordedEvent.getEventType().getName());
                });
                eventStream.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
