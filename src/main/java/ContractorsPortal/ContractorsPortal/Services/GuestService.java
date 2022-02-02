package ContractorsPortal.ContractorsPortal.Services;

import ContractorsPortal.ContractorsPortal.Beans.Message;
import ContractorsPortal.ContractorsPortal.Beans.Training;
import ContractorsPortal.ContractorsPortal.Repositories.MessageRepo;
import ContractorsPortal.ContractorsPortal.Repositories.TrainingRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.MessageCodesResolver;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GuestService {
    private final TrainingRepo trainingRepo;
    private final MessageRepo messageRepo;

    public List<Training> getAllTraining(){
        return trainingRepo.findAll();
    }

    public void addMessage(Message message){
        //message.setId(1); for user anonimus, maybe todo in react
        messageRepo.save(message);
    }

}
/*
* get by title
* get by subtitle includs
* add message--- keep in anonimus
*
* */