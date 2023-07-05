--
-- tb_community data
--
INSERT INTO `tb_community` (
  `PLANTID`, `CATEGORYID`, `FILEID`,
  `TITLE`, `CONTENT`,
  `CREATE_DATE`, `MODIFY_DATE`
)
VALUES 
  (1, 'S', null, '식물 정보 공유합니다.', '홍콩야자수인데요..', '2023-06-13 15:50:33', current_timestamp),
  (1, 'B', null, '제 몬스테라 예쁘죠?', '몬스테라인데요..', '2023-06-13 15:55:33', current_timestamp),
  (1, 'C', null, '제 식물 왜이러죠..?', '홍콩야자수인데요..', '2023-06-13 15:50:33', current_timestamp),
  (1, 'S', null, '식물 영양제 추천', '홍콩야자수인데요..', '2023-06-13 15:50:33', current_timestamp),
  (1, 'S', null, '식물 정보 공유합니다.', '홍콩야자수인데요..', '2023-06-13 15:50:33', current_timestamp),
  (1, 'B', null, '제 몬스테라 예쁘죠?', '홍콩야자수인데요..', '2023-06-13 15:55:33', current_timestamp)
;
