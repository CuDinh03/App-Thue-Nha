package com.example.demo2.transfer;

import com.example.demo2.dto.AccountDto;
import com.example.demo2.dto.HouseDto;
import com.example.demo2.model.Account;
import com.example.demo2.model.House;

public class TransferData {

    public Account returnEntity (AccountDto input){
        Account result = new Account();
        if (input.getId() != null) result.setId(input.getId());
        if (input.getEmail() != null) result.setEmail(input.getEmail());
        if (input.getPassword() != null) result.setPassword(input.getPassword());
        if (input.getName() != null) result.setName(input.getName());
        if (input.getPhoneNumber() != null) result.setPhoneNumber(input.getPhoneNumber());
        if (input.getCreateDate() != null) result.setCreateDate(input.getCreateDate());
        if (input.getEditDate() != null) result.setEditDate(input.getEditDate());
        if (input.getAddress() != null) result.setAddress(input.getAddress());
        return result;
    }

    public AccountDto returnDto (Account input){
        AccountDto result = new AccountDto();
        if (input.getId() != null) result.setId(input.getId());
        if (input.getEmail() != null) result.setEmail(input.getEmail());
        if (input.getPassword() != null) result.setPassword(input.getPassword());
        if (input.getName() != null) result.setName(input.getName());
        if (input.getPhoneNumber() != null) result.setPhoneNumber(input.getPhoneNumber());
        if (input.getCreateDate() != null) result.setCreateDate(input.getCreateDate());
        if (input.getEditDate() != null) result.setEditDate(input.getEditDate());
        if (input.getAddress() != null) result.setAddress(input.getAddress());
        return result;
    }

    public House returnEntity(HouseDto input){
        House result = new House();
        if (input.getId() != null) result.setId(input.getId());
        if (input.getName() != null) result.setName(input.getName());
        if (input.getAddress() != null) result.setAddress(input.getAddress());
        if (input.getDescription() != null) result.setDescription(input.getDescription());
        if (input.getNumberOfRooms() != null ) result.setNumberOfRooms(input.getNumberOfRooms());
        if (input.getRoomArea() != null) result.setRoomArea(input.getRoomArea());
        if (input.getCreatedDate() != null) result.setCreatedDate(input.getCreatedDate());
        if (input.getStartDate() != null) result.setStartDate(input.getStartDate());
        if (input.getEndDate() != null) result.setEndDate(input.getEndDate());
        if (input.getContractNumber() != null) result.setContractNumber(input.getContractNumber());
        if (input.getDepositAmount() != null) result.setDepositAmount(input.getDepositAmount());
        if (input.getMonthlyRentAmount() != null) result.setMonthlyRentAmount(input.getMonthlyRentAmount());
        if (input.getServiceCharge() != null) result.setServiceCharge(input.getServiceCharge());
        if (input.getRentStatus() != null) result.setRentStatus(input.getRentStatus());
        if (input.getCreateDate() != null) result.setCreateDate(input.getCreateDate());
        if (input.getEditDate() != null) result.setEditDate(input.getEditDate());
        return result;
    }

    public HouseDto returnDto (House input){
        HouseDto result = new HouseDto();
        if (input.getId() != null) result.setId(input.getId());
        if (input.getName() != null) result.setName(input.getName());
        if (input.getAddress() != null) result.setAddress(input.getAddress());
        if (input.getDescription() != null) result.setDescription(input.getDescription());
        if (input.getNumberOfRooms() != null ) result.setNumberOfRooms(input.getNumberOfRooms());
        if (input.getRoomArea() != null) result.setRoomArea(input.getRoomArea());
        if (input.getCreatedDate() != null) result.setCreatedDate(input.getCreatedDate());
        if (input.getStartDate() != null) result.setStartDate(input.getStartDate());
        if (input.getEndDate() != null) result.setEndDate(input.getEndDate());
        if (input.getContractNumber() != null) result.setContractNumber(input.getContractNumber());
        if (input.getDepositAmount() != null) result.setDepositAmount(input.getDepositAmount());
        if (input.getMonthlyRentAmount() != null) result.setMonthlyRentAmount(input.getMonthlyRentAmount());
        if (input.getServiceCharge() != null) result.setServiceCharge(input.getServiceCharge());
        if (input.getRentStatus() != null) result.setRentStatus(input.getRentStatus());
        if (input.getCreateDate() != null) result.setCreateDate(input.getCreateDate());
        if (input.getEditDate() != null) result.setEditDate(input.getEditDate());
        return result;
    }
}
