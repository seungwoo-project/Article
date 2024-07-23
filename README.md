# 블로그 API 프로젝트

## 프로젝트 소개
이 프로젝트는 RESTful API를 사용하여 구현한 블로그 백엔드 시스템입니다. Spring Boot를 기반으로 개발되었으며, 블로그 글의 CRUD(Create, Read, Update, Delete) 기능을 제공합니다.

## 주요 기능
- 블로그 글 생성
- 전체 글 목록 조회
- 단일 글 조회
- 글 수정
- 글 삭제

## 기술 스택
- Java
- Spring Boot
- Spring MVC
- JUnit (테스트)
- MockMvc (API 테스트)
- JPA (데이터 접근)

## API 엔드포인트

| 메소드 | 엔드포인트 | 설명 |
|--------|------------|------|
| POST   | /api/articles | 새 글 생성 |
| GET    | /api/articles | 전체 글 목록 조회 |
| GET    | /api/articles/{id} | 특정 ID의 글 조회 |
| PUT    | /api/articles/{id} | 특정 ID의 글 수정 |
| DELETE | /api/articles/{id} | 특정 ID의 글 삭제 |

## 코드 구조
```
src/
├── main/
│   └── java/
│       └── me/
│           └── seungwoo/
│               └── Article/
│                   ├── controller/
│                   │   └── BlogController.java
│                   ├── service/
│                   │   └── BlogService.java
│                   ├── repository/
│                   │   └── BlogRepository.java
│                   ├── domain/
│                   │   └── Article.java
│                   └── dto/
│                       ├── AddArticleRequest.java
│                       ├── ArticleResponse.java
│                       └── UpdateArticleRequest.java
└── test/
    └── java/
        └── me/
            └── seungwoo/
                └── Article/
                    └── controller/
                        └── BlogControllerTest.java
```

## 테스트
본 프로젝트는 JUnit과 MockMvc를 사용하여 각 API 엔드포인트에 대한 단위 테스트를 구현했습니다. 테스트는 다음과 같은 시나리오를 커버합니다:

- 글 추가
- 전체 글 목록 조회
- 단일 글 조회
- 글 수정
- 글 삭제

테스트 코드는 `BlogControllerTest.java` 파일에서 확인할 수 있습니다.

## 향후 계획
- Swagger 사용
- Thymeleaf템플릿 뷰 구현
- 댓글 기능 구현
- 스프링 시큐리티 설정
- JWT 서비스 구현
- Oauth2 구현
- AWS 배포
- CI/CD

---

이 프로젝트는 지속적으로 업데이트될 예정입니다. 문의사항이나 제안사항이 있으시면 이슈를 등록해 주세요.
