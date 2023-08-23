package code.pcc.apitest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import code.pcc.apitest.entity.ApiEntity;


@Repository
public interface ApiJpaRepository extends JpaRepository<ApiEntity, Long>{
    
}
