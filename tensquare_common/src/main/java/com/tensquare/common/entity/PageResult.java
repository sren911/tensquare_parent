package com.tensquare.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: renshuai
 * @date: 2019/2/22 14:06
 * @Description:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> {

    private long total;

    private List<T> rows;


}
