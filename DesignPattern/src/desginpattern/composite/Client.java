package desginpattern.composite;

import java.util.Map;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/3 10:24
 */
public class Client {

    public static void main(String[] args) {

        OrganizationComponent hust = new University("hust","华中科技大学");
        OrganizationComponent csCollege = new College("cs","计算机学院");
        OrganizationComponent telCollege = new College("tel","通信学院");

        // 创建各个学院下面的系(专业)
        csCollege.add(new Department("software","软件工程"));
        csCollege.add(new Department("network engineer","网工"));
        telCollege.add(new Department("information engineer","信息工程"));
        telCollege.add(new Department("tel engineer","通信工程"));
        // 加入学校
        hust.add(csCollege);
        hust.add(telCollege);
//        csCollege.add(hust);    // 这里会递归怎么办
        hust.print();

    }



}
