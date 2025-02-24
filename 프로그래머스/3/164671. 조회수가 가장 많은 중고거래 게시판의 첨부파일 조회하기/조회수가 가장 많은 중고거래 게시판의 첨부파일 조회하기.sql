-- 코드를 입력하세요
SELECT
    '/home/grep/src/' || B.BOARD_ID || '/' || B.FILE_ID || B.FILE_NAME || B.FILE_EXT AS FILE_PATH
FROM 
(
    SELECT 
        BOARD_ID,
        DENSE_RANK() OVER(ORDER BY VIEWS DESC) AS RANKING
    FROM USED_GOODS_BOARD
) A, USED_GOODS_FILE B
WHERE
    A.BOARD_ID = B.BOARD_ID AND A.RANKING = 1
ORDER BY B.FILE_ID DESC;