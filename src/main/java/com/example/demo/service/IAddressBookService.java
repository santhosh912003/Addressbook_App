package com.example.demo.service;

import com.example.demo.dto.AddressBookDTO;
import com.example.demo.model.AddressBook;
import java.util.*;

public interface IAddressBookService {
    AddressBook createEntry(AddressBookDTO dto);
    AddressBook getEntryById(int id);
    List<AddressBook> getAllEntries();
    AddressBook updateEntry(int id, AddressBookDTO dto);
    void deleteEntry(int id);
}
