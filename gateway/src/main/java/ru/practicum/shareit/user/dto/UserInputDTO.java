package ru.practicum.shareit.user.dto;

import lombok.*;
import ru.practicum.shareit.exception.validation.Marker;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import static ru.practicum.shareit.constant.Constant.EMAIL_REGEX;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class UserInputDTO {

    public Long id;

    @NotBlank(message = "The name must not be empty.", groups = Marker.OnCreate.class)
    private String name;

    @NotBlank(message = "The email must not be empty.", groups = Marker.OnCreate.class)
    @Email(regexp = EMAIL_REGEX, message = "The email is incorrect.", groups = {Marker.OnCreate.class, Marker.OnUpdate.class})
    private String email;
}
