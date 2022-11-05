package com.ws.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class UsersDto {
    private Long id;
    private String name;
    private String email;
    private String gender;
    private String status;
}
