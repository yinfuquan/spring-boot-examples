    <insert id="insertList">
        INSERT INTO ums_role_permission_relation (role_id, permission_id) VALUES
        <foreach collection="list" separator="," item="item" index="index">
            (#{item.roleId,jdbcType=BIGINT},
            #{item.permissionId,jdbcType=BIGINT})
        </foreach>
    </insert>