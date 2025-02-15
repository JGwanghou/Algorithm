-- 코드를 입력하세요
SELECT
    ugb.TITLE,
    ugr.BOARD_ID,
    ugr.REPLY_ID,
    ugr.WRITER_ID,
    ugr.CONTENTS,
    TO_CHAR(ugr.CREATED_DATE, 'YYYY-MM-DD') AS CREATED_DATE
FROM USED_GOODS_BOARD ugb
JOIN USED_GOODS_REPLY ugr ON ugb.BOARD_ID = ugr.BOARD_ID
WHERE TO_CHAR(ugb.CREATED_DATE, 'YYYY-MM') = '2022-10'
ORDER BY ugr.CREATED_DATE ASC, ugb.TITLE ASC;