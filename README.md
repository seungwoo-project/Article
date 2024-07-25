# 블로그 API 프로젝트

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

## 프로젝트 구조
```
src/
├── main/
│   ├── java/me/seungwoo/Article/
│   │   ├── config/
│   │   │   └── WebSecurityConfig.java
│   │   ├── controller/
│   │   │   ├── apiController/
│   │   │   │   ├── BlogController.java
│   │   │   │   └── UserApiController.java
│   │   │   └── viewController/
│   │   │       ├── BlogViewController.java
│   │   │       └── UserViewController.java
│   │   ├── domain/
│   │   │   ├── Article.java
│   │   │   └── User.java
│   │   ├── dto/
│   │   │   ├── AddArticleRequest.java
│   │   │   ├── AddUserRequest.java
│   │   │   ├── ArticleListViewResponse.java
│   │   │   ├── ArticleResponse.java
│   │   │   ├── ArticleViewResponse.java
│   │   │   └── UpdateArticleRequest.java
│   │   ├── repository/
│   │   │   ├── BlogRepository.java
│   │   │   └── UserRepository.java
│   │   └── service/
│   │       ├── BlogService.java
│   │       ├── UserDetailService.java
│   │       └── UserService.java
│   └── resources/
│       ├── static/js/
│       │   └── article.js
│       └── templates/
│           ├── article.html
│           ├── articleList.html
│           ├── login.html
│           ├── newArticle.html
│           └── signup.html
└── test/java/me/seungwoo/Article/controller/
    ├── BlogControllerTest.java
    └── ArticleApplicationTests.java
```

## API 엔드포인트
| 메소드 | 엔드포인트 | 설명 |
|--------|------------|------|
| POST   | /api/articles | 새 글 생성 |
| GET    | /api/articles | 전체 글 목록 조회 |
| GET    | /api/articles/{id} | 특정 ID의 글 조회 |
| PUT    | /api/articles/{id} | 특정 ID의 글 수정 |
| DELETE | /api/articles/{id} | 특정 ID의 글 삭제 |
| POST   | /user | 새 사용자 등록 |

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

## 실행 방법
1. 프로젝트를 클론합니다.
2. 프로젝트 루트 디렉토리에서 다음 명령어를 실행합니다:
   ```
   ./gradlew bootRun
   ```
3. 웹 브라우저에서 `http://localhost:8080`에 접속합니다.

---
