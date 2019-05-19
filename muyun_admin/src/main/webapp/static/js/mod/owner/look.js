$(function () {


    $("#loginName").blur(function () {
        $(this).val($.trim($(this).val()));

        if(ValidUtils.validUserName($(this).val(), 1, 15)) {
            $.ajax({
                url: ctx + "sysuser/nameexist.do",
                type: "GET",
                cache: false,
                async: false,
                dataType: 'json',
                data: {
                    id: $("#uid").val(),
                    loginName: $("#loginName").val()
                },
                success: function (data) {
                    if (data && data.resultCode === '0') {
                        if(data.resultData == true) {
                            if($("#loginName").hasClass("inputBg")) {
                                $("#loginName").removeClass("inputBg");
                            }
                            $("#loginName").next().removeClass("none");
                            layer.msg("用户名已存在");
                        } else {
                            $("#loginName").addClass("inputBg");
                            $("#loginName").next().addClass("none");
                        }
                    } else {
                        if (data.resultDesc) {
                            layer.msg(data.resultDesc);
                        } else {
                            layer.msg('查询失败 !');
                        }
                    }
                },
                error: function () {
                    layer.msg('查询失败 !');
                }
            });
        } else {
            if($(this).hasClass("inputBg")) {
                $(this).removeClass("inputBg");
            }
        }
    }).focus(function () {
        $(this).next().removeClass("none");
    });
});