package com.roomly.Roomly.service.interfac;

import com.roomly.Roomly.dto.Response;
import com.roomly.Roomly.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);
}
