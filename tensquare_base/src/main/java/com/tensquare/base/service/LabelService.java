package com.tensquare.base.service;

import com.tensquare.base.pojo.Label;
import com.tensquare.common.entity.PageResult;

import java.util.List;

/**
 * @author: renshuai
 * @date: 2019/2/22 14:53
 * @Description:
 */
public interface LabelService {

    List<Label> findAll();

    Label findById(String labelId);

    void save(Label label);

    void update(Label label);

    void deleteById(String id);

    List<Label> findSearch(Label label);

    PageResult<Label> pageQuery(Label label, Integer page, Integer size);
}
