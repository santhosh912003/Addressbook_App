package com.example.demo.service;

import com.example.demo.dto.AddressBookDTO;

public interface IAddressBookService {
    String createEntry(AddressBookDTO dto);
    String getEntryById(int id);
    String getAllEntries();
    String updateEntry(int id, AddressBookDTO dto);
    String deleteEntry(int id);
}
