$(function () {

    // 加载数据 -------------
    if ($("#uId").val()) {
        $.ajax({
            url: ctx + "owner/get",
            type: "GET",
            cache: false,
            async: false,
            dataType: 'json',
            data: {
                id: $("#uId").val(),
            },
            success: function (data) {
                if (data && data.resultCode === '0') {
                    su = data.resultData;
                    $("#uRelName").val(su.uRelName);
                    $("#uName").val(su.uName);
                    $("#uPwd").val("******");
                    $("#uEmail").val(su.uEmail);
                    $("#uTel").val(su.uTel);
                    $("#uAddr").val(su.uAddr);
                    $("#uDesc").val(su.uDesc);
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
    }
});