계층형 아키텍처
Spring의 핵심 설계

Browser(Frontend): 사용자가 직접 보는 화면을 제공하는 인터페이스 (손님)
Controller : 사용자 요청을 가장 먼저 받은 후 해석하고 전달함 (웨이터)
Service : 실제 핵심 로직 처리. Controller가 요청한 작업을 구체적인 절차로 처리 (주방장)
DAO / Repository : DB, 파일 등의 저장소에 직접 접근함 (창고 관리자)

DTO : 계층 간 데이터 이동을 위한 전용 클래스 (주문서, 영수증)
Entity : DB의 테이블과 맵핑되는 핵심 객체 (유통기한, 원산지 등의 정보) 외부 노출 금지

복습:
Front - Back : Client - Server - DataBase
API와 Rest API
회원 등록, 리스트 조회, 상세 조회, 정보 수정, 삭제: HTTP Method, URI
HTTP header, body(request, response), API 서버(json 응답)

Controller Layer
1. @Controller 어노테이션
2. @Responsebody 어노테이션
3. @RestController 어노테이션
4. 생성자 주입(서비스 계층에 의존)
5. @RequestMapping - method, url 지정
6. 공통 & 상세 URL
7. @RequestBody를 통해 json 데이터 받아오기

패키지 구조
계층형 : 애플리케이션을 기능별로 나눈다
도메인형 : 도메인 관련 모든 클래스를 포함
특정 도메인의 코드를 한 곳에 모으기 때문에 코드 탐색이 쉬움
유지보수 용이, new 도메인 추가 시에도 기존 코드에 영향이 없음
-> 도메인형 구조 선택

MemberController
MemberCreateRequest
MemberUpdateRequest
작성
lombok.Getter로 게터 코드 생략
@RequstMapping으로 중복된 부분 생략
@RestController를 @Controller와 @Responsebody 대신 사용

서비스 계층 구현
MemberService
생성자 주입
//@transactional
(readOnly=true)

스프링 빈 & 의존성 주입
스프링(Spring) : Java 백엔드 애플리케이션 프레임워크
스프링 부트(Spring Boot) : 스프링 프레임워크를 도움
Spring Container : 스프링 빈 저장소
스프링 빈(Spring Bean) : 전역에서 사용하는 공용 객체
-> 필요한 빈은 프레임워크가 전달
-> 빈을 요구하는 객체 역시 빈임

빈 등록 방법 : 컴포넌트 스캔
@Component
@ComponentScan

의존성 주입 : 내가 의존하는 객체를 생성자를 통해 직접 생성 X, 외부에서 주입
-> 매번 필요한 객체를 만들어서 사용하지 말고 미리 만들어 준 객체를 쓰자.(메모리 효율)
생성자 주입, 필드 주입, 수정자 주입

과제: Product, Order 관련 코드 마무리해서 제출하기
