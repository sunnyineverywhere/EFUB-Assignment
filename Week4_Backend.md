# EFUB 4주차 세미나 과제

###### Back-end Sunny lee



### 01. 학사 정보 관리 ERD

[링크]
https://drive.google.com/file/d/1T74VB8hJjDjPT-BPkaI0YcejCDC2HFxD/view?usp=sharing

[사진]

<img width="620" alt="스크린샷 2022-04-08 오후 6 37 21" src="https://user-images.githubusercontent.com/80109963/162409524-44aa9f6b-fc92-4301-975a-e5f23f9e7cf2.png">


다이어그램으로 그리는 줄 몰라서 코드로 짰는데 물론 다시 그려야겠지만 아까워서 일단 첨부

<img width="544" alt="스크린샷 2022-04-08 오후 4 50 07" src="https://user-images.githubusercontent.com/80109963/162391245-f91a440a-d9cd-4d98-a55d-e80c2a134bcd.png">


### 02. MySQL 실습 코드

##### SWS 테이블 생성 코드

```
SWS 테이블 생성 코드
create table `sws`(
	`number` int(2) primary key,
    `name` varchar(20)
);

insert into sws(number, name)
	 values
     (1, '베이커리'),
     (2, '라꾸라꾸'),
     (3, 'STEADY'),
     (4, '이상청');

update member
set team_number = 4
where member_id <= 7;

update member
set team_number = 1
where member_id = 3;

```



##### JOIN 코드

```
JOIN 코드
Select member.team_number, sws.number, sws.name, member.name, member.position
from member
join sws
on member.team_number = sws.number
```



##### JOIN 출력 결과

[JOIN 출력 결과]

<img width="357" alt="스크린샷 2022-04-09 오후 2 42 57" src="https://user-images.githubusercontent.com/80109963/162558270-59ac5588-3456-4625-9346-9615e8b48c45.png">

