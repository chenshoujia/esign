package com.kinggrid.esign.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kinggrid.esign.admin.api.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {

	/**
	 * 通过用户ID，查询角色信息
	 * @param userId
	 * @return
	 */
	List<SysRole> listRolesByUserId(Integer userId);

}
