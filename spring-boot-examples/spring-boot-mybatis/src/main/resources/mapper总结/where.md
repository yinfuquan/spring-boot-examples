　<select id="selectByParams" parameterType="map" resultType="user">

　　　　select * from user

　　　　<where>

　　　　　　<if test="id != null ">id=#{id}</if>

　　　　　　<if test="name != null and name.length()>0" >and name=#{name}</if>

　　　　　　<if test="gender != null and gender.length()>0">and gender = #{gender}</if>

　　　　</where>

　　</select>　　　　　

　　在上述SQL中加入ID的值为null的话，那么打印出来的SQL为：select * from user where name="xx" and gender="xx"

　　where 标记会自动将其后第一个条件的and或者是or给忽略掉