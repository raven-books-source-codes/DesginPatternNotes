package desginpattern.proxy.jdkproxy;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/6 10:39
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("TeacherDao teaches");
    }
}
