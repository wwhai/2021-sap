# JSON结构

## 1.厂区

```json
[
  {
    "ID": 1,
    "NAME": "东部厂房",
    "INFO": "这里是东部厂房",
    "CREATE_AT": "2021-04-07 02:52:40.647000000"
  },
  {
    "ID": 2,
    "NAME": "西部厂房",
    "INFO": "这里是西部厂房",
    "CREATE_AT": "2021-04-07 02:52:40.681000000"
  },
  {
    "ID": 3,
    "NAME": "南部厂房",
    "INFO": "这里是南部厂房",
    "CREATE_AT": "2021-04-07 02:52:40.712000000"
  },
  {
    "ID": 4,
    "NAME": "北部厂房",
    "INFO": "这里是北部厂房",
    "CREATE_AT": "2021-04-07 02:52:40.744000000"
  }
]
```



## 2.产品

```json
[
  {
    "ID": 1,
    "NAME": "超级节能电表",
    "MODEL": "EMQXA001",
    "COMPANY": "EMQX",
    "INFO": "这是EMQX研发的超级节能电表",
    "CREATE_AT": "2021-04-07 02:52:39.792000000"
  },
  {
    "ID": 2,
    "NAME": "超级节能水表",
    "MODEL": "EMQXA001",
    "COMPANY": "EMQX",
    "INFO": "这是EMQX研发的超级节能水表",
    "CREATE_AT": "2021-04-07 02:52:39.828000000"
  },
  {
    "ID": 3,
    "NAME": "超级节能燃气表",
    "MODEL": "EMQXA001",
    "COMPANY": "EMQX",
    "INFO": "这是EMQX研发的超级节能燃气表",
    "CREATE_AT": "2021-04-07 02:52:39.862000000"
  },
  {
    "ID": 4,
    "NAME": "空气压强表",
    "MODEL": "EMQXA001",
    "COMPANY": "EMQX",
    "INFO": "这是EMQX研发的空气压强表",
    "CREATE_AT": "2021-04-07 02:52:39.894000000"
  }
]
```



## 3.设备

