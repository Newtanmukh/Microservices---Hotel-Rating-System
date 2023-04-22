package com.microservice.user.service.UserService.payload;

import lombok.*;
import org.springframework.http.HttpStatus;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiResponse {
    private String message;
    private Boolean success;

    private HttpStatus status;
}
