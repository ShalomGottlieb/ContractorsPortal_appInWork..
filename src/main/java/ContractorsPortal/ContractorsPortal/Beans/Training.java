package ContractorsPortal.ContractorsPortal.Beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="trainings")
public class Training {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String subtitle;
    private String text;
    private String Media;
    private int userId;
    @ManyToMany(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    private List<Message> myMessages;

}
