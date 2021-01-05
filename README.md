# LMS-backend

## 软件项目管理后端

### 开发环境： IDEA 2020.3.1 JDK11 将项目拉下来放进IDEA更改配置文件和pom.xml即可运行

### application.properties需要添加的东西

```
server.port = 8998
spring.datasource.url=jdbc:mysql://localhost:3306/open_exp_system?useUnicode=true&characterEncoding=UTF-8&useSSL=false
spring.datasource.username=root
spring.datasource.password=root
#以上改为你自己的数据源

spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.jpa.open-in-view=true
spring.jpa.properties.hibernate.enable_lazy_load_no_trans=true
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

logging.level.org.hibernate.type.descriptor.sql.BasicBinder=trace
## MULTIPART (MultipartProperties)
# 开启 multipart 上传功能
spring.servlet.multipart.enabled=true
# 文件写入磁盘的阈值
spring.servlet.multipart.file-size-threshold=2KB
# 最大文件大小
spring.servlet.multipart.max-file-size=200MB
# 最大请求大小
spring.servlet.multipart.max-request-size=215MB

## 文件存储所需参数
# 所有通过 REST APIs 上传的文件都将存储在此目录下
file.upload-dir=E:\\report
```
