# HANA 表结构

## 1.设备表 device

| 字段名    | 类型      | 备注                                     |
| --------- | --------- | ---------------------------------------- |
| id        | INT       | PK                                       |
| name      | STRING    | 名称                                     |
| model     | STRING    | 型号                                     |
| type      | INT       | 类型,1:电表，2: 水表，3:燃气表, 4:空气表 |
| sn        | STRING    | 设备的序列号                             |
| simcard   | STRING    | 设备的SIM卡号                            |
| pos   | STRING    | 设备的GPS地址                         |
| info      | TEXT      | 设备的一些信息                           |
| area      | STRING    | 设备的厂区                               |
| create_at | DATE TIME | 创建时间                                 |

示例数据：

```json
{
    "area":"某公司东区1号厂房",
    "simcard":"13388888888",
    "pos":"120,34'-89,45'",
    "name":"1号燃气表",
    "model":"ABC001",
    "id":1,
    "sn":"2020-nvbHJNBVGFYHUJ",
    "create_at":1617678945182,
    "type":1,
    "info":"这是个电表"
}
```

## 2.数据表 data

| 字段名     | 类型      | 备注     |
| ---------- | --------- | -------- |
| id         | INT       | PK       |
| device_id  | INT       | 设备ID   |
| data_value | DOUBLE    | 数据值   |
| threshold  | DOUBLE    | 阈值     |
| create_at  | DATE TIME | 创建时间 |

示例数据

```json
{
    "data_value":123.45,
    "threshold":100.01,
    "id":1,
    "create_at":1617679242020
}
```



## 3.厂区表 area

| 字段名    | 类型      | 备注     |
| --------- | --------- | -------- |
| id        | INT       | PK       |
| name      | STRING    | 名称     |
| info      | TEXT      | 厂区信息 |
| create_at | DATE TIME | 创建时间 |

## 4.产品表 product

| 字段名    | 类型      | 备注     |
| --------- | --------- | -------- |
| id        | INT       | PK       |
| name      | STRING    | 名称     |
| company     | STRING    | 公司     |
| model      | STRING    | 型号     |
| info      | TEXT      | 产品信息 |
| create_at | DATE TIME | 创建时间 |

## 5.事件表 event

| 字段名    | 类型      | 备注     |
| --------- | --------- | -------- |
| id        | INT       | PK       |
| type        | INT       | 类型,1:Warning, 2:Info      |
| name      | STRING    | 名称     |
| device_id | STRING    | 来自设备  |
| info      | TEXT      | 产品信息 |
| create_at | DATE TIME | 创建时间 |

示例数据

```json
{
    "device_id":1,
    "name":"警告信息",
    "id":1,
    "create_at":1617679726494,
    "type":1,
    "info":"设备【1】电压过高，请及时处理"
}
```

