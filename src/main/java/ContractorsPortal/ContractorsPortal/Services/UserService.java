package ContractorsPortal.ContractorsPortal.Services;

import ContractorsPortal.ContractorsPortal.Beans.Message;
import ContractorsPortal.ContractorsPortal.Beans.User;
import ContractorsPortal.ContractorsPortal.Repositories.MessageRepo;
import ContractorsPortal.ContractorsPortal.Repositories.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;
    private final MessageRepo messageRepo;

    public User getMyDetails (int id){
        return userRepo.findById(id);
    }

    public void addMessage(Message message){
        messageRepo.save(message);
    }


}
