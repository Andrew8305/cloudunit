package fr.treeptik.cloudunit.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;

import fr.treeptik.cloudunit.domain.core.Application;

public interface ApplicationRepository extends Repository<Application, String> {
    public Optional<Application> findOne(String id);

    public Optional<Application> findByName(String name);
    
    public Optional<Application> findByServicesContainerName(String containerName);

    public List<Application> findAll();
    
    public Application save(Application application);

    public void delete(Application application);
}
