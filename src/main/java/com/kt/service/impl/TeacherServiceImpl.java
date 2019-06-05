package com.kt.service.impl;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kt.dao.TeacherMapper;
import com.kt.pojo.Teacher;
import com.kt.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class TeacherServiceImpl implements TeacherService {


    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public boolean insert(Teacher teacher) {
        return false;
    }

    @Override
    public boolean insertAllColumn(Teacher teacher) {
        return false;
    }

    @Override
    public boolean insertBatch(List<Teacher> list) {
        return false;
    }

    @Override
    public boolean insertBatch(List<Teacher> list, int i) {
        return false;
    }

    @Override
    public boolean insertOrUpdateBatch(List<Teacher> list) {
        return false;
    }

    @Override
    public boolean insertOrUpdateBatch(List<Teacher> list, int i) {
        return false;
    }

    @Override
    public boolean insertOrUpdateAllColumnBatch(List<Teacher> list) {
        return false;
    }

    @Override
    public boolean insertOrUpdateAllColumnBatch(List<Teacher> list, int i) {
        return false;
    }

    @Override
    public boolean deleteById(Serializable serializable) {
        return false;
    }

    @Override
    public boolean deleteByMap(Map<String, Object> map) {
        return false;
    }

    @Override
    public boolean delete(Wrapper<Teacher> wrapper) {
        return false;
    }

    @Override
    public boolean deleteBatchIds(Collection<? extends Serializable> collection) {
        return false;
    }

    @Override
    public boolean updateById(Teacher teacher) {
        return false;
    }

    @Override
    public boolean updateAllColumnById(Teacher teacher) {
        return false;
    }

    @Override
    public boolean update(Teacher teacher, Wrapper<Teacher> wrapper) {
        return false;
    }

    @Override
    public boolean updateForSet(String s, Wrapper<Teacher> wrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(List<Teacher> list) {
        return false;
    }

    @Override
    public boolean updateBatchById(List<Teacher> list, int i) {
        return false;
    }

    @Override
    public boolean updateAllColumnBatchById(List<Teacher> list) {
        return false;
    }

    @Override
    public boolean updateAllColumnBatchById(List<Teacher> list, int i) {
        return false;
    }

    @Override
    public boolean insertOrUpdate(Teacher teacher) {
        return false;
    }

    @Override
    public boolean insertOrUpdateAllColumn(Teacher teacher) {
        return false;
    }

    @Override
    public Teacher selectById(Serializable serializable) {
        return null;
    }

    @Override
    public List<Teacher> selectBatchIds(Collection<? extends Serializable> collection) {
        return null;
    }

    @Override
    public List<Teacher> selectByMap(Map<String, Object> map) {
        return null;
    }

    @Override
    public Teacher selectOne(Wrapper<Teacher> wrapper) {
        return null;
    }

    @Override
    public Map<String, Object> selectMap(Wrapper<Teacher> wrapper) {
        return null;
    }

    @Override
    public Object selectObj(Wrapper<Teacher> wrapper) {
        return null;
    }

    @Override
    public int selectCount(Wrapper<Teacher> wrapper) {
        return 0;
    }

    @Override
    public List<Teacher> selectList(Wrapper<Teacher> wrapper) {
        return null;
    }

    @Override
    public Page<Teacher> selectPage(Page<Teacher> page) {
        return null;
    }

    @Override
    public List<Map<String, Object>> selectMaps(Wrapper<Teacher> wrapper) {
        return null;
    }

    @Override
    public List<Object> selectObjs(Wrapper<Teacher> wrapper) {
        return null;
    }

    @Override
    public Page<Map<String, Object>> selectMapsPage(Page page, Wrapper<Teacher> wrapper) {
        return null;
    }

    @Override
    public Page<Teacher> selectPage(Page<Teacher> page, Wrapper<Teacher> wrapper) {
        return null;
    }
}
