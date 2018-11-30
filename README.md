开发步骤：

　　　　1. 新建springboot项目。

　　　　2. 导入依赖   -->  devtools，lombok，web，thymeleaf，mysql，aop，mybatisplus，druid，swagger。

　　　　3. maven多环境配置。

　　　　4. 编写application.yml  -->  项目端口，项目路径名，mybatisplus配置，mysql多数据源配置。

　　　　5. 新建DataSourceContextHolder 用于设置，获取，清空 当前线程内的数据源变量。

　　　　6. 新建 MultipleDataSource 实现 AbstractRoutingDataSource 类。重写determineCurrentLookupKey()，通过

　　　　　 DataSourceContextHolder 获取数据源变量，用于当作lookupKey取出指定的数据源。

　　　　7. 新建DataSourceEnum 用于存放数据源名称。

　　　　8. 新建注解 DataSource，用于aop类中当作切入点来选择数据源。

　　　　　编写aop类 --> DataSourceAspect.java

　　　　9. 新建并配置DruidConfiguration，MybatisplusConfiguration，SwaggerConfiguration 三个类。

　　　　DruidConfiguration -->  StatViewServlet 和 WebStatFilter Druid监控配置和监控过滤器。

　　　　MybatisplusConfiguration -->  mybatisplus 分页插件，SQL执行效率插件

　　　　　　　　　　　　　　　　　　　 数据源Bean，MultipleDataSource 注入

　　　　　　　　　　　　　　　　　　　 SqlSessionFactory注入

　　　　SwaggerConfiguration --> 常规配置。

　　　　10. crud Controller接口。

注：resources/sql/下面两个*.sql文件执行，建立两个数据库，名字分别为base和cat