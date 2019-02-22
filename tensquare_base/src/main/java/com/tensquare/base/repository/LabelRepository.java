package com.tensquare.base.repository;

import com.tensquare.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author: renshuai
 * @date: 2019/2/22 14:51
 * @Description:
 */
@Repository
public interface LabelRepository extends JpaRepository<Label, String>, JpaSpecificationExecutor<Label> {
}
