package com.forms.api.forms.dto.request;

import com.forms.api.forms.domain.FormsAccess;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CreateFormsRequest {
    @NotBlank
    private String title;

    @Nullable
    private String description;

    @NotNull
    private FormsAccess access;

    @NotNull
    private LocalDateTime startedAt;

    @NotNull
    private LocalDateTime endedAt;

}
