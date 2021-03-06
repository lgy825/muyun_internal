$(function () {
    loadOwner();
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