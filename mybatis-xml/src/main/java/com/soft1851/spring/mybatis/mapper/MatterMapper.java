package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.dto.MatterDto;
import com.soft1851.spring.mybatis.vo.MatterVo;

import java.util.List;

public interface MatterMapper {
    /**
     * 多表指定条件查询（结合动态SQL）
     * @param matterDto MatterDto
     * @return List<MatterVo>
     */
    List<MatterVo> selectLimitFromTeacherInClassByDynamicSql(MatterDto matterDto);
}
