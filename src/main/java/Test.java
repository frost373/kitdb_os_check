import top.thinkin.lightd.db.DB;
import top.thinkin.lightd.db.RKv;
import top.thinkin.lightd.exception.KitDBException;

import java.net.InetAddress;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws KitDBException, InterruptedException {
        DB db =   DB.build("/data2/kitdb/");
        RKv kv =  db.getrKv();
        kv.set("hello","word".getBytes());
        byte[] bytes =  kv.get("hello");
        kv.del("hello");
        db.close();
        Config();
    }
    public static void Config() {
            Properties props = System.getProperties();
            System.out.println("操作系统的名称：" + props.getProperty("os.name"));
            System.out.println("操作系统的版本号：" + props.getProperty("os.version"));
            System.out.println("Java的虚拟机实现版本号：" + props.getProperty("java.vm.version"));
            System.out.println("Java的虚拟机实现名称：" + props.getProperty("java.vm.name"));
    }

}
