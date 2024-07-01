package com.hotel.project.service.interfac;


import com.hotel.project.dto.LoginRequest;
import com.hotel.project.dto.Response;
import com.hotel.project.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
