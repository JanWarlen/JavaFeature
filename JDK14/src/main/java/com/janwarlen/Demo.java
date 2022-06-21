package com.janwarlen;

import com.janwarlen.feature.JFREventStream;
import com.janwarlen.feature.NPE;
import com.janwarlen.feature.SwitchExpressions;

public class Demo {

    public static void main(String[] args) {
        /*JFREventStream jfrEventStream = new JFREventStream();
        Thread thread = new Thread(jfrEventStream::func1);
        thread.start();
        Thread thread2 = new Thread(jfrEventStream::func2);
        thread2.start();*/

        NPE.func();

        SwitchExpressions.func1("111");
        SwitchExpressions.func1Enhanced("111");
        SwitchExpressions.func2(3);
        SwitchExpressions.func2Enhanced(3);
        SwitchExpressions.func3("asd");
    }
}
