package ContractorsPortal.ContractorsPortal.Beans;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private int id;
    @Enumerated(EnumType.ORDINAL)
    private MessageOptions typeId;
    private String text;
    private Date date;
    @Column(name = "userId")
    private int userId;
    @Column(name = "clusterId")
    private int clusterId;
    @Column(name = "parentMessageId")
    private int parentMessageId;
//    @ManyToMany(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true) //orphanRemoval = true
    @JoinColumn(name = "parentMessageId")
    private List<Message> attachMessages;
    private String media;
}
