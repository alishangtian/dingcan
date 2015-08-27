<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="shortcut icon"
	href="<%=request.getContextPath()%>/staticfile/img/nginx.ico"
	type="image/x-icon" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>nginx</title>
<style type="text/css">
p {
	word-break: break-all;
	TEXT-INDENT: 2em;
}
</style>
</head>
<body>
	<header>
		<h1 align="center">nignx</h1>
	</header>
	<section style="margin-left: 50px">
		<p>
			本网站使用<a href="http://nginx.org/en/docs/http/load_balancing.html" target="_blank" title="nginx">nginx</a>作为负载均衡，后台共有两台服务器，一台服务器上部署得有nginx和网站应用，另一台服务器只部署了网站
		</p>
		<p>nginx负载均衡采用ip_hash策略</p>
		<p>两台服务器上的日志还没有同步，只能分别查看日志</p>
		<p>你访问的后台服务器的ip为${server.serverIp}(内网)</p>
		<p>
			项目是用<a href="http://maven.apache.org/" target="_blank" title="maven">maven</a>进行管理的，包括依赖引入、构建、测试、打包。
		</p>
		<p>
			自动化部署采用简单的<a href="http://linux.vbird.org/linux_basic/0320bash.php"
				target="_blank" title="鸟哥的私房菜">shell</a>脚本命令堆叠，没有用到什么高深的函数，正在研究中。
		</p>
		<p>现在的部署采用的是手动打包，上传到服务器上，然后调用脚本，完成应用的部署。后期要采用从构建到部署的全自动化操作。</p>
	</section>
</body>
</html>