$(function () {

    loadOHourse();
    $("#saveBtn").click(function () {

        if($("#paySel").val() == -1) {
            layer.msg("请选择订单支付方式");
            return;
        }
        var oWay = $("#paySel").val();
        if($("#sourceSel").val() == -1) {
            layer.msg("请选择订单来源");
            return;
        }
        var oSource = $("#sourceSel").val();

        if($("#hourseSel").val() == -1) {
            layer.msg("请选择所属房间");
            return;
        }
        var hourseSel = $("#hourseSel").val();
        var oRecAmount = $.trim($("#oRecAmount").val());
        if(oRecAmount==null){
            layer.msg("输入不能为空");
        }
        var tr=/^[0-9]+([.][0-9]{1}){0,1}$/;
        if(!tr.test(oRecAmount) || oRecAmount>10){
            layer.msg('金额输入有误请重新输入 !');
            return;
        }
        $.ajax({
            url: ctx + "order/addOrder",
            type: "POST",
            cache: false,
            dataType: 'json',
            data: {
                oId:$.trim($("#oId").val()),
                oWay: oWay,
                oSource: oSource,
                hId: hourseSel,
                oRecAmount:oRecAmount
            },
            success: function (data) {
                if (data && data.resultCode === '0') {
                    layer.msg("保存成功");
                    location.href = ctx + "order/toOrderlist";
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

    function loadOHourse() {
        $.ajax({
            url: ctx + "hourse/getpage",
            type: "GET",
            cache: false,
            async: false,
            dataType: 'json',
            data: {
                pageIndex: 1,
                pageSize: 99999
            },
            success: function (data) {
                if (data && data.resultCode === '0') {
                    //
                    $("#hourseSel").select2({placeholder: '*选择房间*'});
                    $("#hourseSel").append("<option value='-1'>*选择房间*</option>");
                    $(data.resultData.list).each(function (idx, hourse) {
                        $("#hourseSel").append("<option value='" + hourse.hId + "'>" + hourse.hNumber + "</option>");
                    });
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
