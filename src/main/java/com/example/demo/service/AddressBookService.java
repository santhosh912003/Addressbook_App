package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.AddressBookDTO;
import com.example.demo.model.AddressBook;

import java.util.*;
@Service
public class AddressBookService implements IAddressBookService {

    private final List<AddressBook> addressList = new ArrayList<>();
    private int idCounter = 1;

    @Override
    public AddressBook createEntry(AddressBookDTO dto) {
        AddressBook entry = new AddressBook(idCounter++, dto.getName(), dto.getAddress(), dto.getPhone());
        addressList.add(entry);
        return entry;
    }

    @Override
    public AddressBook getEntryById(int id) {
        return addressList.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<AddressBook> getAllEntries() {
        return addressList;
    }

    @Override
    public AddressBook updateEntry(int id, AddressBookDTO dto) {
        AddressBook existing = getEntryById(id);
        if (existing != null) {
            existing.setName(dto.getName());
            existing.setAddress(dto.getAddress());
            existing.setPhone(dto.getPhone());
        }
        return existing;
    }

    @Override
    public void deleteEntry(int id) {
        addressList.removeIf(e -> e.getId() == id);
    }
}