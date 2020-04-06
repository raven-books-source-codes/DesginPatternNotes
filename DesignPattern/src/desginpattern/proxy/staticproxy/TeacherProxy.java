package desginpattern.proxy.staticproxy;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/6 10:23
 */
public class TeacherProxy implements ITeacherDao {
    private ITeacherDao teacherDao;

    public TeacherProxy(ITeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("proxy method");
        teacherDao.teach();
    }
}
