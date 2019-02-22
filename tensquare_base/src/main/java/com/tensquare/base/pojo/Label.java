package com.tensquare.base.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author: renshuai
 * @date: 2019/2/22 14:30
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_label")
public class Label implements Serializable {

    @Id
    private String id;

    private String labelname;

    private String state;

    private Long count;

    private String recommend;

    private Long fans;
}
