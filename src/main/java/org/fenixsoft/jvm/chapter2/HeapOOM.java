package org.fenixsoft.jvm.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args：-Xms5m -Xmx5m -XX:+HeapDumpOnOutOfMemoryError
 *
 * @author zzm
 */
public class HeapOOM {

    static class OOMObject {

        double lan = 150.0;
        // double bing = 350.0;
        // double lan = 1500000.0;// 大小效果是一样的，除非加多几个字段
    }

    public static void main(String[] args) throws InterruptedException {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            System.out.println("main(): " + list.size());

            // Thread.sleep(2000);

            list.add(new OOMObject());
        }
    }
}

