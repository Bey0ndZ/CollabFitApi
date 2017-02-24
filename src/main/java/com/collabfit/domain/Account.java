package com.collabfit.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

/**
 * Created by sumanth on 2/23/17.
 */
@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    private String id;

    @NotNull
    private String username;

    @NotNull
    private String email;

    @NotNull
    private String password;
}
