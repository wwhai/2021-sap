--------------------------------------
drop table emqx_spa_product;
drop table emqx_spa_device;
drop table emqx_spa_event;
drop table emqx_spa_area;
drop table emqx_spa_data;
--------------------------------------
--------------------------------------
create column table emqx_spa_product (
    id INT,
    name NVARCHAR(60),
    model NVARCHAR(60),
    company NVARCHAR(60),
    info NVARCHAR(256),
    create_at TIMESTAMP
);
insert into emqx_spa_product
VALUES(
        1,
        '超级节能电表',
        'EMQXA001',
        'EMQX',
        '这是EMQX研发的超级节能电表',
        CURRENT_TIMESTAMP
    );
insert into emqx_spa_product
VALUES(
        2,
        '超级节能水表',
        'EMQXA001',
        'EMQX',
        '这是EMQX研发的超级节能水表',
        CURRENT_TIMESTAMP
    );
insert into emqx_spa_product
VALUES(
        3,
        '超级节能燃气表',
        'EMQXA001',
        'EMQX',
        '这是EMQX研发的超级节能燃气表',
        CURRENT_TIMESTAMP
    );
insert into emqx_spa_product
VALUES(
        4,
        '空气压强表',
        'EMQXA001',
        'EMQX',
        '这是EMQX研发的空气压强表',
        CURRENT_TIMESTAMP
    );
----------------------------------------------
----------------------------------------------
create column table emqx_spa_device (
    id INT,
    name NVARCHAR(60),
    model NVARCHAR(60),
    type INT,
    sn NVARCHAR(64),
    simcard NVARCHAR(11),
    pos NVARCHAR(60),
    info NVARCHAR(256),
    area NVARCHAR(60),
    create_at TIMESTAMP
);
insert INTO emqx_spa_device
VALUES(
        1,
        '电表1',
        'EMQXA001',
        2,
        '20210413-EMQX-ERFGHJ-TYHNB4',
        '18888888888',
        '120.234931,30.232088',
        '这是EMQ生产的电表',
        '东部厂房',
        CURRENT_TIMESTAMP
    );
insert INTO emqx_spa_device
VALUES(
        2,
        '电表2',
        'EMQXA002',
        2,
        '20210413-EMQX-ERFGHJ-TYHNB4',
        '18888888888',
        '120.234931,30.232088',
        '这是EMQ生产的电表',
        '东部厂房',
        CURRENT_TIMESTAMP
    );
insert INTO emqx_spa_device
VALUES(
        3,
        '电表3',
        'EMQXA003',
        2,
        '20210413-EMQX-ERFGHJ-TYHNB4',
        '18888888888',
        '120.234931,30.232088',
        '这是EMQ生产的电表',
        '东部厂房',
        CURRENT_TIMESTAMP
    );
insert INTO emqx_spa_device
VALUES(
        4,
        '电表4',
        'EMQXA004',
        2,
        '20210413-EMQX-ERFGHJ-TYHNB4',
        '18888888888',
        '120.234931,30.232088',
        '这是EMQ生产的电表',
        '东部厂房',
        CURRENT_TIMESTAMP
    );
insert INTO emqx_spa_device
VALUES(
        5,
        '电表5',
        'EMQXA005',
        2,
        '20210413-EMQX-ERFGHJ-TYHNB4',
        '18888888888',
        '120.234931,30.232088',
        '这是EMQ生产的电表',
        '东部厂房',
        CURRENT_TIMESTAMP
    );
insert INTO emqx_spa_device
VALUES(
        6,
        '水表1',
        'EMQXA001',
        3,
        '20210413-EMQX-ERFGHJ-TYHNB4',
        '18888888888',
        '120.234931,30.232088',
        '这是EMQ生产的水表',
        '南部厂房',
        CURRENT_TIMESTAMP
    );
insert INTO emqx_spa_device
VALUES(
        7,
        '水表2',
        'EMQXA002',
        3,
        '20210413-EMQX-ERFGHJ-TYHNB4',
        '18888888888',
        '120.234931,30.232088',
        '这是EMQ生产的水表',
        '南部厂房',
        CURRENT_TIMESTAMP
    );
insert INTO emqx_spa_device
VALUES(
        8,
        '水表3',
        'EMQXA003',
        3,
        '20210413-EMQX-ERFGHJ-TYHNB4',
        '18888888888',
        '120.234931,30.232088',
        '这是EMQ生产的水表',
        '南部厂房',
        CURRENT_TIMESTAMP
    );
insert INTO emqx_spa_device
VALUES(
        9,
        '水表4',
        'EMQXA004',
        3,
        '20210413-EMQX-ERFGHJ-TYHNB4',
        '18888888888',
        '120.234931,30.232088',
        '这是EMQ生产的水表',
        '南部厂房',
        CURRENT_TIMESTAMP
    );
insert INTO emqx_spa_device
VALUES(
        10,
        '水表5',
        'EMQXA005',
        3,
        '20210413-EMQX-ERFGHJ-TYHNB4',
        '18888888888',
        '120.234931,30.232088',
        '这是EMQ生产的水表',
        '南部厂房',
        CURRENT_TIMESTAMP
    );
