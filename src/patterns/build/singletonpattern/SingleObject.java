package patterns.build.singletonpattern;

public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    //    3、饿汉式
    //    是否 Lazy 初始化：否
    //
    //    是否多线程安全：是
    //
    //    实现难度：易
    //
    //    描述：这种方式比较常用，但容易产生垃圾对象。
    //    优点：没有加锁，执行效率会提高。
    //    缺点：类加载时就初始化，浪费内存。
    //    它基于 classloder 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，在单例模式中大多数都是调用 getInstance 方法， 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 显然没有达到 lazy loading 的效果。
    public static SingleObject createStarvingLoadingSingletonObject() {
        return instance;
    }

    //    4、双检锁/双重校验锁（DCL，即 double-checked locking）
    //    JDK 版本：JDK1.5 起
    //
    //    是否 Lazy 初始化：是
    //
    //    是否多线程安全：是
    //
    //    实现难度：较复杂
    //
    //    描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
    //    getInstance() 的性能对应用程序很关键。
    public static SingleObject createDoubleCheckedLockingSingletonObject() {
        if (instance == null) {
            synchronized (SingleObject.class) {
                if (instance == null) {
                    instance = new SingleObject();
                }
            }
        }
        return instance;
    }

    public void resetInstance() {
        instance = null;
    }

    public void showMessage() {
        System.out.println("Hello, World!");
    }

    //        1、懒汉式，线程不安全
    //        是否 Lazy 初始化：是
    //
    //        是否多线程安全：否
    //
    //        实现难度：易
    //
    //        描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
    //        这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
    public static SingleObject createLazyLoadingWithNonThreadSafetySingletonObject() {
        if (instance == null) {
            instance = new SingleObject();
        }
        return instance;
    }

    //    2、懒汉式，线程安全
    //    是否 Lazy 初始化：是
    //
    //    是否多线程安全：是
    //
    //    实现难度：易
    //
    //    描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
    //    优点：第一次调用才初始化，避免内存浪费。
    //    缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
    //    getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
    public static synchronized SingleObject createLazyLoadingWithThreadSafetySingletonObject() {
        if (instance == null) {
            instance = new SingleObject();
        }
        return instance;
    }

    //    5、登记式/静态内部类
    //    是否 Lazy 初始化：是
    //
    //    是否多线程安全：是
    //
    //    实现难度：一般
    //
    //    描述：这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
    //    这种方式同样利用了 classloder 机制来保证初始化 instance 时只有一个线程，它跟第 3 种方式不同的是：第 3 种方式只要 Singleton 类被装载了，那么 instance 就会被实例化（没有达到 lazy loading 效果），而这种方式是 Singleton 类被装载了，instance 不一定被初始化。因为 SingletonHolder 类没有被主动使用，只有显示通过调用 getInstance 方法时，才会显示装载 SingletonHolder 类，从而实例化 instance。想象一下，如果实例化 instance 很消耗资源，所以想让它延迟加载，另外一方面，又不希望在 Singleton 类加载时就实例化，因为不能确保 Singleton 类还可能在其他的地方被主动使用从而被加载，那么这个时候实例化 instance 显然是不合适的。这个时候，这种方式相比第 3 种方式就显得很合理。
    private static class SingletonObjectHolder {
        public static final SingleObject INSTANCE = new SingleObject();
    }

    public static SingleObject createRegistrationSingletonObject() {
        return SingletonObjectHolder.INSTANCE;
    }


}



