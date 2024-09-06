# cokatoo


노션
- https://grand-calcium-138.notion.site/1bc4e3d487d245d0a76e5ae7a901f3b7?pvs=74

디렉토리
```
.
├── HELP.md
├── README.md
├── build
│   ├── classes
│   │   └── java
│   │       └── main
│   │           └── com
│   │               └── cockatoo
│   │                   ├── CockatooApplication.class
│   │                   ├── domain
│   │                   │   ├── grade
│   │                   │   │   ├── api
│   │                   │   │   │   └── GradeController.class
│   │                   │   │   ├── dto
│   │                   │   │   │   ├── CreateGradeRequest.class
│   │                   │   │   │   ├── CreateGradeResponse.class
│   │                   │   │   │   ├── GradeDTO.class
│   │                   │   │   │   ├── GradeDTOImpl.class
│   │                   │   │   │   └── ReadGradeResponse.class
│   │                   │   │   ├── entity
│   │                   │   │   │   └── Grade.class
│   │                   │   │   ├── exception
│   │                   │   │   │   ├── GradeNotFoundException.class
│   │                   │   │   │   ├── GradeTierAlreadyExistsException.class
│   │                   │   │   │   └── GradeTierNotFoundException.class
│   │                   │   │   ├── mapper
│   │                   │   │   │   ├── GradeMapper.class
│   │                   │   │   │   └── GradeMapperImpl.class
│   │                   │   │   ├── repository
│   │                   │   │   │   └── GradeRepository.class
│   │                   │   │   └── service
│   │                   │   │       ├── GradeService.class
│   │                   │   │       ├── GradeServiceImpl.class
│   │                   │   │       └── GradeValidationService.class
│   │                   │   ├── log
│   │                   │   │   ├── api
│   │                   │   │   │   └── LogController.class
│   │                   │   │   ├── dto
│   │                   │   │   │   ├── CreateLogRequest.class
│   │                   │   │   │   ├── CreateLogResponse.class
│   │                   │   │   │   ├── LogDTO.class
│   │                   │   │   │   └── ReadLogResponse.class
│   │                   │   │   ├── entity
│   │                   │   │   │   └── Log.class
│   │                   │   │   ├── exception
│   │                   │   │   │   └── LogNotFoundException.class
│   │                   │   │   ├── mapper
│   │                   │   │   │   ├── LogMapper.class
│   │                   │   │   │   └── LogMapperImpl.class
│   │                   │   │   ├── repository
│   │                   │   │   │   └── LogRepository.class
│   │                   │   │   ├── service
│   │                   │   │   │   ├── LogService.class
│   │                   │   │   │   ├── LogServiceImpl.class
│   │                   │   │   │   └── LogValidationService.class
│   │                   │   │   └── util
│   │                   │   │       ├── LogMapperFacade.class
│   │                   │   │       ├── LogRepositoryFacade.class
│   │                   │   │       ├── LogServiceFacade.class
│   │                   │   │       └── LogValidationServiceFacade.class
│   │                   │   ├── sound
│   │                   │   │   ├── api
│   │                   │   │   │   └── SoundController.class
│   │                   │   │   ├── dto
│   │                   │   │   │   ├── CreateSoundRequest.class
│   │                   │   │   │   ├── CreateSoundResponse.class
│   │                   │   │   │   ├── DeleteSoundResponse.class
│   │                   │   │   │   ├── ReadSoundRequest.class
│   │                   │   │   │   ├── ReadSoundResponse.class
│   │                   │   │   │   ├── SoundDTO.class
│   │                   │   │   │   ├── SoundDTOImpl.class
│   │                   │   │   │   ├── UpdateSoundRequest.class
│   │                   │   │   │   └── UpdateSoundResponse.class
│   │                   │   │   ├── entity
│   │                   │   │   │   └── Sound.class
│   │                   │   │   ├── exception
│   │                   │   │   │   ├── SoundNameAlreadyExistsException.class
│   │                   │   │   │   └── SoundNotFoundException.class
│   │                   │   │   ├── mapper
│   │                   │   │   │   ├── SoundMapper.class
│   │                   │   │   │   └── SoundMapperImpl.class
│   │                   │   │   ├── repository
│   │                   │   │   │   └── SoundRepository.class
│   │                   │   │   └── service
│   │                   │   │       ├── SoundService.class
│   │                   │   │       ├── SoundServiceImpl.class
│   │                   │   │       └── SoundValidationService.class
│   │                   │   └── user
│   │                   │       ├── api
│   │                   │       │   └── UserController.class
│   │                   │       ├── dto
│   │                   │       │   ├── CreateUserRequest.class
│   │                   │       │   ├── CreateUserResponse.class
│   │                   │       │   ├── DeletedUserResponse.class
│   │                   │       │   ├── ReadUserRequest.class
│   │                   │       │   ├── ReadUserResponse.class
│   │                   │       │   ├── UpdateUserRequest.class
│   │                   │       │   ├── UpdateUserResponse.class
│   │                   │       │   ├── UserDTO.class
│   │                   │       │   └── UserDTOImpl.class
│   │                   │       ├── entity
│   │                   │       │   └── User.class
│   │                   │       ├── exception
│   │                   │       │   ├── EmailAlreadyExistsException.class
│   │                   │       │   ├── UserNameAlreadyExistsException.class
│   │                   │       │   └── UserNotFoundException.class
│   │                   │       ├── mapper
│   │                   │       │   ├── UserMapper.class
│   │                   │       │   └── UserMapperImpl.class
│   │                   │       ├── repository
│   │                   │       │   └── UserRepository.class
│   │                   │       └── service
│   │                   │           ├── UserService.class
│   │                   │           ├── UserServiceImpl.class
│   │                   │           └── UserValidationService.class
│   │                   └── global
│   │                       ├── entity
│   │                       │   └── Base.class
│   │                       └── error
│   │                           ├── ErrorCode.class
│   │                           ├── ErrorResponse.class
│   │                           ├── GlobalExceptionHandler.class
│   │                           └── exception
│   │                               ├── AlreadyExistsException.class
│   │                               ├── BusinessBaseException.class
│   │                               └── NotFoundException.class
│   ├── generated
│   │   └── sources
│   │       ├── annotationProcessor
│   │       │   └── java
│   │       │       └── main
│   │       │           └── com
│   │       │               └── cockatoo
│   │       │                   └── domain
│   │       │                       ├── grade
│   │       │                       │   └── mapper
│   │       │                       │       └── GradeMapperImpl.java
│   │       │                       ├── log
│   │       │                       │   └── mapper
│   │       │                       │       └── LogMapperImpl.java
│   │       │                       ├── sound
│   │       │                       │   └── mapper
│   │       │                       │       └── SoundMapperImpl.java
│   │       │                       └── user
│   │       │                           └── mapper
│   │       │                               └── UserMapperImpl.java
│   │       └── headers
│   │           └── java
│   │               └── main
│   ├── resources
│   │   └── main
│   │       ├── application.properties
│   │       ├── static
│   │       └── templates
│   └── tmp
│       └── compileJava
│           ├── compileTransaction
│           │   ├── backup-dir
│           │   └── stash-dir
│           │       ├── LogController.class.uniqueId1
│           │       ├── LogMapperFacade.class.uniqueId2
│           │       ├── LogService.class.uniqueId3
│           │       ├── LogServiceImpl.class.uniqueId4
│           │       └── ReadLogResponse.class.uniqueId0
│           └── previous-compilation-data.bin
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── settings.gradle
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── cockatoo
    │   │           ├── CockatooApplication.java
    │   │           ├── domain
    │   │           │   ├── grade
    │   │           │   │   ├── api
    │   │           │   │   │   └── GradeController.java
    │   │           │   │   ├── dto
    │   │           │   │   │   ├── CreateGradeRequest.java
    │   │           │   │   │   ├── CreateGradeResponse.java
    │   │           │   │   │   ├── GradeDTO.java
    │   │           │   │   │   ├── GradeDTOImpl.java
    │   │           │   │   │   └── ReadGradeResponse.java
    │   │           │   │   ├── entity
    │   │           │   │   │   └── Grade.java
    │   │           │   │   ├── exception
    │   │           │   │   │   ├── GradeNotFoundException.java
    │   │           │   │   │   ├── GradeTierAlreadyExistsException.java
    │   │           │   │   │   └── GradeTierNotFoundException.java
    │   │           │   │   ├── mapper
    │   │           │   │   │   └── GradeMapper.java
    │   │           │   │   ├── repository
    │   │           │   │   │   └── GradeRepository.java
    │   │           │   │   └── service
    │   │           │   │       ├── GradeService.java
    │   │           │   │       ├── GradeServiceImpl.java
    │   │           │   │       └── GradeValidationService.java
    │   │           │   ├── log
    │   │           │   │   ├── api
    │   │           │   │   │   └── LogController.java
    │   │           │   │   ├── dto
    │   │           │   │   │   ├── CreateLogRequest.java
    │   │           │   │   │   ├── CreateLogResponse.java
    │   │           │   │   │   ├── LogDTO.java
    │   │           │   │   │   └── ReadLogResponse.java
    │   │           │   │   ├── entity
    │   │           │   │   │   └── Log.java
    │   │           │   │   ├── exception
    │   │           │   │   │   └── LogNotFoundException.java
    │   │           │   │   ├── mapper
    │   │           │   │   │   └── LogMapper.java
    │   │           │   │   ├── repository
    │   │           │   │   │   └── LogRepository.java
    │   │           │   │   ├── service
    │   │           │   │   │   ├── LogService.java
    │   │           │   │   │   ├── LogServiceImpl.java
    │   │           │   │   │   └── LogValidationService.java
    │   │           │   │   └── util
    │   │           │   │       ├── LogMapperFacade.java
    │   │           │   │       ├── LogRepositoryFacade.java
    │   │           │   │       ├── LogServiceFacade.java
    │   │           │   │       └── LogValidationServiceFacade.java
    │   │           │   ├── sound
    │   │           │   │   ├── api
    │   │           │   │   │   └── SoundController.java
    │   │           │   │   ├── dto
    │   │           │   │   │   ├── CreateSoundRequest.java
    │   │           │   │   │   ├── CreateSoundResponse.java
    │   │           │   │   │   ├── DeleteSoundResponse.java
    │   │           │   │   │   ├── ReadSoundRequest.java
    │   │           │   │   │   ├── ReadSoundResponse.java
    │   │           │   │   │   ├── SoundDTO.java
    │   │           │   │   │   ├── SoundDTOImpl.java
    │   │           │   │   │   ├── UpdateSoundRequest.java
    │   │           │   │   │   └── UpdateSoundResponse.java
    │   │           │   │   ├── entity
    │   │           │   │   │   └── Sound.java
    │   │           │   │   ├── exception
    │   │           │   │   │   ├── SoundNameAlreadyExistsException.java
    │   │           │   │   │   └── SoundNotFoundException.java
    │   │           │   │   ├── mapper
    │   │           │   │   │   └── SoundMapper.java
    │   │           │   │   ├── repository
    │   │           │   │   │   └── SoundRepository.java
    │   │           │   │   └── service
    │   │           │   │       ├── SoundService.java
    │   │           │   │       ├── SoundServiceImpl.java
    │   │           │   │       └── SoundValidationService.java
    │   │           │   └── user
    │   │           │       ├── api
    │   │           │       │   └── UserController.java
    │   │           │       ├── dto
    │   │           │       │   ├── CreateUserRequest.java
    │   │           │       │   ├── CreateUserResponse.java
    │   │           │       │   ├── DeletedUserResponse.java
    │   │           │       │   ├── ReadUserRequest.java
    │   │           │       │   ├── ReadUserResponse.java
    │   │           │       │   ├── UpdateUserRequest.java
    │   │           │       │   ├── UpdateUserResponse.java
    │   │           │       │   ├── UserDTO.java
    │   │           │       │   └── UserDTOImpl.java
    │   │           │       ├── entity
    │   │           │       │   └── User.java
    │   │           │       ├── exception
    │   │           │       │   ├── EmailAlreadyExistsException.java
    │   │           │       │   ├── UserNameAlreadyExistsException.java
    │   │           │       │   └── UserNotFoundException.java
    │   │           │       ├── mapper
    │   │           │       │   └── UserMapper.java
    │   │           │       ├── repository
    │   │           │       │   └── UserRepository.java
    │   │           │       └── service
    │   │           │           ├── UserService.java
    │   │           │           ├── UserServiceImpl.java
    │   │           │           └── UserValidationService.java
    │   │           └── global
    │   │               ├── entity
    │   │               │   └── Base.java
    │   │               ├── error
    │   │               │   ├── ErrorCode.java
    │   │               │   ├── ErrorResponse.java
    │   │               │   ├── GlobalExceptionHandler.java
    │   │               │   └── exception
    │   │               │       ├── AlreadyExistsException.java
    │   │               │       ├── BusinessBaseException.java
    │   │               │       └── NotFoundException.java
    │   │               └── util
    │   └── resources
    │       ├── application.properties
    │       ├── static
    │       └── templates
    └── test
        └── java
            └── com
                └── cockatoo
                    └── CockatooApplicationTests.java
```

