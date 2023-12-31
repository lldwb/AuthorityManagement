package top.lldwb.authorityManagement.controller.vo;

import java.util.List;

/**
 * @author wangl
 * @date 2023/6/8
 * 分页工具类
 */
public class PageUtils {

    /**
     * 计算出从第几行开始查询
     * @return
     */
    public static int toNumberOf(int page, int limit) {
        return page <= 1 ? 0 : (page - 1) * limit;
    }

    /**
     * 封装成PageVO对象
     * @param list 分页记录
     * @param count 总记录数
     * @return
     * @param <T>
     */
    public static <T> PageVO<List<T>> toPageVO(List<T> list, long count) {
        PageVO<List<T>> pageVO = new PageVO<>();
        pageVO.setCount(count);
        pageVO.setData(list);
        pageVO.setCode(0);
        pageVO.setMessage("查询成功");
        return pageVO;
    }
}