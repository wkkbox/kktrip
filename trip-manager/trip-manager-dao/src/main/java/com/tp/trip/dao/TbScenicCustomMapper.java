package com.tp.trip.dao;

import com.tp.trip.common.dto.Order;
import com.tp.trip.common.dto.Page;
import com.tp.trip.pojo.po.TbScenic;
import com.tp.trip.pojo.po.TbScenicWithBLOBs;
import com.tp.trip.pojo.vo.TbScenicCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TbScenicCustomMapper {
    int countItems(@Param("tbScenic") TbScenic tbScenic);
    /**
     * 查询指定页码显示记录集合
     * @param page
     * @return
     */

    int countItemsTest();
    List<TbScenicCustom> listItemsByPage(@Param("page") Page page, @Param("order")Order order, @Param("tbScenic") TbScenicWithBLOBs tbScenic);

    List<TbScenicWithBLOBs> listScenics();


    /**
     * 按条件查询所有景点
     * @param map
     * @return
     */
    List<TbScenicWithBLOBs> listScenic(Map<String, Object> map);

    /**
     * 按条件查询景点的总记录数
     * @param scenic
     * @return
     */
    Integer countScenic(TbScenicWithBLOBs scenic);

    /**
     * 查询所有的国内景点
     * @return
     */
    List<TbScenicWithBLOBs> listInners();

    /**
     * 查询所有的境外景点
     * @return
     */
    List<TbScenicWithBLOBs> listOutters();

    /**
     * 查询所有的跟团景点
     * @return
     */
    List<TbScenicWithBLOBs> listArounds();
}