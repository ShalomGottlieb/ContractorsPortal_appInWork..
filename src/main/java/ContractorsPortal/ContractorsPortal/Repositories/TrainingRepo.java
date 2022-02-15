package ContractorsPortal.ContractorsPortal.Repositories;

import ContractorsPortal.ContractorsPortal.Beans.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingRepo extends JpaRepository<Training, Integer> {
    Training findById(int id);

}
