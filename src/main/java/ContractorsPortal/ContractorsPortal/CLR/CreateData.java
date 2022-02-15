package ContractorsPortal.ContractorsPortal.CLR;

import ContractorsPortal.ContractorsPortal.Beans.Message;
import ContractorsPortal.ContractorsPortal.Beans.MessageOptions;
import ContractorsPortal.ContractorsPortal.Beans.Training;
import ContractorsPortal.ContractorsPortal.Beans.User;
import ContractorsPortal.ContractorsPortal.Repositories.MessageRepo;
import ContractorsPortal.ContractorsPortal.Repositories.TrainingRepo;
import ContractorsPortal.ContractorsPortal.Repositories.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
@Order(1)
@RequiredArgsConstructor
public class CreateData implements CommandLineRunner {
    private final TrainingRepo trainingRepo;
    private final UserRepo userRepo;
    private final MessageRepo messageRepo;

    @Override
    public void run(String... args) throws Exception {
        User user1= User.builder()
                .email("user1@aaa.com")
                .name("user1")
                .password("user1")
                .build();
        userRepo.save(user1);
        System.out.println("user1 created successfully");

        Training training1= Training.builder()
//                .id(5)

                .TrUserId(1)
                .titleId(1)
                .media("media")
                .text("shpactel is the best way")
//                .myMessages(Arrays.asList(message1,message2))
                .build();
        trainingRepo.save(training1);
        System.out.println("training1 added successfully");

        Message message1= Message.builder()
                .id(1)
                .date(Date.valueOf(LocalDate.now()))
                .typeId(MessageOptions.TIP)
                .userId(1)
                .clusterId(1)
                .text("only tambur")
                .media("string")
                .build();
        Message message2= Message.builder()
                .id(2)
                .typeId(MessageOptions.TIP)
                .date(Date.valueOf(LocalDate.now()))
                .userId(1)
                .clusterId(1)
                .text("only yaakoby")
                .media("media")
                .build();
        Message message3=Message.builder()
                .typeId(MessageOptions.TIP)
                .date(Date.valueOf(LocalDate.now()))
                .userId(1)
                .parentMessageId(1)
                .text("tambur the best!")
                .media("media")
                .build();
        Message message4=Message.builder()
                .id(4)
                .typeId(MessageOptions.TIP)
                .date(Date.valueOf(LocalDate.now()))
                .userId(1)
                .parentMessageId(2)
                .text("message4")
                .media("media")
                .build();
        Message message5=Message.builder()
                .typeId(MessageOptions.TIP)
                .date(Date.valueOf(LocalDate.now()))
                .userId(1)
                .parentMessageId(3)
                .text("message5")
                .media("media")
                .build();
        Message message6=Message.builder()
                .typeId(MessageOptions.TIP)
                .date(Date.valueOf(LocalDate.now()))
                .userId(1)
                .parentMessageId(5)
                .text("message6")
                .media("media")
                .build();
        Message message7=Message.builder()
                .typeId(MessageOptions.TIP)
                .date(Date.valueOf(LocalDate.now()))
                .userId(1)
                .parentMessageId(4)
                .text("message7")
                .media("media")
                .build();
        Message message8=Message.builder()
                .typeId(MessageOptions.TIP)
                .date(Date.valueOf(LocalDate.now()))
                .userId(1)
                .parentMessageId(4)
                .text("message8")
                .media("media")
                .build();
        Message message9=Message.builder()
                .typeId(MessageOptions.TIP)
                .date(Date.valueOf(LocalDate.now()))
                .userId(1)
                .parentMessageId(8)
                .text("message9")
                .media("media")
                .build();
        Message message10=Message.builder()
                .typeId(MessageOptions.TIP)
                .date(Date.valueOf(LocalDate.now()))
                .userId(1)
                .parentMessageId(1)
                .text("still here?")
                .media("media")
                .build();
        messageRepo.save(message1);
        messageRepo.save(message2);
        messageRepo.save(message3);
        messageRepo.save(message4);
        messageRepo.save(message5);
        messageRepo.save(message6);
        messageRepo.save(message7);
        messageRepo.save(message8);
        messageRepo.save(message9);
        messageRepo.save(message10);
//        System.out.println("messages created successfully");
        //message2.setMyMessages(Arrays.asList(message3));
        //messageRepo.saveAndFlush(message2);

        System.out.println("messages created");
//        new Message(1, MessageOptions.TIP,"only tambur",new Date(),1,null,"media");


        System.out.println(userRepo.findById(1));
        System.out.println(trainingRepo.findById(1));
        System.out.println(messageRepo.findById(1));
        System.out.println(messageRepo.findById(2));
        System.out.println(messageRepo.findById(3));
    }
}
