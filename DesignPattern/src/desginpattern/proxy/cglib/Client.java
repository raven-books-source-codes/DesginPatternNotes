package desginpattern.proxy.cglib;

import net.sf.cglib.proxy.*;

import java.lang.reflect.Method;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/6 11:03
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDao teacherProxy = (TeacherDao) Enhancer.create(teacherDao.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("log");
                return method.invoke(teacherDao);
            }
        });
        teacherProxy.teach();
    }
}
