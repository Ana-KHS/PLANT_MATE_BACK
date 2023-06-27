
DROP TABLE IF EXISTS `tb_plant_growth_file`;
CREATE TABLE `tb_plant_growth_file` (
    `GROWTHFILEID` INT    NOT NULL,
    `GROWTHID`     INT    NOT NULL,
    `FILEID`       INT    NOT NULL
);

DROP TABLE IF EXISTS `tb_plant_record`;
CREATE TABLE `tb_plant_record` (
    `RECORD_ID`       INT           NOT NULL,
    `PLANT_ID`        INT           NOT NULL,
    `TITLE`           VARCHAR(50)   NOT NULL,
    `DATE`            TIMESTAMP     NOT NULL,
    `LENGTH`          INT           NULL,
    `LEAF_COUNT`      INT           NULL,
    `GROWTH_STATUS`   VARCHAR(10)   NULL COMMENT '씨앗,발아,성장,개화',
    `WATER_SUPPLY`    INT           NULL,
    `SOIL_TYPE`       VARCHAR(10)   NULL COMMENT '고갈성,진흙,흙',
    `FERTILIZER_TYPE` VARCHAR(30)   NULL COMMENT '화학비료,유기질비료',
    `TEMPERATURE`     INT           NULL,
    `HUMIDITY`        INT           NULL,
    `GROWTH_CONTENT`  VARCHAR(1000) NULL,
    `REMARKS`         VARCHAR(1000) NULL
);

DROP TABLE IF EXISTS `tb_file`;
CREATE TABLE `tb_file` (
    `FILEID`          INT          NOT NULL,
    `FILENAME`        VARCHAR(50)  NULL,
    `FILEPATH`        VARCHAR(300) NULL,
    `FILESIZE`        INT          NULL,
    `USERFILENAME`    VARCHAR(50)  NULL
);

DROP TABLE IF EXISTS `tb_member_plant`;
CREATE TABLE `tb_member_plant` (
    `PLANTID`         INT          NOT NULL,
    `USER_ID`         VARCHAR(40)  NOT NULL,
    `NAME`            VARCHAR(40)  NOT NULL,
    `NICKNAME`        VARCHAR(20)  NOT NULL,
    `MEMO`            VARCHAR(300) NULL,
    `THUMBNAIL`       VARCHAR(300) NULL,
    `START_DATE`      DATETIME     NOT NULL,
    `WATER_ALARM`     VARCHAR(1)   NULL      COMMENT 'Y / N (ON/OFF)',
    `WATER_CYCLE`     INT          NULL,
    `LAST_WATER_DATE` DATETIME     NULL,
    `CREATE_DATE`     DATETIME     NOT NULL,
    `MODIFY_DATE`     DATETIME     NOT NULL
);

DROP TABLE IF EXISTS `tb_community`;
CREATE TABLE `tb_community` (
    `COMMUNITYID`    INT         NOT NULL,
    `TITLE`          VARCHAR(50) NOT NULL,
    `CONTENT`        VARCHAR(50) NOT NULL,
    `CREATE_DATE`    TIMESTAMP   NOT NULL,
    `MODIFY_DATE`    TIMESTAMP   NOT NULL,
    `CATEGORYID`     CHAR        NOT NULL,
    `FILEID`         INT         NULL,
    `PLANTID`        INT         NULL
);

DROP TABLE IF EXISTS `tb_comment`;
CREATE TABLE `tb_comment` (
    `COMMENTID`   INT          NOT NULL,
    `COMMUNITYID` INT          NOT NULL,
    `USER_ID`     VARCHAR(40)  NOT NULL,
    `COMMENT`     VARCHAR(500) NOT NULL,
    `CREATE_DATE` DATETIME     NOT NULL,
    `MODIFY_DATE` DATETIME     NOT NULL,
    `FILEID`      INT          NULL
);

DROP TABLE IF EXISTS `tb_bookmark`;
CREATE TABLE `tb_bookmark` (
    `BOOKMARKID`    INT         NOT NULL,
    `USER_ID`       VARCHAR(40) NOT NULL,
    `COMMUNITYID`   INT         NOT NULL,
    `CREATE_DATE`   DATETIME    NOT NULL,
    `MODIFY_DATE`   DATETIME    NOT NULL
);

DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
    `USER_ID`       VARCHAR(40) NOT NULL,
    `USER_NAME`     VARCHAR(40) NOT NULL,
    `USER_NICKNAME` VARCHAR(40) NOT NULL,
    `USER_PASSWORD` VARCHAR(40) NOT NULL  COMMENT '암호화필요',
    `USER_EMAIL`    VARCHAR(45) NOT NULL,
    `CREATE_DATE`   DATETIME    NOT NULL  COMMENT 'YYYY-MM-DD HH:MM:SS',
    `MODIFY_DATE`   DATETIME    NULL      COMMENT 'YYYY-MM-DD HH:MM:SS'
);

