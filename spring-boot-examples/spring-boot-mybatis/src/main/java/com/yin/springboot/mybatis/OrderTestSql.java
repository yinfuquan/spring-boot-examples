package com.yin.springboot.mybatis;

import com.yin.springboot.mybatis.domain.OmsOrder;
import com.yin.springboot.mybatis.domain.OmsOrderItem;
import lombok.Data;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/14
 * Time: 22:35
 * To change this template use File | Settings | File Templates.
 */
@Data
public class OrderTestSql extends OmsOrder {

private List<OmsOrderItem> itemlist;
private  Integer count;

private  OmsOrderItem onelist;

}
