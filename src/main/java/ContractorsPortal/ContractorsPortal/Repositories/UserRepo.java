package ContractorsPortal.ContractorsPortal.Repositories;

import ContractorsPortal.ContractorsPortal.Beans.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    User findById(int id);


}
