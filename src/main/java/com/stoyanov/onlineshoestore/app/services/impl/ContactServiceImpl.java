package com.stoyanov.onlineshoestore.app.services.impl;

import com.stoyanov.onlineshoestore.app.models.entity.contact.Message;
import com.stoyanov.onlineshoestore.app.models.service.contact.SendEmailServiceModel;
import com.stoyanov.onlineshoestore.app.repositories.ContactRepository;
import com.stoyanov.onlineshoestore.app.services.ContactService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    private final ModelMapper mapper;

    @Autowired
    public ContactServiceImpl(ContactRepository contactRepository, ModelMapper mapper) {
        this.contactRepository = contactRepository;
        this.mapper = mapper;
    }

    @Override
    public void sendMsg(SendEmailServiceModel serviceModel) {
        Message message = this.mapper.map(serviceModel, Message.class);
        this.contactRepository.save(message);
    }
}
