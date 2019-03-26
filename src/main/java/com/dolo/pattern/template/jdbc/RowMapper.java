package com.dolo.pattern.template.jdbc;

import java.sql.ResultSet;

/**
 * ORM映射定制化的接口
 * 创建约束 ORM 逻辑的接口
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
