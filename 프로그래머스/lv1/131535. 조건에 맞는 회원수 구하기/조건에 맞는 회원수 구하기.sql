-- 코드를 입력하세요
SELECT count(age) as USERS from user_info where age>=20 and age<=29 and to_char(joined, 'YYYY') like '2021%'