package desginpattern.proxy.cglib;

import desginpattern.proxy.staticproxy.ITeacherDao;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/6 10:22
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("teacher teaches");
    }
}
