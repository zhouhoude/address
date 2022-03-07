package chihane.jdaddressselector;

import java.util.List;

/**
 * @ProjectName: DanaDarurat
 * @Package: chihane.jdaddressselector
 * @ClassName: Lists
 * @Description: java类作用描述
 * @Author: jtao
 * @CreateDate: 2022/3/7 3:27 下午
 * @UpdateUser: 更新者
 * @UpdateDate: 2022/3/7 3:27 下午
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Lists {
    public static boolean isEmpty(List list) {
        return list == null || list.size() == 0;
    }

    public static boolean notEmpty(List list) {
        return list != null && list.size() > 0;
    }

}
