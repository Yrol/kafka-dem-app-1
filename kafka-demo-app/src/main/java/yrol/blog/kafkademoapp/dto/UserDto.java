package yrol.blog.kafkademoapp.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private int id;
    private String firstName;
    private String lastName;
}
