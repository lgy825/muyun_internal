$(function () {

    loadOwner();
    $("#saveBtn").click(function () {

        if($("#ownerSel").val() == -1) {
            layer.msg("请选择房子所属的房主");
            return;
        }
        var uId = $("#ownerSel").val();
        var hNumber = $.trim($("#hNumber").val());
        if(!hNumber) {
            layer.msg("请输入房间号");
            return;
        } else if(!ValidUtils.validText(hNumber, 1, 8)) {
            layer.msg("房间号不超过8个字，不能出现其他特殊字符");
            return;
        }

        var hNumberArea = $.trim($("#hNumberArea").val());
        if (!hNumberArea) {
            layer.msg("请输入地区号");
            return;
        } else if (!ValidUtils.validUserName(hNumberArea, 1, 8)) {
            layer.msg("用户名不超过8个字母或数字，不能出现其他特殊字符");
            return;
        }
        var hAddr = $.trim($("#hAddr").val());
        if(!$("#hAddr").val()) {
            if (!hAddr) {
                layer.msg("请输入房子所在地址");
                return;
            } else if (!ValidUtils.validText(hAddr, 1, 25)) {
                layer.msg("地址不能超过25个字符，不能出现其他特殊字符");
                return;
            }
        } else {
            if (hAddr.length > 0 && !ValidUtils.validText(hAddr, 1, 25)) {
                layer.msg("地址不能超过25个字符，不能出现其他特殊字符");
                return;
            }
        }
        var hDesc=$.trim($("#hDesc").val());
        $.ajax({
            url: ctx + "hourse/saveHourse",
            type: "POST",
            cache: false,
            dataType: 'json',
            data: {
                hId:$("#hId").val(),
                uId:uId,
                hNumber: hNumber,
                hNumberArea: hNumberArea,
                hAddr:hAddr,
                hDesc: hDesc
            },
            success: function (data) {
                if (data && data.resultCode === '0') {
                    layer.msg("保存成功");
                    location.href = ctx + "hourse/toHourselist";
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




    function loadOwner() {
        $.ajax({
            url: ctx + "owner/getpage",
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
                    // // 城市列表
                    $("#ownerSel").select2({placeholder: '房主'});
                    $("#ownerSel").append("<option value='-1'>房主</option>");
                    $(data.resultData.list).each(function (idx, owner) {
                        $("#ownerSel").append("<option value='" + owner.id + "'>" + owner.uRelName + "</option>");
                    });
                    // 加载数据 -------------
                    if ($("#hId").val()) {
                        $.ajax({
                            url: ctx + "hourse/get",
                            type: "GET",
                            cache: false,
                            async: false,
                            dataType: 'json',
                            data: {
                                hId: $("#hId").val(),
                            },
                            success: function (data) {
                                if (data && data.resultCode === '0') {
                                    su = data.resultData;
                                    $("#hNumber").val(su.hNumber);
                                    $("#hNumberArea").val(su.hNumberArea);
                                    $("#hDesc").val(su.hDesc);
                                    $("#hAddr").val(su.hAddr);
                                    $("#ownerSel").val(su.uId)
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
