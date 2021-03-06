package cn.zup.bi.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import cn.zup.bi.entity.BIShowField;
import cn.zup.bi.entity.BI_DIM;
import cn.zup.bi.entity.BI_DIM_ATTRIBUTE;
import cn.zup.bi.entity.BI_DIM_FIELD;

public interface BIDimService {
	
	/**
	 * 获取所有的数据库表名
	 * @author antsdot
	 * @date 2016-10-9 14:31:21
	 * 
	 * */
	public List getTableNameList(Connection conn) throws SQLException ;
	
	/**
	 * 获取数据表中所有列的列名，并添加到列表结构中
	 * @author antsdot
	 * @date 2016-10-9 14:31:21
	 * 
	 * */
	public List<BI_DIM_FIELD> getColumnNameList(Connection conn, String tableName) throws SQLException;
	
	/**
	 * 保存维表数据
	 * @author antsdot
	 * @date 2016-10-10 09:51:29
	 * @prams BI_DIM 维表实体
	 * 
	 * */
	public int saveDimData(BI_DIM biDim);
	
	/**
	 * 保存维表属性数据
	 * @author antsdot
	 * @date 2016-10-10 10:40:18
	 * @prams BI_DIM 维表属性实体
	 * 
	 * */
	public int saveDimAttribute(BI_DIM_ATTRIBUTE biDimAttribute);
	
	/**
	 * 更新维表数据
	 * @author antsdot
	 * @date 2016-10-10 09:51:29
	 * @prams BI_DIM 维表实体
	 * 
	 * */
	public int updateDimData(BI_DIM biDim);
	
	/**
	 * 更新维表属性数据
	 * @author antsdot
	 * @date 2016-10-10 10:40:18
	 * @prams BI_DIM 维表属性实体
	 * 
	 * */
	public int updateDimAttribute(BI_DIM_ATTRIBUTE biDimAttribute);
	
	/**
	 * 获取维表名称
	 * @author antsdot
	 * @date 2016-10-10 10:47:30
	 * 
	 * */
	List<BI_DIM> getBiDimName();
	
	/**
	 * 获取维表钻取类型
	 * @author antsdot
	 * @date 2016-10-10 10:47:30
	 * 
	 * */
	BI_DIM getBiOpenType(int dimId);
	
	/**
	 * 获取维表数据
	 * @author antsdot
	 * @date 22016-10-14 23:50:47
	 * 
	 * */
	BI_DIM getDimInfo(String biz_Table_Name);
	
	/**
	 * 获取维表属性数据
	 * @author antsdot
	 * @date 22016-10-14 23:50:47
	 * 
	 * */
	List<BI_DIM_ATTRIBUTE> getDimInInfo(int dimId);
	
	/**
	 * 获取数据表中所有列的列名，并添加到列表结构中
	 * @author 谢炎 
	 * @date 2016-10-9 14:31:21
	 * @throws SQLException 
	 * 
	 * */
	public String getPrimaryKey(Connection conn, String tableName) throws SQLException;
	
	/**
	 * 通过维表字段主键id获取维表字段信息
	 * 
	 * */
	public BI_DIM_ATTRIBUTE getBiDimAttribute(int attribute_Id);
	
	BI_DIM getDimInfo(int dimId);
	
	List<BIShowField> getDimFieldList(Integer report_Id, List<String> key, List<Object> value);
	
	int getDimCount(Integer report_Id);
}
