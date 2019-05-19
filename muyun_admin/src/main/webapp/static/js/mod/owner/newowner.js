$(function () {


    $("#saveBtn").click(function () {


        var uRelName = $.trim($("#uRelName").val());
        if(!uRelName) {
            layer.msg("请输入姓名");
            return;
        } else if(!ValidUtils.validText(uRelName, 1, 15)) {
            layer.msg("姓名不超过15个字，不能出现其他特殊字符");
            return;
        }

        var uName = $.trim($("#uName").val());
        if (!uName) {
            layer.msg("请输入用户名");
            return;
        } else if (!ValidUtils.validUserName(uName, 1, 15)) {
            layer.msg("用户名不超过15个字母或数字，不能出现其他特殊字符");
            return;
        }
        var uPwd = $.trim($("#uPwd").val());
        if(!$("#uPwd").val()) {
            if (!uPwd) {
                layer.msg("请输入密码");
                return;
            } else if (!ValidUtils.validUserName(uPwd, 1, 10)) {
                layer.msg("密码不超过10个字母或数字，不能出现其他特殊字符");
                return;
            }
        } else {
            if (uPwd.length > 0 && !ValidUtils.validUserName(uPwd, 1, 10)) {
                layer.msg("密码不超过10个字母或数字，不能出现其他特殊字符");
                return;
            }
        }
        var uEmail = $.trim($("#uEmail").val());
        if(uEmail && !ValidUtils.validEmail(uEmail, 1, 10)) {
            layer.msg("请输入正确的邮箱格式，可为空");
            return;
        }
        var uTel = $.trim($("#uTel").val());
        if(uTel && !ValidUtils.validNum(uTel, 15)) {
            layer.msg("联系电话过长");
            return;
        }
        var uAddr=$.trim($("#uAddr").val());

        $.ajax({
            url: ctx + "owner/saveOwner",
            type: "POST",
            cache: false,
            dataType: 'json',
            data: {
                uId:$("#uId").val(),
                uRelName: uRelName,
                uPwd: uPwd,
                uName:uName,
                uTel: uTel,
                uEmail: uEmail,
                uAddr:uAddr,
                uDesc:$("#uDesc").val()
            },
            success: function (data) {
                if (data && data.resultCode === '0') {
                    layer.msg("保存成功");
                    location.href = ctx + "owner/toOwnerlist";
                } else {
                    if (data.resultDesc) {
                        layer.msg(data.resultDesc);
                    } else {
                        layer.msg('保存失败 !');
                    }
                }
            },
            error: function () {
                layer.msg('保存失败 !');
            },
            beforeSend: function () {
                layer.load(1, {shade:[0.3]})
            }
        });
    });
});
