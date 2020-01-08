package com.springboot.jpadata.application.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccountResponseDTO {
    private String id;
    private String name;
    private Integer money;
}
