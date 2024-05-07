package com.congo.helloWorld2.repository;

import com.congo.helloWorld2.entity.Hello;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//extends JpaRepository <entityName, entityDataType>
@Repository
public interface HelloRepository extends JpaRepository<Hello,Long> {  //extend the interface with jpRepo


}
