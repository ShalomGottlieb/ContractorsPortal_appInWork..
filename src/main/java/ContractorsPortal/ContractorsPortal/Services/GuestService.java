package ContractorsPortal.ContractorsPortal.Services;

import ContractorsPortal.ContractorsPortal.Beans.Message;
import ContractorsPortal.ContractorsPortal.Beans.Training;
import ContractorsPortal.ContractorsPortal.Beans.User;
import ContractorsPortal.ContractorsPortal.Exceptions.AlreadyExistsException;
import ContractorsPortal.ContractorsPortal.Repositories.MessageRepo;
import ContractorsPortal.ContractorsPortal.Repositories.TrainingRepo;
import ContractorsPortal.ContractorsPortal.Repositories.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.MessageCodesResolver;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GuestService {
    private final TrainingRepo trainingRepo;
    private final MessageRepo messageRepo;
    private final UserRepo userRepo;

    public List<Training> getAllTraining(){
        return trainingRepo.findAll();
    }

    public List<Message> getAllMessages(){
        return messageRepo.findAll();
    }

    public void addMessage(Message message){
        //message.setId(1); for user anonimus, maybe todo in react
        messageRepo.save(message);
    }

    public void addTraining(Training training){
        //message.setId(1); for user anonimus, maybe todo in react
        trainingRepo.save(training);
    }

    public void registerUser(User user) throws AlreadyExistsException {
        if (userRepo.existsUserByName(user.getName())) {
            throw new AlreadyExistsException("company name already exists");
        }
        if (userRepo.existsUserByEmail(user.getEmail())) {
            throw new AlreadyExistsException("company email already exists");
        }
        userRepo.save(user);
        System.out.println("user sucsesfully added");
    }


}
/*
* get by title
* get by subtitle includs
* add message--- keep in anonimus
*
* */