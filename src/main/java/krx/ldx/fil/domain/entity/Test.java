package krx.ldx.fil.domain.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@Entity(name = "test")
@Table(
    name = "test"
)
public class Test  implements Serializable {

  @Id
  @Column(columnDefinition = "BIGINT NOT NULL COMMENT 'id unique id'",
      name = "id", unique = true)
  private Long uid;

  @Column(name = "test", length = 10)
  private String test;

  @Column(name = "title", length = 10)
  private String title;



}
