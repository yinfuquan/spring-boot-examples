
OmsOrderMapper.xml  例子

        @Data
        public class OrderTestSql extends OmsOrder {

        private List<OmsOrderItem> itemlist;

        }


 <resultMap id="BaseResultMap" type="com.yin.springboot.mybatis.domain.OmsOrder">
        <!--@mbg.generated-->
        <id column="id" jdbcType="BIGINT" property="id"/>
        <result column="member_id" jdbcType="BIGINT" property="memberId"/>
        <result column="coupon_id" jdbcType="BIGINT" property="couponId"/>
        <result column="order_sn" jdbcType="VARCHAR" property="orderSn"/>
        <result column="create_time" jdbcType="TIMESTAMP" property="createTime"/>
        <result column="member_username" jdbcType="VARCHAR" property="memberUsername"/>
        <result column="total_amount" jdbcType="DECIMAL" property="totalAmount"/>
        <result column="pay_amount" jdbcType="DECIMAL" property="payAmount"/>

    </resultMap>


继承上面的 resultmap


<resultMap id="itemmap" type="com.yin.springboot.mybatis.OrderTestSql" extends="com.yin.springboot.mybatis.mapper.OmsOrderMapper.BaseResultMap">
    <collection property="itemlist" columnPrefix="item_"  resultMap="com.yin.springboot.mybatis.mapper.OmsOrderItemMapper.BaseResultMap"/>
</resultMap>


<!--查询出来的参数前面加个前缀，，，方便collection里使用前缀-->

<select id="selectOrderitemListById" resultMap="itemmap">

    SELECT
    od.*,
    item.product_name  item_product_name
    FROM
    oms_order od
    LEFT JOIN oms_order_item item
    ON od.id = item.order_id
    WHERE
    od.id = #{id,jdbcType=BIGINT}

</select>
