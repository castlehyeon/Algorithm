-- 코드를 입력하세요
SELECT MR.MEMBER_NAME, RR.REVIEW_TEXT, TO_CHAR(RR.REVIEW_DATE, 'YYYY-MM-DD') as REVIEW_DATE
FROM MEMBER_PROFILE MR, REST_REVIEW RR
WHERE MR.MEMBER_ID = RR.MEMBER_ID
AND MR.MEMBER_ID IN (
    SELECT MEMBER_ID FROM
                        (
                            SELECT MEMBER_ID, COUNT(*) as CNT
                            FROM REST_REVIEW
                            GROUP BY MEMBER_ID
                        )
    WHERE CNT  = (
        SELECT MAX(COUNT(*)) as MAXCNT
        FROM REST_REVIEW
        GROUP BY MEMBER_ID
                )
                    )
ORDER BY RR.REVIEW_DATE, RR.REVIEW_TEXT;