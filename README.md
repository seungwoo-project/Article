# 블로그 API 프로젝트
## 목차
1. [프로젝트 소개](#프로젝트-소개)
2. [주요 기능](#주요-기능)
3. [기술 스택](#기술-스택)
4. [API 명세서](#api-명세서)
5. [웹 인터페이스](#웹-인터페이스)
6. [보안](#보안)
7. [테스트](#테스트)
8. [학습 내용 및 프로젝트 후기](#학습-내용-및-프로젝트-후기)
9. [실행 방법](#실행-방법)

## 프로젝트 소개
이 프로젝트는 Spring Boot를 기반으로 한 블로그 시스템입니다. RESTful API와 웹 인터페이스를 모두 제공하며, 사용자 인증 및 블로그 글 관리 기능을 포함하고 있습니다.

## 주요 기능
- 사용자 등록 및 인증
- 블로그 글 CRUD (생성, 조회, 수정, 삭제)
- RESTful API 엔드포인트
- Thymeleaf 기반의 웹 인터페이스
- Spring Security를 이용한 보안 구현

## 기술 스택
- Java
- Spring Boot
- Spring MVC
- Spring Security
- Spring Data JPA
- Thymeleaf
- H2 Database
- JUnit (테스트)


## API 명세서
```
| 기능 | Method | URL | Request Body | Response |
|------|--------|-----|--------------|----------|
| 글 생성 | POST | /api/articles | { "title": "제목", "content": "내용" } | 201 Created, Article 객체 |
| 전체 글 목록 조회 | GET | /api/articles | - | 200 OK, ArticleResponse 리스트 |
| 특정 글 조회 | GET | /api/articles/{id} | - | 200 OK, ArticleResponse 객체 |
| 글 수정 | PUT | /api/articles/{id} | { "title": "새 제목", "content": "새 내용" } | 200 OK, 수정된 ArticleResponse |
| 글 삭제 | DELETE | /api/articles/{id} | - | 200 OK |
| 회원가입 | POST | /user | { "email": "user@example.com", "password": "pwd123" } | 302 Found, /login으로 리다이렉트 |
| 로그아웃 | GET | /logout | - | 302 Found, /login으로 리다이렉트 |
| 새 액세스 토큰 생성 | POST | /api/token | { "refreshToken": "token" } | 201 Created, { "accessToken": "newToken" } |
```


## 웹 인터페이스
Thymeleaf를 사용하여 다음과 같은 웹 페이지를 구현했습니다:
- 글 목록 페이지 (articleList.html)
- 개별 글 조회 페이지 (article.html)
- 새 글 작성 페이지 (newArticle.html)
- 로그인 페이지 (login.html)
- 회원가입 페이지 (signup.html)

## 보안
Spring Security를 사용하여 사용자 인증 및 권한 관리를 구현했습니다. `WebSecurityConfig.java`에서 보안 설정을 확인할 수 있습니다.

## 테스트
JUnit을 사용하여 컨트롤러 테스트를 구현했습니다. `BlogControllerTest.java`에서 테스트 코드를 확인할 수 있습니다.

## 학습 내용 및 프로젝트 후기

이 프로젝트를 통해 다음과 같은 주요 기술과 개념을 학습하고 경험할 수 있었습니다:

### REST API
- RESTful 설계 원칙에 따라 API를 구현하였습니다.
- HTTP 메서드(GET, POST, PUT, DELETE)를 적절히 활용하여 리소스에 대한 CRUD 작업을 구현했습니다.
- 응답 상태 코드를 적절히 사용하여 API의 결과를 명확히 전달하도록 했습니다.

### 스프링 시큐리티
- 스프링 시큐리티의 기본 개념과 동작 원리에 대해 이론적으로 학습했습니다.
- 사용자 인증, 권한 관리, 보안 설정 등 핵심 개념에 대해 이해할 수 있었습니다.
- 실제 구현은 복잡성으로 인해 어려움이 있어, 클론 코딩을 통해 코드를 익히고 이해하는 방식으로 학습했습니다.

### JWT (JSON Web Token)
- JWT의 구조, 작동 방식, 장단점 등 이론적인 부분을 집중적으로 학습했습니다.
- 토큰 기반 인증의 흐름과 JWT를 사용하는 이유에 대해 이해할 수 있었습니다.
- 실제 JWT 구현과 관련된 코드는 클론 코딩을 통해 학습하였으며, 이 과정에서 JWT의 생성, 검증, 파싱 등의 실제 적용 방법을 익혔습니다.

이 프로젝트를 통해 RESTful API 설계에 대한 실전 경험을 쌓을 수 있었으며, 스프링 시큐리티와 JWT와 같은 복잡한 보안 기술에 대한 이론적 이해를 높일 수 있었습니다. 특히 스프링 시큐리티와 JWT의 실제 구현은 클론 코딩을 통해 접근함으로써, 코드 레벨에서의 동작 방식을 익힐 수 있었습니다.
이러한 학습 경험을 통해 웹 애플리케이션의 인증 및 보안 구조에 대한 이해도를 크게 높일 수 있었습니다. 비록 처음부터 직접 구현하는 데는 어려움이 있었지만, 이론적 지식과 클론 코딩을 통한 실습을 결합함으로써 향후 더 복잡한 프로젝트에서 이러한 기술을 적용할 수 있는 기반을 마련할 수 있었습니다.

## 실행 방법
1. 프로젝트를 클론합니다.
2. 프로젝트 루트 디렉토리에서 다음 명령어를 실행합니다:
   ```
   ./gradlew bootRun
   ```
3. 웹 브라우저에서 `http://localhost:8080`에 접속합니다.

---
