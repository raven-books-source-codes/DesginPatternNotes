package desginpattern.proxy.staticproxy;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/6 10:23
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDao();
        ITeacherDao teacherDaoProxy = new TeacherProxy(teacherDao);
        teacherDaoProxy.teach();
    }
}
