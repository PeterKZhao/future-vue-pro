package cn.iocoder.future.module.report.dal.mysql.goview;

import cn.iocoder.future.framework.common.pojo.PageParam;
import cn.iocoder.future.framework.common.pojo.PageResult;
import cn.iocoder.future.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.future.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.future.module.report.dal.dataobject.goview.GoViewProjectDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoViewProjectMapper extends BaseMapperX<GoViewProjectDO> {

    default PageResult<GoViewProjectDO> selectPage(PageParam reqVO, Long userId) {
        return selectPage(reqVO, new LambdaQueryWrapperX<GoViewProjectDO>()
                .eq(GoViewProjectDO::getCreator, userId)
                .orderByDesc(GoViewProjectDO::getId));
    }

}
