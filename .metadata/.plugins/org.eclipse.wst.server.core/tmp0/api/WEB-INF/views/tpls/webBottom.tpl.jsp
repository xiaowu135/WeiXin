<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div class="container-fluid m0 mt30 FOOTER_BG_COLOR FOOTER_COLOR">
<div class="container p0" ng-controller="lefMenuCtrl">
	<div class="col-xs-12 f12 p0 mb5 tl mt50 mb50">
				©crap.cn &nbsp;版权所有
	    		<ul class="dis-in-tab ml0"> 
	    			<li class="dis-in-tab mr20">
	    				<a target="_blank" href="http://api.crap.cn/web.do#/webWebPage/list/ARTICLE/帮助文档">帮助文档</a>
	    			</li>
	    			<li class="dis-in-tab mr20">
	    				<a target="_blank" href="https://github.com/EhsanTang/CrapApi">GitHub源码</a>
	    				<span class="bg_line"></span>
	    			</li>
	    			<li class="dis-in-tab mr20"  ng-repeat="item in menus" ng-if="item.menu.type=='BOTTOM'">
	    				<a target="_blank" ng-href="{{item.menu.menuUrl}}" ng-bind="item.menu.menuName"></a>
	    			</li>
	    		</ul>
	    		<div class="mt20">
					友情链接：
					<ul class="dis-in-tab p0"> 
		    			<li class="dis-in-tab pr20"  ng-repeat="item in menus" ng-if="item.menu.type=='FRIEND'">
		    				<a target="_blank" ng-href="{{item.menu.menuUrl}}" ng-bind="item.menu.menuName"></a>
		    			</li>
	    			</ul>
				</div>
				
	</div>
</div>
<div class="ndis">
<script type="text/javascript">var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");document.write(unescape("%3Cspan id='cnzz_stat_icon_1258389938'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol + "s95.cnzz.com/z_stat.php%3Fid%3D1258389938' type='text/javascript'%3E%3C/script%3E"));</script>
</div>
</div>
<div id="go_top" style="padding-top:9px;padding-left:13px;" class="cursor">
	<i class="iconfont f20" style="color:#FFF;">&#xe617;</i>
</div>

