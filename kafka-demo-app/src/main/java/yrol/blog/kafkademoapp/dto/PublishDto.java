package yrol.blog.kafkademoapp.dto;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PublishDto {
    private String message;
}
