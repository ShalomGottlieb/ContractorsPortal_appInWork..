package ContractorsPortal.ContractorsPortal.Repositories;

import ContractorsPortal.ContractorsPortal.Beans.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepo extends JpaRepository<Message, Integer> {
    Message findById(int id);

}
