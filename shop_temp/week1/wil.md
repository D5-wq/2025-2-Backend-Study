웹 - 인터넷 위에서 동작하는 서비스.
인터넷을 통해 전 세계에서 정보를 공유 가능하다.
클라이언트-서버 구조 : client가 request를 server에 보내면 response 반환

URL : 웹 상의 특정 자원의 위치를 나타내는 주소
Host : IP 주소 또는 도메인
Port : 서버의 특정 네트워크 포트 번호
Path : 서버 내에서 원하는 리소스의 구조
Query : 추가적인 정보를 서버에 제공하는 parameter. '?' 뒤에 key-value 나열

http(HyperText Transper Protocol)
웹에서 데이터를 주고 받는 모델의 프로토콜
무상태성 : 이전 요청을 저장하지 않고 매 요청을 독립적으로 처리
비연결성 : 요청을 보내고 응답을 받은 뒤 서버와 연결 유지하지 않음

http 요청
start line : 요청 메서드
headers : 부가 정보
body : 실제 전송 데이터

http 응답
status line : http 상태 코드
headers : 부가 정보
body : 실제 응답 데이터

프론트엔드 : 사용자가 직접 보고 상호작용하는 화면, UI 개발
백엔드 : 사용자의 요청을 받아 실제 동작을 처리, 데이터 저장 및 관리

데이터베이스(Database, DB)
- 데이터를 체계적으로 모아둔 저장소
- DBMS으로 DB 관리, 조작
-> 데이터 중복 해결, 독립성 확보, 무결성 유지

API : 한 프로그램이 다른 프로그램의 기능이나 데이터를 사용할 수 있도록 미리 정해놓은 약속이자 소통 창구
요청, 응답에 관해 미리 정해놓은 규칙과 기능의 목록

REST : 네트워크 아키텍처 스타일, HTTP 장점 최대한 활용
구성요소 : 자원(URI), 행위(Method), 표현(Json이 일반적임)

![localhost:8080 스크린샷](WhiteLabel-1.PNG)


API 명세서(기능 - HTTP Method - URI 순)

-회원 기능
회원 등록 - POST - /members
회원 목록 조회 - GET - /members
개별 회원 정보 상세 조회 - GET - /members/{memberId} 
회원 정보 수정 - PUT - /members/{memberId}
회원 삭제 - DELETE - /members/{memberId}

-상품 기능
상품 등록 - POST - /products
상품 목록 조회 - GET - /products
개별 상품 정보 상세 조회 - GET - /products/{productId}
상품 정보 수정 - PUT - /products/{productId}
상품 삭제 - DELETE - /products/{productId}

-주문 기능
주문 생성 - POST - /orders
주문 목록 조회 - GET - /orders
개별 주문 정보 상세 조회 - GET - /orders/{ordersId}
주문 취소 - DELETE - /orders/{ordersId}