```json
[
  {
    "ID": 1,
    "NAME": "电表1",
    "MODEL": "EMQXA001",
    "TYPE": 2,
    "SN": "20210413-EMQX-ERFGHJ-TYHNB4",
    "SIMCARD": 18888888888,
    "POS": "120.234931,30.232088",
    "INFO": "这是EMQ生产的电表",
    "AREA": "东部厂房",
    "CREATE_AT": "2021-04-07 02:52:39.962000000"
  },
  {
    "ID": 2,
    "NAME": "电表2",
    "MODEL": "EMQXA002",
    "TYPE": 2,
    "SN": "20210413-EMQX-ERFGHJ-TYHNB4",
    "SIMCARD": 18888888888,
    "POS": "120.234931,30.232088",
    "INFO": "这是EMQ生产的电表",
    "AREA": "东部厂房",
    "CREATE_AT": "2021-04-07 02:52:39.997000000"
  },
  {
    "ID": 3,
    "NAME": "电表3",
    "MODEL": "EMQXA003",
    "TYPE": 2,
    "SN": "20210413-EMQX-ERFGHJ-TYHNB4",
    "SIMCARD": 18888888888,
    "POS": "120.234931,30.232088",
    "INFO": "这是EMQ生产的电表",
    "AREA": "东部厂房",
    "CREATE_AT": "2021-04-07 02:52:40.031000000"
  },
  {
    "ID": 4,
    "NAME": "电表4",
    "MODEL": "EMQXA004",
    "TYPE": 2,
    "SN": "20210413-EMQX-ERFGHJ-TYHNB4",
    "SIMCARD": 18888888888,
    "POS": "120.234931,30.232088",
    "INFO": "这是EMQ生产的电表",
    "AREA": "东部厂房",
    "CREATE_AT": "2021-04-07 02:52:40.063000000"
  },
  {
    "ID": 5,
    "NAME": "电表5",
    "MODEL": "EMQXA005",
    "TYPE": 2,
    "SN": "20210413-EMQX-ERFGHJ-TYHNB4",
    "SIMCARD": 18888888888,
    "POS": "120.234931,30.232088",
    "INFO": "这是EMQ生产的电表",
    "AREA": "东部厂房",
    "CREATE_AT": "2021-04-07 02:52:40.096000000"
  },
  {
    "ID": 6,
    "NAME": "水表1",
    "MODEL": "EMQXA001",
    "TYPE": 3,
    "SN": "20210413-EMQX-ERFGHJ-TYHNB4",
    "SIMCARD": 18888888888,
    "POS": "120.234931,30.232088",
    "INFO": "这是EMQ生产的水表",
    "AREA": "南部厂房",
    "CREATE_AT": "2021-04-07 02:52:40.128000000"
  },
  {
    "ID": 7,
    "NAME": "水表2",
    "MODEL": "EMQXA002",
    "TYPE": 3,
    "SN": "20210413-EMQX-ERFGHJ-TYHNB4",
    "SIMCARD": 18888888888,
    "POS": "120.234931,30.232088",
    "INFO": "这是EMQ生产的水表",
    "AREA": "南部厂房",
    "CREATE_AT": "2021-04-07 02:52:40.160000000"
  },
  {
    "ID": 8,
    "NAME": "水表3",
    "MODEL": "EMQXA003",
    "TYPE": 3,
    "SN": "20210413-EMQX-ERFGHJ-TYHNB4",
    "SIMCARD": 18888888888,
    "POS": "120.234931,30.232088",
    "INFO": "这是EMQ生产的水表",
    "AREA": "南部厂房",
    "CREATE_AT": "2021-04-07 02:52:40.192000000"
  },
  {
    "ID": 9,
    "NAME": "水表4",
    "MODEL": "EMQXA004",
    "TYPE": 3,
    "SN": "20210413-EMQX-ERFGHJ-TYHNB4",
    "SIMCARD": 18888888888,
    "POS": "120.234931,30.232088",
    "INFO": "这是EMQ生产的水表",
    "AREA": "南部厂房",
    "CREATE_AT": "2021-04-07 02:52:40.224000000"
  },
  {
    "ID": 10,
    "NAME": "水表5",
    "MODEL": "EMQXA005",
    "TYPE": 3,
    "SN": "20210413-EMQX-ERFGHJ-TYHNB4",
    "SIMCARD": 18888888888,
    "POS": "120.234931,30.232088",
    "INFO": "这是EMQ生产的水表",
    "AREA": "南部厂房",
    "CREATE_AT": "2021-04-07 02:52:40.256000000"
  },
  {
    "ID": 11,
    "NAME": "燃气表1",
    "MODEL": "EMQXB001",
    "TYPE": 1,
    "SN": "20210413-EMQX-ERFGHJ-TYHNB4",
    "SIMCARD": 18888888888,
    "POS": "120.234931,30.232088",
    "INFO": "这是EMQ生产的燃气表",
    "AREA": "北部厂房",
    "CREATE_AT": "2021-04-07 02:52:40.289000000"
  },
  {
    "ID": 12,
    "NAME": "燃气表2",
    "MODEL": "EMQXB002",
    "TYPE": 1,
    "SN": "20210413-EMQX-ERFGHJ-TYHNB4",
    "SIMCARD": 18888888888,
    "POS": "120.234931,30.232088",
    "INFO": "这是EMQ生产的燃气表",
    "AREA": "北部厂房",
    "CREATE_AT": "2021-04-07 02:52:40.321000000"
  },
  {
    "ID": 13,
    "NAME": "燃气表3",
    "MODEL": "EMQXB003",
    "TYPE": 1,
    "SN": "20210413-EMQX-ERFGHJ-TYHNB4",
    "SIMCARD": 18888888888,
    "POS": "120.234931,30.232088",
    "INFO": "这是EMQ生产的燃气表",
    "AREA": "北部厂房",
    "CREATE_AT": "2021-04-07 02:52:40.353000000"
  },
  {
    "ID": 14,
    "NAME": "燃气表4",
    "MODEL": "EMQXB004",
    "TYPE": 1,
    "SN": "20210413-EMQX-ERFGHJ-TYHNB4",
    "SIMCARD": 18888888888,
    "POS": "120.234931,30.232088",
    "INFO": "这是EMQ生产的燃气表",
    "AREA": "北部厂房",
    "CREATE_AT": "2021-04-07 02:52:40.385000000"
  },
  {
    "ID": 15,
    "NAME": "燃气表5",
    "MODEL": "EMQXB005",
    "TYPE": 1,
    "SN": "20210413-EMQX-ERFGHJ-TYHNB4",
    "SIMCARD": 18888888888,
    "POS": "120.234931,30.232088",
    "INFO": "这是EMQ生产的燃气表",
    "AREA": "北部厂房",
    "CREATE_AT": "2021-04-07 02:52:40.420000000"
  },
  {
    "ID": 16,
    "NAME": "空气压强表1",
    "MODEL": "EMQXB001",
    "TYPE": 4,
    "SN": "20210413-EMQX-ERFGHJ-TYHNB4",
    "SIMCARD": 18888888888,
    "POS": "120.234931,30.232088",
    "INFO": "这是EMQ生产的空气压强表",
    "AREA": "北部厂房",
    "CREATE_AT": "2021-04-07 02:52:40.452000000"
  },
  {
    "ID": 17,
    "NAME": "空气压强表2",
    "MODEL": "EMQXB002",
    "TYPE": 4,
    "SN": "20210413-EMQX-ERFGHJ-TYHNB4",
    "SIMCARD": 18888888888,
    "POS": "120.234931,30.232088",
    "INFO": "这是EMQ生产的空气压强表",
    "AREA": "北部厂房",
    "CREATE_AT": "2021-04-07 02:52:40.485000000"
  },
  {
    "ID": 18,
    "NAME": "空气压强表3",
    "MODEL": "EMQXB003",
    "TYPE": 4,
    "SN": "20210413-EMQX-ERFGHJ-TYHNB4",
    "SIMCARD": 18888888888,
    "POS": "120.234931,30.232088",
    "INFO": "这是EMQ生产的空气压强表",
    "AREA": "北部厂房",
    "CREATE_AT": "2021-04-07 02:52:40.517000000"
  },
  {
    "ID": 19,
    "NAME": "空气压强表4",
    "MODEL": "EMQXB004",
    "TYPE": 4,
    "SN": "20210413-EMQX-ERFGHJ-TYHNB4",
    "SIMCARD": 18888888888,
    "POS": "120.234931,30.232088",
    "INFO": "这是EMQ生产的空气压强表",
    "AREA": "北部厂房",
    "CREATE_AT": "2021-04-07 02:52:40.549000000"
  },
  {
    "ID": 20,
    "NAME": "空气压强表5",
    "MODEL": "EMQXB005",
    "TYPE": 4,
    "SN": "20210413-EMQX-ERFGHJ-TYHNB4",
    "SIMCARD": 18888888888,
    "POS": "120.234931,30.232088",
    "INFO": "这是EMQ生产的空气压强表",
    "AREA": "北部厂房",
    "CREATE_AT": "2021-04-07 02:52:40.581000000"
  }
]
```

# 实时数据

## 水表

```json
{
    "tele":[
        {
            "objn":"water_power_1",
            "tstp":1617780750,
            "water":203
        },
        {
            "objn":"water_power_2",
            "tstp":1617780750,
            "water":128
        },
        {
            "objn":"water_power_3",
            "tstp":1617780750,
            "water":17
        },
        {
            "objn":"water_power_4",
            "tstp":1617780750,
            "water":33
        },
        {
            "objn":"water_power_5",
            "tstp":1617780750,
            "water":32
        }
    ]
}
```

## 电表

```json
{
    "tele":[
        {
            "objn":"electricity_electricity meter_1",
            "tstp":1617780965,
            "electricity":32
        },
        {
            "objn":"electricity_electricity meter_2",
            "tstp":1617780965,
            "electricity":68
        },
        {
            "objn":"electricity_electricity meter_3",
            "tstp":1617780965,
            "electricity":0
        },
        {
            "objn":"electricity_electricity meter_4",
            "tstp":1617780965,
            "electricity":96
        },
        {
            "objn":"electricity_electricity meter_5",
            "tstp":1617780965,
            "electricity":144
        }
    ]
}
```



## 空气压强表

## 燃气表