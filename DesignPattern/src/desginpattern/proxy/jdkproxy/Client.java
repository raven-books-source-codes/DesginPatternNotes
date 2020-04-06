package desginpattern.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/6 10:40
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDao();
        ITeacherDao teacherDaoProxy = (ITeacherDao) Proxy.newProxyInstance(teacherDao.getClass().getClassLoader(), teacherDao.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("log method");
                        Object ret = method.invoke(teacherDao, args);
                        return ret;
                    }
                });
        teacherDaoProxy.teach();


    }
}
