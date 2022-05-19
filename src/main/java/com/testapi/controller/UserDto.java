package com.testapi.controller;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Сущность пользователя")
public class UserDto {
    @Schema(description = "Идентификатор", example = "A-124523")
    private String id;

    @Schema(description = "имя", example = "Вася")
    private String name;
}
