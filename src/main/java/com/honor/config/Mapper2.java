package com.honor.config;

import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 继承自己的MyMapper
 *
 * @author liuzh
 * @since 2015-09-06 21:53
 */
public interface Mapper2<T> extends tk.mybatis.mapper.common.Mapper<T>, MySqlMapper<T> {
}