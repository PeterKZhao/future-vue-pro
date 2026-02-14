package cn.iocoder.future.module.report.convert.goview;

import cn.iocoder.future.framework.common.pojo.PageResult;
import cn.iocoder.future.module.report.controller.admin.goview.vo.project.GoViewProjectCreateReqVO;
import cn.iocoder.future.module.report.controller.admin.goview.vo.project.GoViewProjectRespVO;
import cn.iocoder.future.module.report.controller.admin.goview.vo.project.GoViewProjectUpdateReqVO;
import cn.iocoder.future.module.report.dal.dataobject.goview.GoViewProjectDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GoViewProjectConvert {

    GoViewProjectConvert INSTANCE = Mappers.getMapper(GoViewProjectConvert.class);

    GoViewProjectDO convert(GoViewProjectCreateReqVO bean);

    GoViewProjectDO convert(GoViewProjectUpdateReqVO bean);

    GoViewProjectRespVO convert(GoViewProjectDO bean);

    PageResult<GoViewProjectRespVO> convertPage(PageResult<GoViewProjectDO> page);

}
