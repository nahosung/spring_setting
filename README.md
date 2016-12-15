# spring_setting
##소개
eclipe spring 프로젝트 기본 셋팅
(spring + maven + mybatis + mysql + logback)

##버전 (pom.xml)
- spring 4.3.0
- mybatis 3.4.1
- mysql 5.1.38
- logback 1.1.2

##실행환경
- jdk 1.8 (하위버전 무관)
- tomcat 8 (하위버전 무관)
- maven (별도 설정 필요)
- mysql

#설명
- root-context.xml 파일에서 DB 접속 정보 설정 가능
- 프로젝트 import 후 실행시 기본 화면은 프로젝트 실행시 나오는 화면 그대로 사용(http://localhost)
- http://localhost/test/usercheck 접속시 mvc 형태로 mysql 쿼리를 실행하는 구조(MemberController.java 파일을 따라가며 확인가능)
- 쿼리문은 admin이란 테이블에 admin_id 컬럼을 카운팅 (추후 DB정보 업로드)
MemberController.java 파일에 admin_id 값 고정

(http://nahosung.tistory.com/58 - 자세한 설명 )