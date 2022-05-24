package com.example.ladingpage.Repository;

import com.example.ladingpage.Model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IVehicleRepository extends JpaRepository<Vehicle, Integer> {

    @Query("from Vehicle v where v.category.id = :idCategory")
    List<Vehicle> listForCategory(@Param("idCategory") Integer idCategory);
}