ALTER TABLE `tb_plant_record`
  ADD CONSTRAINT `PK_TB_PLANT_RECORD` PRIMARY KEY (
    `RECORD_ID`,
    `PLANT_ID`
  );

ALTER TABLE `tb_file`
  ADD CONSTRAINT `PK_TB_FILE` PRIMARY KEY (
    `FILEID`
  );

ALTER TABLE `tb_member_plant`
  ADD CONSTRAINT `PK_TB_MEMBER_PLANT` PRIMARY KEY (
    `PLANTID`
  );

ALTER TABLE `tb_plant_growth_file`
  ADD CONSTRAINT `PK_TB_PLANT_GROWTH_FILE` PRIMARY KEY (
    `GROWTHFILEID`,
    `GROWTHID`
  );

ALTER TABLE `tb_community`
  ADD CONSTRAINT `PK_TB_COMMUNITY` PRIMARY KEY (
    `COMMUNITYID`
  );

ALTER TABLE `tb_comment`
  ADD CONSTRAINT `PK_TB_COMMENT` PRIMARY KEY (
    `COMMENTID`
  );

ALTER TABLE `tb_bookmark`
  ADD CONSTRAINT `PK_TB_BOOKMARK` PRIMARY KEY (
    `BOOKMARKID`,
    `USER_ID`,
    `COMMUNITYID`
  );

ALTER TABLE `tb_user`
  ADD CONSTRAINT `PK_TB_USER` PRIMARY KEY (
    `USER_ID`
  );

ALTER TABLE `tb_plant_record`
  ADD CONSTRAINT `FK_tb_member_plant_TO_tb_plant_record_1` FOREIGN KEY (
    `PLANT_ID`
  )
  REFERENCES `tb_member_plant` (
    `PLANTID`
  );

ALTER TABLE `tb_member_plant`
  ADD CONSTRAINT `FK_tb_user_TO_tb_member_plant_1` FOREIGN KEY (
    `USER_ID`
  )
  REFERENCES `tb_user` (
    `USER_ID`
  );

ALTER TABLE `tb_plant_growth_file`
  ADD CONSTRAINT `FK_tb_plant_record_TO_tb_plant_growth_file_1` FOREIGN KEY (
    `GROWTHID`
  )
  REFERENCES `tb_plant_record` (
    `RECORD_ID`
  );

ALTER TABLE `tb_plant_growth_file`
  ADD CONSTRAINT `FK_tb_file_TO_tb_plant_growth_file_1` FOREIGN KEY (
    `FILEID`
  )
  REFERENCES `tb_file` (
    `FILEID`
  );

ALTER TABLE `tb_community`
  ADD CONSTRAINT `FK_tb_file_TO_tb_community_1` FOREIGN KEY (
    `FILEID`
  )
  REFERENCES `tb_file` (
    `FILEID`
  );

ALTER TABLE `tb_community`
  ADD CONSTRAINT `FK_tb_member_plant_TO_tb_community_1` FOREIGN KEY (
    `PLANTID`
  )
  REFERENCES `tb_member_plant` (
    `PLANTID`
  );

ALTER TABLE `tb_comment`
  ADD CONSTRAINT `FK_tb_community_TO_tb_comment_1` FOREIGN KEY (
    `COMMUNITYID`
  )
  REFERENCES `tb_community` (
    `COMMUNITYID`
  );

ALTER TABLE `tb_comment`
  ADD CONSTRAINT `FK_tb_user_TO_tb_comment_1` FOREIGN KEY (
    `USER_ID`
  )
  REFERENCES `tb_user` (
    `USER_ID`
  );

ALTER TABLE `tb_comment`
  ADD CONSTRAINT `FK_tb_file_TO_tb_comment_1` FOREIGN KEY (
    `FILEID`
  )
  REFERENCES `tb_file` (
    `FILEID`
  );

ALTER TABLE `tb_bookmark`
  ADD CONSTRAINT `FK_tb_user_TO_tb_bookmark_1` FOREIGN KEY (
    `USER_ID`
  )
  REFERENCES `tb_user` (
    `USER_ID`
  );

ALTER TABLE `tb_bookmark`
  ADD CONSTRAINT `FK_tb_community_TO_tb_bookmark_1` FOREIGN KEY (
    `COMMUNITYID`
  )
  REFERENCES `tb_community` (
    `COMMUNITYID`
  );
