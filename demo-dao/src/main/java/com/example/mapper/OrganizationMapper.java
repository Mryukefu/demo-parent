package com.example.mapper;

import com.example.po.Organization;
import com.example.po.OrganizationExample;
import org.apache.ibatis.annotations.Param;

import java.sql.Driver;
import java.util.List;

public interface OrganizationMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 03 04:42:19 CST 2021
     */
    long countByExample(OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 03 04:42:19 CST 2021
     */
    int deleteByExample(OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 03 04:42:19 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 03 04:42:19 CST 2021
     */
    int insert(Organization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 03 04:42:19 CST 2021
     */
    int insertSelective(Organization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 03 04:42:19 CST 2021
     */
    List<Organization> selectByExample(OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 03 04:42:19 CST 2021
     */
    Organization selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 03 04:42:19 CST 2021
     */
    int updateByExampleSelective(@Param("record") Organization record, @Param("example") OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 03 04:42:19 CST 2021
     */
    int updateByExample(@Param("record") Organization record, @Param("example") OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 03 04:42:19 CST 2021
     */
    int updateByPrimaryKeySelective(Organization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 03 04:42:19 CST 2021
     */
    int updateByPrimaryKey(Organization record);
}