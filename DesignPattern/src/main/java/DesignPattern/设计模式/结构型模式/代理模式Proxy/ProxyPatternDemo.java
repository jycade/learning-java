package 设计模式.结构型模式.代理模式Proxy;

/**
 * 在代理模式（Proxy Pattern）中，一个类代表另一个类的功能。这种类型的设计模式属于结构型模式。
 *
 * 在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。
 *
 * 当被请求时，使用 ProxyImage 来获取 RealImage 类的对象。
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
