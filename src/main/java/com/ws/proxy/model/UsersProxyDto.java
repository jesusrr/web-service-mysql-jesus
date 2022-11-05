package com.ws.proxy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsersProxyDto {
    private String name;
    private String email;
    private String gender;
    private String status;
}
