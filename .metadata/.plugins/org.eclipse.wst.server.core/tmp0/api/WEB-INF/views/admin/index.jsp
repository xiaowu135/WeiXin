<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en" ng-app="app">
<head>
<meta charset="UTF-8">
<title>${TITLE}</title>
<meta charset="UTF-8" />
<meta name="keywords"
	content="CrapApi,api,crap,接口管理,应用接口管理,开源接口管理,开源api接口管理" />
<meta name="description" content="CrapApi|一个由anjularjs+bootstrap+springMVC搭建的免费开源的API接口管理系统（应用接口管理系统）" />
<link href="${ICON}" rel="shortcut icon" type="image/x-icon" />
<link href="${ICON}" rel="icon" type="image/x-icon" />
<link href="${ICON}" rel="shortcut" type="image/x-icon" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link href="resources/framework/bootstrap-3.0.0/css/bootstrap.css" rel="stylesheet" type="text/css" />
<link href="resources/framework/bootstrap-3.0.0/css/bootstrap-datetimepicker.min.css" rel="stylesheet" type="text/css" />
<!-- base-min.css,admin.css应该发在bootstrap之后,覆盖部分bootstrap样式 -->
<link href="resources/css/base.css" rel="stylesheet" type="text/css" />
<link href="resources/css/crapApi.css" rel="stylesheet" type="text/css" />
<link href="resources/framework/font-awesome-4.5.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
<link href="resources/framework/textAngular-1.5.0/textAngular.css" rel="stylesheet" type="text/css" />
<%@include file="../tpls/webCss.tpl.jsp"%>
</head>
<body>
	<%@include file="../tpls/top.tpl.jsp"%>
	<div class="container-fluid h p0 m0">
		<div class="row h p0 m0 pt50">
				<%@include file="../tpls/left.tpl.jsp"%>
				<div class="col-xs-9 col-sm-10 p0 h mah ofy-a">
					<div class="BGFFF m20 BGFFF p10 r5">
						<div class="col-xs-12 f16 fb p0 mb5" ng-if="error">
							<button type="button" class="btn btn-danger btn-xs break-word">
								<span class="glyphicon glyphicon-remove"></span>
								<span ng-bind="error"></span>
							</button>
						</div>
						<div ui-view="main"></div>
					</div>
				</div>
		</div>
	</div>
	<script src="resources/framework/jquery-1.9.1.min.js"></script>
	<script src="resources/framework/jquery.cookie.js"></script>
	<script src="resources/framework/jquery.base64.js"></script>
	
	<script src="resources/framework/angular-1.3.0.14/angular.js"></script>
	<script src="resources/framework/angular-1.3.0.14/angular-animate.min.js"></script>
	<script src="resources/framework/angular-ui-router-0.2.15.js"></script>
	<script src="resources/js/app.js?v=2010"></script>
	<script src="resources/js/services.js"></script>
	<script src="resources/js/router.js"></script>
    <script src="resources/js/controllers.js?v=2010"></script>
    <script src="resources/js/webControllers.js?v=2010"></script>
    
    <script src='resources/framework/textAngular-1.5.0/textAngular-rangy.min.js'></script>
    <script src='resources/framework/textAngular-1.5.0/textAngular-sanitize.min.js'></script>
    <script src='resources/framework/textAngular-1.5.0/textAngular.min.js'></script>
    
    <script src="resources/framework/bootstrap-3.0.0/js/bootstrap.js"></script>
	<script src="resources/framework/bootstrap-3.0.0/js/bootstrap-datetimepicker.min.js"></script>
	<script src="resources/framework/bootstrap-3.0.0/js/bootstrap-datetimepicker.zh-CN.js"></script>
    <script src="resources/js/validateAndRefresh.js?v=200"></script>
    <script src="resources/js/core.js?v=200"></script>
	<script src="resources/js/global.js?v=200"></script>
	<script src="resources/js/crapApi.js?v=200"></script>
	<script src="resources/js/checkJson.js?v=200"></script>
	
	<!-- 提示窗口 -->
<div id="lookUp" class="look-up shadow">
	<div id="lookUpContent" class="look-up-content f12 tc">加载中....</div>
	<div id="pickTip"></div>
	<i class="iconfont i-close" onclick="iClose('lookUp')">&#xe615;</i>
</div>
<div id="fade"></div>
<div id="myDialog" class="look-up shadow r2 bottom-radius pt50">
		<div id="myDialog-title" class="CFFF f20 fb shadow" style="margin-top:-50px;line-height:50px;padding-left:20px;height:50px;">
		</div>
		<div id="myDialogContent" class="look-up-content b0 f12 tc p30 BGFFF bottom-radius">
			<button type="button" class="btn btn-danger btn-xs break-word" ng-if="error">
					<span class="glyphicon glyphicon-remove"></span>
					<span ng-bind="error"></span>
			</button>
			<div ui-view="detail"></div>
		</div>
		<i class="iconfont i-close CFFF fb f20" onclick="closeMyDialog('myDialog')">&#xe615;</i>
</div>    
<div id="float" class="folat">
		<div class="sk-wave">
        <div class="sk-rect sk-rect1"></div>
        <div class="sk-rect sk-rect2"></div>
        <div class="sk-rect sk-rect3"></div>
        <div class="sk-rect sk-rect4"></div>
        <div class="sk-rect sk-rect5"></div>
      </div>
</div>
<div class="ndis">
	<script type="text/javascript">var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");document.write(unescape("%3Cspan id='cnzz_stat_icon_1258389938'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol + "s95.cnzz.com/z_stat.php%3Fid%3D1258389938' type='text/javascript'%3E%3C/script%3E"));</script>
</div>
</body>
</html>
