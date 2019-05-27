<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>添加订单</title>
    <%@include file="/static/commons/common.jspf" %>
</head>
<body>
<div class="p20">
    <div class="bgc-ff">
        <!-- 广告投放 -->
        <div class="b_title">添加订单</div>
        <div class="hr">
            <hr>
        </div>
        <div class="p20">
            <input id="oId" type="hidden" value="${oId}" />
            <div class="">
                <!-- 必填选项 -->
                <div class="mt12 clearfix">
                    <div class="align-r mr8 mt6">支付方式</div>
                    <select id="paySel" class="select ml16 wid-238">

                    </select>
                    <span class="color-lred ml8 mt6">* 支付方式*</span>
                </div>
                <!-- 必填选项 -->
                <div class="mt12 clearfix">
                    <div class="align-r mr8 mt6">订单来源</div>
                    <select id="sourceSel" class="select ml16 wid-238">

                    </select>
                    <span class="color-lred ml8 mt6">*请选择订单来源*</span>
                </div>
                <!-- 必填选项 -->
                <div class="mt12 clearfix">
                    <div class="align-r mr8 mt6">房间号</div>
                    <select id="hourseSel" class="select ml16 wid-238">
                    </select>
                    <span class="color-lred ml8 mt6">*请选择所属房间*</span>
                </div>
                <div class="mt12">
                    <div class="align-r">房费</div>
                    <input id="oRecAmount" maxlength="5" type="text" class="inpW set-inpwid ml8" placeholder="请输入房费">
                    <span class="color-lred ml8 none">* 不超过5个字，不能出现其他特殊字符</span>
                </div>
                <div class="pl88 mt30">
                    <input id="saveBtn" type="button" class="blue_btn blue_btn30" value="创建完成">
                    <a href="${ctx}/order/toOrderlist">
                        <input type="button" class="gray_btn gray-btn30 ml20" value="返回订单列表">
                    </a>
                </div>
            </div>
        </div>
    </div>
</div>
</body>

<!-- scripts -->
<script type="text/javascript" src="${ctx}/static/js/mod/order/addorder.js"></script>
</html>