# RuoYi
> 模仿优秀的开源项目RuoYi，它的源链接为https://gitee.com/y_project/RuoYi
>
> 按照自己的理解，尝试复刻出来该开源软件。



## 记录项目文件编写

## Common模块（工具模块）

- **core：**
  - **controller：**
    - **BaseController：**web层通用数据处理	---------------	未完成
  - **page：**
    - **PageDomain：**分页数据	----------------	完成
    - **TableSupport：**表格数据处理    --------------------  未完成
  - **text：**
    - **Convert：**类型转换器	---------------------  完成
    - **CharsetKit：**字符集工具类   ---------------------   完成

- **utils：**
  - **DateUtils：**时间工具类	------------------------	未完成
  - **ServletUtils：**客户端工具类    ----------------------   完成
  - **StringUtils：** 字符串工具类    ------------------------   未完成
- **constant：**
  - **Constants：** 通用常量信息	-------------------	未完成



## 算法

- 驼峰命名转下划线 （common - utils - StringUtils）
- 数字转大写  （common - core - text - Convert）