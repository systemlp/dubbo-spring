# dubbo-spring
Dubbo+Zookeeper+Spring整合
#
Zookeeper服务注册中心
#
Dubbo 可在Zookeeper中提供或调用服务
#
1,下载zookeeper注册中心，下载地址：http://www.apache.org/dyn/closer.cgi/zookeeper/ 下载后解压即可
#
2,在你执行启动脚本之前，还有几个基本的配置项需要配置一下，Zookeeper的配置文件在 conf 目录下，这个目录下有 zoo_sample.cfg 和 log4j.properties，你需要做的就是将zoo_sample.cfg 改名为 zoo.cfg，因为 Zookeeper在启动时会找这个文件作为默认配置文件
#
	配置文件说明：
#
		•tickTime：这个时间是作为Zookeeper 服务器之间或客户端与服务器之间维持心跳的时间间隔，也就是每个 tickTime 时间就会发送一个心跳。#
		•dataDir：顾名思义就是 Zookeeper保存数据的目录，默认情况下，Zookeeper 将写数据的日志文件也保存在这个目录里。#
		•dataLogDir：顾名思义就是Zookeeper 保存日志文件的目录#
		•clientPort：这个端口就是客户端连接Zookeeper 服务器的端口，Zookeeper 会监听这个端口，接受客户端的访问请求#
3,进入bin目录启动注册中心服务（zkServer.sh【Linux】或zkServer.cmd【Windows】）
