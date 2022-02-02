package ContractorsPortal.ContractorsPortal.Services;

import ContractorsPortal.ContractorsPortal.Beans.User;
import ContractorsPortal.ContractorsPortal.Repositories.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AdminService {
    private final UserRepo userRepo;

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }




}
