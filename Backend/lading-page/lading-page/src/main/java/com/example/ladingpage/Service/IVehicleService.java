package com.example.ladingpage.Service;

import com.example.ladingpage.Model.VehicleDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IVehicleService {

    VehicleDTO createVehicle(VehicleDTO vehicle);
    List<VehicleDTO> listVehicleForCategory(Integer idCategory);
    VehicleDTO findVehicle(Integer id);
    void deleteVehicle(Integer id);

}
