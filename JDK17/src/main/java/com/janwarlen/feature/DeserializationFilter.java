package com.janwarlen.feature;

import java.io.*;

public class DeserializationFilter {

    /**
     * 可以先不执行该方法正常序列化/反序列化
     */
    public static void func() {
        ObjectInputFilter filter = ObjectInputFilter.Config.createFilter("java.base/*;!*");
        ObjectInputFilter serialFilter = ObjectInputFilter.Config.getSerialFilter();
        ObjectInputFilter.Config.setSerialFilter(filter);
    }

    public static void serial(Object obj) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("test");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(obj);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deserial () {
        try {
            FileInputStream fileInputStream = new FileInputStream("test");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object o = objectInputStream.readObject();
            if (o instanceof Shape s) {
                System.out.println("deserial:");
                s.func();
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
