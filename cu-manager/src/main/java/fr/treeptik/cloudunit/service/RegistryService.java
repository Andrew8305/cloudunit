package fr.treeptik.cloudunit.service;

import fr.treeptik.cloudunit.exception.CheckException;
import fr.treeptik.cloudunit.exception.ServiceException;
import fr.treeptik.cloudunit.model.Registry;

import java.util.List;

public interface RegistryService {
    List<Registry> findAll() throws ServiceException;
    Registry createNewRegistry(String endpoint, String username, String password, String email) throws ServiceException;
    Registry loadRegistry(int id) throws CheckException;
    void deleteRegistry(Integer id) throws ServiceException;
}
