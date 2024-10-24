package com.cockatoo.domain.user.api;

import com.cockatoo.domain.user.dto.ReadUserResponse;
import com.cockatoo.domain.user.dto.UpdateUserRequest;
import com.cockatoo.domain.user.dto.UpdateUserResponse;
import com.cockatoo.domain.user.entity.User;
import com.cockatoo.domain.user.exception.UserNotFoundException;
import com.cockatoo.domain.user.repository.UserRepository;
import com.cockatoo.domain.user.service.UserService;
import com.cockatoo.global.error.ErrorCode;
import com.cockatoo.global.error.GlobalExceptionHandler;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;


@ExtendWith(MockitoExtension.class)
public class UserControllerMockMvcStandaloneTest {

    private MockMvc mvc;

    @Mock
    private UserService userService;

    @InjectMocks
        private UserController userController;

    private JacksonTester<ReadUserResponse> jacksonTester;
    private JacksonTester<UpdateUserRequest> updateMapper;
    private ObjectMapper objectMapper;


    @BeforeEach
    public void setup() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        // Initialize JacksonTester with the configured ObjectMapper
        JacksonTester.initFields(this, objectMapper);
        // We would need this line if we would not use the MockitoExtension
        // MockitoAnnotations.initMocks(this);
        // Here we can't use @AutoConfigureJsonTesters because there isn't a Spring context
        // MockMvc standalone approach
        mvc = MockMvcBuilders.standaloneSetup(userController)
                .setControllerAdvice(new GlobalExceptionHandler())
                .defaultResponseCharacterEncoding(StandardCharsets.UTF_8)
                .build();
    }

    @Test
    public void canRetrieveByIdWhenExists() throws Exception {
        // given
        Long userId = 2L;
        ReadUserResponse readUserResponse = ReadUserResponse.builder()
                .userId(userId)
                .password("123")
                .name("오예성")
                .email("email@example.com")
                .withdrawAt(null)
                .createdAt(null) // null 값이 필요하다면 추가합니다.
                .updatedAt(null) // null 값이 필요하다면 추가합니다.
                .build();

        // UserService의 readUser 메서드를 모킹
        given(userService.readUser(userId)).willReturn(readUserResponse);

        // when
        MockHttpServletResponse response = mvc.perform(
                        get("/api/v1/user/2")
                                .accept(MediaType.APPLICATION_JSON))
                .andReturn()
                .getResponse();

        // then
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo(
                jacksonTester.write(readUserResponse).getJson()
        );
    }

    @Test
    public void canRetrieveByIdWhenDoesNotExist() throws Exception {
        //given
        given(userService.readUser(2L))
                .willThrow(new UserNotFoundException());

        // when
        MockHttpServletResponse response = mvc.perform(
                        get("/api/v1/user/2")
                                .accept(MediaType.APPLICATION_JSON))
                .andReturn()
                .getResponse();

        // then
        assertThat(response.getStatus()).isEqualTo(HttpStatus.NOT_FOUND.value());
        assertThat(response.getContentAsString()).isEqualTo("{\"message\":\"존재하지 않는 아이디입니다.\",\"code\":\"U1\"}");
    }


    @Test
    public void canUpdateByIdWhenExists() throws Exception {
        // given
        Long userId = 2L;
        LocalDateTime updatedTime = LocalDateTime.now();


        UpdateUserRequest updateUserRequest = UpdateUserRequest.builder()
                .password("changed password")
                .name("바뀐이름입니다")
                .email("chageEmail@example.com")
                .withdrawAt(updatedTime)
                .build();

        UpdateUserResponse updateUserResponse = UpdateUserResponse.builder()
                .userId(userId)
                .password("changed password")
                .name("바뀐이름입니다")
                .email("chageEmail@example.com")
                .withdrawAt(updatedTime)
                .createdAt(null) // Use null if required
                .updatedAt(updatedTime) // Use null if required
                .build();

        given(userService.updateUser(userId, updateUserRequest ))
                .willReturn(updateUserResponse);


        System.out.println(updateUserRequest.toString());

        System.out.println(updateMapper.write(updateUserRequest).getJson().toString());
        // when
        MockHttpServletResponse response = mvc.perform(
                        patch("/api/v1/user/{userId}", userId)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(updateMapper.write(updateUserRequest).getJson())
                                .accept(MediaType.APPLICATION_JSON))
                .andReturn()
                .getResponse();

        // then
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
//        assertThat(response.getContentAsString()).isEqualTo(objectMapper.writeValueAsString(updateUserResponse)); // Use ObjectMapper to convert response to JSON
    }

}
