# cokatoo

개발일지
- https://grand-calcium-138.notion.site/1bc4e3d487d245d0a76e5ae7a901f3b7?pvs=74

- 엔티티 별 crud 까지 개발 완료
- 도메인형 디렉토리 구조 적용
- 에러핸들링 적용
- Facade 디자인 패턴 적용
- Mapper

디렉토리
```
.
 src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── cockatoo
    │   │           ├── domain
    │   │           │   ├── grade
    │   │           │   │   ├── api
    │   │           │   │   ├── dto
    │   │           │   │   ├── entity
    │   │           │   │   ├── exception
    │   │           │   │   ├── mapper
    │   │           │   │   ├── repository
    │   │           │   │   └── service
    │   │           │   ├── log
    │   │           │   │   ├── api
    │   │           │   │   ├── dto
    │   │           │   │   ├── entity
    │   │           │   │   ├── exception
    │   │           │   │   ├── mapper
    │   │           │   │   ├── repository
    │   │           │   │   ├── service
    │   │           │   │   └── util
    │   │           │   ├── sound
    │   │           │   │   ├── api
    │   │           │   │   ├── dto
    │   │           │   │   ├── entity
    │   │           │   │   ├── exception
    │   │           │   │   ├── mapper
    │   │           │   │   ├── repository
    │   │           │   │   └── service
    │   │           │   └── user
    │   │           │       ├── api
    │   │           │       ├── dto
    │   │           │       ├── entity
    │   │           │       ├── exception
    │   │           │       ├── mapper
    │   │           │       ├── repository
    │   │           │       └── service
    │   │           └── global
    │   │               ├── entity
    │   │               ├── error
    │   │               │   └── exception
    │   │               └── util
    │   └── resources
    │       ├── static
    │       └── templates
    └── test
        └── java
            └── com
                └── cockatoo

```