insert INTO emqx_spa_device
VALUES(
        11,
        '燃气表1',
        'EMQXB001',
        1,
        '20210413-EMQX-ERFGHJ-TYHNB4',
        '18888888888',
        '120.234931,30.232088',
        '这是EMQ生产的燃气表',
        '北部厂房',
        CURRENT_TIMESTAMP
    );
insert INTO emqx_spa_device
VALUES(
        12,
        '燃气表2',
        'EMQXB002',
        1,
        '20210413-EMQX-ERFGHJ-TYHNB4',
        '18888888888',
        '120.234931,30.232088',
        '这是EMQ生产的燃气表',
        '北部厂房',
        CURRENT_TIMESTAMP
    );
insert INTO emqx_spa_device
VALUES(
        13,
        '燃气表3',
        'EMQXB003',
        1,
        '20210413-EMQX-ERFGHJ-TYHNB4',
        '18888888888',
        '120.234931,30.232088',
        '这是EMQ生产的燃气表',
        '北部厂房',
        CURRENT_TIMESTAMP
    );
insert INTO emqx_spa_device
VALUES(
        14,
        '燃气表4',
        'EMQXB004',
        1,
        '20210413-EMQX-ERFGHJ-TYHNB4',
        '18888888888',
        '120.234931,30.232088',
        '这是EMQ生产的燃气表',
        '北部厂房',
        CURRENT_TIMESTAMP
    );
insert INTO emqx_spa_device
VALUES(
        15,
        '燃气表5',
        'EMQXB005',
        1,
        '20210413-EMQX-ERFGHJ-TYHNB4',
        '18888888888',
        '120.234931,30.232088',
        '这是EMQ生产的燃气表',
        '北部厂房',
        CURRENT_TIMESTAMP
    );
insert INTO emqx_spa_device
VALUES(
        16,
        '空气压强表1',
        'EMQXB001',
        4,
        '20210413-EMQX-ERFGHJ-TYHNB4',
        '18888888888',
        '120.234931,30.232088',
        '这是EMQ生产的空气压强表',
        '北部厂房',
        CURRENT_TIMESTAMP
    );
insert INTO emqx_spa_device
VALUES(
        17,
        '空气压强表2',
        'EMQXB002',
        4,
        '20210413-EMQX-ERFGHJ-TYHNB4',
        '18888888888',
        '120.234931,30.232088',
        '这是EMQ生产的空气压强表',
        '北部厂房',
        CURRENT_TIMESTAMP
    );
insert INTO emqx_spa_device
VALUES(
        18,
        '空气压强表3',
        'EMQXB003',
        4,
        '20210413-EMQX-ERFGHJ-TYHNB4',
        '18888888888',
        '120.234931,30.232088',
        '这是EMQ生产的空气压强表',
        '北部厂房',
        CURRENT_TIMESTAMP
    );
insert INTO emqx_spa_device
VALUES(
        19,
        '空气压强表4',
        'EMQXB004',
        4,
        '20210413-EMQX-ERFGHJ-TYHNB4',
        '18888888888',
        '120.234931,30.232088',
        '这是EMQ生产的空气压强表',
        '北部厂房',
        CURRENT_TIMESTAMP
    );
insert INTO emqx_spa_device
VALUES(
        20,
        '空气压强表5',
        'EMQXB005',
        4,
        '20210413-EMQX-ERFGHJ-TYHNB4',
        '18888888888',
        '120.234931,30.232088',
        '这是EMQ生产的空气压强表',
        '北部厂房',
        CURRENT_TIMESTAMP
    );
---------------------------------------------
---------------------------------------------
create column table emqx_spa_area (
    id INT,
    name NVARCHAR(60),
    info NVARCHAR(256),
    create_at TIMESTAMP
);
insert INTO emqx_spa_area
values(1, '东部厂房', '这里是东部厂房', CURRENT_TIMESTAMP);
insert INTO emqx_spa_area
values(2, '西部厂房', '这里是西部厂房', CURRENT_TIMESTAMP);
insert INTO emqx_spa_area
values(3, '南部厂房', '这里是南部厂房', CURRENT_TIMESTAMP);
insert INTO emqx_spa_area
values(4, '北部厂房', '这里是北部厂房', CURRENT_TIMESTAMP);
---------------------------------------------
---------------------------------------------
create column table emqx_spa_data (
    id INT,
    device_id INT,
    device_name NVARCHAR(60),
    data_value FLOAT,
    threshold FLOAT,
    create_at TIMESTAMP
);
insert INTO emqx_spa_data
values (
        1,
        1,
        "设备:1"
        541.6896669070521,
        586.6089280830091,
        CURRENT_TIMESTAMP
    );
---------------------------------------------
---------------------------------------------
create column table emqx_spa_event (
    id INT,
    type INT,
    device_id INT,
    "VALUE" INT,
    device_name NVARCHAR(60),
    name NVARCHAR(60),
    info NVARCHAR(256),
    create_at TIMESTAMP
);

-------------------------------------------------------
-------------------------------------------------------
update emqx_spa_data set data_value = 240 where id =1;
update emqx_spa_data set data_value = 250 where id =2;
update emqx_spa_data set data_value = 300 where id =3;
update emqx_spa_data set data_value = 180 where id =4;
update emqx_spa_data set data_value = 333 where id =5;
update emqx_spa_data set data_value = 222 where id =6;
update emqx_spa_data set data_value = 223 where id =7;
update emqx_spa_data set data_value = 400 where id =8;