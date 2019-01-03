package com.honor.service.base;


import com.honor.config.Mapper2;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by rongyaowen
 * on 2018/1/3.
 * <p>
 * 抽象service实现，实现了基础mapper的基础方法，所有需要基础mapper的service实现类继承这个类
 */
public abstract class AbstractBaseService<T> implements IBaseService<T> {

    @Autowired
    private Mapper2<T> mapper2;

    // 线程池
    protected static ExecutorService executorService = Executors.newFixedThreadPool(30);

    @Override
    public List<T> selectAll() {
        return mapper2.selectAll();
    }

    @Override
    public T selectByPrimaryKey(T t) {
        return mapper2.selectByPrimaryKey(t);
    }

    @Override
    public int deleteByPrimaryKey(T t) {
        return mapper2.deleteByPrimaryKey(t);
    }

    @Override
    public int updateByPrimaryKey(T t) {
        return mapper2.updateByPrimaryKey(t);
    }

    @Override
    public T selectOne(T t) {
        return mapper2.selectOne(t);
    }

    @Override
    public List<T> select(T t) {
        return mapper2.select(t);
    }

    @Override
    public int insert(T t) {
        return mapper2.insert(t);
    }

    @Override
    public int insertList(List<T> t) {
        return mapper2.insertList(t);
    }

    @Override
    public int delete(T t) {
        return mapper2.delete(t);
    }

    @Override
    public int selectCount(T t) {
        return mapper2.selectCount(t);
    }

    @Override
    public int insertSelective(T t) {
        return mapper2.insertSelective(t);
    }

    @Override
    public int selectCountByExample(Example example) {
        return mapper2.selectCountByExample(example);
    }

    @Override
    public List<T> selectByExample(Example example) {
        return mapper2.selectByExample(example);
    }

    @Override
    public int deleteByExample(Example example) {
        return mapper2.deleteByExample(example);
    }

    @Override
    public int updateByExample(T t, Example example) {
        return mapper2.updateByExample(t, example);
    }

    @Override
    public int updateByPrimaryKeySelective(T t) {
        return mapper2.updateByPrimaryKeySelective(t);
    }

    @Override
    public int updateByExampleSelective(T t, Example example) {
        return mapper2.updateByExampleSelective(t, example);
    }

    @Override
    public T selectOneByExample(Example example) {
        return mapper2.selectOneByExample(example);
    }

    @Override
    public List<T> selectByRowBounds(T t, RowBounds rowBounds) {
        return mapper2.selectByRowBounds(t, rowBounds);
    }

    @Override
    public List<T> selectByExampleAndRowBounds(Example example, RowBounds rowBounds) {
        return mapper2.selectByExampleAndRowBounds(example, rowBounds);
    }
}
