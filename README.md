# repair-backEnd
报修大分队
## 须知
- 为了避免发生不必要的错误，建议先将项目直接clone到本地
- 部分使用条件查询的简单示例代码在 [***com.sanyau.repair.controller.ExampleController***](https://github.com/USY-repair/repair-backEnd/blob/master/src/main/java/com/sanyau/repair/controller/ExampleController.java) 
- SwaggerUI地址：***http://localhost:8080/swagger-ui.html***
- 请求的返回体一律使用 [***com.sanyau.repair.response.Result***](https://github.com/USY-repair/repair-backEnd/blob/master/src/main/java/com/sanyau/repair/response/Result.java) 类，关于Result的使用案例，请查看 [***com.sanyau.repair.controller.ExampleController***](https://github.com/USY-repair/repair-backEnd/blob/master/src/main/java/com/sanyau/repair/controller/ExampleController.java) 

### 1. 如何clone本项目 （默认你已配置好git）
- 使用```git clone git@github.com:USY-repair/repair-backEnd.git``` 拿到本项目
- 使用IDEA打开，配置项目maven

### 2. 如何使用mybatis-plus代码生成器 [***com.sanyau.repair.CodeGenerator***](https://github.com/USY-repair/repair-backEnd/blob/master/src/test/java/com/sanyau/repair/CodeGenerator.java)
默认认为已完成maven配置
- 运行 ***com.sanyau.repair.CodeGenerator*** 中的main方法
- 按提示填写生成代码位置的包名，这里直接填```repair```即可
- 按提示填写需要生成的表，你需要填写的是new_repair数据库中的表名，多张表以逗号分隔
- 表：*order,abnormal_order,material_info,return_material_info,repair_details,admin_role,student_info,master_info,delivery_material_info,repository*

### 3. <span id="如何提交自己的代码">如何提交自己的代码</span>
#### 使用原生git提交
- 使用```git add .```将新增文件全部添加至本地仓库
- 使用```git commit -m "提交信息"```将新增文件全部提交至本地仓库，这里的提交信息建议填写这次提交完成的内容或说明
- 使用```git push -u origin master``` 将本地文件提交至github
- 至此，提交完成。
#### 使用IDEA提交
注意：使用IDEA提交的前提是，该项目必须是git clone下来的（有其他办法，但是没有必要）
- 在IDEA工具栏 点击 VCS >> Commit
- 可以发现IDEA左上方区域出现Local Changes的子窗口，且文件已自动勾选
- 在下方有一块编辑区，这个就是你提交文件时附带的备注信息，即上文所说的提交信息。
- 点击COMMIT按钮，将代码提交至本地仓库。
- 点击VCS >> Git >> Push 将本地仓库提交至Github的远程仓库。
- 至此，提交完成
## 开发规范
- 在Controller中的每一个处理http的请求函数都加上 ***@ApiOperation*** 注解，用于备注这个请求用来干什么。示例：[***com.sanyau.repair.controller.ExampleController***](https://github.com/USY-repair/repair-backEnd/blob/master/src/main/java/com/sanyau/repair/controller/ExampleController.java) 

## 建议
- 建议每完成一次自己模块的功能后就进行一次提交，提交步骤参照 [如何提交自己的代码](#如何提交自己的代码)
