layui.define(["jquery", "templatex"], function (exports) {
    var $ = layui.$;
    var templatex = layui.templatex;

    Array.prototype.contain = function (val) {
        for (var i = 0; i < this.length; i++) {
            if (this[i] == val) {
                return true;
            }
        }
        return false;
    };

    var tabConfig = {};
    tabConfig.opts = {};

    var tabs = [], tabIndex = 1000;

    $(".fastui-sidebar .title").on("click", function () {
        $(".fastui-sidebar").toggleClass("fastui-sidebar-min");
    });

    function closeSideBar() {
        $(".fastui-sidebar").toggleClass("fastui-sidebar-min");
    }

    /**
     * 在主窗口中打开一个新的窗口
     * opts = {url:'url', target:'tab|iframe|window'}
     * @param opts
     */
    function openInTab(opts) {

        var options = opts || {target: "tab"};

        tabConfig.opts[options.id] = options;

        //tab已经打开
        if (tabs.contain(options.id)) {
            layui.use(['element'], function (element) {
                element.tabChange("fastui-maincontent", options.id);
            });
            return;
        }

        if (options.target == 'tab') {
            layui.use(['elementx', 'layer'], function (element) {
                var layer = layui.layer;

                var data = $("<div class='fastui-tab-wrapper'></div>").html("<div class='fastui-loading layui-icon layui-anim  layui-anim-loop' style='color:#999;text-align:center;font-size:14px;'><img style='width:130px;' src='../static/images/load.gif'><p>玩命加载中<span class='fastui-dot'></span><span class='fastui-dot'></span><span class='fastui-dot'></span></p></div>").prop("outerHTML");

                element.tabAdd("fastui-maincontent", {
                    title: options.title,
                    content: data,
                    id: options.id
                });

                tabs.push(options.id);

                element.tabChange("fastui-maincontent", options.id);

                $.get(options.url, options.queryParam, function (data, status) {
                    data = templatex.render(data, {
                        container_id: "tab_" + (tabIndex++)
                    });
                    data = $("<div class='fastui-tab-wrapper'></div>").html(data).prop("outerHTML");
                    //replace
                    element.tabReplace("fastui-maincontent", options.id, data);
                }, "html");
            });

            return;
        }

        if (options.target == "iframe") {
            var id = options.id,
                url = options.url,
                title = options.title;
            var content = '<iframe data-frameid="' + id + '" frameborder="0" name="content" scrolling="auto" height="100%" width="100%" src="' + url + '"></iframe>'

            layui.use(['element'], function (element) {
                if (tabs.contain(id)) {
                    element.tabChange("fastui-maincontent", id);
                } else {
                    element.tabAdd("fastui-maincontent", {
                        title: title,
                        content: content,
                        id: id
                    });
                    tabs.push(id);
                    element.tabChange("fastui-maincontent", id);
                    element.on('tabDelete(fastui-maincontent)', function (data) {
                        tabs.splice(data.index - 1, 1);
                    });
                }
            });
            return;
        }

        if (options.target == "window") {
            var fulls = "left=0,screenX=0,top=0,screenY=0,scrollbars=1"; //定义弹出窗口的参数  
            if (window.screen) {
                var ah = screen.availHeight - 30;
                var aw = screen.availWidth - 10;
                fulls += ",height=" + ah;
                fulls += ",innerHeight=" + ah;
                fulls += ",width=" + aw;
                fulls += ",innerWidth=" + aw;
                fulls += ",resizable"
            } else {
                fulls += ",resizable"; // 对于不支持screen属性的浏览器，可以手工进行最大化。 manually  
            }
            window.open(options.url, fulls);
            return;
        }
    }

    function reloadTab(layerId, queryParam) {
        if (tabConfig.opts[layerId] == null) {
            return;
        }

        var opts = tabConfig.opts[layerId];
        layui.use(['elementx'], function (element) {
            if (queryParam) {
                opts.queryParam = queryParam;
            }
            element.tabReload("fastui-maincontent", opts.id, opts);
        });
    }

    function closeInTab(tabId) {
        layui.use(['element'], function (element) {
            element.tabDelete('fastui-maincontent', tabId);
        });
    }

    /**
     * 初始化fastui
     */
    function init() {
        layui.config({
            base: '../static/layui/ext/'
        });
        //绑定
        layui.use(['element'], function (element) {
            element.on('tabDelete(fastui-maincontent)', function (data) {
                tabs.splice(data.index - 1, 1);
                //console.log(data.index);
            });

            element.on('tab(fastui-maincontent)', function () {
                //TODO 触发reload事件
                //var layid = this.getAttribute('lay-id');
                //alert(layid);
            });
        });

        //主菜单和侧边菜单

        $(".fastui-sidebar-all .fastui-pack-up h3 i").click(function () {
            $(".fastui-sidebar-all").toggleClass("fastui-sidebar-up");
            if ($(".fastui-sidebar-all").attr("class") == "fastui-sidebar-all fastui-sidebar-up") {
                $(".fastui-maincontent").stop().animate({"left": "68px"}, 300);
                $(".fastui-pack-up").stop().animate({"width": "48px"}, 300);
                $(".fastui-header .fastui-menubar").stop().animate({"left": "66px"}, 300);
                $(".fastui-logo").stop().animate({"width": "64px"}, 300);
                $(".fastui-logo img").attr('src', '../static/images/logo1.png');
                $(".fastui-logo img").stop().animate({"height": "38px"}, 300);
                $(".fastui-logo span").css("display", "none");
                $(".fastui-silder.layui-nav .layui-nav-item>a").css("border-top", "none");
                $('.fastui-sidebar-up .fastui-silder>li').hover(function () {
                    $(this).find('ul').show()
                }, function () {
                    $(this).find('ul').hide()
                })
            } else {
                $(".fastui-maincontent").stop().animate({"left": "178px"}, 300);
                $(".fastui-pack-up").stop().animate({"width": "158px"}, 300);
                $(".fastui-header .fastui-menubar").stop().animate({"left": "180px"}, 300);
                $(".fastui-logo img").attr('src', '../static/images/logo.png');
                $(".fastui-logo").stop().animate({"width": "180px"}, 300);
                $(".fastui-logo img").stop().animate({"height": "23px"}, 300);
                $(".fastui-logo span").css("display", "block");
                $(".fastui-silder.layui-nav .layui-nav-item>a").css("border-top", "1px solid #daefff");
                $(".fastui-silder.layui-nav .layui-nav-item:first-of-type>a").css("border-top", "none");
                $('.fastui-silder>li').unbind('mouseenter').unbind('mouseleave');
            }
        })
        $(".fastui-menu-wrapper li").hover(function () {
            $(this).find(".fastui-two-menu").stop().slideDown(200)
        }, function () {
            $(this).find(".fastui-two-menu").stop().slideUp(200)
        })

        $(".fastui-toolbar-btn .fastui-btn-slide").click(function () {
            $(".fastui-seacher-up").stop().slideToggle(500);
        })
        $(".fastui-seacher-hide").click(function () {
            $(".fastui-seacher-up").stop().slideUp(500);
        })

        $(".fastui-window-screen").on("click", ".fastui-menuitem", function () {
            $this = $(this);
            fastui.openInTab({
                title: $this.text(),
                url: $this.attr("data-href"),
                target: $this.attr("data-target"),
                id: $this.attr("data-id")
            });
        });

    }

    var fastui = {
        closeSideBar: closeSideBar,
        openInTab: openInTab,
        closeInTab: closeInTab,
        reloadTab: reloadTab,
        tabConfig: tabConfig
    };

    window.fastui = fastui;

    init();

    exports("fastui", fastui);
});