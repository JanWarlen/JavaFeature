package com.janwarlen.feature;

import com.google.common.io.CharStreams;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

public class HiddenClass {


    public static void readBytesFromClass() {
        try {
            byte[] bytes = Files.readAllBytes(Path.of("/Users/jan/IdeaProjects/JavaFeature/JDK15/target/classes/com/janwarlen/feature/HiddenClassModel.class"));
            System.out.println(Base64.getEncoder().encodeToString(bytes));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void func() {
//        byte[] b = Files.readAllBytes(Paths.get(classFilePath));
//        Base64.getEncoder().encodeToString(b);

        try {
            InputStream ins = HiddenClass.class.getClassLoader().getResourceAsStream("HiddenClass");
            String hiddenClass = CharStreams.toString(new InputStreamReader(ins));
            byte[] classBytes = Base64.getDecoder().decode(hiddenClass);
            Class<?> aClass = MethodHandles.lookup().defineHiddenClass(classBytes, true, MethodHandles.Lookup.ClassOption.NESTMATE).lookupClass();
            System.out.println("className:" + aClass.getName());
            for (Method method : aClass.getMethods()) {
                System.out.println("method:" + method.getName());
            }

            MethodHandle hello = MethodHandles.lookup().findStatic(aClass, "hello", MethodType.methodType(String.class));
            String o = (String) hello.invokeExact();
            System.out.println("hello:" + o);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
