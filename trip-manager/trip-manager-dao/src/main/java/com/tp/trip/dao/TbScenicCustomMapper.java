package com.tp.trip.dao;

import com.tp.trip.common.dto.Order;
import com.tp.trip.common.dto.Page;
import com.tp.trip.pojo.po.TbScenic;
import com.tp.trip.pojo.po.TbScenicWithBLOBs;
import com.tp.trip.pojo.vo.TbScenicCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbScenicCustomMapper {
    int countItems(@Param("tbScenic") TbScenic tbScenic);
    /**
     * 查询指定页码显示记录集合
     * @param page
     * @return
     */

    int countItemsTest();
    List<TbScenicCustom> listItemsByPage(@Param("page") Page page, @Param("order")Order order, @Param("tbScenic") TbScenicWithBLOBs tbScenic);

    /**
     * 查询所有的国内景点
     * @param tid
     * @return
     */
    List<TbScenic> listInners(Long tid);

    List<TbScenicWithBLOBs> listScenics();
}