package com.yin.web.config;

import com.yin.web.entity.User;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * 自定义实现 ShiroRealm，包含认证和授权两大模块
 *
 * @author MrBird
 */
@Component
public class ShiroRealm extends AuthorizingRealm {

//    @Autowired
//    private IUserService userService;
//    @Autowired
//    private IRoleService roleService;
//    @Autowired
//    private IMenuService menuService;

    /**
     * 授权模块，获取用户角色和权限
     *
     * @param principal principal
     * @return AuthorizationInfo 权限信息
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
//        User user = (User) SecurityUtils.getSubject().getPrincipal();
//        String userName = user.getUsername();

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();

//        // 获取用户角色集
//        List<Role> roleList = this.roleService.findUserRole(userName);
//        Set<String> roleSet = roleList.stream().map(Role::getRoleName).collect(Collectors.toSet());
//        simpleAuthorizationInfo.setRoles(roleSet);
//
//        // 获取用户权限集
//        List<Menu> permissionList = this.menuService.findUserPermissions(userName);
//        Set<String> permissionSet = permissionList.stream().map(Menu::getPerms).collect(Collectors.toSet());
        Set<String> permissionSet = new HashSet<>();
        //  permissionSet.add("user:add");
        permissionSet.add("user:update");
        simpleAuthorizationInfo.setStringPermissions(permissionSet);
        return simpleAuthorizationInfo;
    }

    /**
     * 用户认证
     *
     * @param token AuthenticationToken 身份认证 token
     * @return AuthenticationInfo 身份认证信息
     * @throws AuthenticationException 认证相关异常
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // 获取用户输入的用户名和密码
//        String userName = (String) token.getPrincipal();
//        String password = new String((char[]) token.getCredentials());
//
//        // 通过用户名到数据库查询用户信息
//        User user = this.userService.findByName(userName);
//
//        if (user == null)
//            throw new UnknownAccountException("用户名或密码错误！");
//        if (!StringUtils.equals(password, user.getPassword()))
//            throw new IncorrectCredentialsException("用户名或密码错误！");
//        if (User.STATUS_LOCK.equals(user.getStatus()))
//            throw new LockedAccountException("账号已被锁定,请联系管理员！");
//        return new SimpleAuthenticationInfo(user, password, getName());


        //数据库根据username查出用户
        User user = new User();
        user.setPassword("123456");
        user.setUsername("yin");



        //获取用户输入的用户名和密码
        String userName = (String) token.getPrincipal();
        String password = new String((char[]) token.getCredentials());
        if (null == user) {
            throw new UnknownAccountException("用户名错误");
        }
        if (!StringUtils.equals(password, user.getPassword())) {
            throw new IncorrectCredentialsException("密码错误！");
        }


        return new SimpleAuthenticationInfo(userName, password, getName());

    }

}
