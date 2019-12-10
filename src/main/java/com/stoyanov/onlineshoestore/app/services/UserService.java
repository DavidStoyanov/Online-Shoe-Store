package com.stoyanov.onlineshoestore.app.services;

import com.stoyanov.onlineshoestore.app.errors.BadLoginArgsException;
import com.stoyanov.onlineshoestore.app.errors.UserAlreadyExist;
import com.stoyanov.onlineshoestore.app.models.service.user.UserLoginServiceModel;
import com.stoyanov.onlineshoestore.app.models.service.user.UserRegisterServiceModel;
import com.stoyanov.onlineshoestore.app.models.service.user.UserSessionModel;

public interface UserService {

    void register(UserRegisterServiceModel serviceModel) throws UserAlreadyExist;

    UserSessionModel login(UserLoginServiceModel serviceModel) throws BadLoginArgsException;
}