package com.example.ladingpage.Service;

import com.example.ladingpage.Model.Vehicle;
import com.example.ladingpage.Model.VehicleDTO;
import com.example.ladingpage.Repository.IVehicleRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService implements IVehicleService{

    @Autowired
    IVehicleRepository iVehicleRepository;
    @Autowired
    ModelMapper modelMapper;

    @Override
    public VehicleDTO createVehicle(VehicleDTO vehicle) {
        vehicle.setId(null);
        return saveVehicle(vehicle);
    }

    public VehicleDTO saveVehicle(VehicleDTO vehicleDTO){
        Vehicle newVehicle = modelMapper.map(vehicleDTO, Vehicle.class);
        iVehicleRepository.save(newVehicle);
        return modelMapper.map(newVehicle, VehicleDTO.class);
    }

    @Override
    public List<VehicleDTO> listVehicleForCategory(Integer idCategory) {
        List<Vehicle> listVehicleForCategory = iVehicleRepository.listForCategory(idCategory);
        return modelMapper.map(listVehicleForCategory, new TypeToken<List<VehicleDTO>>(){}.getType());
    }

    @Override
    public VehicleDTO findVehicle(Integer id){
        Optional<Vehicle> findVehicle = iVehicleRepository.findById(id);
        try{
            if(findVehicle.isPresent()){
                return modelMapper.map(findVehicle, VehicleDTO.class);
            }
        }catch (Exception e){
            System.out.println("NOT FOUND VEHICLE!!");
            e.getMessage();
        }
        return null;
    }

    @Override
    public void deleteVehicle(Integer id) {
        Optional<Vehicle> foundVehicle = iVehicleRepository.findById(id);
        if(foundVehicle.isPresent()){
            iVehicleRepository.deleteById(id);
        }else {
            System.out.println("NOT FOUND ID_VEHICLE");
        }
    }
}
