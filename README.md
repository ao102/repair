# repair-backEnd
报修大分队
## 须知
- 为了避免发生不必要的错误，建议先将项目直接clone到本地
- 部分使用条件查询的简单示例代码在 *com.sanyau.repair.controller.ExampleController*
- SwaggerUI地址：*http://localhost:8080.swagger-ui.html*
- 请求的返回体一律使用 *com.sanyau.repair.response* 中的Result类，关于Result的使用案例，请在 *com.sanyau.repair.controller.ExampleController* 查看

### 1. 如何clone本项目 （默认你已配置好git）
- 使用``` git clone https://github.com/USY-repair/repair-backEnd.git``` 拿到本项目
- 使用IDEA打开，配置项目maven

### 2. 如何使用mybatis-plus代码生成器（在test下 *com.sanyau.repair.CodeGenerator*）
默认认为已完成maven配置
- 运行 *com.sanyau.repair.CodeGenerator* 中的main方法
- 按提示填写生成代码位置的包名，这里直接填```repair```即可
- 按提示填写需要生成的表，你需要填写的是new_repair数据库中的表名，多张表以逗号分隔

### 3. <span id="jump">如何提交自己的代码</span>
- 使用```git add .```将新增文件全部添加至本地仓库
- 使用```git commit -m "提交信息"```将新增文件全部提交至本地仓库，这里的提交信息建议填写这次提交完成的内容或说明
- 使用```git push -u origin master``` 将本地文件提交至github
- 至此，提交完成。
## 建议
- 建议每完成一次自己模块的功能后就进行一次提交，提交步骤参照 [如何提交自己的代码](#jump)
