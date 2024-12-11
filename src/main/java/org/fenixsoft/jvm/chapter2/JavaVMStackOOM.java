package org.fenixsoft.jvm.chapter2;

/**
 * VM Args：-Xss2M （这时候不妨设大些，请在32位系统下运行）
 * <p>
 * 虚拟机栈内存受限于进程的内存大小，32位系统，内存限制为2G，比较好测试
 * <p>
 * 64位系统内存过大，监控系统内存会发现，内存一直在上涨，因为可以一直分配，直到内存耗尽，注意会卡死，要及时关掉程序
 *
 * @author zzm
 */
public class JavaVMStackOOM {

    private static int oomLength = 1;

    private void dontStop() {
        while (true) {
            try {
                Thread.sleep(10000 * 000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void stackLeakByThread() {
        while (true) {
            System.out.println(oomLength++);

            if (oomLength > 100000) {
                System.out.println("主动退出，防止死机");
                System.exit(0);//线程多了，退出很慢，可以观察内存下降趋势，所以直接手动退出
                return;
            }

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
        System.out.println("-----");
    }
}
